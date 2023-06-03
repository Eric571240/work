package static_;

public class ChildGame {
    public static void main(String[] args) {
    int count = 0;

    Child child1 = new Child("白骨精");
    child1.join();
    child1.count++;
    Child child2 = new Child("狐狸精");
    child2.join();
    child2.count++;
    Child child3 = new Child("蜘蛛精");
    child3.join();
    child3.count++;

        System.out.println("共有 " + Child.count + " 个小孩加入了游戏...");
    }
}

class Child {
    private String name;

    //定义一个变量 count, 是一个类变量(静态变量) static 静态
    //该变量最大的特点就是会被Child 类的所以的对象实例共享
    /**
     * static变量是对象共享 不管static变量在哪  static变量是同一个类所以对象共享
     *static类变量在  类加载的时候就生成了
     */
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + " 加入了游戏..");
    }
}
