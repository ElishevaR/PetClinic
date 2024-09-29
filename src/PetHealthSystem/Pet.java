package PetHealthSystem;

public abstract class  Pet{

    private String name;
    private int age;
    protected String species;

    public Pet(String name, int age, String species)
    {
        this.name = name;
        this.age = age;
        this.species = species;
    }
    public String GetName()
    {
        return name;
    }
    public int GetAge()
    {
        return age;
    }
    public String GetSpecies()
    {
        return species;
    }
    abstract public String MakeSound();
    abstract public String Eat();

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", species='" + species + '\'' +
                '}';
    }
}
