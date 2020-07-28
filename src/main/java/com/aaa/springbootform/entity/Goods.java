package com.aaa.springbootform.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Goods {

  private long id;
  private String name;
  private double price;
  @DateTimeFormat(pattern="yyyy-MM-dd")
  private Date makedate;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }



  public Date getMakedate() {
    return makedate;
  }

  public void setMakedate(Date makedate) {
    this.makedate = makedate;
  }

  public void setMakedate(String makedate){
    String[] strings = makedate.split("-");
    Date dates = new Date(Integer.valueOf(strings[0]),Integer.valueOf(strings[1]),Integer.valueOf(strings[2]));
    System.out.println(dates);
    this.makedate = dates;
  }
  @Override
  public String toString() {
    return "Goods{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + ", makedate=" + makedate + '}';
  }
}
