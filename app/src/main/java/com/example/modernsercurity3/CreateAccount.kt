package com.example.modernsercurity3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class CreateAccount : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_create_account, container, false)

        val redirectLink = view.findViewById<TextView>(R.id.login_redirect)
        val createAccountButton = view.findViewById<Button>(R.id.create_account_button)

        redirectLink.setOnClickListener { view ->
            findNavController().navigate(R.id.login)
        }

        return view
    }

}