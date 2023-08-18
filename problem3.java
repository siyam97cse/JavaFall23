public class problem3{
    public static void main(String [] args){
       int a=9;
       int b=4;
       int c=5;
       
       if(a>=b && a>=c){
           System.out.println(a+" is the largest number");
       }else if(b>=a && b>=c){
           System.out.println(b+" is the largest number");
       }else{
           System.out.println(c+" is the largest number");
       }
    }
}
