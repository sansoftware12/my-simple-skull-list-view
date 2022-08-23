package com.example.mysimplelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ListView=findViewById<ListView>(R.id.ListView)
        val Latenames= arrayOf("sandra kaimuri","hope muthosi","mike makasi")
        val arrayadopter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,Latenames)
        ListView.adapter=arrayadopter
        ListView.setOnItemClickListener { adapterView, view, position, l ->
           Toast.makeText(this,"hthis is a latecomer" +Latenames[position],Toast.LENGTH_LONG).show()

        }
    }
}