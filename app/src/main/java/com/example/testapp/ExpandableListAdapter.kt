package com.example.testapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ExpandableListView
import android.widget.TextView
import kotlinx.android.synthetic.main.heroactivity.*

class ExpandableListAdapter(val context: Context, val expListView : ExpandableListView,
                            val header: MutableList<String>, val body: MutableList<MutableList<String>>) : BaseExpandableListAdapter()
{
    override fun getGroup(groupPosition: Int): String {
        return header[groupPosition]
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup?): View? {
        var cView = convertView
        if(cView == null)
        {
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            cView = inflater.inflate(R.layout.expandable_list_group, null)
        }
        val title = cView?.findViewById<TextView>(R.id.textView)
        title?.text = getGroup(groupPosition)

        title?.setOnClickListener{
            if(expListView.isGroupExpanded(groupPosition))
                expListView.collapseGroup(groupPosition)
            else expListView.expandGroup(groupPosition)
        }

        return cView
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return body[groupPosition].size
    }

    override fun getChild(groupPosition: Int, childPosition: Int): String {
        return body[groupPosition][childPosition]
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean, convertView: View?, parent: ViewGroup?): View? {
        var cView = convertView
        if(cView == null)
        {
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            cView = inflater.inflate(R.layout.expandable_list_item, null)
        }
        val title = cView?.findViewById<TextView>(R.id.textView)
        title?.text = getChild(groupPosition, childPosition)
        return cView
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun getGroupCount(): Int {
        return header.size
    }

}