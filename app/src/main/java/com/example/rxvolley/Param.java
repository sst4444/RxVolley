package com.example.rxvolley;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.kymjs.rxvolley.RxVolley;
import com.kymjs.rxvolley.client.HttpCallback;
import com.kymjs.rxvolley.client.HttpParams;

import java.util.Map;

/**
 * RxVolley传递参数
 */
public class Param extends AppCompatActivity {
    /*private String url = "http://10.0.2.2:8080/systemnovel/getnovel?limit=1&page=10";*/
    private String url = "http://192.168.1.100:8080/DoctorSystem/Life/getLifelist?limit=10&page=1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_param);
    }

    public void onWindowFocusChanged(boolean hasFocus)
    {
        if (hasFocus){
            //客户端向后台接口传递参数方法
            HttpParams params = new HttpParams();
            params.put("diet","  我喜欢你");
            RxVolley.post(url, params, new HttpCallback() {
                @Override
                public void onSuccess(String t) {
                    super.onSuccess(t);

                    Toast.makeText(Param.this,"请求到的数据:"+t,Toast.LENGTH_LONG).show();
                }
        });
        }
    }
}
