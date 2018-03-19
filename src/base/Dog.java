package base;

public class Dog implements Animals,Sesan {
    //static final 声明类常量
    public static final double PI = 3.14;
    public static int foot = 4;
    String breed;
    int dogAge;
    String color;
    public void setAge(int age){
        dogAge = age;
    }
    public int getAge(){
        System.out.println("the age of dog is " + dogAge);
        return dogAge;
    }

    public void eat(){
        System.out.println("吃。。。");
    }

    public void travel(){
        System.out.println("travel....");
    }

    public void listen(){

    }

    public void scaring(){

    }

    public Dog(String name){
        foot ++;
        System.out.println("this is dog, it's name is "+ name + "foot is " + foot);
    }
}
