package interfaceAbstrakcia2;

import java.util.Scanner;

public class AnimalGeneral {

    public void task1() {
        Scanner in = new Scanner(System.in);
        System.out.println("input type");
        String type = in.next();

        if (type.equals("dog")) {
            Dog2 dog2 = new Dog2();
            System.out.println(dog2.dog2Info());

        }
        if (type.equals("cat")) {
            Cat2 cat2 = new Cat2();
            System.out.println(cat2.cat2Info());
        }
        if (type.equals("mouse")) {

            Mouse2 mouse2 = new Mouse2();
            System.out.println(mouse2.mouse2Info());
        }


    }
}