package com.appyfurious.spp_bsuir_hcl.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Toast
import com.appyfurious.spp_bsuir_hcl.R
import com.appyfurious.spp_bsuir_hcl.repositories.UserRepository
import kotlinx.android.synthetic.main.activity_user_created.*

class UserCreatedActivity : AppCompatActivity() {

    private val userRepository = UserRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_created)

        userType.adapter = ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, listOf(getString(R.string.actor),
                getString(R.string.producer)))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.new_film -> {
                if (name1.text.isNotEmpty() && name2.text.isNotEmpty() && name3.text.isNotEmpty()) {
                    saveUser()
                    Toast.makeText(this@UserCreatedActivity,
                            R.string.success_user_created, Toast.LENGTH_SHORT).show()
                    finish()
                } else {
                    Toast.makeText(this@UserCreatedActivity,
                            R.string.error_create_user, Toast.LENGTH_SHORT).show()
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun saveUser() {
        userRepository.insertUser(userType.selectedItemId.toInt(), name1.text.toString(),
                name2.text.toString(), name3.toString(), about.toString())
    }
}
