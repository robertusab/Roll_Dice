package com.obet.rolldice.presenter

import android.util.Log
import com.obet.rolldice.view.MainView

class DicePresenter2 {
    fun setView(view: MainView) {
        this.view = view
    }

    private lateinit var view: MainView
    private var score: Int = 0

    fun diceRoll() {
        when ((1..6).random()) {
            1 -> {
                score += 5
                Log.d("dadu player 2", "1")
            }
            2 -> {
                score -= 3
                Log.d("dadu player 2", "2")
            }
            3 -> {
                score += 5
                Log.d("dadu player 2", "3")
            }
            4 -> {
                score -= 3
                Log.d("dadu player 2", "4")
            }
            5 -> {
                score += 5
                Log.d("dadu player 2", "5")
            }
            6 -> {
                score -= 3
                Log.d("dadu player 2", "6")
            }
        }
        view.result2("$score")
        Log.d("Score", score.toString())
    }
}