package com.obet.rolldice.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.obet.rolldice.R
import com.obet.rolldice.presenter.DicePresenter1
import com.obet.rolldice.presenter.DicePresenter2
import com.obet.rolldice.presenter.DicePresenter3
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    private lateinit var presenter1: DicePresenter1
    private lateinit var presenter2: DicePresenter2
    private lateinit var presenter3: DicePresenter3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ronde = 0

        presenter1 = DicePresenter1()
        presenter1.setView(this)
        presenter2 = DicePresenter2()
        presenter2.setView(this)
        presenter3 = DicePresenter3()
        presenter3.setView(this)

        val nama1 = intent.getStringExtra("nama1")
        tv_player1.text = "$nama1"
        intent.putExtra("nama1", nama1)
        val nama2 = intent.getStringExtra("nama2")
        tv_player2.text = "$nama2"
        intent.putExtra("nama2", nama2)
        val nama3 = intent.getStringExtra("nama3")
        tv_player3.text = "$nama3"
        intent.putExtra("nama3", nama3)

        button_roll.setOnClickListener {
            presenter1.diceRoll()
            presenter2.diceRoll()
            presenter3.diceRoll()

            if (ronde < 4) {
                ronde++
            } else {
                button_roll.setEnabled(false)
                tv_winner.visibility = View.VISIBLE
            }

            if (tv_score_1.text.toString().toInt() >
                tv_score_2.text.toString().toInt() &&
                tv_score_1.text.toString().toInt() >
                tv_score_3.text.toString().toInt()
            ) {
                tv_winner.text = "$nama1 is the Winner"

            } else if (tv_score_2.text.toString().toInt() >
                tv_score_1.text.toString().toInt() &&
                tv_score_2.text.toString().toInt() >
                tv_score_3.text.toString().toInt()
            ) {
                tv_winner.text = "$nama2 is the Winner"

            } else if (tv_score_3.text.toString().toInt() >
                tv_score_1.text.toString().toInt() &&
                tv_score_3.text.toString().toInt() >
                tv_score_2.text.toString().toInt()
            ) {
                tv_winner.text = "$nama3 is the Winner"
            }
        }
    }

    override fun result1(result: String) {
        tv_score_1.text = result
    }

    override fun result2(result: String) {
        tv_score_2.text = result
    }

    override fun result3(result: String) {
        tv_score_3.text = result
    }

    override fun onBackPressed() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}