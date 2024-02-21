package task1.Personal;

import task1.Clients.Animal;
import task1.Information.Illness;

public class Doctor {
    protected String name;
    protected boolean place;
    protected boolean task;

    protected int countUkol;
//    private String operation;
//    protected String ukol;

    public Doctor(String name, boolean place){
        this.name = name;
        this.place = place;
    }

    public void osmotr(Animal animal, Nurse nurse){
        System.out.println("Доктор " + name + " осматривает животное " + animal.getType());
         if(animal.getIllness() && nurse.place){
             System.out.println("Доктор поручает сделать укол медсестре.");
             this.task = true;
             nurse.ukol();
         } else if(animal.getIllness()){
             ukol();
             countUkol++;
         } else{
             System.out.println("Укол не требуется! Животинка Здорова!");
         }
    }

    public int getCountUkol() {
        return countUkol;
    }

    //    protected void setTask(boolean task){
//        this.task = task;
//    }
    protected void ukol(){
        System.out.println("Доктор делает укол!");
    }

}
