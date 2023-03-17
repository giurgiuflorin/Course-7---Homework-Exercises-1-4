package exercise3;

public class Animal implements AnimalBehaviour{

    String animalType;

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    @Override
    public String walk() {
        System.out.println(animalType + "-walking");
        return animalType;
    }

    @Override
    public String talk() {
        System.out.println(animalType + "-talking");
        return animalType;
    }

    @Override
    public String eat() {
        System.out.println(animalType + "-eating");
        return animalType;
    }
}
