package com.sky.modulestudy.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sky.modulestudy.R

/**
 *
 * @Description:    []
 * @Author:         skyHuang
 * @CreateDate:     2021/5/19 9:46
 */
class RVActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv)
        val adapter = ConcatAdapter()
        // 2. 使用ConcatAdapter将三个Adapter组合起来。
        adapter.addAdapter(FirstAdapter(generateList("Header", 2)))
        adapter.addAdapter(SecondAdapter(generateList("Content", 2)))
        adapter.addAdapter(ThirdAdapter(generateList("Footer", 2)))
        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }

    private fun generateList(title: String, count: Int) = ArrayList<String>().apply {
        for (index in 0 until count) {
            add("$title position = $index")
        }
    }
}