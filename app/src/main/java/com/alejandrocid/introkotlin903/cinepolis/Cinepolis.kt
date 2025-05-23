package com.alejandrocid.introkotlin903.cinepolis

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AlertDialog
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.alejandrocid.introkotlin903.R

class Cinepolis : AppCompatActivity() {
    private lateinit var edtNombre: EditText
    private lateinit var edtCantidad: EditText
    private lateinit var edtBoletos: EditText
    private lateinit var rsi: RadioButton
    private lateinit var rno: RadioButton
    private lateinit var precio: TextView
    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cinepolis)
        edtNombre = findViewById(R.id.edtNombre)
        edtCantidad = findViewById(R.id.edtCantidad)
        edtBoletos = findViewById(R.id.edtBoletos)
        rsi = findViewById(R.id.rsi)
        rno = findViewById(R.id.rno)
        precio = findViewById(R.id.precio)
        btn = findViewById(R.id.btn)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun calcular (view: android.view.View){
        if(!validarCampos()){
            return
        }

        val nombre = edtNombre.text.toString()
        val compradores = edtCantidad.text.toString().toInt()
        val boletos = edtBoletos.text.toString().toDouble()
        var pago = 12.00

        if (boletos <= compradores * 7) {
            if(boletos > 5){
                pago *= boletos * 0.85
                if (rsi.isChecked){
                    pago *= 0.90
                    precio.text = "$$pago"
                }else{
                    precio.text = "$$pago"
                }
            } else if (boletos >= 3 && boletos < 5){
                pago *= boletos * 0.90
                if (rsi.isChecked){
                    pago *= 0.90
                    precio.text = "$$pago"
                }else{
                    precio.text = "$$pago"
                }
            } else {
                pago *= boletos
                if (rsi.isChecked){
                    pago *= 0.90
                    precio.text = "$$pago"
                }else{
                    precio.text = "$$pago"
                }
            }
        } else {
            Toast.makeText(this, "Hay un máximo de 7 boletos por persona", Toast.LENGTH_LONG).show()
        }
    }

    fun validarCampos(): Boolean {
        try {
            if (edtNombre.text.toString().trim().isEmpty()) {
                Toast.makeText(this, "El nombre es requerido", Toast.LENGTH_SHORT).show()
                edtNombre.requestFocus()
                return false
            }

            if (edtCantidad.text.toString().trim().isEmpty()) {
                Toast.makeText(this, "La cantidad es requerida", Toast.LENGTH_SHORT).show()
                edtCantidad.requestFocus()
                return false
            }

            if (edtBoletos.text.toString().trim().isEmpty()) {
                Toast.makeText(this, "El número de boletos es requerido", Toast.LENGTH_SHORT).show()
                edtBoletos.requestFocus()
                return false
            }

            val cantidad = edtCantidad.text.toString().toInt()
            val boletos = edtBoletos.text.toString().toInt()

            if (cantidad <= 0) {
                Toast.makeText(this, "La cantidad debe ser mayor a 0", Toast.LENGTH_SHORT).show()
                edtCantidad.requestFocus()
                return false
            }

            if (!rsi.isChecked && !rno.isChecked) {
                Toast.makeText(this, "Debes seleccionar una opción", Toast.LENGTH_SHORT).show()
                return false
            }

            if (boletos <= 0) {
                Toast.makeText(this, "Los boletos deben ser mayor a 0", Toast.LENGTH_SHORT).show()
                edtBoletos.requestFocus()
                return false
            }

            return true

        } catch (e: NumberFormatException) {
            Toast.makeText(this, "Por favor ingresa números válidos", Toast.LENGTH_SHORT).show()
            return false
        } catch (e: Exception) {
            Toast.makeText(this, "Error de validación: ${e.message}", Toast.LENGTH_SHORT).show()
            return false
        }
    }
}