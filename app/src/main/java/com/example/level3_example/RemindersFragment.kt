package com.example.level3_example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_reminder.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class RemindersFragment : Fragment() {

    private val reminders = arrayListOf<Reminder>()
    private val reminderAdapter = ReminderAdapter(reminders)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        // Initialize the recycler view with a linear layout manager, adapter
        rvReminders.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        rvReminders.adapter = reminderAdapter
        rvReminders.addItemDecoration(DividerItemDecoration(context,DividerItemDecoration.VERTICAL))
    }

}