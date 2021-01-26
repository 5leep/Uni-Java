import java.text.MessageFormat;

public class Cat extends Animal
{
    private String name;
    private int age;

    public Cat(String name, String move, String sound)
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
        System.out.println("Dog's are pricks.");
    }
}
