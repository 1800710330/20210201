package cn.edu.guet;

import cn.edu.guet.poly.Animal;
import cn.edu.guet.poly.Dog;
import cn.edu.guet.util.configReader;

/**
 * Hello world!
 * OCP:对扩展开放(可以新增类或配置文件)
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //不灵活写法
        String className = configReader.getClassName();
        /*
        利用反射机制使用className动态创建对象
         */

        Animal animal = (Animal) Class.forName(className).newInstance();
        animal.bark();
    }
}
