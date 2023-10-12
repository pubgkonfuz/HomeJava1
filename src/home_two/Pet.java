package home_two;

public class Pet {
    private int age;
    private Color color;
    private Shelter shelter;

    private int generateDefaultAge() {
        age = 10;
        return age;
    }

    public final String getInfo() {
        return "age: " + generateDefaultAge() + " color: " + color + " shelter: " + shelter.getName();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
}

