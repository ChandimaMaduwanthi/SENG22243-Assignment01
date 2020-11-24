package com.cm.android.legends.posts.api;

import com.cm.android.legends.posts.models.Post;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostApi {

    @GET("/posts/1")
    Call<Post> getPosts();
}
