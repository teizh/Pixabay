package com.example.pixabay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pixabay.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var adapter = PixaAdapter(arrayListOf())
    var page = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
    }

    private fun initClickers() {
        with(binding) {
            changePageBtn.setOnClickListener {
                ++page
                request()
            }
            okBtn.setOnClickListener {
                page = 1
                adapter.list.clear()
                request()
            }

            imageRecycler.addOnScrollListener(object : RecyclerView.OnScrollListener() {
                override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                    super.onScrolled(recyclerView, dx, dy)
                    val layoutManager: LinearLayoutManager =
                        recyclerView.layoutManager as LinearLayoutManager
                    val totalItemCount = layoutManager.itemCount
                    val lastVisibleItem = layoutManager.findLastVisibleItemPosition()

                    if (lastVisibleItem == totalItemCount - 1) {
                        ++page
                        request()
                    }
                }
            })
        }
    }


    private fun ActivityMainBinding.request() {
        RetrofitService().api.searchImage(keyWordEd.text.toString(), page = page)
            .enqueue(object : Callback<PixabayModel> {
                override fun onResponse(
                    call: Call<PixabayModel>, response: Response<PixabayModel>
                ) {
                    if (response.isSuccessful) {
                        adapter.list.addAll(response.body()?.hits!!)
                        imageRecycler.adapter = adapter
                    }
                }

                override fun onFailure(call: Call<PixabayModel>, t: Throwable) {
                    Log.e("ololo", "onFailure: $t.message")
                }

            })
    }
}