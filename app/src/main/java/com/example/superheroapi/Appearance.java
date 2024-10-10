package com.example.superheroapi;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Appearance {
    // import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */

        private String response;
        private String id;
        private String name;
        private String gender;
        private String race;
        private ArrayList<String> height;
        private ArrayList<String> weight;
        @SerializedName("eye-color")
        private String apikey5;
        @SerializedName("hair-color")
        private String apikey6;

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

        public String getGender() {
                return gender;
        }

        public void setGender(String gender) {
                this.gender = gender;
        }

        public String getRace() {
                return race;
        }

        public void setRace(String race) {
                this.race = race;
        }

        public ArrayList<String> getHeight() {
                return height;
        }

        public void setHeight(ArrayList<String> height) {
                this.height = height;
        }

        public ArrayList<String> getWeight() {
                return weight;
        }

        public void setWeight(ArrayList<String> weight) {
                this.weight = weight;
        }

        public String getApikey5() {
                return apikey5;
        }

        public void setApikey5(String apikey5) {
                this.apikey5 = apikey5;
        }

        public String getApikey6() {
                return apikey6;
        }

        public void setApikey6(String apikey6) {
                this.apikey6 = apikey6;
        }
}



