package task1.Clients;

import task1.Actions.Goable;
import task1.Actions.Swimable;
import task1.Information.Illness;
import task1.Information.Owner;

import java.time.LocalDate;


public class Cheetah extends Animal implements Goable, Swimable {

//    public Сheetah(String nickname, Owner owner, LocalDate birthday, Illness illness) {
//        super(nickname, owner, birthday, illness);
//    }
//
//    public Cheetah() {
//    }

//    @Override
//    public void eat() {
//
//    }


    @Override
    public double run() {
        System.out.println("Гепард бегает со скоростью ");
        return 60D;
    }

    @Override
    public double swim() {
        System.out.println("Гепард палавает со скоростью ");
        return 12D;
    }
}
