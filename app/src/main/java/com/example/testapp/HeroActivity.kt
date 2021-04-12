package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.recycler_view
import kotlinx.android.synthetic.main.heroactivity.*

class HeroActivity : AppCompatActivity(), Adapter.OnItemClickListener
{
    //val name: String? = intent.getStringExtra("key")

    val header : MutableList<String> = ArrayList()
    val body : MutableList<MutableList<String>> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.heroactivity)

        generateExpandable()
        ExpandableView.setAdapter(ExpandableListAdapter(this, ExpandableView, header, body))

        //val List = generateAbilitiesList(1)

        //recycler_view.adapter = Adapter(List, this)
        //recycler_view.layoutManager = LinearLayoutManager(this)
        //recycler_view.setHasFixedSize(true)
    }

    override fun onItemClick(pos: Int) {
        Toast.makeText(this, "Item at $pos clicked", Toast.LENGTH_SHORT).show()
        TODO("toggle view expand")
    }

    private fun generateExpandable()
    {
        val list1 : MutableList<String> = ArrayList()
        list1.add("This is list item 1")
        list1.add("This is list item 2")
        list1.add("This is list item 3")

        header.add("This is expandable List 1")
        body.add(list1)
    }

    private fun generateAbilitiesList(pos : Int): List<CardItem>
    {
        val list = ArrayList<CardItem>()

        list += CardItem(R.drawable.baptiste, "Baptiste")
        list += CardItem(R.drawable.bap_bioticlauncher, "Biotic Launcher")
        list += CardItem(R.drawable.bap_regenerativeburst, "Regenerative Burst")
        list += CardItem(R.drawable.bap_immortalityfield, "Immortality Field")
        list += CardItem(R.drawable.bap_amplificationmatrix, "Amplification Matrix")
        list += CardItem(R.drawable.bap_exoboots, "Exo-Boots")

        return list

        /*when (hero_name) {
            "Baptiste"->
            {
                list += CardItem(R.drawable.baptiste, "Baptiste")
                list += CardItem(R.drawable.bap_bioticlauncher, "Biotic Launcher")
                list += CardItem(R.drawable.bap_regenerativeburst, "Regenerative Burst")
                list += CardItem(R.drawable.bap_immortalityfield, "Immortality Field")
                list += CardItem(R.drawable.bap_amplificationmatrix, "Amplification Matrix")
                list += CardItem(R.drawable.bap_exoboots, "Exo-Boots")
            }


            "Ana" ->
            {
                list += CardItem(R.drawable.ana, "Ana")
                list += CardItem(R.drawable.ana_bioticrifle, "Biotic Rifle")
                list += CardItem(R.drawable.ana_sleepdart, "Sleep Dart")
                list += CardItem(R.drawable.ana_bioticgrenade, "Biotic Grenade")
                list += CardItem(R.drawable.ana_nanoboost, "NanoBoost")
            }

            else ->
            {
                list += CardItem(R.drawable.dva, "D.Va")
                list += CardItem(R.drawable.orisa, "Orisa")
                list += CardItem(R.drawable.reinhardt, "Reinhardt")
                list += CardItem(R.drawable.roadhog, "Roadhog")
                list += CardItem(R.drawable.sigma, "Sigma")
                list += CardItem(R.drawable.winston, "Winston")
                list += CardItem(R.drawable.ball, "Wrecking Ball")
                list += CardItem(R.drawable.zarya, "Zarya")
            }
        }*/
    }
}