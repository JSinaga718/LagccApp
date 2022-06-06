package com.example.lagccalumni

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lagccalumni.databinding.ActivityRegisterPageBinding
import java.util.*
import kotlin.collections.ArrayList


class RegisterPage : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var username : EditText = binding.editTextEmail
        var userArray : ArrayList<String> = ArrayList<String>()
        var pwArray : ArrayList<String> = ArrayList<String>()
        var password : EditText = binding.editTextPassword
        var registerbtn : Button = binding.registerBtn
        var textView : TextView = binding.textView

        registerbtn.setOnClickListener {
            //use intent to hold data/array to other activity
            var intent : Intent = Intent(this, MainActivity::class.java)
            intent.putExtra("string", userArray)
           // startActivity(intent)


            if (TextUtils.isEmpty(username.text.toString()
                ) || TextUtils.isEmpty(password.text.toString())) {
                Toast.makeText(this, "Empty data", Toast.LENGTH_LONG).show()
            } else {
                var  myUser : user = user(username.text.toString(), password.text.toString())
                userViewModel.getInstance().addUser(myUser)

                 //  username.setText(Arrays.toString(userArray))
                Toast.makeText(this, "Successfully Registered", Toast.LENGTH_LONG).show()
                textView.append("User: " + username.text)
                textView.append("PW: " + password.text)
             //   var intent : Intent = new Intent(RegisterPage.this, MainActivity.class)

            }
        //if (userArray.isNotEmpty()) {
           // Log.d("onCreate: user: " + userArray[1],"user ")

        }
    }
}