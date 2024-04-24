package com.getir.patika.finalcase

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class ProductAdapter(private val productList:List<Products>):
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {
    class ProductViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val productImageView:ImageView=itemView.findViewById(R.id.product_image_1)
        val productPriceTv:TextView=itemView.findViewById(R.id.product_price_1)
        val productNameTv:TextView=itemView.findViewById(R.id.product_name_1)
        val productAttributeTv:TextView=itemView.findViewById(R.id.product_attribute_1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items,parent,false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product=productList[position]
        holder.productImageView.setImageResource(product.productImage)
        holder.productPriceTv.text = product.productPrice
        holder.productNameTv.text = product.productName
        holder.productAttributeTv.text = product.productAttribute
    }
}