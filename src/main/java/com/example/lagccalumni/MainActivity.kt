package com.example.lagccalumni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.lagccalumni.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username : EditText = binding.emailLoginBox
        val password : EditText = binding.passwordLoginBox
        val loginbtn : Button = binding.loginButton

        var username1 : String = "admin"
        var password1 : String = "123"

        //val myusers: ArrayList<String> = intent.getStringArrayListExtra("string") as ArrayList<String>
        var myusers: ArrayList<user> = userViewModel.getInstance().users
//username.text.toString().equals(myusers.contains(username.text.toString())
        loginbtn.setOnClickListener(View.OnClickListener {
            //validate inputs
            if (TextUtils.isEmpty(username.text.toString()
                ) || TextUtils.isEmpty(password.text.toString())) {
                Toast.makeText(this, "Empty data", Toast.LENGTH_LONG).show()
            } else if (username.text.toString() == username1 && password.text.toString() == password1) {
                //check password

                //successful login
                Toast.makeText(this, "Successful login", Toast.LENGTH_LONG).show()
                var intent: Intent = Intent(this, HomePage::class.java)
                startActivity(intent)
            }
            /* else {
                    Toast.makeText(this, "Invalid Password", Toast.LENGTH_LONG).show()
                } */

             else {
                 var isLoggedIn : Boolean = false
                 for(user in myusers) {
                     if (user.email.equals(username.text.toString()) && (user.password.equals(password.text.toString()))) {
                     isLoggedIn = true
                         var intent: Intent = Intent(this, HomePage::class.java)
                         startActivity(intent)
                         break;
                     }
                 }
                if(!isLoggedIn)
                    Toast.makeText(this, "Invalid Username/Password", Toast.LENGTH_LONG).show()
            }
        })
        registerButton.setOnClickListener {
            var intent : Intent = Intent(this,RegisterPage::class.java)
            startActivity(intent)
        }
    }
}

