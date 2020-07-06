package com.obet.rolldice.presenter

import android.util.Log
import com.obet.rolldice.view.MainView

class DicePresenter {
    fun setView(view: MainView) {
        this.view = view
    }

    private lateinit var view: MainView
    private var score: Int = 0

    fun diceRoll() {
        when ((1..6).random()) {
            1, 3, 5 -> score += 5
            2, 4, 6 -> score -= 3
        }
        view.result("$score")
        Log.d("Score", score.toString() )
    }
}