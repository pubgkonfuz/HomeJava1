package home_two;

public class Dog extends Pet {
    private String name;
    private String breed;
    private String commands;
    public Dog(String name, String breed, String commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        setColor(color);
        setShelter(shelter);
    }

    public Dog(String name, String breed, Color color, Shelter shelter, String commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        setColor(color);
        setShelter(shelter);
    }

    public String getInfo1() {
        return super.getInfo() + "name" + getName() + "breed" +
                getBreed() + "commands" + getCommands();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    void makeVoice(String voice, int number){
        System.out.println(voice + number);
    }
    void makeVoice(String voice,int number,String height){
        System.out.println(voice + number + height);
    }
}
