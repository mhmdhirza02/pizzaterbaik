package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment

class HomeActivity : AppCompatActivity() {

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentcontainerview, fragment)
            .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home1)

        val txtAccount = findViewById<TextView>(R.id.MenuAccount)
        val txtMenu = findViewById<TextView>(R.id.Menu)
        val txtTransaction = findViewById<TextView>(R.id.Transaction)
        val txtReport = findViewById<TextView>(R.id.Report)

        txtAccount.setOnClickListener {
            replaceFragment(AccountFragmen())
        }

        txtMenu.setOnClickListener {
            replaceFragment(MenuFragment())
        }

        txtTransaction.setOnClickListener {
            replaceFragment(TransactionFragment())
        }

        txtReport.setOnClickListener {
            replaceFragment(ReportFragment())
        }

        // Fragment default
        replaceFragment(AccountFragmen())

    }
}

