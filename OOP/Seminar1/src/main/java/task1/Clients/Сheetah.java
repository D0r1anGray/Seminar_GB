package task1.Clients;

import java.time.LocalDate;

public class Сheetah extends Animal{

    public Сheetah(String nickname, Owner owner, LocalDate birthday, Illness illness, Boolean fly,
                   Boolean swim, Boolean toGo) {
        super(nickname, owner, birthday, illness, fly, swim, toGo);
    }

    public Сheetah() {
        super.fly = false;
        super.swim = false;
        super.toGo = true;
    }

    @Override
    public void eat() {

    }
}
