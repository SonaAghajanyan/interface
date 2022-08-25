package interfaceAbstrakcia2;

public abstract class  Generale2 implements Anim2{
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
