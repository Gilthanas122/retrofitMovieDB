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
public class Movie {
  @Id
  @GeneratedValue
  private long id;

  @SerializedName("back_drop_path")
  @Expose
  private boolean adult;
  @SerializedName("backdrop_path")
  @Expose
  private String backDropPath;
  @SerializedName("budget")
  @Expose
  private int budget;

  @SerializedName("genres")
  @Expose
  @ManyToMany
  private List<Genre> genres;

  @SerializedName("production_companies")
  @Expose
  @ManyToMany
  private List<ProductionCompany> productionCompanies;

  @SerializedName("production_countries")
  @Expose
  @ManyToMany
  private List<ProductionCountry> productionCountries;

  @SerializedName("spoken_languages")
  @Expose
  @ManyToMany
  private List<SpokenLanguages> spokenLanguages;

  @SerializedName("homepage")
  @Expose
  private String homepage;

  @SerializedName("imdb_id")
  @Expose
  String imdbId;

  @SerializedName("original_language")
  @Expose
  String originalLanguage;

  @SerializedName("original_title")
  @Expose
  private String originalTitle;

  @SerializedName("overview")
  @Expose
  private String overview;

  @SerializedName("popularity")
  @Expose
  private Double popularity;

  @SerializedName("belongs_to_collection")
  @Expose
  private String belongsToCollection;

  @SerializedName("poster-path")
  @Expose
  private String posterPath;

  @SerializedName("release_date")
  @Expose
  private String releaseDate;

  @SerializedName("revenue")
  @Expose
  private Integer revenue;

  @SerializedName("runtime")
  @Expose
  private Integer runtime;

  @SerializedName("status")
  @Expose
  private String status;

  @SerializedName("tagline")
  @Expose
  private String tagline;

  @SerializedName("title")
  @Expose
  private String title;

  @SerializedName("video")
  @Expose
  private boolean video;

  @SerializedName("vote_average")
  @Expose
  private Double voteAverage;

  @SerializedName("vote-count")
  @Expose
  private Integer voteCount;

  public Movie() {
  }

  public Movie(Boolean adult, String backdropPath, String belongsToCollection, Integer budget, List<Genre> genres, String homepage, Integer id, String imdbId, String originalLanguage, String originalTitle, String overview, Double popularity, String posterPath, List<ProductionCompany> productionCompanies, List<ProductionCountry> productionCountries, String releaseDate, Integer revenue, Integer runtime, List<SpokenLanguages> spokenLanguages, String status, String tagline, String title, Boolean video, Double voteAverage, Integer voteCount) {
    super();
    this.adult = adult;
    this.backDropPath = backdropPath;
    this.belongsToCollection = belongsToCollection;
    this.budget = budget;
    this.genres = genres;
    this.homepage = homepage;
    this.id = id;
    this.imdbId = imdbId;
    this.originalLanguage = originalLanguage;
    this.originalTitle = originalTitle;
    this.overview = overview;
    this.popularity = popularity;
    this.posterPath = posterPath;
    this.productionCompanies = productionCompanies;
    this.productionCountries = productionCountries;
    this.releaseDate = releaseDate;
    this.revenue = revenue;
    this.runtime = runtime;
    this.spokenLanguages = spokenLanguages;
    this.status = status;
    this.tagline = tagline;
    this.title = title;
    this.video = video;
    this.voteAverage = voteAverage;
    this.voteCount = voteCount;
  }

}
