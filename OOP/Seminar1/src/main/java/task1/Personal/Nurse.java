package task1.Personal;

public class Nurse extends Doctor {
    public Nurse(String name, boolean place) {
        super(name, place);
    }

    public String getName(){
        return name;
    }

    @Override
    protected void ukol(){
        if(!super.task){
            System.out.println("Медсестра делает укол!");
            countUkol ++;
        }

    }

}
