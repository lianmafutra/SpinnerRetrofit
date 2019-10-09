package com.sunflower.spinnerretrofit.Server;

import com.sunflower.spinnerretrofit.Model.ResponseData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Interface {
    @GET("url")
    Call<ResponseData> getdata();
}

