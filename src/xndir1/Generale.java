package xndir1;

import java.util.Scanner;

public class Generale implements Computer, Phone, Language {
    String compName;
    int cost;
    int gg;

    public Generale(String compName, int cost, int gg) {
        this.compName = compName;
        this.cost = cost;
        this.gg = gg;
    }


    @Override
    public void data() {
        if (cost > 500) {
            int count = 0;
            for (int i = 0; i < compName.length(); i++) {
                if (compName.charAt(i) == 'a') {
                    count++;

                }
            }
            System.out.println(count);

        } else {
            System.out.println(gg);
        }
    }


    @Override
    public void taskT() {
        String phoneName = "Samsung";
        String language = "java";

        if (phoneName.equals("Redmi")) {
            System.out.println(language == "android");
        } else if (cost < 1000) {
            for (int i = 0; i < phoneName.length(); i++) {
                String s1 = "";
                String s2 = ",,";
                s1 += phoneName.charAt(i) + s2;
                System.out.print(s1);

            }

        }
        System.out.println();

    }


    @Override
    public void task3() {
        Scanner in = new Scanner(System.in);
        System.out.println("input language");
        String language = in.nextLine();


        if (language.equals("java")) {


            for (int i = 0; i < language.length(); i++) {
                if (language.charAt(i) != 'v') {
                    String sss = "";
                    sss += language.charAt(i);
                    System.out.print(sss);
                }

            }

            /**
             if (language.equals("payton")) {
             System.out.println("pay" + "java" + "ton");

             }
             */
        }

        String k = "java";
        String k1 = "";
        String k2 = "";
        String k3 = "";

        if (language.equals("payton")) {
            for (int j = 0; j < language.length() / 2; j++) {
                k1 += language.charAt(j);
            }
            k2 = k1 + k;

            for (int j = language.length() / 2; j < language.length(); j++) {
                k3 += language.charAt(j);
            }
            System.out.println(k2 + k3);
        }




        }


    }


