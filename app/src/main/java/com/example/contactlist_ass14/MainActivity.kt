package com.example.contactlist_ass14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.RecoverySystem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContacts:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        runcontacts()
    }
    fun runcontacts() {
        var numberList = listOf<Contacts>(
            Contacts("Asma", "0705566339", "asha@gmail.com"),
            Contacts("Manal", "070655444", "manal@gmail.com"),
            Contacts("Jubal", "076655434", "jubal@gmail.com"),
            Contacts("Rouda", "0966775443", "rouda@gmail.com"),
            Contacts("Tutu", "0722131456", "tutu@gmail.com"),
            Contacts("Lesy", "076654332", "less@gmail.com"),
            Contacts("Fadallala", "097661123", "fadallala@gmail.com"),
            Contacts("Baraza", "071223141", "baraza@gmail.com"),
            Contacts("John", "076654345", "john@gmail.com"),
            Contacts("Dina", "076655432", "dina@gmail.com")
        )
//        rvContact = findViewById<RecyclerView>(R.id.rvContact)
        rvContacts=findViewById(R.id.rvContacts)
        var numberAdapter = ContactRVAdapter(numberList)
        rvContacts.layoutManager = LinearLayoutManager(baseContext)
        rvContacts.adapter = numberAdapter

        }
        }
