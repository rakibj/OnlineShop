package com.example.i_tech.onlineshop.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.i_tech.onlineshop.Adapters.CategoryAdapter
import com.example.i_tech.onlineshop.Model.Category
import com.example.i_tech.onlineshop.R
import com.example.i_tech.onlineshop.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this,DataService.categories)
        categoryListView.adapter = adapter

    }
}
