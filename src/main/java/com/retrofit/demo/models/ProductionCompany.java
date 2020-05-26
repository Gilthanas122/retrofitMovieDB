package com.retrofit.demo.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class ProductionCompany {

  @Id
  @GeneratedValue
  @SerializedName("id")
  @Expose
  private long id;

  @SerializedName("logo_path")
  @Expose
  private String logoPath;

  @SerializedName("name")
  @Expose
  private String name;

  @SerializedName("origin_country")
  @Expose
  private String originCountry;

  @ManyToMany
  private List<Movie> movies;

  public ProductionCompany() {
  }

  public ProductionCompany(long id, String logoPath, String name, String originCountry, List<Movie> movies) {
    this.id = id;
    this.logoPath = logoPath;
    this.name = name;
    this.originCountry = originCountry;
    this.movies = movies;
  }

}
