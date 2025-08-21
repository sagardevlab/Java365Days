package Java365Days;
import java.util.List;

public class day2 {
    public static void main(String[] args){

        // Store a list inside var 
        var num = List.of(1,2,3,4,5);

        //print that list
        System.out.println("Numbers inside list are: " + num);

        //a new way to write switch case and storing it inside var
        var day = 3;

        var dayType = switch (day) {
            case 1, 7 -> "Weekend";
            case 2, 3, 4, 5, 6 -> "Weekday";
            default -> "Invalid day";
        };

        System.out.println(dayType);

        //Storing json inside var
        var json = """
                {
                    "name" : "Sagar",
                    "status" : "Learning"
                }
                """;

        System.out.println(json);
    }
}
