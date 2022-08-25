import interfaceAbstrakcia1.*;
import interfaceAbstrakcia2.AnimalGeneral;
import xndir1.Computer;
import xndir1.Generale;
import xndir1.Phone;
import xndir2.Door2;

public class Main {

    public static void main(String[] args) {


        //    PrintTable pr=creat("ffff",false);
        // pr.print();

        //   read(new Book1("jfjfj","jfjfj"));
        //   read(new Journal("fjgj"));


        // write your code here
        Printable printable = new Printable("eee", 5);
        // printable.print();
        //   System.out.println(printable.task());

        P p = new B("aaaa");
        //  p.start();
        String name = ((B) p).getName();
        // System.out.println(name);
        // P.a();
        P p1 = new B("aa");
        //   System.out.println( p1.sum(2,3));


        HH.If n = new H1("aa");
        //  n.ss();


        Generale generale = new Generale("MacbookPro", 600, 4);
        // generale.data();
        //  generale.taskT();
        //  generale.task3();


        Door2 door2 = new Door2();
        // door2.task(1);

/**
 }
 static void read(PrintTable p){
 p.print();
 }


 static PrintTable creat(String name, boolean opsheon){
 if (opsheon){
 return new Book1(name,"NN");

 }
 else {
 return new Journal(name);
 }
 }
 */
/**
 //xndir1
 Animal animal= new Dog();
 animal.age();
 animal.name();
 animal.sound();
 Animal animal1=new Cat();
 animal1.age();
 animal1.name();
 animal1.sound();
 Animal animal2=new Mouse();
 animal2.age();
 animal2.name();
 animal2.sound();
 */
//xndir1
        Gen gen = new Gen();
      //  gen.taskAnimals();


        AnimalGeneral animal= new AnimalGeneral();
      //  animal.task1();
    }
}