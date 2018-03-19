package base;

public class HelloWorld {
    //类变量
   static char x = 'a';
    //实例变量
    String str;

    public String setStr(){
        str = "hello";
        return str;
    }
    public static void main(String[] args) {
        System.out.println("Hello world");
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.LARGE;
        System.out.println(juice.size);
        Dog dog1 = new Dog("Lucky1");
        Dog dog2 = new Dog("Lucky2");
        Dog dog3 = new Dog("Lucky3");
        //当实例化类时修改静态变量，其他实例化过的类的相应值也会改变
        System.out.println(dog1.foot);

        HelloWorld hw = new HelloWorld();
        System.out.println(hw.setStr());
        //当前类里的静态变量可直接使用，无须实例化
        //静态方法不能使用类的非静态变量
        System.out.println(x);

        Employee empOne = new Employee("run1");
        Employee empTwo = new Employee("run2");
        // 调用这两个对象的成员方法
        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟程序员");
        empTwo.empSalary(500);
        empTwo.printEmployee();

        System.out.println("=================\n");


    }
}

class FreshJuice {
    //枚举
    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}
    FreshJuiceSize size;
}
