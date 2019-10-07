package com.abc.firebaseuiauth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (FirebaseAuth.getInstance().currentUser == null) {
            startActivity(
                Intent(
                    this@MainActivity,
                    LoginPage::class.java
                ).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            )
        }

    }

    override fun onStart() {
        super.onStart()

    }
}
