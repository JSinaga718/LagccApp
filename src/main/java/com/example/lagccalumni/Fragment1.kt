package com.example.lagccalumni

import android.graphics.Color
import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_fragment1, container, false)
        val applyTransfer: TextView = view.findViewById(R.id.applyTransfer)
        applyTransfer.movementMethod = LinkMovementMethod.getInstance()
        applyTransfer.setLinkTextColor(Color.BLUE)

        val applyReq: TextView = view.findViewById(R.id.applyReq)
        applyReq.movementMethod = LinkMovementMethod.getInstance()
        applyReq.setLinkTextColor(Color.BLUE)

        val applyFin: TextView = view.findViewById(R.id.applyFin)
        applyFin.movementMethod = LinkMovementMethod.getInstance()
        applyFin.setLinkTextColor(Color.BLUE)

        val applyCun: TextView = view.findViewById(R.id.applyCun)
        applyCun.movementMethod = LinkMovementMethod.getInstance()
        applyCun.setLinkTextColor(Color.BLUE)

        val applyNys: TextView = view.findViewById(R.id.applyNys)
        applyNys.movementMethod = LinkMovementMethod.getInstance()
        applyNys.setLinkTextColor(Color.BLUE)

        val applyFaq: TextView = view.findViewById(R.id.applyFaq)
        applyFaq.movementMethod = LinkMovementMethod.getInstance()
        applyFaq.setLinkTextColor(Color.BLUE)

        val applyStud: TextView = view.findViewById(R.id.applyStud)
        applyStud.movementMethod = LinkMovementMethod.getInstance()
        applyStud.setLinkTextColor(Color.BLUE)

        val applyContact: TextView = view.findViewById(R.id.applyContact)
        applyContact.movementMethod = LinkMovementMethod.getInstance()
        applyContact.setLinkTextColor(Color.BLACK)

        // Inflate the layout for this fragment
        return view
    }
}