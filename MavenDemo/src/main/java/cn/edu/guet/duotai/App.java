package cn.edu.guet.duotai;

public class App {
    public static void main(String[] args) {
        /*Cat cat = new Cat();
        *cat.bark();
        *Elephant elephant = new Elephant();
        *elephant.bark();
        //面向具体
        *Dog dog = new Dog();
        *dog.bark();
       */
        /*
        利用<面向对象>实现ocp原则:Open Close Principle(开闭原则或者闭合原则:对修改闭合,对扩展开放)
        对修改闭合:将来系统新增需求或修改需求的时候,不要修改原来的代码
        对扩展开放:只需要新增相应的类或配置文件来满足新的需求
        可维护性、可扩展性
         */
        Animal animal = new Cat();//向上转型:大象是动物，特点:父类的引用(Animal)指向子类的对象(new Dog()或new Cat()...)
        animal.bark();//运行代码不变,只变上面的对象,就会出现多态:同一种行为,作用在不同的对象上,有不同的结果出现
    }
}
