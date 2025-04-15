package Abstraction;


abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("playing Music..");
    }
}

abstract class Toyota extends Car{

}

class AdvancedToyota extends Toyota{

    public void drive(){
        System.out.println("Driving Toyota..");
    }
    public void fly(){
        System.out.println("Flying..");
    }
}

public class Demo {
    public static void main(String a[]){
        AdvancedToyota obj = new AdvancedToyota();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
