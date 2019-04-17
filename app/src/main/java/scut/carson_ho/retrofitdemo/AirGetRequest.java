package scut.carson_ho.retrofitdemo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AirGetRequest extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        request();
    }

    private void request() {
        //步骤4:创建Retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(" https://api.github.com/") // 设置 网络请求 Url
                .addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
                .build();

        // 步骤5:创建 网络请求接口 的实例
        AirGetRequest_Interface request = retrofit.create(AirGetRequest_Interface.class);

        //对 发送请求 进行封装
        Call<List<AirBean>> call = request.getCall();

        //步骤6:发送网络请求(异步)
        call.enqueue(new Callback<List<AirBean>>() {
            //请求成功时候的回调
            @Override
            public void onResponse(Call<List<AirBean>> call, Response<List<AirBean>> response) {
                //请求处理,输出结果
                response.body();
            }

            //请求失败时候的回调
            @Override
            public void onFailure(Call<List<AirBean>> call, Throwable throwable) {
                System.out.println("连接失败");
            }
        });
    }
}
