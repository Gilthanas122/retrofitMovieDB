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
public class ProductionCountry {

  @Id
  @GeneratedValue
  private long id;
  @SerializedName("iso_3166_1")
  @Expose
  private String productionCountryId;

  @SerializedName("name")
  @Expose
  private String name;

  @ManyToMany
  private List<Movie> movies;

  public ProductionCountry() {
  }

  public ProductionCountry(String productionCountryId, String name, List<Movie> movies) {
    this.productionCountryId = productionCountryId;
    this.name = name;
    this.movies = movies;
  }
}
