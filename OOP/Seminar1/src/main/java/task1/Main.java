package task1;

import task1.Clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Солнышко", new Owner("Лол Галимов"),
                LocalDate.of(2021,10,5), new Illness("Лишай"), false, false, false, 10.0);
        System.out.println(cat.getOwner());
        System.out.println(cat.getNickname());

        cat.setIllness(new Illness(null));

        System.out.println(cat.getIllness());
        


        //System.out.println(testanimal.getNickname());

        System.out.println(cat.getType());
        System.out.println(cat);
        Animal catty = new Cat();
        Animal goodboy = new Dog();

        System.out.println(goodboy.getType());
        System.out.println(catty.getType());
        //catty.meow(); //Без статики мякнул определённый кот
        Cat.meow(); //Со статикой мяукнули все коты

        List<Animal> animals = new ArrayList<Animal>();

        animals.add(catty);
        animals.add(goodboy);
        animals.add(cat);
        
        Animal gepard = new Сheetah();
        Animal utka = new Duck();

        gepard.fly();
        //gepard.toGo();
        gepard.swim();

        utka.swim();
        //utka.toGo();
        utka.fly();

//        int i = 0;
//        for(Animal animal : animals){
//            System.out.println(i+1 + " " + animal);
//            i++;
//        }


    }
}

