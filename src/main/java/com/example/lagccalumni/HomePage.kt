package com.example.lagccalumni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.lagccalumni.databinding.ActivityHomePageBinding

class HomePage : AppCompatActivity() {
    private lateinit var binding: ActivityHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragment1btn.setOnClickListener {
            replaceFragment(Fragment1 ())
        }

        binding.fragment2btn.setOnClickListener() {
            replaceFragment(Fragment2())
        }

        binding.fragment3btn.setOnClickListener() {
           replaceFragment(Fragment3())
    }
}
    private fun replaceFragment(fragment: Fragment) {
        var fragmentmanager : FragmentManager = supportFragmentManager;
        var fragmentTransaction : FragmentTransaction = fragmentmanager.beginTransaction()
        fragmentTransaction.replace(R.id.fragcontainer,fragment)
        fragmentTransaction.commit()
    }
}