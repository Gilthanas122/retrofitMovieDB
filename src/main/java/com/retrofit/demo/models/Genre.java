package com.retrofit.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Genre {
  @Id
  @GeneratedValue
  private long id;
  @SerializedName("name")

  private String name;

  @ManyToMany
  @JsonIgnore
  private List<Movie> movies;

  public Genre() {
  }

  public Genre(String name, List<Movie> movies) {
    this.name = name;
    this.movies=movies;
  }
}
