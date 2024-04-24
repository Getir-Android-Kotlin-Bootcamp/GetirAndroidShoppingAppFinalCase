package com.getir.patika.finalcase

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //private lateinit var recyclerView: RecyclerView
    private lateinit var productList: ArrayList<Products>
    private lateinit var productAdapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //productList = ArrayList<Products>()
        //productAdapter =ProductAdapter(productList)
       // init()
    }

   /* Yorum satırına aldığım kodları horizontal ve vertical scrolları aynı sayfada yapamadığım için
   kullanmadım.

        private fun init(){
        recyclerView = findViewById(R.id.product_list_rv)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        productList = ArrayList()
        addDataToList()
        var productAdapter = ProductAdapter(productList)
        recyclerView.adapter = productAdapter

    }
    private fun addDataToList(){
        productList.add(Products(R.drawable.product,"0,00","Product1","Attribute"))
    }*/
}