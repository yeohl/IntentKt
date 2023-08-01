package com.example.intentkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.intentkt.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    var UserList = arrayListOf<User>(
        User(R.drawable.profile, "빵빵이","30","안녕하세여"),
        User(R.drawable.profile, "옥지얌","30","마카롱"),
        User(R.drawable.profile, "오사카","9","덥다"),
        User(R.drawable.profile, "여행","48","기대된다"),
        User(R.drawable.profile, "도쿄","11","디즈니랜드"),
        User(R.drawable.profile, "유니버셜","2","비싸다")
    )

    private lateinit var binding: ActivitySubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySubBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


//        if (intent.hasExtra("msg")){
//            binding.textView2.text = intent.getStringExtra("msg") // 서브에 존재하는 textView2에다가 hello World가 넘겨져 옴
//        }

//        val item = arrayOf("월요일","화요일","수요일","목요일","금요일")
//        // context란 한 액티비티의 모든 정보를 담고 있음
//        binding.listV.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

        val Adapter = UserAdapter(this,UserList)
        binding.listV.adapter = Adapter

        binding.listV.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            val selectItem = parent.getItemAtPosition(position) as User
            Toast.makeText(this,selectItem.name, Toast.LENGTH_SHORT).show()



        }

    }
}