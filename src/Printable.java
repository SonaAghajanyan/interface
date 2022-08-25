public class Printable implements Person,Book{
    String name;
    int age;

    public Printable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println(name+" "+age);

    }

    @Override
    public int task() {
        return 10;
    }
}
