package interfaceAbstrakcia1;

public class Dog extends  Generale {

    public String type(){
        return "Dog";
    }

    public String dogInfo(){
        return   "type " + "" +type() + ":\n"
                +" name" +" "+ name() + ":\n"
                +"age"+" " +age() + ":\n"
                +"sound"+" "+sound() + ":\n";

    }
//
//    @Override
//    public String name() {
//
//        System.out.println("Sharik");
//        return null;
//    }
//
//    @Override
//    public int age() {
//        System.out.println(2);
//
//        return 0;
//    }
//
//    @Override
//    public String sound() {
//        System.out.println("huf");
//
//        return null;
//
//    }
}
