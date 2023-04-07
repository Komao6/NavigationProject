package com.example.timercounter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.findFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class SmsVerificationFragment : Fragment() {

    private val args:SmsVerificationFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sms_verification, container, false)

        val phoneNumTextView = view.findViewById<TextView>(R.id.phone_num_text_view)
        val verCodeTextView = view.findViewById<TextView>(R.id.ver_code_text_view)
        val nextToResultButton = view.findViewById<Button>(R.id.next_to_result_bt)
        val verCode = view.findViewById<EditText>(R.id.ver_code)

        phoneNumTextView.text =args.phonenum
        nextToResultButton.setOnClickListener {
            val varCode1 = verCode.text.toString()
            if(varCode1.length >= 6){

                val action = SmsVerificationFragmentDirections.actionSmsVerificationFragmentToResultFragment(varCode1,args.phonenum)
                findNavController().navigate(action)
            }


        }

        return view
    }

}