package xndir2;

public class Door2 implements Door{
    @Override
    public void task(int n) {

        if (n==open){
            System.out.println("Door is open");
        }
        else if (n==close){
            System.out.println("door is close");
        }
        else {
            System.out.println("invalide");
        }
    }
}
