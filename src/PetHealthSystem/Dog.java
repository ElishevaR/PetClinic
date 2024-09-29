package PetHealthSystem;

public class Dog extends Pet {
    private String breed;

    public Dog(String breed, String name, int age) {
        super(name, age, "cattle");
        this.breed = breed;
    }

    @Override
    public String MakeSound() {
        return "ahooahooahoo";
    }

    @Override
    public String Eat() {
        return "Dogs eat dog food";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", " + super.toString() + // שימוש ב-super לקריאה ל-toString במחלקה האבסטרקטית
                '}';
    }
}
