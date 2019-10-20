package com.example.rxvolley;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.Toast;

import com.kymjs.rxvolley.RxVolley;
import com.kymjs.rxvolley.client.HttpCallback;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
   // private static final String TAG = "MainActivity";

    private ListView mListView;
    private List<Province2> mList = new ArrayList<>();

    int id=1;

    //访问服务器接口
    private String url = "http:/b99d839af845a3305b157307d03660";
    //访问本地接口，用10.0.2./v.juhe.cn/historyWeather/province?key=232取代localhost
    private String url1 = "http://192.168.1.100:8080/DoctorSystem/Life/getLifelist?limit=10&page=1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = findViewById(R.id.mListView);
    }

    public void onWindowFocusChanged(boolean hasFocus)
    {
        /**
         * 请求数据
         * 解析json
         * 适配器
         * 绑值显示
         */
        if (hasFocus){

            RxVolley.get(url1, new HttpCallback() {
                @Override
                public void onSuccess(String t) {
                    Toast.makeText(MainActivity.this,t,Toast.LENGTH_LONG).show();

                    //控制台输出Json
                    Log.d("aaaa",""+t);

                    //解析json
                    parsingJson(t);
//
//                    Log.d("xxxxx",t.toString());
//                    Log.d("xxxxx",mList.toString());

                    Adapter2 adapter = new Adapter2(MainActivity.this,mList);
                    mListView.setAdapter(adapter);


                }
            });
        }
    }

    //数据解析
    public void parsingJson(String t){
        try {

            JSONObject jsonObject = new JSONObject(t);
            JSONArray jsonList = jsonObject.getJSONArray("data");
            for(int i=0;i<jsonList.length();i++){
//                JSONArray json = jsonList.getJSONArray(i);

                JSONObject json = jsonList.getJSONObject(i);
                int lifeid=Integer.parseInt(json.getString("lifeid"));
                String diet=json.getString("diet");
                String excretion=json.getString("excretion");
                String sleep=json.getString("sleep");
                String activity=json.getString("activity");
                String useself=json.getString("useself");
                String hobby=json.getString("hobby");
                int patientid=Integer.parseInt(json.getString("patientid"));


                // Log.d("zzzz",province);

                mList.add(new Province2(lifeid,diet,excretion,sleep,activity,useself,hobby,patientid));

//                Province data = new Province();
//                data.setProvince(json.toString(1));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}
