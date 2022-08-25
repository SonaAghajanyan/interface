public interface P {
     int a=9;

     void start();

    default  void q(){
         System.out.println("java");
    }
    static void a(){
         System.out.println("fff");
    }
  default    int sum(int a,int b){
         return samAll(a,b);


    }



    private  int samAll(int...num){

         int result= 0;
         for ( int i: num) {
              result+=i;

         }
         return result;

    }
}
