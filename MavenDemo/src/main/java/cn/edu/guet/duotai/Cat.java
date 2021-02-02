package cn.edu.guet.duotai;

public class Cat extends Animal {
    /*
    在子类中可以实现了(可以具体化,因为确定了是哪种动物)
     */
    @Override
    void bark() {
        System.out.println("喵喵....");
    }
}
