package com.example.testapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testapp.CardItem
import com.example.testapp.R
import kotlinx.android.synthetic.main.fragment_tank.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [tankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class tankFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    val List = generateList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

            //recycler_view.adapter = Adapter(List, requireContext())
            recycler_view.layoutManager = LinearLayoutManager(requireContext())
            recycler_view.setHasFixedSize(true)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tank, container, false)

    }

    private fun generateList(): List<CardItem> {
        val list = ArrayList<CardItem>()

        list += CardItem(R.drawable.dva, "D.Va")
        list += CardItem(R.drawable.orisa, "Orisa")
        list += CardItem(R.drawable.reinhardt, "Reinhardt")
        list += CardItem(R.drawable.roadhog, "Roadhog")
        list += CardItem(R.drawable.sigma, "Sigma")
        list += CardItem(R.drawable.winston, "Winston")
        list += CardItem(R.drawable.ball, "Wrecking Ball")

        return list
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment tankFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                tankFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}