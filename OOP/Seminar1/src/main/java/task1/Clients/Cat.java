package task1.Clients;

import task1.Actions.Goable;
import task1.Actions.Swimable;
import task1.Information.Illness;
import task1.Information.Owner;

import java.time.LocalDate;

public class Cat extends Animal implements Goable, Swimable {

    //Todo отличие Double от double;
    private Double discount;
    public Cat(String nickname, Owner owner, LocalDate birthday, boolean illness) {
        super(nickname, owner, birthday, illness);
//        this.discount = discount;
    }

    public Cat() {
        this.discount = 10.0;
    }

//    @Override
//    public void eat() {
//        System.out.println("Кошка поймала мышь и хавает");
//    }


//    public Double getDiscount() {
//        return discount;
//    }

//    public void setDiscount(Double discount) {
//        this.discount = discount;
//    }

//    @Override
//    public String toString() {
//        return super.toString()+" Discount("+discount+")";
//    }

//    public static void meow(){
//        System.out.println(" Мяяяяяу!");
//    }

    @Override
    public double run() {
        System.out.print("Кошка бежит со скоростью ");
        return Goable.super.run();
    }
    @Override
    public double swim(){
        System.out.println("Кошка плавает со скоростью ");
        return 3D;
    }
}
