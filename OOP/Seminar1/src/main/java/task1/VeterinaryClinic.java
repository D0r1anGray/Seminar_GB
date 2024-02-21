package task1;

import task1.Actions.Flyable;
import task1.Actions.Goable;
import task1.Actions.Swimable;
import task1.Clients.Animal;
import task1.Personal.*;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {

     private List<Animal> animals;
     private List<Doctor> doctors;
     private List<Nurse>  nurses;

     public VeterinaryClinic(){
         animals = new ArrayList<>();
         doctors = new ArrayList<>();
         nurses = new ArrayList<>();
     }

     public void addAnimal(Animal animal){
        animals.add(animal);
     }

     public void addDoctor(Doctor doctor){
         doctors.add(doctor);
     }

     public void addNurse(Nurse nurse){
         nurses.add(nurse);
     }

     public List<Goable> getRunAnimal(){
         List<Goable> canrun = new ArrayList<>();
         for (Animal animal : animals) {
             if (animal instanceof Goable) {
                 canrun.add((Goable) animal);
             }
         }
         return canrun;
     }

     public List<Swimable> getSwimAnimal(){
         List<Swimable> canswim = new ArrayList<>();
         for (Animal animal : animals) {
             if (animal instanceof Swimable) {
                 canswim.add((Swimable) animal);
             }
         }
         return canswim;
     }

     public List<Flyable> getFlyAnimal(){
         List<Flyable> canfly = new ArrayList<>();
         for (Animal animal : animals) {
             if (animal instanceof Flyable) {
                 canfly.add((Flyable) animal);
             }
         }
         return canfly;
     }

      public Double setDoctorSalalry(Doctor doctor){
         return doctor.getCountUkol()*200.25;
      }

      public Double setNurseSalary(Nurse nurse){
         return nurse.getCountUkol()*100.50;
      }





}
