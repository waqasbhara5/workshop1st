package com.example.superheroapi;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Root {

    private String response;
    @SerializedName("results-for")
    private String resultsFor;
    private ArrayList<Result> results;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getResultsFor() {
        return resultsFor;
    }

    public void setResultsFor(String resultsFor) {
        this.resultsFor = resultsFor;
    }

    public ArrayList<Result> getResults() {
        return results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }
}
