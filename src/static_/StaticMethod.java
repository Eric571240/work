package static_;

public class StaticMethod {
    public static void main(String[] args) {
        //创建2个学生对象 交学费
        Stu tom = new Stu("tom");
//        tom.payFee(100);

        Stu mary = new Stu("mary");
//        mary.payFee(200);

        //类名.类方法名  前提是  满足访问修饰符的访问权限和范围
        Stu.payFee(400);

        //通过类名来调用
        Stu.showFee();

        //如果我们希望不创建实例 我们可以调用某个方法(即当做工具来使用)
        //这时 把方法做成静态方法很合适
        System.out.println("9开平方的结果是=" + Math.sqrt(9));

        System.out.println(MyTools.calSum(10, 20));
    }
}
    //开发自己的工具类时，可以将方法做成静态的，方便调用
class MyTools {
    //求出两个数的和
        public static double calSum(double n1, double n2) {
            return n1 + n2;
        }
    }


class Stu {
    private String name;
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    //当方法使用了static修饰后，该方法就是静态方法
    //静态方法就可以访问静态属性/变量
    public static void payFee(double fee) {
        Stu.fee += fee;
    }
    public static void showFee() {
        System.out.println("总学费有:" + Stu.fee);
    }

}
