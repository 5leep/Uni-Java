import java.time.LocalDateTime;

public class Greeter
{
    private String  name;           // Defines the name of person as a string output.
    private String  daytime;        // Defines time of day as a string output.
    private int     hourOfDay;      // Defines the hour as an integer output.
    private int minuteOfDay;     // Defines the minute as an integer output.

    public Greeter( String name, String daytime, int hourOfDay )      // CLASS: Security level + Name of class ("Greeter") + specifying which objects are used in the following method.
    {
        this.name       = name;         // ]
        this.daytime    = daytime;      // Referring to the appropriate objects in this class.
        this.hourOfDay  = hourOfDay;    // ]
    }

        public String getGreeting()     // METHOD: Security level + Name of method ("getGreeting").
        {
            hourOfDay   = ( LocalDateTime.now().getHour() );      // Retrieving current irl hour and assigning it to "hourOfDay" object.
            minuteOfDay = ( LocalDateTime.now().getMinute() );    // Retrieving current irl minute and assigning it to "minuteOfDay" object.

            if ( hourOfDay == 12 && minuteOfDay > 0 )                           // 'if' statement specifying if time is after 12:00
            {
                daytime = ( ":" + minuteOfDay + " Good Afternoon, Sir." );      // Specifies "daytime" object to assign parameters that it's the afternoon. 
            }
            else if ( hourOfDay <= 12 )                                         // 'else if' statement specifying if time is sooner than 12:00
            {
                daytime = ( ":" + minuteOfDay + " Good Morning, Sir." );        // Specifies "daytime" object to assign parameters that it's the morning.
            }
            else if ( hourOfDay >= 13 && hourOfDay <= 18 )                      // 'else if' statement specifying if time is between 13:00 and 18:00.
            {
                daytime = ( ":" + minuteOfDay + " Good Afternoon, Sir." );      // Specifies "daytime" object to assign parameters that it's the afternoon.
            }
            else if ( hourOfDay >= 19 && hourOfDay <= 22 )                      // 'else if' statement specifying if time is between 19:00 and 22:00.
            {
                daytime = ( ":" + minuteOfDay + " Good Evening, Sir.");         // Specifies "daytime" objects to assign parameters that it's the evening.
            }

            return "Hello, my name is " + name + ", and it is currently " + hourOfDay + daytime;    // Ending print statement

        }
}