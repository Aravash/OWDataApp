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
    val headerImages : MutableList<Int> = ArrayList()
    val body : MutableList<MutableList<String>> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.heroactivity)

        val name: String? = intent.getStringExtra("key")

        generateExpandable(name.toString())
        ExpandableView.setAdapter(ExpandableListAdapter(this, ExpandableView, header, headerImages, body))

        //val List = generateAbilitiesList(name.toString())

        //recycler_view.adapter = Adapter(List, this)
        //recycler_view.layoutManager = LinearLayoutManager(this)
        //recycler_view.setHasFixedSize(true)
    }

    override fun onItemClick(pos: Int) {
        Toast.makeText(this, "Item at $pos clicked", Toast.LENGTH_SHORT).show()
        TODO("toggle view expand")
    }

    private fun generateExpandable( name : String)
    {
        /*val list1 : MutableList<String> = ArrayList()
        list1.add("This is list item 1")
        list1.add("This is list item 2")
        list1.add("This is list item 3")

        header.add("This is expandable List 1")
        body.add(list1)*/
        when (name) {
            "Baptiste"->
            {
                val list1 : MutableList<String> = ArrayList()
                list1.add(getString(R.string.Bap_Nationality))
                list1.add(getString(R.string.Bap_Health))
                list1.add(getString(R.string.Bap_MoveSpeed))
                createListElement("Baptiste", R.drawable.baptiste, list1)

                val list2 : MutableList<String> = ArrayList()
                list2.add(getString(R.string.Bap_Gun_Detail))
                list2.add(getString(R.string.Bap_Gun_Type))
                list2.add(getString(R.string.Bap_Gun_Damage))
                list2.add(getString(R.string.Bap_Gun_Ammo))
                list2.add(getString(R.string.Bap_Gun_ReloadTime))
                list2.add(getString(R.string.Bap_Gun_ROF))
                list2.add(getString(R.string.Bap_Gun_Falloff))
                list2.add(getString(R.string.Bap_Gun_CanHeadshot))
                createListElement(getString(R.string.Bap_Gun), R.drawable.bap_bioticlauncher, list2)

                val list3 : MutableList<String> = ArrayList()
                list3.add(getString(R.string.Bap_Gun2_Detail))
                list3.add(getString(R.string.Bap_Gun2_Type))
                list3.add(getString(R.string.Bap_Gun2_Speed))
                list3.add(getString(R.string.Bap_Gun2_Damage))
                list3.add(getString(R.string.Bap_Gun2_Ammo))
                list3.add(getString(R.string.Bap_Gun2_ReloadTime))
                list3.add(getString(R.string.Bap_Gun2_ROF))
                list3.add(getString(R.string.Bap_Gun2_Radius))
                list3.add(getString(R.string.Bap_Gun2_CanHeadshot))
                createListElement(getString(R.string.Bap_Gun2), R.drawable.bap_bioticlauncher, list3)

                val list4 : MutableList<String> = ArrayList()
                list4.add(getString(R.string.Bap_Ability1_Detail))
                list4.add(getString(R.string.Bap_Ability1_CastTime))
                list4.add(getString(R.string.Bap_Ability1_Healing))
                list4.add(getString(R.string.Bap_Ability1_Duration))
                list4.add(getString(R.string.Bap_Ability1_AOE))
                list4.add(getString(R.string.Bap_Ability1_Cooldown))
                createListElement(getString(R.string.Bap_Ability1), R.drawable.bap_regenerativeburst, list4)

            }


            "Ana" ->
            {
                /*list += CardItem(R.drawable.ana, "Ana")
                list += CardItem(R.drawable.ana_bioticrifle, "Biotic Rifle")
                list += CardItem(R.drawable.ana_sleepdart, "Sleep Dart")
                list += CardItem(R.drawable.ana_bioticgrenade, "Biotic Grenade")
                list += CardItem(R.drawable.ana_nanoboost, "NanoBoost")*/
            }

            else ->
            {
                /*list += CardItem(R.drawable.dva, "D.Va")
                list += CardItem(R.drawable.orisa, "Orisa")
                list += CardItem(R.drawable.reinhardt, "Reinhardt")
                list += CardItem(R.drawable.roadhog, "Roadhog")
                list += CardItem(R.drawable.sigma, "Sigma")
                list += CardItem(R.drawable.winston, "Winston")
                list += CardItem(R.drawable.ball, "Wrecking Ball")
                list += CardItem(R.drawable.zarya, "Zarya")*/
            }
        }
    }

    private fun createListElement( elementName: String, drawable: Int, list: MutableList<String>)
    {
        header.add(elementName)
        headerImages.add(drawable)
        body.add(list)
    }

    private fun generateAbilitiesList(name : String): List<CardItem>
    {
        val list = ArrayList<CardItem>()

        /*list += CardItem(R.drawable.baptiste, "Baptiste")
        list += CardItem(R.drawable.bap_bioticlauncher, "Biotic Launcher")
        list += CardItem(R.drawable.bap_regenerativeburst, "Regenerative Burst")
        list += CardItem(R.drawable.bap_immortalityfield, "Immortality Field")
        list += CardItem(R.drawable.bap_amplificationmatrix, "Amplification Matrix")
        list += CardItem(R.drawable.bap_exoboots, "Exo-Boots")*/


        when (name) {
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
        }
        return list

    }
}