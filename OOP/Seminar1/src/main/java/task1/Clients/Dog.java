package task1.Clients;

import task1.Actions.Goable;
import task1.Actions.Swimable;
import task1.Information.Illness;
import task1.Information.Owner;

import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable {
//    public Dog(String nickname, Owner owner, LocalDate birthday, Illness illness) {
//        super(nickname, owner, birthday, illness);
//    }
//
    public Dog(String nickname, boolean illness) {
        this.nickname = nickname;
        this.illness = illness;
    }

//    @Override
//    public void eat() {
//
//    }


    @Override
    public double run() {
        System.out.println("Собарка бежит со скоростью ");
        return 15D;
    }

    public double swim(){
        System.out.println("Собака плавает со скоростью ");
        return 4D;
    }
}
