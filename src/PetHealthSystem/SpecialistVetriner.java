package PetHealthSystem;

public class SpecialistVetriner extends GeneralVetrinian {
    private String specialty;

    public SpecialistVetriner(String name, String specialty) {
        super(name);
        this.specialty = specialty;
    }

    @Override
    public String ExaminPet(Pet pet) {
        return pet.GetName() + "was specially tested in the field of " + specialty + " by Dr. " + this.GetName();
    }

    @Override
    public String toString() {
        return "SpecialistVetriner{" +
                "specialty='" + specialty + '\'' +
                ", " + super.toString() + // שימוש ב-super לקריאה ל-toString במחלקה האבסטרקטית
                '}';
    }


}
