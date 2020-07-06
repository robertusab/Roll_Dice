package com.obet.rolldice.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.obet.rolldice.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var nama: String

        button_login.setOnClickListener {
            nama = et_name.text.toString()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("nama", nama)
            startActivity(intent)
            finish()
        }
    }
}