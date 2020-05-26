package com.retrofit.demo.services;

import com.retrofit.demo.models.Movie;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

@Service
public interface MovieService {

  @GET("/3/movie/{id}")
  Call<Movie> getMovieById(@Path ("id") long id, @Query("api_key") String apiKey);

  @GET("/users/{username}")
  public Call<Movie> getUser(@Path("username") String username);
}
