package com.retrofit.demo.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class User {
  private String login;
  @Id
  @GeneratedValue
  private long id;
  private String url;
}
