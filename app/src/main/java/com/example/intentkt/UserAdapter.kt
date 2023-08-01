package com.example.intentkt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

// listView는 반드시 Adapter로 연결을 해야 한다.
class UserAdapter (val context: Context, val Userlist: ArrayList<User>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.list_item_user, null)

        val profile = view.findViewById<ImageView>(R.id.imgPro)
        val name = view.findViewById<TextView>(R.id.textVname)
        val greet = view.findViewById<TextView>(R.id.textVgreet)
        val age = view.findViewById<TextView>(R.id.textVage)

        val user = Userlist[position] // 0번부터 시작

        profile.setImageResource(user.profile)
        name.text = user.name
        age.text = user.age
        greet.text = user.greet

        return view
    }


    override fun getCount(): Int {

        return Userlist.size
    }

    override fun getItem(position: Int): Any {

        return Userlist[position]
    }

    override fun getItemId(position: Int): Long {

        return 0
    }


}