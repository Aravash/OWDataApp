package com.example.testapp.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.Adapter
import com.example.testapp.CardItem
import com.example.testapp.HeroActivity
import com.example.testapp.R
import kotlinx.android.synthetic.main.fragment_damage.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [damageFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class damageFragment : Fragment(), Adapter.OnItemClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    val List = generateList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val inflate = inflater.inflate(R.layout.fragment_tank, container, false)
        val tank_recycler: RecyclerView = inflate.findViewById(R.id.tank_recycler)

        tank_recycler.adapter = Adapter(List, this)
        tank_recycler.layoutManager = LinearLayoutManager(requireContext())
        tank_recycler.setHasFixedSize(true)

        // Inflate the layout for this fragment
        return inflate
    }

    private fun generateList(): List<CardItem> {
        val list = ArrayList<CardItem>()

        list += CardItem(R.drawable.ashe, "Ashe")
        list += CardItem(R.drawable.bastion, "Bastion")
        list += CardItem(R.drawable.doomfist, "Doomfist")
        list += CardItem(R.drawable.echo, "Echo")
        list += CardItem(R.drawable.genji, "Genji")
        list += CardItem(R.drawable.hanzo, "Hanzo")
        list += CardItem(R.drawable.junkrat, "Junkrat")
        list += CardItem(R.drawable.mccree, "McCree")
        list += CardItem(R.drawable.mei, "Mei")
        list += CardItem(R.drawable.pharah, "Pharah")
        list += CardItem(R.drawable.reaper, "Reaper")
        list += CardItem(R.drawable.soldier76, "Soldier: 76")
        list += CardItem(R.drawable.sombra, "Sombra")
        list += CardItem(R.drawable.symmetra, "Symmetra")
        list += CardItem(R.drawable.torbjorn, "Torbjorn")
        list += CardItem(R.drawable.tracer, "Tracer")
        list += CardItem(R.drawable.widowmaker, "Widowmaker")

        return list
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment damageFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            damageFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onItemClick(position: Int) {
        TODO("Not yet implemented")
    }
}