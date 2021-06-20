package com.aadesh.firebaseauth.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aadesh.firebaseauth.R
import com.aadesh.firebaseauth.extensions.Extensions.toast
import com.aadesh.firebaseauth.utils.FirebaseUtils.firebaseAuth
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
// sign out a user

        btnSignOut.setOnClickListener {
            firebaseAuth.signOut()
            startActivity(Intent(this, CreateAccountActivity::class.java))
            toast("signed out")
            finish()
        }
    }
}