package task1;

import task1.Actions.Flyable;
import task1.Actions.Goable;
import task1.Actions.Swimable;
import task1.Clients.*;
import task1.Information.Illness;
import task1.Information.Owner;
import task1.Personal.Doctor;
import task1.Personal.Nurse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Animal cat = new Cat("Солнышко", new Owner("Лол Галимов"),
//                LocalDate.of(2021,10,5), new Illness("Лишай"), false, false, false, 10.0);
//        System.out.println(cat.getOwner());
//        System.out.println(cat.getNickname());
//
//        cat.setIllness(new Illness(null));
//
//        System.out.println(cat.getIllness());
        


        //System.out.println(testanimal.getNickname());

//        System.out.println(cat.getType());
//        System.out.println(cat);
//        Animal catty = new Cat();
//        Animal goodboy = new Dog();
//
//        System.out.println(goodboy.getType());
//        System.out.println(catty.getType());
        //catty.meow(); //Без статики мякнул определённый кот
       // Cat.meow(); //Со статикой мяукнули все коты
//
//        List<Animal> animals = new ArrayList<Animal>();
//
//        animals.add(catty);
//        animals.add(goodboy);
//        animals.add(cat);
//
//        Animal gepard = new Сheetah();
//        Animal utka = new Duck();

//        int i = 0;
//        for(Animal animal : animals){
//            System.out.println(i+1 + " " + animal);
//            i++;
//        }


//        List<Animal> animals = new ArrayList<>();
//
//        List<Goable> goables = new ArrayList<>();
//        List<Swimable> swimables = new ArrayList<>();
//        List<Flyable> flyables = new ArrayList<>();

        VeterinaryClinic veterinaryClinic = new VeterinaryClinic();

        Dog dog = new Dog("Шарик", true);
        Cat cat = new Cat();
        Duck duck = new Duck();
        Cheetah gepard = new Cheetah();
        Parrot parrot = new Parrot();
        Penguin penguin = new Penguin();

        veterinaryClinic.addAnimal(dog);
        veterinaryClinic.addAnimal(cat);
        veterinaryClinic.addAnimal(duck);
        veterinaryClinic.addAnimal(gepard);
        veterinaryClinic.addAnimal(parrot);
        veterinaryClinic.addAnimal(penguin);

        Doctor doc1 = new Doctor("Лол Галимов", true);
        Doctor doc2 = new Doctor("Геральт Изривии", false);

        veterinaryClinic.addDoctor(doc1);
        veterinaryClinic.addDoctor(doc2);

        Nurse nurse1 = new Nurse("Симпотная Медичка", true);
        Nurse nurse2 = new Nurse("Настасья Филипповна", true);

        veterinaryClinic.addNurse(nurse1);
        veterinaryClinic.addNurse(nurse2);

        System.out.println(veterinaryClinic.getSwimAnimal()+"\n");
        System.out.println(veterinaryClinic.getRunAnimal()+"\n");
        System.out.println(veterinaryClinic.getFlyAnimal()+"\n");

        doc1.osmotr(dog, nurse1);
        System.out.println("Медсестра " + nurse1.getName() + " получила ЗП в размере "+
                veterinaryClinic.setNurseSalary(nurse1));


    }
}

