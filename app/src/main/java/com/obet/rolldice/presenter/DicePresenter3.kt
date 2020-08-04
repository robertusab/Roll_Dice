package com.obet.rolldice.presenter

import android.util.Log
import com.obet.rolldice.view.MainView

class DicePresenter3 {
    fun setView(view: MainView) {
        this.view = view
    }

    private lateinit var view: MainView
    private var score: Int = 0

    fun diceRoll() {
        when ((1..6).random()) {
            1 -> {
                score += 5
                Log.d("dadu player 3", "1")
            }
            2 -> {
                score -= 3
                Log.d("dadu player 3", "2")
            }
            3 -> {
                score += 5
                Log.d("dadu player 3", "3")
            }
            4 -> {
                score -= 3
                Log.d("dadu player 3", "4")
            }
            5 -> {
                score += 5
                Log.d("dadu player 3", "5")
            }
            6 -> {
                score -= 3
                Log.d("dadu player 3", "6")
            }
        }
        view.result3("$score")
        Log.d("Score", score.toString())
    }
}