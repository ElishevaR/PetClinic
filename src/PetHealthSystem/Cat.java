package PetHealthSystem;

public class Cat extends Pet {
    private String color;//enum?

    public Cat(String color, String name, int age) {
        super(name, age, "animal");
        this.color = color;
    }


    @Override
    public String MakeSound() {
        return "meow";
    }

    @Override
    public String Eat() {
        return "Cats eat cat food";
    }
    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", " + super.toString() + // שימוש ב-super לקריאה ל-toString במחלקה האבסטרקטית
                '}';
    }
}
