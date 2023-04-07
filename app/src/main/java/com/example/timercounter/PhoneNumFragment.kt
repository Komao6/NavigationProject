package com.example.timercounter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class PhoneNumFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_phone_num, container, false)

        val greetingText = view.findViewById<TextView>(R.id.greeting_text)
        val nextToSmsButton = view.findViewById<Button>(R.id.next_to_sms_bt)
        val phonenum = view.findViewById<EditText>(R.id.phone_num)



        nextToSmsButton.setOnClickListener {
            val phoneNum11 = phonenum.text.toString()
            if (phoneNum11.length >= 3)
            {
                val action = PhoneNumFragmentDirections.actionPhoneNumFragmentToSmsVerificationFragment(phoneNum11)
                findNavController().navigate(action)
            }
        }
        return view
    }

}