package com.obet.rolldice.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.obet.rolldice.R
import com.obet.rolldice.presenter.DicePresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    private lateinit var presenter: DicePresenter
    var nama = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = DicePresenter()
        presenter.setView(this)

        button_roll.setOnClickListener {
            presenter.diceRoll()
        }

//        nama = getString("nama")
        tv_username.text = "$nama"
        intent.putExtra("nama", nama)
    }

    override fun result(result: String) {
        tv_score.text = result
    }
}