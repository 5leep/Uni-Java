import java.text.MessageFormat;

public class Application 
{
    public static void main(String[] args)
    {
        Dog dog = new Dog("Table", "run", "woof");
        //System.out.println(dog.getDescription());
        dog.getDescription();

        Cat cat = new Cat("Bench", "fucking sprint everywhere", "scream at 3am");
        cat.getDescription();

        Pig pig = new Pig("Hammond", "Roll", "oink");
        pig.getDescription();
       
    }
}
