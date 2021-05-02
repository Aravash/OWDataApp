package com.example.testapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.testapp.fragments.damageFragment
import com.example.testapp.fragments.heroDetailFragment
import com.example.testapp.fragments.supportFragment
import com.example.testapp.fragments.tankFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //val TankList = generateTanksList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tankFrag = heroDetailFragment()
        val damageFrag = damageFragment()
        val supportFrag = supportFragment()

        makeFragmentCurrent(tankFrag)

        bottom_navigation.setOnNavigationItemSelectedListener()
        {
            when (it.itemId) {
                R.id.ic_tanks -> makeFragmentCurrent(tankFrag)
                R.id.ic_damage -> makeFragmentCurrent(damageFrag)
                R.id.ic_supports -> makeFragmentCurrent(supportFrag)
            }
            true
        }

        //recycler_view.adapter = Adapter(TankList, this)
        // recycler_view.layoutManager = LinearLayoutManager(this)
        // recycler_view.setHasFixedSize(true)*/
    }

    public fun makeFragmentCurrent(fragment: Fragment) =
            supportFragmentManager.beginTransaction().apply {

                val b = Bundle()
                b.putString("message", "D.Va")
                fragment.arguments = b
                replace(R.id.fl_wrapper, fragment)
                commit()
            }

    public fun makeHeroViewActivity(fragment: Fragment, title: String) =
            supportFragmentManager.beginTransaction().apply {
                val b = Bundle()
                b.putString("message", "D.Va")
                fragment.arguments = b
                replace(R.id.fl_wrapper, fragment)
                commit()
            }
}
/*
    override fun onItemClick(pos: Int) {
        Toast.makeText(this, TankList[pos].title + " clicked", Toast.LENGTH_SHORT).show()
        openHeroActivity(TankList[pos].title)
    }

    private fun generateTanksList(): List<CardItem> {
        val list = ArrayList<CardItem>()

        list += CardItem(R.drawable.dva, "D.Va")
        list += CardItem(R.drawable.orisa, "Orisa")
        list += CardItem(R.drawable.reinhardt, "Reinhardt")
        list += CardItem(R.drawable.roadhog, "Roadhog")
        list += CardItem(R.drawable.sigma, "Sigma")
        list += CardItem(R.drawable.winston, "Winston")
        list += CardItem(R.drawable.ball, "Wrecking Ball")

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

        list += CardItem(R.drawable.ana, "Ana")
        list += CardItem(R.drawable.baptiste, "Baptiste")
        list += CardItem(R.drawable.brigitte, "Brigitte")
        list += CardItem(R.drawable.lucio, "Lucio")
        list += CardItem(R.drawable.mercy, "Mercy")
        list += CardItem(R.drawable.moira, "Moira")
        list += CardItem(R.drawable.zenyatta, "Zenyatta")

        return list
    }


    private fun openHeroActivity(name: String) {
        val intent = Intent(this, HeroActivity()::class.java)
        intent.putExtra("key", name)
        startActivity(intent)
    }
}*/

