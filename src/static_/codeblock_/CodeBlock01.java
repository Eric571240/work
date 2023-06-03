package static_.codeblock_;

public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("你好，李焕英");
        System.out.println("------------------------------");
        Movie m2 = new Movie("唐探3", 50);
        System.out.println("------------------------------");
        Movie m3 = new Movie("唐探3", 50,"小唐");
    }
}
class Movie {
    private String name;
    private double price;
    private String director;

    //3个构造器=》重载

    //代码块优先于构造器
    {
        System.out.println("=====代码块被调用...=====");
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正是开始...");
    }

    public Movie(String name) {
        System.out.println("=====M1被调用...=====");
        this.name = name;
    }

    public Movie(String name, double price) {
        System.out.println("=====M2被调用...=====");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("=====M3被调用...=====");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}