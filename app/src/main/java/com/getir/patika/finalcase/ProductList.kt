package com.getir.patika.finalcase

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProductList.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProductList : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var detailPage:ImageView
    private lateinit var listToBasket:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        detailPage=view.findViewById(R.id.product_image_1)
        /*detailPage=view.findViewById(R.id.product_image_2)
        detailPage=view.findViewById(R.id.product_image_3)
        detailPage=view.findViewById(R.id.product_image_4)
        detailPage=view.findViewById(R.id.product_image_5)
        detailPage=view.findViewById(R.id.product_image_6)
        detailPage=view.findViewById(R.id.product_image_7)
        detailPage=view.findViewById(R.id.product_image_8)
        detailPage=view.findViewById(R.id.product_image_9)
        detailPage=view.findViewById(R.id.product_image_10)
        detailPage=view.findViewById(R.id.product_image_11)
        detailPage=view.findViewById(R.id.product_image_12)
        detailPage=view.findViewById(R.id.product_image_13)
        detailPage=view.findViewById(R.id.product_image_14)*/

        detailPage.setOnClickListener{
            findNavController().navigate(R.id.action_productList_to_productDetailFirst)
        }
        listToBasket=view.findViewById(R.id.basket_imageview)
        listToBasket.setOnClickListener{
            findNavController().navigate(R.id.action_productList_to_basket)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product_list, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ProductList.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic fun newInstance(param1: String, param2: String) =
                ProductList().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}