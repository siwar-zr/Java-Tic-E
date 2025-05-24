package generics;

public class GenericsExemple {

    public static void main(String[] args){

        Printer<Integer> printer = new Printer<>(40);
        printer.print();

        Printer<String> printer1 = new Printer<>("Hello");
        printer1.print();
    }
}
