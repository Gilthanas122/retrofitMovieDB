package com.retrofit.demo;

import com.retrofit.demo.models.RetroPhoto;
import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface RepositoryInterface {


    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
  }
