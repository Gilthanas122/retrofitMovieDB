package com.retrofit.demo;

import com.retrofit.demo.models.RetroPhoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
  @Autowired
  private GitHubService githubService;

  @GetMapping("/phptps")
  public List<RetroPhoto> getRepos() throws IOException {
    return githubService.getPhotos();
  }
}
