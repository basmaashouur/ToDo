package com.example.basma.todo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
//https://www.androidauthority.com/retrofit-android-tutorial-906928/
public interface GetData {

    @GET("read")
    Call<List<RetroUsers>> getAllTodo();
}