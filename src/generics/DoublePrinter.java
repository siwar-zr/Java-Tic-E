package generics;

public class DoublePrinter {

    Double objToPrint;

    public DoublePrinter(Double objToPrint){
        this.objToPrint = objToPrint;
    }

    public void print() {
        System.out.println(objToPrint);
    }
}
