package interfaceAbstrakcia2;

import interfaceAbstrakcia1.Generale;

public class Dog2 extends Generale {

    public String type2(){
        return "dog";

    }
    public String dog2Info(){
        return "type"+ " "+type2()+ " "+":\n"
                +"name"+ " "+name()+ " "+ ":\n"
                +"age"+ " "+age()+" "+":\n"
                +"sound"+ " "+ sound()+" "+":\n";
    }

    }

