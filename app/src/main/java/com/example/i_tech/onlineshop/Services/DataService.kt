package com.example.i_tech.onlineshop.Services

import com.example.i_tech.onlineshop.Model.Category
import com.example.i_tech.onlineshop.Model.Product
import java.util.*

/**
 * Created by i-tech on 2/2/2018.
 */
object DataService {

    val categories = listOf(
            Category("Shirts","shirtimage"),
            Category("Hoodies","hoodieimage"),
            Category("Hats","hatimage"),
            Category("Digital","digitalgoodsimage")
    )

    val hats = listOf(
            Product("Graphic Beanie","$18","hat1"),
            Product("Black Hat","$22","hat2"),
            Product("White Beanie","$18","hat3"),
            Product("Grey Hat Snapback","$20","hat4")
    )

    val hoodies = listOf(
            Product("Hoodie Grey DragonHeart","$28","hoodie1"),
            Product("Hoodie White DragonHeart","$32","hoodie2"),
            Product("Hoodie Blue DragonHeart","$38","hoodie3"),
            Product("Hoodie Grey SkeleHeart","$28","hoodie4")
    )

    val shirts = listOf(
            Product("Shirt Grey DragonHandle","$28","shirt1"),
            Product("Shirt White Blade","$32","shirt2"),
            Product("Shirt Blue DragonHeart","$38","shirt3"),
            Product("Shirt Grey SkeleHeart","$28","shirt4"),
            Product("Shirt Purple SkeleArm","$28","shirt5")
    )


}









