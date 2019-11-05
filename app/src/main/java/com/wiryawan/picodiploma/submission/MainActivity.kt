package com.wiryawan.picodiploma.submission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wiryawan.picodiploma.submission.adapter.ListMoboAdapter
import com.wiryawan.picodiploma.submission.model.AboutActivity
import com.wiryawan.picodiploma.submission.model.Mobo
import com.wiryawan.picodiploma.submission.model.MobosData

class MainActivity : AppCompatActivity() {

    private lateinit var rvMobos : RecyclerView
    private var list: ArrayList<Mobo> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMobos = findViewById(R.id.rv_mobos)
        rvMobos.setHasFixedSize(true)

        list.addAll(MobosData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvMobos.layoutManager = LinearLayoutManager(this)
        val listMoboAdapter = ListMoboAdapter(list)
        rvMobos.adapter = listMoboAdapter

        listMoboAdapter.setOnItemClickCallback(object : ListMoboAdapter.OnItemClickCallback {
            override fun onItemClicked(mobo: Mobo) {
                val moboIntent = Intent(this@MainActivity, DetailActivity::class.java)
                moboIntent.putExtra(DetailActivity.EXTRA_NAME, mobo.name)
                moboIntent.putExtra(DetailActivity.EXTRA_DETAIL, mobo.detail)
                moboIntent.putExtra(DetailActivity.EXTRA_PHOTO, mobo.photo)
                startActivity(moboIntent)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.about -> {
            moveToDetail()
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }

    private fun moveToDetail() {
        val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(moveIntent)
    }

}
