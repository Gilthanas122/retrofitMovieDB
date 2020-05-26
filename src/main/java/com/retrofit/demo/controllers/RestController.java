package com.retrofit.demo.controllers;

import com.retrofit.demo.models.Movie;
import com.retrofit.demo.services.GithubServiceGenerator;
import com.retrofit.demo.services.RetrofitServiceImp;
import com.retrofit.demo.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
  @Autowired
  RetrofitServiceImp retrofitServiceImp;

  @GetMapping("get/user")
  public ResponseEntity getUser(){
    Retrofit retrofit = retrofitServiceImp.buildRetrofit();
    MovieService service = retrofit.create(MovieService.class);
    Call<Movie> callSync = service.getUser("eugenp");

    try {
      Response<Movie> response = callSync.execute();
      Movie movie = response.body();
      return ResponseEntity.ok(movie);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return ResponseEntity.notFound().build();
  }

  @GetMapping("get/users")
  public ResponseEntity getUsers(){
    MovieService service = GithubServiceGenerator.createService(MovieService.class);
    Call<Movie> callSync = service.getMovieById( 550, System.getenv("API_KEY"));
    try {
      Response<Movie> response = callSync.execute();
      Movie movie = response.body();
      return ResponseEntity.ok(movie);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return ResponseEntity.notFound().build();
  }
}
