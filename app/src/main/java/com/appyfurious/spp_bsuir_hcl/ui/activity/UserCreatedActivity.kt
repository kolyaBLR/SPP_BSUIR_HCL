package com.appyfurious.spp_bsuir_hcl.ui.activity

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.appyfurious.spp_bsuir_hcl.R
import com.appyfurious.spp_bsuir_hcl.repositories.UserRepository
import kotlinx.android.synthetic.main.activity_user_created.*

class UserCreatedActivity : AppCompatActivity() {

    companion object {
        private const val USER_KEY = "user_key_wafegsrhdn"
        fun intent(context: Context, userKey: Int) = Intent(context,
                UserCreatedActivity::class.java).putExtra(USER_KEY, userKey)
    }

    private val userRepository = UserRepository()
    private fun isActor() = this.intent.getIntExtra(USER_KEY, -1) == UserRepository.ACTOR

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_created)
        supportActionBar?.setTitle(if (isActor()) R.string.actor_created else R.string.producer_created)
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
        userRepository.insertUser(if (isActor()) UserRepository.ACTOR else UserRepository.PRODUCER,
                name1.text.toString(), name2.text.toString(), name3.toString(), about.toString())
    }
}
