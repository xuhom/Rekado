package com.pavelrekun.rekado.screens.main_activity

interface MainContract {

    interface View {

        fun initViews()

        fun initToolbar()

        fun initNavigationClickListener()

        fun showUpdaterDialog()

        fun onStart()

        fun onStop()

    }

}