package com.example.ndkapi.api;

import com.example.ndkapi.model.Film;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

//    ApiService apiService = new Retrofit.Builder().baseUrl("https://movie0706.cybersoft.edu.vn")
//            .addConverterFactory(GsonConverterFactory.create(gson)).build().create(ApiService.class);
    @GET("/api/QuanLyPhim/LayDanhSachPhim?maNhom=GP04")
    Call<List<Film>> getAllFilm();
}
