package com.zj.play.view.profile.user

import android.content.Context
import android.content.Intent
import com.zj.core.view.BaseActivity
import com.zj.play.R
import kotlinx.android.synthetic.main.activity_user_info.*

class UserActivity : BaseActivity() {

    override fun getLayoutId(): Int {
        return R.layout.activity_user_info
    }

    override fun initData() {}

    override fun initView() {
        userTitleBar.setTitle("关于我")
    }

    companion object {
        fun actionStart(context: Context) {
            val intent = Intent(context, UserActivity::class.java)
            context.startActivity(intent)
        }
    }

}
