package interfaceAbstrakcia2;

public class Mouse2 extends Generale2 {


    public String type2() {
        return "mouse";
    }
    public String mouse2Info(){
        return "type"+ " "+type2()+ " "+ ":\n"
                +"name"+ " "+name()+ " "+ ":\n"
                +"age"+ " "+ age()+ " "+ ":\n"
                +"sound"+ " "+ sound()+ " "+ ":\n";
    }
}

