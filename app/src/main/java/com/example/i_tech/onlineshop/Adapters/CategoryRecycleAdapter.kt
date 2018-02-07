package com.example.i_tech.onlineshop.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.i_tech.onlineshop.Model.Category
import com.example.i_tech.onlineshop.R
import kotlinx.android.synthetic.main.category_list_item.view.*

/**
 * Created by i-tech on 2/3/2018.
 */
class CategoryRecycleAdapter(val context:Context, val categories:List<Category>,val itemClick: (Category)-> Unit) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>(){

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(Holder: Holder?, position: Int) {
        Holder?.bindCategory(categories[position],context)
    }

    //if Loaded for the first time then inflate
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        //Inflate the layout resource into a view
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent,false)
        return Holder(view,itemClick)
    }


    inner class Holder(itemView: View?, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category: Category, context: Context){
            //Image resource ID extraction
            val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
            //Setting the image and the text
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title

            //if item is clicked
            itemView.setOnClickListener{itemClick(category)}
        }
    }
}