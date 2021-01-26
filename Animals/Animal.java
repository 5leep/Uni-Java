import java.text.MessageFormat;

public abstract class Animal 
{
    
    private String move, sound;

    protected Animal(String move, String sound)
    {
        this.move = move;
        this.sound = sound;
    }

    public String getSound(){return sound;}
    public String getMovement(){return move;}

    protected void startDescription()
    {
        System.out.println("no implementation from derived class");
    }
    protected void endDescription(){}

    public void getDescription()
    {
        startDescription();
        String output = MessageFormat.format("From super: movement = {0} and sound = {1}", move, sound);
        System.out.println(output);
        endDescription();
    }
}