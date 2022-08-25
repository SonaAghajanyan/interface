public class A implements P{

    String name;
    String after;

    public A(String name, String after) {
        this.name = name;
        this.after = after;
    }

    @Override
    public void start() {
        System.out.println(name+ " "+ after);
    }
}
