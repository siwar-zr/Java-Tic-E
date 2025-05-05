package Exceptions;

class ZeroResultException extends Exception{
   public ZeroResultException(String message){
       super(message);
   }
        }

public class Demo {
    public static void main(String a[]){
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j == 0){
                throw new ZeroResultException("The output cannot be 0");
            }
        }

        catch(ZeroResultException e){
            j=18;
            System.out.println("This is the default output " + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong" + e);
        }


        System.out.println(j);
        System.out.println("Bye");
    }
}
