package com.amu.myintents

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Explicit Intent to SecondActivity
        val explicitButton = findViewById<Button>(R.id.explicitButton) //init Button

        explicitButton.setOnClickListener {
            val explicitIntent = Intent(this, SecondActivit::class.java)
            startActivity(explicitIntent)

            //somit geht er beim zurück Button gleich raus!
            finish()
        }


        //implicit Intent
        val url = "https://www.google.com" //Der öffnet den default Browser
        val implicitButton = findViewById<Button>(R.id.implicitButton)
        implicitButton.setOnClickListener {
            val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
//            val implicitIntent = Intent.makeMainSelectorActivity(Intent.ACTION_MAIN, Intent.CATEGORY_APP_GALLERY) // Beispiel für Galerie öffnen
            startActivity(implicitIntent)
        }

    }
}