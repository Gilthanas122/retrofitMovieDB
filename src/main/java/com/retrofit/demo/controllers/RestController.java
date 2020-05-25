package com.retrofit.demo.controllers;

import com.retrofit.demo.models.User;
import com.retrofit.demo.services.GithubServiceGenerator;
import com.retrofit.demo.services.RetrofitServiceImp;
import com.retrofit.demo.services.UserService;
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
    UserService service = retrofit.create(UserService.class);
    Call<User> callSync = service.getUser("eugenp");

    try {
      Response<User> response = callSync.execute();
      User user = response.body();
      return ResponseEntity.ok(user);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return ResponseEntity.notFound().build();
  }

  @GetMapping("get/users")
  public ResponseEntity getUsers(){
    UserService service = GithubServiceGenerator.createService(UserService.class);
    Call<List<User>> callSync = service.getUsers(5, 2);
    try {
      Response<List<User>> response = callSync.execute();
      List<User> user = response.body();
      return ResponseEntity.ok(user);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return ResponseEntity.notFound().build();
  }
}
