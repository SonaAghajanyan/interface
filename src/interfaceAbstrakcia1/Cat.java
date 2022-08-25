package interfaceAbstrakcia1;

public class Cat extends Generale{
    public String type1(){
        return "Cat";
    }

    public String catInfo(){
        return "taype1"+ type1()+"\n"
                +"name"+name()+"\n"
                +"age"+age()+"\n"
                +"sound"+sound()+"\n";


    }
    /**
    @Override
    public String name() {
        System.out.println("murzik");
        return null;
    }

    @Override
    public int age() {
        System.out.println(3);

        return 0;
    }

    @Override
    public String sound() {
        System.out.println("myau");

        return null;
    }
    */
}
