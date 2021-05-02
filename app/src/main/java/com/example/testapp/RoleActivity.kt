package com.example.testapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.roleactivity.*

class RoleActivity : AppCompatActivity(), Adapter.OnItemClickListener
{
    var List = generateList("Tank")

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.roleactivity)

        val name: String? = intent.getStringExtra("key")
        List = generateList(name.toString())

        recycler_view.adapter = Adapter(List, this)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }

    override fun onItemClick(position: Int) {
        openHeroActivity(List[position].title)
    }

    private fun generateList( name : String): List<CardItem> {
        val list = ArrayList<CardItem>()
        when (name) {
            "Tank" -> {
                list += CardItem(R.drawable.dva, "D.Va")
                list += CardItem(R.drawable.orisa, "Orisa")
                list += CardItem(R.drawable.reinhardt, "Reinhardt")
                list += CardItem(R.drawable.roadhog, "Roadhog")
                list += CardItem(R.drawable.sigma, "Sigma")
                list += CardItem(R.drawable.winston, "Winston")
                list += CardItem(R.drawable.ball, "Wrecking Ball")
            }
            "Damage" -> {
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
            }
            "Support" -> {
                list += CardItem(R.drawable.ana, "Ana")
                list += CardItem(R.drawable.baptiste, "Baptiste")
                list += CardItem(R.drawable.brigitte, "Brigitte")
                list += CardItem(R.drawable.lucio, "Lucio")
                list += CardItem(R.drawable.mercy, "Mercy")
                list += CardItem(R.drawable.moira, "Moira")
                list += CardItem(R.drawable.zenyatta, "Zenyatta")
            }
            else ->
            {
            }
        }
        return list
    }

    private fun openHeroActivity(name: String) {
        val intent = Intent(this, HeroActivity()::class.java)
        intent.putExtra("key", name)
        startActivity(intent)
    }
}