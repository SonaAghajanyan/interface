public class Book1 implements PrintTable {



    String name;
    String after;

    public Book1(String name, String after) {
        this.name = name;
        this.after = after;
    }

    @Override
    public void print() {
        System.out.println(name + " " + after);
    }
}
