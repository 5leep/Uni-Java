import java.text.MessageFormat;

public class Dog extends Animal
{
    private String name;
    private int age;
    
    public Dog(String name, String move, String sound)
    {
        super(move, sound);
        this.name = name;
    }

    @Override
    protected void startDescription()
    {
        String output = MessageFormat.format("My name is {0} and I am {1} years old.", name, age);
        System.out.println(output);
    }

    @Override
    protected void endDescription()
    {
        System.out.println("That pig is a handsome boi.");
    }
}