package interfaceAbstrakcia1;

public class Gen {
    public void taskAnimals() {


        Dog dog = new Dog();
        System.out.println(dog.type());
        System.out.println(dog.dogInfo());
        Cat cat=new Cat();
        System.out.println(cat.type1());
        System.out.println(cat.catInfo());
        Mouse mouse=new Mouse();
        System.out.println(mouse.type2());
        System.out.println(mouse.mouseInfo());
    }
}