package com.example.bts_application

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.bts_application.R.id.bts_image_1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 화면이 클릭되었다는 것을 알아야 합니다!
        // Toast는 안드로이드에서 잠깐(짧은 시간) 화면 하단에 표시되는 작은 메시지 박스입니다.
        val image1 = findViewById<ImageView>(bts_image_1)
        image1.setOnClickListener{
            // Toast.makeText(context, text, duration)
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_LONG).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보이게!
            val intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }



    }
}