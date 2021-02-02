package cn.edu.guet.ex;

//如果不使用set and get 赋值,那么使用lombook去执行

public class Student extends User {

    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
