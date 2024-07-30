package com.example.superheroapi;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Objects;

public class Biography {

    public String response;
    public String id;
    public String name;
    @SerializedName("full-name")
    public String apikey;
    @SerializedName("alter-egos")
    public String apikey2;
    public ArrayList<String> aliases;
    @SerializedName("place-of-birth")
    public String apikey3;
    @SerializedName("first-appearance")
    public String apikey4;
    public String publisher;
    public String alignment;


    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApikey() {
        return apikey;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public String getApikey2() {
        return apikey2;
    }

    public void setApikey2(String apikey2) {
        this.apikey2 = apikey2;
    }

    public ArrayList<String> getAliases() {
        return aliases;
    }

    public void setAliases(ArrayList<String> aliases) {
        this.aliases = aliases;
    }

    public String getApikey3() {
        return apikey3;
    }

    public void setApikey3(String apikey3) {
        this.apikey3 = apikey3;
    }

    public String getApikey4() {
        return apikey4;
    }

    public void setApikey4(String apikey4) {
        this.apikey4 = apikey4;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }
}
