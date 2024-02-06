package task1.Clients;

import java.time.LocalDate;

public class Dog extends Animal{
    public Dog(String nickname, Owner owner, LocalDate birthday, Illness illness, Boolean fly,
               Boolean swim, Boolean toGo) {
        super(nickname, owner, birthday, illness, fly, swim, toGo);
    }

    public Dog() {
        super.fly = false;
        super.swim = true;
        super.toGo = true;
    }
}
