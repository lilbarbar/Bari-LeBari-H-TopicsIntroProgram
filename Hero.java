public class Hero {
    private String name;
    private String power;
    private int age;

    public Hero() {
        name = "Nameless";
        power = "Unknown Power";
        age = 20;
    }

    public Hero(String name, String power, int age) {
        this.name = name;
        this.power = power;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nPower: " + power;
    }

}