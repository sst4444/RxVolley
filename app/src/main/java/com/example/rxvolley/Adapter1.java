package com.example.rxvolley;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 *适配器
 */
public class Adapter1 extends BaseAdapter {
    private Context context;
    private List<Province> list;

    //private Province data;
    //布局加载器
    private LayoutInflater inflater;

    public Adapter1(Context context, List<Province> list) {
        this.context = context;
        this.list = list;
        //获取系统服务
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view=inflater.inflate(R.layout.list_item,null);

        TextView tv1=view.findViewById(R.id.idBind);
        TextView tv2=view.findViewById(R.id.testBind);

        tv1.setText(list.get(i).getId()+"");
        tv2.setText(list.get(i).getProvince());
        return view;
    }


}


