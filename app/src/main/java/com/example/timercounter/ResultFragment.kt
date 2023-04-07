package com.example.timercounter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs

class ResultFragment : Fragment() {

    private val args:ResultFragmentArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_result, container, false)

        val resultTextView = view.findViewById<TextView>(R.id.result_text_view)
        val resultPhoneNum = view.findViewById<TextView>(R.id.phonenum_result_text)
        val  resultCodeVer = view.findViewById<TextView>(R.id.ver_code_result_text)

        resultCodeVer.text = args.resultVecodeNum
        resultPhoneNum.text = args.resultPhoneNum
        return view
    }


}