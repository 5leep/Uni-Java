public class Hello
{
    public static void main(String[] args)
    {
        // System.out.println("Hello World");

        Greeter greeter = new Greeter ( "EV", "", 20 );
        System.out.println ( greeter.getGreeting() );
    }    
}
