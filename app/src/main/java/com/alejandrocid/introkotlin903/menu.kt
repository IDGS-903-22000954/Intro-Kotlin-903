package com.alejandrocid.introkotlin903

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.alejandrocid.introkotlin903.cinepolis.Cinepolis
import com.alejandrocid.introkotlin903.practica1.saludoActivity
import com.alejandrocid.introkotlin903.practica2.OperasActivity
import com.alejandrocid.introkotlin903.practica3.Ejemplo3
import com.alejandrocid.introkotlin903.practica4.ArchivosActivity

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val btnSaludo = findViewById<Button>(R.id.btn1)
        btnSaludo.setOnClickListener{navegateToSaludo()}

        val btnOperas = findViewById<Button>(R.id.btn2)
        btnOperas.setOnClickListener{navegateToOperas()}

        val btnCine = findViewById<Button>(R.id.btn3)
        btnCine.setOnClickListener {navegateToCine()}

        val btn4 = findViewById<Button>(R.id.btn4)
        btn4.setOnClickListener {navegateToEjemplo3()}

        val btn5 = findViewById<Button>(R.id.btn5)
        btn5.setOnClickListener {navegateToEjemplo4()}

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navegateToSaludo(){
        val intent = Intent(this, saludoActivity::class.java)
        startActivity(intent)
    }

    private fun navegateToOperas(){
        val intent = Intent(this, OperasActivity::class.java)
        startActivity(intent)
    }

    private fun navegateToCine(){
        val intent = Intent(this, Cinepolis::class.java)
        startActivity(intent)
    }

    private fun navegateToEjemplo3(){
        val intent = Intent(this, Ejemplo3::class.java)
        startActivity(intent)
    }

    private fun navegateToEjemplo4(){
        val intent = Intent(this, ArchivosActivity::class.java)
        startActivity(intent)
    }
}