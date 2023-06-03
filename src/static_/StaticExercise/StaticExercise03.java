package static_.StaticExercise;

public class StaticExercise03 {

}

class Person3 {
    private int id;
    private static int total = 0;

    public static void setTotalPerson3(int total) {
//        this.total = total;//static中不能使用this关键字
        Person3.total = total;//✔
    }

    public Person3() {
        total++;
        id = total;
    }

    //编写一个方法输出total的值
    public static void m() {
        System.out.println("total的值=" + total);
    }
}

class TestPerson3 {
    public static void main(String[] args) {
        Person3.setTotalPerson3(3);
        new Person3();
        Person3.m();
    }
}
