package com.example.lagccalumni

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Fragment3 : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view : View = inflater.inflate(R.layout.fragment_fragment3, container, false)



        val recView : RecyclerView = view.findViewById(R.id.resumeList)

        //we use linear layout manager to display list vertically when only 1 col.
        recView.layoutManager = LinearLayoutManager(requireContext())

        //whenever you add something to list, it will display inside list because of adapter
        val images:ArrayList<Resume> = ArrayList()
        images.add(Resume("Action words\n Use these buzz words to stand out and effectively describe your skills and work ethic. Words are very important!", R.drawable.action_words))
        images.add(Resume("Resume sample\n This is a sample of a student's resume in the Junior year of college", R.drawable.jr_dev_resume))
        images.add(Resume("Resume sample\n This is a sample of a student's resume in the Senior year of college", R.drawable.sr_dev_resume))
        images.add(Resume("Cover letter sample\n Many employers still use cover letters. Although they may be intimidating, they are very simple and straight forward.", R.drawable.cover_letter))
        images.add(Resume("Lagcc", R.drawable.logo))
        recView.adapter = ResumeListAdapter(images)


        return view
    }
}