package com.andela.buildsdgs.rtrc.services;

import com.andela.buildsdgs.rtrc.utility.Configuration;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceBuilder {
    private static HttpLoggingInterceptor logger= new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
    private static OkHttpClient.Builder okhttp = new OkHttpClient.Builder().addInterceptor(logger);
    private static Retrofit.Builder builder = new Retrofit.Builder().baseUrl(Configuration.BASE_URL).
            addConverterFactory(GsonConverterFactory.create()).client(okhttp.build());
    private static Retrofit retrofit = builder.build();
    public static <S> S buildService(Class<S> serviceType){
        return retrofit.create(serviceType);
    }
}