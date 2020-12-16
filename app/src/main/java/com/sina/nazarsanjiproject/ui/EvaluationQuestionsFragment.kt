package com.sina.nazarsanjiproject.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sina.nazarsanjiproject.MyRecyclerViewAdapter
import com.sina.nazarsanjiproject.R
import com.sina.nazarsanjiproject.databinding.FragmentEvaluationQuestionsBinding


class EvaluationQuestionsFragment : Fragment() {

    lateinit var binding: FragmentEvaluationQuestionsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding= FragmentEvaluationQuestionsBinding.bind(inflater.inflate(R.layout.fragment_evaluation_questions, container, false))
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val adapter=MyRecyclerViewAdapter(getQuestionsList())
        binding.rvQuestions.adapter=adapter
    }

    private fun getQuestionsList(): MutableList<String> {
        return mutableListOf(
            "شما دیزاین این اپ را چطور ارزیابی میکنید؟",
            "شما راحتی کار با این اپ را چطور ارزیابی میکنید؟",
            "شما سرعت عملکرد اپ را چطور ارزیابی میکنید؟",
            "شما دیزاین این اپ را چطور ارزیابی میکنید؟",
            "شما راحتی کار با این اپ را چطور ارزیابی میکنید؟",
            "شما سرعت عملکرد اپ را چطور ارزیابی میکنید؟",
            "شما دیزاین این اپ را چطور ارزیابی میکنید؟",
            "شما راحتی کار با این اپ را چطور ارزیابی میکنید؟",
            "شما سرعت عملکرد اپ را چطور ارزیابی میکنید؟",
        )

    }
}