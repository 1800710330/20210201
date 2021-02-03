package cn.edu.guet.inter;
/*
*接口可以看作抽象类（更纯粹的抽象类）
 */
public class Person implements Fly {
    @Override
    public void fly() {
        System.out.println("使用大的风筝模型去飞");
    }
}
