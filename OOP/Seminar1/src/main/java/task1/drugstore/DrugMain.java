package task1.drugstore;

import task1.drugstore.components.Azitronite;
import task1.drugstore.components.Penicellin;
import task1.drugstore.components.Water;

import java.util.*;

public class DrugMain {
    public static void main(String[] args) {

        Component water = new Water("Water", 10D, 1);
        Component azitron = new Azitronite("Azitronit", 2D, 14);
        Component penicellin = new Penicellin("Penicellin", 1.6, 6);

        Pharmacy2 p1 = new Pharmacy2();
        p1.addComponents(water, azitron);

        Pharmacy2 p2 = new Pharmacy2();
        p2.addComponents(water, penicellin);

        Pharmacy2 p3 = new Pharmacy2();
        p3.addComponents(penicellin, water);

        Pharmacy2 p4 = new Pharmacy2();
        p4.addComponents(penicellin, azitron, water);

        Pharmacy2 p5 = new Pharmacy2();
        p5.addComponents(azitron, water);

        //Iterator<Component> iterator = p1;

//        while(iterator.hasNext()) {
//            System.out.println(p1.next().toString());
//        }

//        Pharmacy2 p3 = new Pharmacy2();
//        p3.addComponents(azitron, penicellin);
//
//        List<Component> components = new ArrayList<>();
//
//        components.add(azitron);
//        components.add(water);
//        components.add(penicellin);
//
//        System.out.println(components);
//
////        Collections.sort(components/*, Comparator.reverseOrder()*/);
//
//        System.out.println(components);

//        for(Component c : p2){
//            System.out.println(c);
//        }

        List<Pharmacy2> lekarstva = new ArrayList<>();

        lekarstva.add(p2);
        lekarstva.add(p1);
        lekarstva.add(p3);
        lekarstva.add(p4);
        lekarstva.add(p5);

        System.out.println(lekarstva);

        System.out.println();
        Collections.sort(lekarstva);

        System.out.println(lekarstva);
    }
}
