package com.clientproviderexample.demo.entity;

import java.io.Serializable;

public class City implements Serializable{
    private static final long serialVersionUID = -1L;
    private String name;
    private String zipcode;

    public City(){

    }

    public City(String name,String zipcode){
        this.name = name;
        this.zipcode = zipcode;
    }

   public String getName(){
        return this.name;
   }
   public void setName(String name){
        this.name = name;
   }
   public String getZipcode(){
        return this.zipcode;
   }
   public void setZipcode(String zipcode){
        this.zipcode = zipcode;
   }
}
