package task1.Clients;

import task1.Information.Illness;
import task1.Information.Owner;

import java.time.LocalDate;

public class Animal {
    protected String nickname;
    protected Owner owner;
    protected LocalDate birthday;
    //protected Illness illness;
    protected boolean illness;

    public Animal(String nickname, Owner owner, LocalDate birthday, boolean illness){ //Конструктор по умолчанию (пустой)
        this.nickname = nickname;
        this.owner = owner;
        this.birthday = birthday;
        this.illness = illness;
    }

    public Animal() {
//        this.nickname = "Кличка";
//        this.owner = new Owner("Хозяин");
//        this.birthday = LocalDate.now();
//        this.illness = new Illness("Болезнь");
        this("БезКлички" , new Owner("БезХозяина"),
                LocalDate.now(), false);
    }

    public String getNickname() {
        return nickname;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public boolean getIllness() {
        return illness;
    }

    public void setIllness(boolean illness) {
        this.illness = illness;
    }

//    public void lifeCicle(){
//        wakeUp("12:00");
//        hunt();
//        eat();
//        sleep();
//    }

    private void wakeUp(){
        System.out.println("Животное проснулось!");
    }

    private void wakeUp(String time) {
        System.out.println("Животное "+ nickname +" проснулось в " + time);
    }
    private void hunt(){
        System.out.println("Животное охотится");
    }
    //public abstract void eat();
    private void sleep(){
        System.out.println("Животное уснуло!");
    }



    public String getType(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("nickName = %s birthday = %s owner = %s illness = %s",
                nickname, birthday, owner, illness);

    }
}
