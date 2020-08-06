package com.dicoding123.picodiploma.myrecyclerview

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity () {

    private lateinit var imageSuperfood: ImageView
    private lateinit var desc: TextView

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val title = intent.getStringExtra(EXTRA_NAME)
        val photos = intent.getStringExtra(EXTRA_PHOTO)
        val descs = intent.getStringExtra(EXTRA_DESC)
        setActionBarTitle(title!!)
        imageSuperfood = findViewById(R.id.img_superfood)
        desc = findViewById(R.id.detail_superfood)
        // Update the icon based on the resource id of the image in the drawable folder.
        val resourceID = resources.getIdentifier(photos,"drawable", packageName)
        Log.d("TEST", photos.toString())
        imageSuperfood.setImageResource(resourceID)
        desc.text = descs
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_about_or_detail, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.button_back_about -> {
                startActivity (Intent(this, MainActivity::class.java))
            }
        }
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

}