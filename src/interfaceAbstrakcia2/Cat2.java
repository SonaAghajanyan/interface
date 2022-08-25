package interfaceAbstrakcia2;


import interfaceAbstrakcia1.Generale;

public class Cat2 extends Generale2 {
        public String type2(){
            return "cat";
        }
        public String cat2Info(){
            return "type"+ " "+ type2()+ " "+ ":\n"
                    +" name"+ " "+ name() + " "+ ":\n"
                    +"age"+ " "+ age()+ " "+ ":\n"
                    + "sound"+ " "+ sound() + " "+ " :\n";
        }
}
