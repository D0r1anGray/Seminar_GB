package task1;

import task1.Clients.Animal;
import task1.Clients.Cat;
import task1.Clients.Dog;
import task1.Actions.Goable;

import java.util.ArrayList;
import java.util.List;


public class Main2 {
    public static void main(String[] args) {
        List<Goable> list = new ArrayList<>(); // Создание листа с интерфейсом Goable; List - абстаркция, а ArrayList уже его реализация
         Cat cat = new Cat();
         //Dog dog = new Dog();
         list.add(cat);
         //list.add(dog);

        System.out.println(list);

//        Animal animal = new Animal() { // анонимный класс
//            @Override
//            public void eat() {
//
//            }
//        };
    }
}
