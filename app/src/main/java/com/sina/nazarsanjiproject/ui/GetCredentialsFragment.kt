package com.sina.nazarsanjiproject.ui

import android.os.Bundle
import android.os.Parcel
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.sina.nazarsanjiproject.R
import com.sina.nazarsanjiproject.databinding.FragmentGetCredentialsBinding
import com.sina.nazarsanjiproject.datamodel.Voter


class GetCredentialsFragment : Fragment() {

    lateinit var binding: FragmentGetCredentialsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGetCredentialsBinding.bind(
            inflater.inflate(
                R.layout.fragment_get_credentials,
                container,
                false
            )
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSabtAndstartQuestions.setOnClickListener {
            val firstName = binding.etFirstName.text.toString()
            val lastName: String = binding.etLastName.text.toString()
            val age = binding.etAge.text.toString()
            val phone = binding.etPhone.text.toString()
            if (age.isNotEmpty() && phone.isNotEmpty()) {
                val voter = Voter(firstName, lastName, age.toInt(), phone.toLong())
                findNavController().navigate(
                    GetCredentialsFragmentDirections.
                    actionGetCredentialsFragmentToEvaluationQuestionsFragment(
                        voter
                    )
                )
            } else {
//                Toast.makeText(activity, "لطفا قسمت های اجباری را پر کنید", Toast.LENGTH_SHORT)
//                    .show()
                Log.e("TAG", "onViewCreated: لطفا قسمت های اجباری را پر کنید", )
                binding.tvWarningForNotOptional.visibility=View.VISIBLE
            }

        }
    }


}