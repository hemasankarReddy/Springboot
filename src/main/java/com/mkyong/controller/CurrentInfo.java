package com.mkyong.controller;

import java.io.Serializable;

public class CurrentInfo implements Serializable {

   private  String pieces;

    public String getPieces() {
        return pieces;
    }

    public void setPieces(String pieces) {
        this.pieces = pieces;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getCurentClass() {
        return curentClass;
    }

    public void setCurentClass(String curentClass) {
        this.curentClass = curentClass;
    }

    private  String description;
   private  String weight;
   private String curentClass;
}
