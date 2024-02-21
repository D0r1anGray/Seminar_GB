package task1.Clients;

import task1.Actions.Swimable;

public class Penguin extends Animal implements Swimable {

    public double swim(){
        System.out.println("Пингвин плавает со скоростью ");
        return 40D;
    }
}
