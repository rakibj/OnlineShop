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
class CategoryRecycleAdapter(val context:Context, val categories:List<Category>) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>(){

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(Holder: Holder?, position: Int) {
        Holder?.bindCategory(categories[position],context)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent,false)
        return Holder(view)
    }


    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category: Category, context: Context){
            val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title
        }
    }
}