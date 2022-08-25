package interfaceAbstrakcia1;

public class Mouse extends Generale{
    public String type2(){
        return "mouse";
    }

    public String mouseInfo(){
        return "type2"+ type2()+"\n"
                +"name"+ name()+"\n"
                +"age"+age()+"\n"
                +"sound"+sound()+"\n";
    }





    /**
    @Override
    public String name() {
        System.out.println("stuard");
        return null;
    }

    @Override
    public int age() {
        System.out.println(1);

        return 0;
    }

    @Override
    public String sound() {
        System.out.println("pi");

        return null;
    }
    */
}
