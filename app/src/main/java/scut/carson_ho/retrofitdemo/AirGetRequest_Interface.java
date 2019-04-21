package scut.carson_ho.retrofitdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AirGetRequest_Interface {
    @GET("users/{searchWord}/repos")
    Call<List<AirBean>> getCall(@Path ("searchWord") String searchWord,@Query("page") String page);



    // 注解里传入 网络请求 的部分URL地址https://api.github.com/users/airbnb/repos?page=1
    // getCall()是接受网络请求数据的方法
    @GET("users/airbnb/repos?page=1")
    Call<List<AirBean>> getCall();


}
