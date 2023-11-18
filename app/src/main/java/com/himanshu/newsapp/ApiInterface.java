package com.himanshu.newsapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    String BASE_URL = "https://newsapi.org/v2/" ;

    @GET("top-headlines")
    Call<MainNews> getNews(
            @Query("country") String country,               //can also directly pass country name like us
            @Query("pageSize") int pagesize,               //to limit no of news on a page
            @Query("apiKey") String apikey
    );


    @GET("top-headlines")
    Call<MainNews> getCategoryNews(
            @Query("country") String country,//can also directly pass country name like US
            @Query("category") String category,
            @Query("pageSize") int pagesize,               //to limit no of news on a page
            @Query("apiKey") String apikey
    );
}
