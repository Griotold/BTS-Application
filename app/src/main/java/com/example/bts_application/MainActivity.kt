package com.example.bts_application

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.bts_application.R.id.bts_image_1
import com.example.bts_application.R.id.bts_image_2
import com.example.bts_application.R.id.bts_image_3
import com.example.bts_application.R.id.bts_image_4
import com.example.bts_application.R.id.bts_image_5
import com.example.bts_application.R.id.bts_image_6
import com.example.bts_application.R.id.bts_image_7

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 화면이 클릭되었다는 것을 알아야 합니다!
        // Toast는 안드로이드에서 잠깐(짧은 시간) 화면 하단에 표시되는 작은 메시지 박스입니다.
        val image1 = findViewById<ImageView>(bts_image_1)
        image1.setOnClickListener{
            // Toast.makeText(context, text, duration)
            Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보이게!
            val intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)
        }

        // 2 ~ 7 도 동일하게
        val image2 = findViewById<ImageView>(bts_image_2)
        image2.setOnClickListener{
            // Toast.makeText(context, text, duration)
            Toast.makeText(this, "2번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보이게!
            val intent = Intent(this, Bts2Activity::class.java)
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(bts_image_3)
        image3.setOnClickListener{
            // Toast.makeText(context, text, duration)
            Toast.makeText(this, "3번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보이게!
            val intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)
        }

        val image4 = findViewById<ImageView>(bts_image_4)
        image4.setOnClickListener{
            // Toast.makeText(context, text, duration)
            Toast.makeText(this, "4번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보이게!
            val intent = Intent(this, Bts4Activity::class.java)
            startActivity(intent)
        }

        val image5 = findViewById<ImageView>(bts_image_5)
        image5.setOnClickListener{
            // Toast.makeText(context, text, duration)
            Toast.makeText(this, "5번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보이게!
            val intent = Intent(this, Bts5Activity::class.java)
            startActivity(intent)
        }

        val image6 = findViewById<ImageView>(bts_image_6)
        image6.setOnClickListener{
            // Toast.makeText(context, text, duration)
            Toast.makeText(this, "6번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보이게!
            val intent = Intent(this, Bts6Activity::class.java)
            startActivity(intent)
        }

        val image7 = findViewById<ImageView>(bts_image_7)
        image7.setOnClickListener{
            // Toast.makeText(context, text, duration)
            Toast.makeText(this, "7번 클릭 완료", Toast.LENGTH_SHORT).show()

            // 2. 화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보이게!
            val intent = Intent(this, Bts7Activity::class.java)
            startActivity(intent)
        }
    }
}