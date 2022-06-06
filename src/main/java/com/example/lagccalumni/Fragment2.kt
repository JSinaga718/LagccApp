package com.example.lagccalumni

import android.graphics.Color
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment

        val view : View = inflater.inflate(R.layout.fragment_fragment2, container, false)

        val applyJobs : TextView = view.findViewById(R.id.applyJob)

        applyJobs.movementMethod = LinkMovementMethod.getInstance()
        applyJobs.setLinkTextColor(Color.BLUE)

        val applyIntern : TextView = view.findViewById(R.id.applyIntern)

        applyIntern.movementMethod = LinkMovementMethod.getInstance()
        applyIntern.setLinkTextColor(Color.BLUE)

        val applyCom : TextView = view.findViewById(R.id.applyCom)
        applyCom.movementMethod = LinkMovementMethod.getInstance()
        applyCom.setLinkTextColor(Color.BLUE)
        return view
    }
}