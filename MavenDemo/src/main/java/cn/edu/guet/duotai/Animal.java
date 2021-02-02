package cn.edu.guet.duotai;
//继承：父类中有一个方法，子类去继承该方法
/*
抽象类
 */
public abstract class Animal {
    /*
    *bark:叫声，这种行为不能在Animal中具体化，如果具体化，会导致所有继承Animal的子类都具有统一的叫声
    * 因为不同动物有不同叫声，叫这种行为在Animal中必须是抽象的(不确定是哪种动物)
    * 方法如何写成抽象的？
    * 1.把方法体去掉
    * 2.
    */
    abstract void bark();
}
