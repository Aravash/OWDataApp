package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Adapter.OnItemClickListener {

    val List = generateList()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.adapter = Adapter(List, this)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }

    override fun onItemClick(pos: Int) {
        //Toast.makeText(this, List[pos].title + " clicked", Toast.LENGTH_SHORT).show()
        openHeroActivity(List[pos].title)
    }

    private fun generateList(): List<CardItem> {
        val list = ArrayList<CardItem>()

        list += CardItem(R.drawable.nav_tank, "Tank")
        list += CardItem(R.drawable.nav_damage, "Damage")
        list += CardItem(R.drawable.nav_support, "Support")

        return list
    }

    private fun openHeroActivity(name: String) {
        val intent = Intent(this, RoleActivity()::class.java)
        intent.putExtra("key", name)
        startActivity(intent)
    }
}

