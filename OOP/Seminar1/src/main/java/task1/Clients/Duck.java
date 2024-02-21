package task1.Clients;

import task1.Actions.*;
import task1.Information.Illness;
import task1.Information.Owner;

import java.time.LocalDate;

public class Duck extends Animal implements Goable, Swimable, Flyable {

//    public Duck(String nickname, Owner owner, LocalDate birthday, Illness illness) {
//        super(nickname, owner, birthday, illness);
//    }
//
//    public Duck() {
//    }

//    @Override
//    public void eat() {
//
//    }

    @Override
    public double run() {
        System.out.println("Утка бежит со скоростью ");
        return 2D;
    }

    @Override
    public double swim() {
        System.out.println("Утка плавает со скоростью ");
        return 2D;
    }

    @Override
    public double fly() {
        System.out.println("Утка летает со скоростью ");
        return 12D;
    }
}
