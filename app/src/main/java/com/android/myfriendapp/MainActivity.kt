package com.android.myfriendapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.my_friends_fragment.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tampilMyFriendsFragment()
    }

    private fun changeFragment(fragmentManager: FragmentManager,
                               fragment: Fragment,frameId: Int){

        val transaction = fragmentManager.beginTransaction()
        transaction.replace(frameId, fragment)

        transaction.commit()
    }

    fun tampilMyFriendsFragment(){
        changeFragment(supportFragmentManager, MyFriendsFragment.newInstance(),
            R.id.contentFrame)
    }

    fun tampilMyFriendsAddFragment(){
        changeFragment(supportFragmentManager, MyFriendsAddFragment.newInstance(),
            R.id.contentFrame)
    }
}
