package task1.Clients;

import task1.Actions.Flyable;

public class Parrot extends Animal implements Flyable {
//    public Parrot(){
//
//    }

    @Override
    public double fly() {
        System.out.println("Попугай летает со скоростью ");
        return 4D;
    }

//    @Override
//    public void eat() {
//
//    }

}
