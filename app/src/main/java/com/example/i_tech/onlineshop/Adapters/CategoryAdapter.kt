package com.example.i_tech.onlineshop.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.i_tech.onlineshop.Model.Category
import com.example.i_tech.onlineshop.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by i-tech on 2/3/2018.
 */
class CategoryAdapter(context:Context, categories:List<Category>):BaseAdapter(){

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView: View

        //Inflate the layout resource into a view
        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item,null)

        val categoryImage : ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryName : TextView = categoryView.findViewById(R.id.categoryName)

        val category = categories[position]

        //Image resource ID extraction
        val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)

        //Setting the image and the text
        categoryName.text = category.title
        categoryImage.setImageResource(resourceId)

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
       return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

}