package com.retrofit.demo.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class SpokenLanguages {

  @Id
  @GeneratedValue
  private long id;
  @SerializedName("iso_639-1")
  @Expose
  private String spokenLanguagesIso;

  @SerializedName("name")
  @Expose
  private String name;

  @ManyToMany
  private List<Movie> movies;

  public SpokenLanguages() {
  }

  public SpokenLanguages(String spokenLanguagesIso, String name, List<Movie> movies) {
    this.spokenLanguagesIso = spokenLanguagesIso;
    this.name = name;
    this.movies = movies;
  }
}
