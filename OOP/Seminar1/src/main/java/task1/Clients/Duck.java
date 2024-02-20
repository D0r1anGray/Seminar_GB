package task1.Clients;

import java.time.LocalDate;

public class Duck extends Animal{

    public Duck(String nickname, Owner owner, LocalDate birthday, Illness illness, Boolean fly,
                Boolean swim, Boolean toGo) {
        super(nickname, owner, birthday, illness, fly, swim, toGo);
    }

    public Duck() {
        super.fly = true;
        super.swim = true;
        super.toGo = true;
    }

    @Override
    public void eat() {

    }
}
