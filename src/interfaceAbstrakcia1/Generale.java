package interfaceAbstrakcia1;

public abstract class Generale implements Animal {
    @Override
    public String name() {
        System.out.println("input name");
        return in.next();
    }

    @Override
    public int age() {
        System.out.println("input age");
        return in.nextInt();

    }

    @Override
    public String sound() {
        System.out.println("input sound");
        return in.next();
    }
}
