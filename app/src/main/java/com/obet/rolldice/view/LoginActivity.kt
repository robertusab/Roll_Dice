package com.obet.rolldice.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.obet.rolldice.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    var nama1 = ""
    var nama2 = ""
    var nama3 = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button_login.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            nama1 = et_name_1.text.toString()
            intent.putExtra("nama1", nama1)
            nama2 = et_name_2.text.toString()
            intent.putExtra("nama2", nama2)
            nama3 = et_name_3.text.toString()
            intent.putExtra("nama3", nama3)
            startActivity(intent)
            finish()
        }
    }
}