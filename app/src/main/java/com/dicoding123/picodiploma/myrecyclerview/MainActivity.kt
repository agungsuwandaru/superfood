package com.dicoding123.picodiploma.myrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding123.picodiploma.myrecyclerview.adapter.ListSuperfoodAdapter
import com.dicoding123.picodiploma.myrecyclerview.model.Superfood
import com.dicoding123.picodiploma.myrecyclerview.model.SuperfoodsData

class MainActivity : AppCompatActivity() {
    private lateinit var rvSuperfoods: RecyclerView
    private var list: ArrayList<Superfood> = arrayListOf()
    private var title: String = "Home"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvSuperfoods = findViewById(R.id.rv_superfoods)
        rvSuperfoods.setHasFixedSize(true)

        list.addAll(SuperfoodsData.listData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.button_about -> {
                startActivity (Intent(this, AboutActivity::class.java))
            }
        }
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun showRecyclerList() {
        rvSuperfoods.layoutManager = LinearLayoutManager(this)
        val listSuperfoodAdapter = ListSuperfoodAdapter(list)
        rvSuperfoods.adapter = listSuperfoodAdapter

        listSuperfoodAdapter.setOnItemClickCallback(object : ListSuperfoodAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Superfood) {
                showSelectedSuperfood(data)
            }
        })
    }

    private fun showSelectedSuperfood(superfood: Superfood) {
        val moveWithDataIntent = Intent(this@MainActivity, DetailActivity::class.java)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_NAME, superfood.name)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_DESC, superfood.desc)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_PHOTO, superfood.photoDetail)
        startActivity(moveWithDataIntent)
    }


}