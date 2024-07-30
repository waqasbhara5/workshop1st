package com.example.superheroapi;

import com.google.gson.annotations.SerializedName;

public class Connections {
    // import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
        private String response;
        private String id;
        private String name;
        @SerializedName("group-affiliation")
        private String apikey;
        private String relatives;

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

    public String getRelatives() {
        return relatives;
    }

    public void setRelatives(String relatives) {
        this.relatives = relatives;
    }
}
