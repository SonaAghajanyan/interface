public class H1 implements HH.If {
    public H1(String name) {
        this.name = name;
    }

    String name;

    @Override
    public void ss() {
        System.out.println(name);
    }
}
