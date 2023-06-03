package static_.codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        /**
         * 类被加载的情况举例
         * */

        //1.创建对象实例时(new)
//        AA aa = new AA();
        //2.创建子类对象实例，父类也会被加载
//        AA aa2 = new AA();
        //3.使用类的静态成员时(静态属性，静态方法)
//        System.out.println(Cat.n1);

        //static代码块，是在类加载的时候，执行的；并且只会执行一次
//        DD dd = new DD();
//        DD dd1 = new DD();

        //普通代码块，在创建对象实例时被隐式地调用。
        //被创建一次，就会调用一次。
        //如果只是使用类的静态成员时，普通代码块并不会执行
        System.out.println(DD.n1);//888，静态代码块一定会执行

    }
}

class DD {
    //如果只是使用类的静态成员时，普通代码块并不会执行
    public static int n1 = 888;//静态属性

    //静态代码块  只被执行一次
    static {
        System.out.println("DD 的静态代码5被执行..");
    }
    //普通代码块只有 在创建对象实例时被隐式地调用。每创建一个对象就调一次
    //可以理解为: 普通代码块是构造器的补充
    {
        System.out.println("DD的普通代码块....");
    }
}

class Animal {
    //静态代码块
    static {
        System.out.println("Animal 的静态代码4被执行..");
    }
}

class Cat extends Animal{
    public static int n1 = 999;//静态属性

    //静态代码块
    static {
        System.out.println("Cat 的静态代码3被执行..");
    }
}

class BB {
    //静态代码块
    static {
        System.out.println("BB 的静态代码2被执行..");//父类先输出
    }
}

class AA extends BB {
    //静态代码块
    static {
        System.out.println("AA 的静态代码1被执行..");//子类后输出
    }
}
