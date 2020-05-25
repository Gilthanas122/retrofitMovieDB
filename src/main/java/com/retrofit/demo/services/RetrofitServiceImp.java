package com.retrofit.demo.services;

import okhttp3.OkHttpClient;
import org.springframework.stereotype.Service;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Service
public class RetrofitServiceImp {

  public Retrofit buildRetrofit(){
    OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
    return new Retrofit.Builder()
            .baseUrl(System.getenv("API_LINK"))
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build();
  }
}
