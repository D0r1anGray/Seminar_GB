package task1.Clients;

import java.time.LocalDate;

public class Cat extends Animal implements Goable,Huntable{

    //Todo отличие Double от double;
    private Double discount;
    public Cat(String nickname, Owner owner, LocalDate birthday, Illness illness, Boolean fly,
               Boolean swim, Boolean toGo, Double discount) {
        super(nickname, owner, birthday, illness, fly, swim, toGo);
        this.discount = discount;
    }

    public Cat() {
        this.discount = 10.0;
        super.fly = false;
        super.swim = false;
        super.toGo = true;
    }

    @Override
    public void eat() {
        System.out.println("Кошка поймала мышь и хавает");
    }


    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    @Override
    public void toGo(){
        System.out.println("Животное может бегать!");
    }
    @Override
    public String toString() {
        return super.toString()+" Discount("+discount+")";
    }

    public static void meow(){
        System.out.println(" Мяяяяяу!");
    }
}
