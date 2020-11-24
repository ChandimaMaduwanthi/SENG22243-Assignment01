package com.cm.android.legends.models

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.cm.android.legends.R
import com.cm.android.legends.posts.models.Post


class PostsAdapter(private val context: Context,
                   private val postsList: ArrayList<Post>) : BaseAdapter() {

    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.fragment_third, parent, false)

        val titleTextView = rowView.findViewById(R.id.title) as TextView

        val post = getItem(position) as Post

        titleTextView.text = post.title

        return rowView
    }

    override fun getItem(position: Int): Any {
        return postsList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return postsList.size
    }
}