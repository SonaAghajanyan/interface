public class B implements P{

    String name;

    public B(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void start() {
        System.out.println(getName());
    }

    @Override
    public int sum(int a, int b) {
        return P.super.sum(a, b);
    }
}
