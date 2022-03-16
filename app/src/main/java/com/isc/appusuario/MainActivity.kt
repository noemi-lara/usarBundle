package com.isc.appusuario


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var usuario: EditText = findViewById <EditText>(R.id.Nusuario)
        var password: EditText = findViewById <EditText>(R.id.Pusuario)
        val ingresar: Button= findViewById(R.id.btnIngresar)
        val registrar: Button = findViewById(R.id.BtnRegistrar)

        var user = "noemi"
        var pass = "sistemas"


        ingresar.setOnClickListener {
            val cadena1 = usuario.text.toString().trim()
            val cadena2 = password.text.toString().trim()

            if ((cadena1==user)  && (cadena2==pass)) {
                Toast.makeText(
                    applicationContext, "usuario y password correcto",
                    Toast.LENGTH_SHORT
                ).show()
                usuario.setText("")
                password.setText("")
                startActivity(Intent(this, InicioActivity::class.java))
            } else {
                Toast.makeText(
                    applicationContext, "usuario y password incorrecto",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }
        // Enviar el nombre del usuario
        // Pedir el género (hombre o mujer)
        // Modificar el texto de Bienvenida según el género de la persona

        registrar.setOnClickListener{
            val cadena1 = usuario.text.toString()
            val cadena2 = password.text.toString()
            user = cadena1.toString()
            pass = cadena2.toString()
            Toast.makeText(
                applicationContext, "usuario y password registrados",
                Toast.LENGTH_SHORT
            ).show()
        }


    }
}