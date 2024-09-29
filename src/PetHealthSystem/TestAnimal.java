package PetHealthSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAnimal {

    public static void performVetChecks(List<Pet> pets, List<IVetriniarian> vets) {
        for (Pet pet : pets) {
            for (IVetriniarian vet : vets) {
                System.out.println(vet.ExaminPet(pet));
            }
        }
    }

    public static void main(String[] args) {


        // יצירת רשימות של חיות
        List<Pet> pets = Arrays.asList(
                new Cat("black", "Mittens", 2),
                new Cat("gray", "Caty", 2),
                new Cat("white", "Yany", 2),
                new Dog("Labrador", "Doggy", 5),
                new Dog("Labrador", "Buddy", 5),
                new Dog("Labrador", "Mici", 5)
        );

        // יצירת וטרינרים
        List<IVetriniarian> vets = Arrays.asList(
                new GeneralVetrinian("Jones"),
                new GeneralVetrinian("Yony"),
                new GeneralVetrinian("Rami"),
                new SpecialistVetriner("Sani", "Cardiology"),
                new SpecialistVetriner("Ron", "Neurology"),
                new SpecialistVetriner("Smith", "Cardiology")
        );

        // קריאה לפונקציית הבדיקה
        performVetChecks(pets, vets);
    }


}

