package com.example.superheroapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
        private static Retrofit instance;
        private RetrofitClient(){}
        public static final String BASE_URL = "https://www.superheroapi.com/api.php/ee9ca443e9d001cc617bfed6ab8c310c/";
        public static Retrofit getInstance (){
            if (instance == null ){
                instance = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

            }
            return instance;
        }


}


