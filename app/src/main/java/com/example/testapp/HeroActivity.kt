package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
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
    }

    override fun onItemClick(pos: Int) {
        Toast.makeText(this, "Item at $pos clicked", Toast.LENGTH_SHORT).show()
        TODO("toggle view expand")
    }

    private fun generateExpandable( name : String)
    {
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

                val list5 : MutableList<String> = ArrayList()
                list5.add(getString(R.string.Bap_Ability2_Detail))
                list5.add(getString(R.string.Bap_Ability2_Speed))
                list5.add(getString(R.string.Bap_Ability2_Health))
                list5.add(getString(R.string.Bap_Ability2_Duration))
                list5.add(getString(R.string.Bap_Ability2_Cooldown))
                createListElement(getString(R.string.Bap_Ability2), R.drawable.bap_immortalityfield, list5)

                val list6 : MutableList<String> = ArrayList()
                list6.add(getString(R.string.Bap_Ultimate))
                list6.add(getString(R.string.Bap_Ultimate_Detail))
                list6.add(getString(R.string.Bap_Ultimate_Cost))
                list6.add(getString(R.string.Bap_Ultimate_Duration))
                list6.add(getString(R.string.Bap_Ultimate_Range))
                list6.add(getString(R.string.Bap_Ultimate_AOE))
                createListElement(getString(R.string.Bap_Ultimate), R.drawable.bap_amplificationmatrix, list6)

                val list7 : MutableList<String> = ArrayList()
                list7.add(getString(R.string.Bap_Passive_Detail))
                list7.add(getString(R.string.Bap_Passive_Height))
                list7.add(getString(R.string.Bap_Passive_ChargeTime))
                createListElement(getString(R.string.Bap_Passive), R.drawable.bap_exoboots, list7)
            }

            "Ana" ->
            {
                val list1 : MutableList<String> = ArrayList()
                list1.add(getString(R.string.Ana_Nationality))
                list1.add(getString(R.string.Ana_Health))
                list1.add(getString(R.string.Ana_MoveSpeed))
                createListElement("Ana", R.drawable.ana, list1)

                val list2 : MutableList<String> = ArrayList()
                list2.add(getString(R.string.Ana_Gun_Detail))
                list2.add(getString(R.string.Ana_Gun_Type))
                list2.add(getString(R.string.Ana_Gun_Speed))
                list2.add(getString(R.string.Ana_Gun_Damage))
                list2.add(getString(R.string.Ana_Gun_Healing))
                list2.add(getString(R.string.Ana_Gun_Ammo))
                list2.add(getString(R.string.Ana_Gun_ReloadTime))
                list2.add(getString(R.string.Ana_Gun_ROF))
                list2.add(getString(R.string.Ana_Gun_Falloff))
                list2.add(getString(R.string.Ana_Gun_CanHeadshot))
                createListElement(getString(R.string.Ana_Gun), R.drawable.ana_bioticrifle, list2)

                val list3 : MutableList<String> = ArrayList()
                list3.add(getString(R.string.Ana_Ability1_Detail))
                list3.add(getString(R.string.Ana_Ability1_Type))
                list3.add(getString(R.string.Ana_Ability1_Speed))
                list3.add(getString(R.string.Ana_Ability1_Damage))
                list3.add(getString(R.string.Ana_Ability1_CastTime))
                list3.add(getString(R.string.Ana_Ability1_Healing))
                list3.add(getString(R.string.Ana_Ability1_Duration))
                list3.add(getString(R.string.Ana_Ability1_AOE))
                list3.add(getString(R.string.Ana_Ability1_Cooldown))
                createListElement(getString(R.string.Ana_Ability1), R.drawable.ana_sleepdart, list3)

                val list4 : MutableList<String> = ArrayList()
                list4.add(getString(R.string.Ana_Ability2_Detail))
                list4.add(getString(R.string.Ana_Ability2_Type))
                list4.add(getString(R.string.Ana_Ability2_Speed))
                list4.add(getString(R.string.Ana_Ability2_Damage))
                list4.add(getString(R.string.Ana_Ability2_Healing))
                list4.add(getString(R.string.Ana_Ability2_Duration))
                list4.add(getString(R.string.Ana_Ability2_AOE))
                list4.add(getString(R.string.Ana_Ability2_Cooldown))
                createListElement(getString(R.string.Ana_Ability2), R.drawable.ana_bioticgrenade, list4)

                val list5 : MutableList<String> = ArrayList()
                list5.add(getString(R.string.Ana_Ultimate))
                list5.add(getString(R.string.Ana_Ultimate_Detail))
                list5.add(getString(R.string.Ana_Ultimate_Cost))
                list5.add(getString(R.string.Ana_Ultimate_Healing))
                list5.add(getString(R.string.Ana_Ultimate_Range))
                list5.add(getString(R.string.Ana_Ultimate_CastTime))
                list5.add(getString(R.string.Ana_Ultimate_Duration))
                createListElement(getString(R.string.Ana_Ultimate), R.drawable.ana_nanoboost, list5)
            }

            "Brigitte" ->
            {
                val list1 : MutableList<String> = ArrayList()
                list1.add(getString(R.string.Brig_Nationality))
                list1.add(getString(R.string.Brig_Health))
                list1.add(getString(R.string.Brig_MoveSpeed))
                createListElement("Brigitte", R.drawable.brigitte, list1)

                val list2 : MutableList<String> = ArrayList()
                list2.add(getString(R.string.Brig_Flail_Detail))
                list2.add(getString(R.string.Brig_Flail_Type))
                list2.add(getString(R.string.Brig_Flail_Damage))
                list2.add(getString(R.string.Brig_Flail_Range))
                createListElement(getString(R.string.Brig_Flail), R.drawable.bri_rocketflail, list2)

                val list3 : MutableList<String> = ArrayList()
                list3.add(getString(R.string.Brig_RepairPack_Detail))
                list3.add(getString(R.string.Brig_RepairPack_Healing))
                list3.add(getString(R.string.Brig_RepairPack_Speed))
                list3.add(getString(R.string.Brig_RepairPack_Charges))
                list3.add(getString(R.string.Brig_RepairPack_Cooldown))
                createListElement(getString(R.string.Brig_RepairPack), R.drawable.bri_repairpack, list3)

                val list4 : MutableList<String> = ArrayList()
                list4.add(getString(R.string.Brig_WhipShot_Detail))
                list4.add(getString(R.string.Brig_WhipShot_Type))
                list4.add(getString(R.string.Brig_WhipShot_Type))
                list4.add(getString(R.string.Brig_WhipShot_Speed))
                list4.add(getString(R.string.Brig_WhipShot_Damage))
                list4.add(getString(R.string.Brig_WhipShot_Range))
                list4.add(getString(R.string.Brig_WhipShot_Knockback))
                list4.add(getString(R.string.Brig_WhipShot_Cooldown))
                createListElement(getString(R.string.Brig_WhipShot), R.drawable.bri_whipshot, list4)

                val list5 : MutableList<String> = ArrayList()
                list5.add(getString(R.string.Brig_BarrierShield_Detail))
                list5.add(getString(R.string.Brig_BarrierShield_Health))
                list5.add(getString(R.string.Brig_BarrierShield_Healing))
                list5.add(getString(R.string.Brig_BarrierShield_MovePenalty))
                list5.add(getString(R.string.Brig_BarrierShield_Cooldown))
                createListElement(getString(R.string.Brig_BarrierShield), R.drawable.bri_barriershield, list5)

                val list6 : MutableList<String> = ArrayList()
                list6.add(getString(R.string.Brig_ShieldBash_Detail))
                list6.add(getString(R.string.Brig_ShieldBash_Damage))
                list6.add(getString(R.string.Brig_ShieldBash_Range))
                list6.add(getString(R.string.Brig_ShieldBash_Duration))
                list6.add(getString(R.string.Brig_ShieldBash_Cooldown))
                createListElement(getString(R.string.Brig_ShieldBash), R.drawable.bri_shieldbash, list6)

                val list7 : MutableList<String> = ArrayList()
                list7.add(getString(R.string.Brig_Ultimate_detail))
                list7.add(getString(R.string.Brig_Ultimate_cost))
                list7.add(getString(R.string.Brig_Ultimate_healing))
                list7.add(getString(R.string.Brig_Ultimate_movespeed))
                list7.add(getString(R.string.Brig_Ultimate_AOE))
                list7.add(getString(R.string.Brig_Ultimate_duration))
                createListElement(getString(R.string.Brig_Ultimate), R.drawable.bri_rally, list7)

                val list8 : MutableList<String> = ArrayList()
                list8.add(getString(R.string.Brig_Passive_detail))
                list8.add(getString(R.string.Brig_Passive_healing))
                list8.add(getString(R.string.Brig_Passive_AOE))
                list8.add(getString(R.string.Brig_Passive_duration))
                list8.add(getString(R.string.Brig_Passive_cooldown))
                createListElement(getString(R.string.Brig_Passive), R.drawable.bri_inspire, list8)
            }

            "Lucio" ->
            {
                val list1 : MutableList<String> = ArrayList()
                list1.add(getString(R.string.lucio_Nationality))
                list1.add(getString(R.string.lucio_Health))
                list1.add(getString(R.string.lucio_MoveSpeed))
                createListElement("Lucio", R.drawable.lucio, list1)

                val list2 : MutableList<String> = ArrayList()
                list2.add(getString(R.string.lucio_Gun_Detail))
                list2.add(getString(R.string.lucio_Gun_Type))
                list2.add(getString(R.string.lucio_Gun_Speed))
                list2.add(getString(R.string.lucio_Gun_Damage))
                list2.add(getString(R.string.lucio_Gun_Ammo))
                list2.add(getString(R.string.lucio_Gun_ReloadTime))
                list2.add(getString(R.string.lucio_Gun_ROF))
                list2.add(getString(R.string.lucio_Gun_CanHeadshot))
                createListElement(getString(R.string.lucio_Gun), R.drawable.luc_sonicamplifier, list2)

                val list3 : MutableList<String> = ArrayList()
                list3.add(getString(R.string.lucio_Soundwave_Detail))
                list3.add(getString(R.string.lucio_Soundwave_Damage))
                list3.add(getString(R.string.lucio_Soundwave_Range))
                list3.add(getString(R.string.lucio_Soundwave_Cooldown))
                createListElement(getString(R.string.lucio_Soundwave), R.drawable.luc_soundblast, list3)

                val list4 : MutableList<String> = ArrayList()
                list4.add(getString(R.string.lucio_Crossfade_Detail))
                list4.add(getString(R.string.lucio_Crossfade_Healing))
                list4.add(getString(R.string.lucio_Crossfade_movespeed))
                list4.add(getString(R.string.lucio_Crossfade_AOE))
                list4.add(getString(R.string.lucio_Crossfade_Cooldown))
                createListElement(getString(R.string.lucio_Crossfade), R.drawable.luc_crossfade, list4)

                val list5 : MutableList<String> = ArrayList()
                list5.add(getString(R.string.lucio_AmpitUp_Detail))
                list5.add(getString(R.string.lucio_AmpitUp_Healing))
                list5.add(getString(R.string.lucio_AmpitUp_movespeed))
                list5.add(getString(R.string.lucio_AmpitUp_AOE))
                list5.add(getString(R.string.lucio_AmpitUp_Duration))
                list5.add(getString(R.string.lucio_AmpitUp_Cooldown))
                createListElement(getString(R.string.lucio_AmpitUp), R.drawable.luc_ampitup, list5)

                val list6 : MutableList<String> = ArrayList()
                list6.add(getString(R.string.lucio_Ultimate_Detail))
                list6.add(getString(R.string.lucio_Ultimate_Cost))
                list6.add(getString(R.string.lucio_Ultimate_Healing))
                list6.add(getString(R.string.lucio_Ultimate_casttime))
                list6.add(getString(R.string.lucio_Ultimate_Range))
                list6.add(getString(R.string.lucio_Ultimate_Duration))
                createListElement(getString(R.string.lucio_Ultimate), R.drawable.luc_soundbarrier, list6)

                val list7 : MutableList<String> = ArrayList()
                list7.add(getString(R.string.lucio_passive_detail))
                list7.add(getString(R.string.lucio_passive_movespeed))
                createListElement(getString(R.string.lucio_passive), R.drawable.passive, list7)
            }

            "Mercy" ->
            {
                val list1 : MutableList<String> = ArrayList()
                list1.add(getString(R.string.mercy_Nationality))
                list1.add(getString(R.string.mercy_Health))
                list1.add(getString(R.string.mercy_MoveSpeed))
                createListElement("Mercy", R.drawable.mercy, list1)

                val list2 : MutableList<String> = ArrayList()
                list2.add(getString(R.string.mercy_staff_Detail))
                list2.add(getString(R.string.mercy_staff_Healing))
                list2.add(getString(R.string.mercy_staff_Damage))
                list2.add(getString(R.string.mercy_staff_Range))
                createListElement(getString(R.string.mercy_staff), R.drawable.mer_caduceusstaff, list2)

                val list3 : MutableList<String> = ArrayList()
                list3.add(getString(R.string.mercy_gun_detail))
                list3.add(getString(R.string.mercy_gun_type))
                list3.add(getString(R.string.mercy_gun_speed))
                list3.add(getString(R.string.mercy_gun_ROF))
                list3.add(getString(R.string.mercy_gun_ammo))
                list3.add(getString(R.string.mercy_gun_reload))
                list3.add(getString(R.string.mercy_gun_canHeadshot))
                createListElement(getString(R.string.mercy_gun), R.drawable.mer_caduceusblaster, list3)

                val list4 : MutableList<String> = ArrayList()
                list4.add(getString(R.string.mercy_GA_detail))
                list4.add(getString(R.string.mercy_GA_movespeed))
                list4.add(getString(R.string.mercy_GA_range))
                list4.add(getString(R.string.mercy_GA_Cooldown))
                list4.add(getString(R.string.mercy_GA_Targeting))
                createListElement(getString(R.string.mercy_GA), R.drawable.mer_guardianangel, list4)

                val list5 : MutableList<String> = ArrayList()
                list5.add(getString(R.string.mercy_resurrect_detail))
                list5.add(getString(R.string.mercy_resurrect_movespeed))
                list5.add(getString(R.string.mercy_resurrect_range))
                list5.add(getString(R.string.mercy_resurrect_cast_time))
                list5.add(getString(R.string.mercy_resurrect_cooldown))
                createListElement(getString(R.string.mercy_resurrect), R.drawable.mer_resurrect, list5)

                val list6 : MutableList<String> = ArrayList()
                list6.add(getString(R.string.mercy_Ultimate_detail))
                list6.add(getString(R.string.mercy_Ultimate_cost))
                list6.add(getString(R.string.mercy_Ultimate_staff))
                list6.add(getString(R.string.mercy_Ultimate_blaster))
                list6.add(getString(R.string.mercy_Ultimate_regeneration))
                list6.add(getString(R.string.mercy_Ultimate_duration))
                createListElement(getString(R.string.mercy_Ultimate), R.drawable.mer_valkyrie, list6)
            }

            "Moira" ->
            {
                val list1 : MutableList<String> = ArrayList()
                list1.add(getString(R.string.moira_Nationality))
                list1.add(getString(R.string.moira_Health))
                list1.add(getString(R.string.moira_MoveSpeed))
                createListElement("Moira", R.drawable.moira, list1)

                val list2 : MutableList<String> = ArrayList()
                list2.add(getString(R.string.moira_gun_heal_detail))
                list2.add(getString(R.string.moira_gun_heal_healing))
                list2.add(getString(R.string.moira_gun_heal_range))
                list2.add(getString(R.string.moira_gun_heal_ammo))
                list2.add(getString(R.string.moira_gun_heal_ROF))
                list2.add(getString(R.string.moira_gun_heal_reload))
                createListElement(getString(R.string.moira_gun_heal), R.drawable.moi_bioticgrasp, list2)

                val list3 : MutableList<String> = ArrayList()
                list3.add(getString(R.string.moira_gun_kill_type))
                list3.add(getString(R.string.moira_gun_kill_damage))
                list3.add(getString(R.string.moira_gun_kill_heal))
                list3.add(getString(R.string.moira_gun_kill_range))
                list3.add(getString(R.string.moira_gun_kill_regen))
                createListElement(getString(R.string.moira_gun_kill), R.drawable.moi_bioticgrasp, list3)

                val list4 : MutableList<String> = ArrayList()
                list4.add(getString(R.string.moira_orb_detail))
                list4.add(getString(R.string.moira_orb_damage))
                list4.add(getString(R.string.moira_orb_healing))
                list4.add(getString(R.string.moira_orb_type))
                list4.add(getString(R.string.moira_orb_speed))
                list4.add(getString(R.string.moira_orb_range))
                list4.add(getString(R.string.moira_orb_duration))
                list4.add(getString(R.string.moira_orb_cooldown))
                createListElement(getString(R.string.moira_orb), R.drawable.moi_bioticorb, list4)

                val list5 : MutableList<String> = ArrayList()
                list5.add(getString(R.string.moira_fade_detail))
                list5.add(getString(R.string.moira_fade_movespeed))
                list5.add(getString(R.string.moira_fade_duration))
                list5.add(getString(R.string.moira_fade_cooldown))
                createListElement(getString(R.string.moira_fade), R.drawable.moi_fade, list5)

                val list6 : MutableList<String> = ArrayList()
                list6.add(getString(R.string.moira_ultimate_detail))
                list6.add(getString(R.string.moira_ultimate_cost))
                list6.add(getString(R.string.moira_ultimate_damage))
                list6.add(getString(R.string.moira_ultimate_healing))
                list6.add(getString(R.string.moira_ultimate_movespeed))
                list6.add(getString(R.string.moira_ultimate_range))
                list6.add(getString(R.string.moira_ultimate_duration))
                createListElement(getString(R.string.moira_ultimate), R.drawable.moi_coalescence, list6)
            }

            "Zenyatta" ->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.zen_Nationality))
                list1.add(getString(R.string.zen_Health))
                list1.add(getString(R.string.zen_Shields))
                list1.add(getString(R.string.zen_MoveSpeed))
                createListElement("Zenyatta", R.drawable.zenyatta, list1)

                val list2: MutableList<String> = ArrayList()
                list2.add(getString(R.string.zen_gun_detail))
                list2.add(getString(R.string.zen_gun_damage))
                list2.add(getString(R.string.zen_gun_type))
                list2.add(getString(R.string.zen_gun_speed))
                list2.add(getString(R.string.zen_gun_ROF))
                list2.add(getString(R.string.zen_gun_volley))
                list2.add(getString(R.string.zen_gun_ammo))
                list2.add(getString(R.string.zen_gun_reloadspeed))
                list2.add(getString(R.string.zen_gun_canHeadshot))
                createListElement(getString(R.string.zen_gun), R.drawable.zenyatta, list2)
            }

            "D.Va"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.dva_Nationality))
                list1.add(getString(R.string.dva_Health))
                list1.add(getString(R.string.dva_Armour))
                list1.add(getString(R.string.dva_MoveSpeed))
                createListElement("D.Va", R.drawable.dva, list1)

                val list2: MutableList<String> = ArrayList()
                list2.add(getString(R.string.dva_gun_detail))
                createListElement(getString(R.string.dva_gun), R.drawable.dva_fusioncannon, list2)

                val list3: MutableList<String> = ArrayList()
                list3.add(getString(R.string.dva_defense_matrix_detail))
                createListElement(getString(R.string.dva_defense_matrix), R.drawable.dva_defensematrix, list3)

                val list4: MutableList<String> = ArrayList()
                list4.add(getString(R.string.dva_boosters_detail))
                createListElement(getString(R.string.dva_boosters), R.drawable.dva_boosters, list4)

                val list5: MutableList<String> = ArrayList()
                list5.add(getString(R.string.dva_micro_missiles_detail))
                createListElement(getString(R.string.dva_micro_missiles), R.drawable.dva_micromissiles, list5)

                val list6: MutableList<String> = ArrayList()
                list6.add(getString(R.string.dva_ultimate_detail))
                createListElement(getString(R.string.dva_ultimate), R.drawable.dva_selfdestruct, list6)

                val list7: MutableList<String> = ArrayList()
                list7.add(getString(R.string.dva_demeched_detail))
                list7.add(getString(R.string.dva_demeched_exit_time))
                list7.add(getString(R.string.dva_demeched_Health))
                list7.add(getString(R.string.dva_demeched_MoveSpeed))
                createListElement(getString(R.string.dva_demeched), R.drawable.dva, list7)

                val list8: MutableList<String> = ArrayList()
                list8.add(getString(R.string.dva_gun2_detail))
                createListElement(getString(R.string.dva_gun2), R.drawable.dva_lightgun, list8)

                val list9: MutableList<String> = ArrayList()
                list9.add(getString(R.string.dva_ultimate2_detail))
                createListElement(getString(R.string.dva_ultimate2), R.drawable.dva_callmech, list9)
            }

            "Orisa"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.orisa_Nationality))
                list1.add(getString(R.string.orisa_Health))
                list1.add(getString(R.string.orisa_Armour))
                list1.add(getString(R.string.orisa_MoveSpeed))
                createListElement("Orisa", R.drawable.orisa, list1)

                val list2: MutableList<String> = ArrayList()
                list2.add(getString(R.string.orisa_gun_detail))
                createListElement(getString(R.string.orisa_gun), R.drawable.ori_fusiondriver, list2)

                val list3: MutableList<String> = ArrayList()
                list3.add(getString(R.string.orisa_halt_detail))
                createListElement(getString(R.string.orisa_halt), R.drawable.ori_halt, list3)

                val list4: MutableList<String> = ArrayList()
                list4.add(getString(R.string.orisa_fortify_detail))
                createListElement(getString(R.string.orisa_fortify), R.drawable.ori_fortify, list4)

                val list5: MutableList<String> = ArrayList()
                list5.add(getString(R.string.orisa_barrier_detail))
                createListElement(getString(R.string.orisa_barrier), R.drawable.ori_protectivebarrier, list5)

                val list6: MutableList<String> = ArrayList()
                list6.add(getString(R.string.orisa_ultimate_detail))
                createListElement(getString(R.string.orisa_ultimate), R.drawable.ori_supercharger, list6)
            }

            "Reinhardt"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.reinhardt_Nationality))
                list1.add(getString(R.string.reinhardt_Health))
                list1.add(getString(R.string.reinhardt_Armour))
                list1.add(getString(R.string.reinhardt_MoveSpeed))
                createListElement("Reinhardt", R.drawable.reinhardt, list1)

                val list2: MutableList<String> = ArrayList()
                list2.add(getString(R.string.reinhardt_gun_detail))
                createListElement(getString(R.string.reinhardt_gun), R.drawable.rei_rockethammer, list2)

                val list4: MutableList<String> = ArrayList()
                list4.add(getString(R.string.reinhardt_shield_detail))
                createListElement(getString(R.string.reinhardt_shield), R.drawable.rei_barrierfield, list4)

                val list5: MutableList<String> = ArrayList()
                list5.add(getString(R.string.reinhardt_charge_detail))
                createListElement(getString(R.string.reinhardt_charge), R.drawable.rei_charge, list5)

                val list6: MutableList<String> = ArrayList()
                list6.add(getString(R.string.reinhardt_firestrike_detail))
                createListElement(getString(R.string.reinhardt_firestrike), R.drawable.rei_firestrike, list6)

                val list3: MutableList<String> = ArrayList()
                list3.add(getString(R.string.reinhardt_ultimate_detail))
                createListElement(getString(R.string.reinhardt_ultimate), R.drawable.rei_earthshatter, list3)

                val list7: MutableList<String> = ArrayList()
                list7.add(getString(R.string.reinhardt_passive_detail))
                createListElement(getString(R.string.reinhardt_passive), R.drawable.rei_steadfast, list7)
            }

            "Roadhog"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.roadhog_Nationality))
                list1.add(getString(R.string.roadhog_Health))
                list1.add(getString(R.string.roadhog_MoveSpeed))
                createListElement("Roadhog", R.drawable.roadhog, list1)

                val list2: MutableList<String> = ArrayList()
                list2.add(getString(R.string.roadhog_gun_detail))
                createListElement(getString(R.string.roadhog_gun), R.drawable.hog_scrapgun, list2)

                val list3: MutableList<String> = ArrayList()
                list3.add(getString(R.string.roadhog_takeabreather_detail))
                createListElement(getString(R.string.roadhog_takeabreather), R.drawable.hog_takeabreather, list3)

                val list4: MutableList<String> = ArrayList()
                list4.add(getString(R.string.roadhog_hook_detail))
                createListElement(getString(R.string.roadhog_hook), R.drawable.hog_chainhook, list4)

                val list5: MutableList<String> = ArrayList()
                list5.add(getString(R.string.roadhog_ultimate_detail))
                createListElement(getString(R.string.roadhog_ultimate), R.drawable.hog_wholehog, list5)
            }

            "Sigma"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.sigma_Nationality))
                list1.add(getString(R.string.sigma_Health))
                list1.add(getString(R.string.sigma_Shields))
                list1.add(getString(R.string.sigma_MoveSpeed))
                createListElement("Sigma", R.drawable.sigma, list1)

                val list2: MutableList<String> = ArrayList()
                list2.add(getString(R.string.sigma_gun_detail))
                createListElement(getString(R.string.sigma_gun), R.drawable.sig_hyperspheres, list2)

                val list3: MutableList<String> = ArrayList()
                list3.add(getString(R.string.sigma_barrier_detail))
                createListElement(getString(R.string.sigma_barrier), R.drawable.sig_experimentalbarrier, list3)

                val list4: MutableList<String> = ArrayList()
                list4.add(getString(R.string.sigma_grasp_detail))
                createListElement(getString(R.string.sigma_grasp), R.drawable.sig_kineticgrasp, list4)

                val list5: MutableList<String> = ArrayList()
                list5.add(getString(R.string.sigma_accretion_detail))
                createListElement(getString(R.string.sigma_accretion), R.drawable.sig_accretion, list5)

                val list6: MutableList<String> = ArrayList()
                list6.add(getString(R.string.sigma_ultimate_detail))
                createListElement(getString(R.string.sigma_ultimate), R.drawable.sig_graviticflux, list6)
            }

            "Winston"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.winston_Nationality))
                list1.add(getString(R.string.winston_Health))
                list1.add(getString(R.string.winston_Armour))
                list1.add(getString(R.string.winston_MoveSpeed))
                createListElement("Winston", R.drawable.winston, list1)

                val list2: MutableList<String> = ArrayList()
                list2.add(getString(R.string.winston_gun_detail))
                createListElement(getString(R.string.winston_gun), R.drawable.win_teslacannon, list2)

                val list3: MutableList<String> = ArrayList()
                list3.add(getString(R.string.winston_jumppack_detail))
                createListElement(getString(R.string.winston_jumppack), R.drawable.win_jumppack, list3)

                val list4: MutableList<String> = ArrayList()
                list4.add(getString(R.string.winston_barrier_detail))
                createListElement(getString(R.string.winston_barrier), R.drawable.win_barrierprojector, list4)

                val list5: MutableList<String> = ArrayList()
                list5.add(getString(R.string.winston_ultimate_detail))
                createListElement(getString(R.string.winston_ultimate), R.drawable.win_primalrage, list5)
            }

            "Wrecking Ball"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.ball_Nationality))
                list1.add(getString(R.string.ball_Health))
                list1.add(getString(R.string.ball_Armour))
                list1.add(getString(R.string.ball_MoveSpeed))
                createListElement("Wrecking Ball", R.drawable.ball, list1)

                val list2: MutableList<String> = ArrayList()
                list2.add(getString(R.string.ball_gun_detail))
                createListElement(getString(R.string.ball_gun), R.drawable.bal_quadcannons, list2)
            }

            "Zarya"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.zarya_Nationality))
                list1.add(getString(R.string.zarya_Health))
                list1.add(getString(R.string.zarya_Shields))
                list1.add(getString(R.string.zarya_MoveSpeed))
                createListElement("Zarya", R.drawable.zarya, list1)

                val list2: MutableList<String> = ArrayList()
                list2.add(getString(R.string.zarya_gun_detail))
                createListElement(getString(R.string.zarya_gun), R.drawable.zar_particlecannon, list2)
            }

            "Ashe"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.Ashe_Nationality))
                list1.add(getString(R.string.Ashe_Health))
                list1.add(getString(R.string.Ashe_MoveSpeed))
                createListElement("Ashe", R.drawable.ashe, list1)
            }

            "Bastion"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.bastion_Nationality))
                list1.add(getString(R.string.bastion_Health))
                list1.add(getString(R.string.bastion_Armour))
                list1.add(getString(R.string.bastion_MoveSpeed))
                createListElement("Bastion", R.drawable.bastion, list1)
            }

            "Doomfist"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.doomfist_Nationality))
                list1.add(getString(R.string.doomfist_Health))
                list1.add(getString(R.string.doomfist_MoveSpeed))
                createListElement("Doomfist", R.drawable.doomfist, list1)
            }

            "Echo"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.echo_Nationality))
                list1.add(getString(R.string.echo_Health))
                list1.add(getString(R.string.echo_MoveSpeed))
                createListElement("Echo", R.drawable.echo, list1)
            }

            "Genji"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.genji_Nationality))
                list1.add(getString(R.string.genji_Health))
                list1.add(getString(R.string.genji_MoveSpeed))
                createListElement("Genji", R.drawable.genji, list1)
            }

            "Hanzo"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.hanzo_Nationality))
                list1.add(getString(R.string.hanzo_Health))
                list1.add(getString(R.string.hanzo_MoveSpeed))
                createListElement("Hanzo", R.drawable.hanzo, list1)
            }

            "Junkrat"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.junkrat_Nationality))
                list1.add(getString(R.string.junkrat_Health))
                list1.add(getString(R.string.junkrat_MoveSpeed))
                createListElement("Junkrat", R.drawable.junkrat, list1)
            }

            "McCree"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.mccree_Nationality))
                list1.add(getString(R.string.mccree_Health))
                list1.add(getString(R.string.mccree_MoveSpeed))
                createListElement("McCree", R.drawable.mccree, list1)
            }

            "Mei"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.mei_Nationality))
                list1.add(getString(R.string.mei_Health))
                list1.add(getString(R.string.mei_MoveSpeed))
                createListElement("Mei", R.drawable.mei, list1)
            }

            "Pharah"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.Ashe_Nationality))
                list1.add(getString(R.string.Ashe_Health))
                list1.add(getString(R.string.Ashe_MoveSpeed))
                createListElement("Pharah", R.drawable.ashe, list1)
            }

            "Reaper"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.reaper_Nationality))
                list1.add(getString(R.string.reaper_Health))
                list1.add(getString(R.string.reaper_MoveSpeed))
                createListElement("Reaper", R.drawable.reaper, list1)
            }

            "Soldier: 76"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.soldier76_Nationality))
                list1.add(getString(R.string.soldier76_Health))
                list1.add(getString(R.string.soldier76_MoveSpeed))
                createListElement("Soldier: 76", R.drawable.soldier76, list1)
            }

            "Sombra"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.sombra_Nationality))
                list1.add(getString(R.string.sombra_Health))
                list1.add(getString(R.string.sombra_MoveSpeed))
                createListElement("Sombra", R.drawable.sombra, list1)
            }

            "Torbjorn"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.torb_Nationality))
                list1.add(getString(R.string.torb_Health))
                list1.add(getString(R.string.torb_Armour))
                list1.add(getString(R.string.torb_MoveSpeed))
                createListElement("Torbjorn", R.drawable.torbjorn, list1)
            }

            "Tracer"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.tracer_Nationality))
                list1.add(getString(R.string.tracer_Health))
                list1.add(getString(R.string.tracer_MoveSpeed))
                createListElement("Tracer", R.drawable.tracer, list1)
            }

            "Widowmaker"->
            {
                val list1: MutableList<String> = ArrayList()
                list1.add(getString(R.string.widowmaker_Nationality))
                list1.add(getString(R.string.widowmaker_Health))
                list1.add(getString(R.string.widowmaker_MoveSpeed))
                createListElement("Widowmaker", R.drawable.widowmaker, list1)
            }

            else ->
            {
                //THIS MUST NEVER HAPPEN
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