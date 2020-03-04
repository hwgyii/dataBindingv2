package com.example.yukit_exer4_slambook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.yukit_exer4_slambook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //created class variable binding
    private val name: Name = Name("Enter Name:")
    private val nickname: Nickname = Nickname("Enter Nickname:")
    private val age: Age = Age("Enter Age:")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding.name = name
        binding.nickname = nickname
        binding.age = age

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.submitButton.setOnClickListener() {
            submit(it)
        }
    }

    private fun submit(view: View) {

        binding.apply {
            name?.name = "Name: " + binding.namePlainText.toString()
            age?.age = "Age: " + binding.agePlainText.toString()
            nickname?.nickname = "Nickname: " + binding.nicknamePlainText.toString()
            invalidateAll()

            binding.namePlainText.visibility = View.GONE
            binding.nicknamePlainText.visibility = View.GONE
            binding.agePlainText.visibility = View.GONE
            binding.birthdayDate.visibility = View.GONE
            binding.birthdayTextView.visibility = View.GONE
            binding.coursePlainText.visibility = View.GONE
            binding.courseTextView.visibility = View.GONE
            binding.phoneNumPhone.visibility = View.GONE
            binding.phoneNumTextView.visibility = View.GONE
            binding.colorPlainText.visibility = View.GONE
            binding.colorTextView.visibility = View.GONE
            binding.crushPlainText.visibility = View.GONE
            binding.crushTextView.visibility = View.GONE
            binding.messageMultiLine.visibility = View.GONE
            binding.messageTextView.visibility = View.GONE
            binding.submitButton.visibility = View.GONE
            binding.dreamPlainText.visibility = View.GONE
            binding.dreamTextView.visibility = View.GONE
        }
    }
}
