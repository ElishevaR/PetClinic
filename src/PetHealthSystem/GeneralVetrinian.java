package PetHealthSystem;

public class GeneralVetrinian implements IVetriniarian{

    private String name;

    public GeneralVetrinian(String name) {
        this.name = name;
    }

    public String GetName()
    {
        return name;
    }
    public  String ExaminPet(Pet pet)
    {
        return pet.GetName()+" was checked by Dr. "+this.name;
    }

    @Override
    public String toString() {
        return "GeneralVetrinian{" +
                "name='" + name + '\'' +
                '}';
    }
}
