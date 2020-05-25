package com.retrofit.demo.services;

import com.retrofit.demo.models.User;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

@Service
public interface UserService {

  @GET("/users")
  public Call<List<User>> getUsers(
          @Query("per_page") int per_page,
          @Query("page") int page);

  @GET("/users/{username}")
  public Call<User> getUser(@Path("username") String username);
}
