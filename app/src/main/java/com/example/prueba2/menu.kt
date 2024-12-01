package com.example.prueba2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu) // Asegúrate de que esto coincida con tu archivo XML

        val verPerfilButton: Button = findViewById(R.id.ver_perfil_button)
        val verEstacionamientosButton: Button = findViewById(R.id.ver_estacionamientos_button)
        val verReservasButton: Button = findViewById(R.id.ver_reservas_button)
        val salirButton: Button = findViewById(R.id.salir_button) // Nuevo botón para salir

        verPerfilButton.setOnClickListener {
            val intent = Intent(this, perfil::class.java)
            startActivity(intent)
        }

        verEstacionamientosButton.setOnClickListener {
            val intent = Intent(this, estacionamiento::class.java)
            startActivity(intent)
        }



        // Manejar clic en el botón de salir
        salirButton.setOnClickListener {
            val intent = Intent(this, login::class.java) // Cambia a la actividad de login
            startActivity(intent)
            finish() // Opcional: Cerrar esta actividad
        }
    }
}
