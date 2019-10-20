package com.example.rxvolley;

/**
 * 作者：Administrator on 2019/10/16 0016 14:38
 * 邮箱：1415862429@qq.com
 * 互联网医疗----日常生活实体
 */
public class Province2 {
    private  int lifeid;
    private  String diet;
    private  String excretion;
    private  String sleep;
    private  String activity;
    private  String useself;
    private  String hobby;
    private  int patientid;

    public Province2(int lifeid, String diet, String excretion, String sleep, String activity, String useself, String hobby, int patientid) {
        this.lifeid = lifeid;
        this.diet = diet;
        this.excretion = excretion;
        this.sleep = sleep;
        this.activity = activity;
        this.useself = useself;
        this.hobby = hobby;
        this.patientid = patientid;
    }

    public int getLifeid() {
        return lifeid;
    }

    public void setLifeid(int lifeid) {
        this.lifeid = lifeid;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getExcretion() {
        return excretion;
    }

    public void setExcretion(String excretion) {
        this.excretion = excretion;
    }

    public String getSleep() {
        return sleep;
    }

    public void setSleep(String sleep) {
        this.sleep = sleep;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getUseself() {
        return useself;
    }

    public void setUseself(String useself) {
        this.useself = useself;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    @Override
    public String toString() {
        return "Province2{" +
                "lifeid=" + lifeid +
                ", diet='" + diet + '\'' +
                ", excretion='" + excretion + '\'' +
                ", sleep='" + sleep + '\'' +
                ", activity='" + activity + '\'' +
                ", useself='" + useself + '\'' +
                ", hobby='" + hobby + '\'' +
                ", patientid=" + patientid +
                '}';
    }
}
