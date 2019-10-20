package com.example.rxvolley;

import android.widget.TextView;

/**
 * 省份实体类
 */
public class Province {
    private String province;
    private int id;

    public Province(String province, int id) {
        this.province = province;
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Province{" +
                "province='" + province + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
