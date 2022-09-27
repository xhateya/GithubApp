package com.xhateya.idn.githubapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.xhateya.idn.githubapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object {
        private var EXTRA_RESULT = "extra_result"
    }

    private lateinit var detailBinding: ActivityDetailBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)
        supportActionBar?.hide()

        val user = intent.getParcelableExtra<User>(EXTRA_RESULT) as User
        Glide.with(this)
            .load(user.avatar)
            .into(detailBinding.ivUsrDetail)

        detailBinding.tvUsernameDetail.text = user.username
        detailBinding.tvNameDetail.text = user.name
        detailBinding.tvAbout.text = user.about
        detailBinding.tvCompany.text = user.company
        detailBinding.tvLocationDetail.text = user.location
        detailBinding.tvRepo.text = user.repository
        detailBinding.tvFollowers.text = user.followers
        detailBinding.tvFollowing.text = user.following


    }
}