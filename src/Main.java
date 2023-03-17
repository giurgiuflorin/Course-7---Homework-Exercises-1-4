import exercise1.Company;
import exercise1.Facebook;
import exercise2.ING;
import exercise2.Person;
import exercise3.Animal;
import exercise4.Student;

public class Main {
    public static void main(String[] args) {

        //Exercise 1
        Company companySRL = new Company();
        companySRL.setPreferredType(new Facebook());
        companySRL.setTypeOfProduct("product");
        companySRL.setDaysOfAdvertisement(5);


        //Exercise 2
        // Pentru a corela functiile unei banci cu persoana, m-am folosit de Person extends (banca dorita).
        // Nu am reusit sa setez banca si functiile aferente printr-o metoda setBank din clasa
        // Person si care sa poata apele functiile bancii prin person.(apelare functie).
        // Astfel, pentru a schimba banca unei persoane, se va schimba din antetul clasei Person
        // numele bancii prin metoda extends.
        // Problema apare cand vreau sa creez doua persoane diferite cu banci diferite;
        // ambele vor putea apela doar functiile aceleasi banci din antetul clasei Person.
        // Nu mi-a reusit rezolvarea optima/corecta a acestui exercitiu.
        Person antonia = new Person(new ING());
//        antonia.setBankProvider(new ING());
        antonia.depositMoney(100);
        antonia.withdrawMoney(1200);
        antonia.withdrawMoney(100);


        //Exercise 3
        //Pentru a nu crea clase separate pentru fiecare animal, am creat o singura clasa
        //denumita "Animal" care are functia de setAnimalType.
        Animal cat = new Animal();
        cat.setAnimalType("cat");
        cat.walk();
        Animal dog = new Animal();
        dog.setAnimalType("dog");
        dog.eat();
        Animal mouse = new Animal();
        mouse.setAnimalType("mouse");
        mouse.talk();
        Animal chicken = new Animal();
        chicken.setAnimalType("chicken");
        chicken.talk();
        Animal duck = new Animal();
        duck.setAnimalType("duck");
        duck.eat();

        //Exercise 4
        Student alin = new Student("Alin", 8);
        Student ciprian = new Student("Ciprian", 10);

















    }
}