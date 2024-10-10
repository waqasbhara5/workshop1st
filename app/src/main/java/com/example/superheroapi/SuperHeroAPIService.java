package com.example.superheroapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SuperHeroAPIService {
    String API_URL_Appearance = "/appearance";
    String API_URL_BIO = "/biography";
    String API_URL3 = "/connections";

    String API_URL = "/powerstats";
    String API_URL2 = "/work";
    String API_URL_Image = "/image";
    String API_URL_NAME = "search";

    @GET("{id}"+API_URL_Image)
    Call<Image> fetchImage(@Path("id")String id);

    @GET("{id}"+API_URL)
    Call<Powerstat> fetchPowerStats(@Path("id") String id);

    @GET("{id}"+API_URL_BIO)
    Call<Biography> fetchBiography(@Path("id") String id);
    @GET("{id}"+API_URL3)
    Call<Connections> fetchConnections(@Path("id") String id);
    @GET("{id}"+API_URL2)
    Call<Work> fetchWork(@Path("id") String id);
    @GET("{id}"+API_URL_Appearance)
    Call<Appearance> fetchAppearance(@Path("id")String id);

    @GET(API_URL_NAME+"/{name}")
    Call<Root> fetchByName(@Path("name")String name);


}


