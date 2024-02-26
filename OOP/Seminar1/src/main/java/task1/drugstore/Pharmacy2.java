package task1.drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy2 implements Iterable<Component>, Comparable<Pharmacy2>{

    private List<Component> components = new ArrayList<>();

    private int index = 0; //При декларировании уже по умолчанию 0

    public void addComponents(Component ... components){
        for(Component c : components){
            this.components.add(c);
        }
    }

    public Double sumWeight(List<Component> list){
        Double sum = 0D;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i).getWeight();
        }
        return sum;
    }

    public int sumPower(List<Component> list){
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            sum += list.get(i).getPower();
        }
        return sum;
    }

//    @Override
//    public boolean hasNext() {
//        return index < components.size();
//    }
//
//    @Override
//    public Component next() {
//        return components.get(index++);
//    }


//    public List<Component> getComponents() {
//        return components;
//    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    //toDO Надо переопределить метод так, чтобы сравнение было и по силе, и по массе. Приоритет по массе.
    @Override
    public int compareTo(Pharmacy2 o) {
        if(o.sumWeight(o.components) > this.sumWeight(this.components)){
            return 1;
        }
        if(o.sumWeight(o.components) < this.sumWeight(this.components)){
            return -1;
        }
        else{
            return Integer.compare(o.sumPower(o.components), this.sumPower(this.components));
        }
    }

    @Override
    public String toString() {
        return "Pharmacy2{" +
                "components=" + components +
                '}';
    }
}
