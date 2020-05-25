package com.retrofit.demo;

import com.retrofit.demo.models.RetroPhoto;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

@Service
public class GitHubService implements APIConfiguration {
  private String accessToken;

  private RepositoryInterface service;

  public GitHubService() {
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    service = retrofit.create(RepositoryInterface.class);
  }

  public List<RetroPhoto> getPhotos() throws IOException {
    Call<List<RetroPhoto>> retrofitCall = service.getAllPhotos();

    Response<List<RetroPhoto>> response = retrofitCall.execute();

    if (!response.isSuccessful()) {
      throw new IOException(response.errorBody() != null
              ? response.errorBody().string() : "Unknown error");
    }
    return response.body();
  }

}
