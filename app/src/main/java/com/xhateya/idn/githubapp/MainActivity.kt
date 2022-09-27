package com.xhateya.idn.githubapp

import android.annotation.SuppressLint
import android.content.res.TypedArray
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.xhateya.idn.githubapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  val list = ArrayList<User>()

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        supportActionBar?.hide()

        list.addAll(getDataUser())
        mainBinding.rvUser.setHasFixedSize(true)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        mainBinding.rvUser.layoutManager = LinearLayoutManager(this)
        val listUserAdapter = ListUserAdapter(list)
        mainBinding.rvUser.adapter = listUserAdapter
    }


    @SuppressLint("Recycle")
    private fun getDataUser(): ArrayList<User> {
        val contentUsername = resources.getStringArray(R.array.username)
        val contentLocation = resources.getStringArray(R.array.location)
        val contentAvatar : TypedArray = resources.obtainTypedArray(R.array.avatar)
        val contentName = resources.getStringArray(R.array.name)
        val contentAbout = resources.getStringArray(R.array.about)
        val contentCompany= resources.getStringArray(R.array.company)
        val contentFollowers = resources.getStringArray(R.array.followers)
        val contentFollowing = resources.getStringArray(R.array.following)
        val contentRepository= resources.getStringArray(R.array.repository)
        val listUser = ArrayList<User>()
        for (position in contentUsername.indices){
            val user = User(
                contentUsername[position],
                contentLocation[position],
                contentAvatar.getResourceId(position, -1),
                contentName[position],
                contentAbout[position],
                contentCompany[position],
                contentFollowers[position],
                contentFollowing[position],
                contentRepository[position]
            )
            listUser.add(user)
        }
        return  listUser
    }
}