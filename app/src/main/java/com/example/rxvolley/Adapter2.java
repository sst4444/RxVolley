package com.example.rxvolley;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * 作者：Administrator on 2019/10/16 0016 14:02
 * 邮箱：1415862429@qq.com
 */
public class Adapter2 extends BaseAdapter {
    private Context context;
       private List<Province2> list;

    //private Province data;
    //布局加载器
    private LayoutInflater inflater;

    public Adapter2(Context context, List<Province2> list) {
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

        TextView tv1=view.findViewById(R.id.lifeid);
        TextView tv2=view.findViewById(R.id.diet);
        TextView tv3=view.findViewById(R.id.excretion);
        TextView tv4=view.findViewById(R.id.sleep);
        TextView tv5=view.findViewById(R.id.activity);
        TextView tv6=view.findViewById(R.id.useself);
        TextView tv7=view.findViewById(R.id.hobby);
        TextView tv8=view.findViewById(R.id.patientid);

        tv1.setText(list.get(i).getLifeid()+"");
        tv2.setText(list.get(i).getDiet()+"");
        tv3.setText(list.get(i).getExcretion()+"");
        tv4.setText(list.get(i).getSleep()+"");
        tv5.setText(list.get(i).getActivity()+"");
        tv6.setText(list.get(i).getUseself()+"");
        tv7.setText(list.get(i).getHobby()+"");
        tv8.setText(list.get(i).getPatientid()+"");

        return view;
    }
}
