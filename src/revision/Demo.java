package revision;

final class A {
    public final void print(){
        System.out.println("Hello");
    }
}

/*class B extends A{
//    @Override
//    public void print() {
//        System.out.println("Hello from B");
//    }
}*/
public class Demo {
    public static void main(String[] args){
//        final int x = 5;
//        //x =6;
//
//        for(int i = 0; i < 7 ; i++){
//            if(i == 2)
//                continue;
//            if(i == 5)
//                break;
//            System.out.println(i);
//        }

        int x = 5;
        while (isAvailable(x)){
            System.out.println(x);
            x--;
        }
    }

    public static boolean isAvailable(int x){
        return x-- > 0 ? true : false;
    }
}
