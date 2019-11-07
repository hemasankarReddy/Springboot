package com.mkyong.controller;

import java.io.Serializable;

public class OriginalInfo implements Serializable {

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

    public String getOrgclass() {
        return orgclass;
    }

    public void setOrgclass(String orgclass) {
        this.orgclass = orgclass;
    }

    private  String description;
   private  String weight;
   private String orgclass;
}
