package com.example.intentkt

import android.content.ActivityNotFoundException
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import com.example.intentkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btn.setOnClickListener {

            val intent = Intent(this, SubActivity::class.java) // 화면 전환
            //intent.putExtra("msg",binding.textView.text.toString()) // hello World라는 text 값을 담아서 msg라는 키로 잠금
            startActivity(intent) // intent에 저장되어 있는 activity쪽으로 이동
            // finish()          // 자기 자신 activity하면 파괴

        }
        binding.btn2.setOnClickListener {

            binding.flag.setImageResource(R.drawable.castle) // 버튼을 클릭하면 새로운 이미지 변경

            Toast.makeText(this@MainActivity, "버튼이 클릭 되었습니다.", Toast.LENGTH_SHORT).show()
        }

    }

}



