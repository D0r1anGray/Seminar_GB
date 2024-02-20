package task1.Clients;

import java.time.LocalDate;

public abstract class Animal {
    protected String nickname;
    protected Owner owner;
    protected LocalDate birthday;
    protected Illness illness;

    protected Boolean fly;
    protected Boolean swim;
    protected Boolean toGo;



    public Animal(String nickname, Owner owner, LocalDate birthday, Illness illness,Boolean fly,
                  Boolean swim, Boolean toGo) { //Конструктор по умолчанию (пустой)
        this.nickname = nickname;
        this.owner = owner;
        this.birthday = birthday;
        this.illness = illness;
        this.toGo = toGo;
        this.swim = swim;
        this.fly = fly;
    }

    public Animal() {
//        this.nickname = "Кличка";
//        this.owner = new Owner("Хозяин");
//        this.birthday = LocalDate.now();
//        this.illness = new Illness("Болезнь");
        this("Кличка" , new Owner("Хозяин"),
                LocalDate.now(), new Illness("Болеет"), false, false, false);
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

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
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
    public abstract void eat();
    private void sleep(){
        System.out.println("Животное уснуло!");
    }



    public void fly(){
        if(this.fly){
            System.out.println("Животное " + getType() + " умеет летать!");
        }
        else{
            System.out.println("Животное " + getType() + " не умеет летать!");
        }

    }

    public void swim(){
        if(this.swim){
            System.out.println("Животное " + getType() + " умеет плавать!");
        }
        else{
            System.out.println("Животное " + getType() + " не умеет плавать!");
        }

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
