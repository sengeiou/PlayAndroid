package com.zj.play.view.home.search.article

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.zj.play.model.Article
import com.zj.play.network.Repository

/**
 * 版权：渤海新能 版权所有
 * @author zhujiang
 * 版本：1.5
 * 创建日期：2020/5/19
 * 描述：PlayAndroid
 *
 */
class ArticleListViewModel : ViewModel() {

    val articleList = ArrayList<Article>()

    private val pageLiveData = MutableLiveData<QueryKeyArticle>()

    val articleLiveData = Transformations.switchMap(pageLiveData) { query ->
        Repository.getQueryArticleList(query.page, query.k)
    }

    fun getArticleList(page: Int, k: String) {
        pageLiveData.value = QueryKeyArticle(page, k)
    }

}

data class QueryKeyArticle(var page: Int, var k: String)