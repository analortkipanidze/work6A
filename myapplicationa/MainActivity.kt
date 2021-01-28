package com.example.myapplicationa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerListView)

        val photoList = ArrayList<Photo>()

        photoList.add(Photo("https://cdn.britannica.com/66/101766-050-85FEF17D/Missouri-River-Gates-of-the-Mountains-Helena.jpg"))
        photoList.add(Photo("https://miro.medium.com/max/1500/1*BnPKEeSwSBmkQsUTrlbT3w.jpeg"))
        photoList.add(Photo("https://miro.medium.com/max/1000/1*BnPKEeSwSBmkQsUTrlbT3w.jpeg",))

        val adapter = PhotoAdapter(photoList)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = adapter
    }
}