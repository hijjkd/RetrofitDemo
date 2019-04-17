package scut.carson_ho.retrofitdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AirGetRequest_Interface {
    @GET("users/airbnb/repos?page=1")
    Call<List<AirBean>> getCall();
    // 注解里传入 网络请求 的部分URL地址
    // getCall()是接受网络请求数据的方法
}
