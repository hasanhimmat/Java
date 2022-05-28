import java.time.LocalDate;


//0019
public class JavaSwitch {

    public static void main(String[] args) {
        // Java Switch
        System.out.println("===== Java Switch =====\n");
        LocalDate today = LocalDate.now();

        System.out.println("Date: " + today.getDayOfMonth());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Year: " + today.getYear());
        System.out.println("Day: " + today.getDayOfWeek());


        System.out.println("===== BN Result =====");
        switch (today.getDayOfWeek()) {
            case SATURDAY -> System.out.println("শনিবার -> Saturday");
            case SUNDAY -> System.out.println("রবিবার -> Sunday");
            case MONDAY -> System.out.println("সোমবার -> Monday");
            case TUESDAY -> System.out.println("মঙ্গলবার -> Tuesday");
            case WEDNESDAY -> System.out.println("বুধবার -> Wednesday");
            case THURSDAY -> System.out.println("বৃহস্পতিবার -> Thursday");
            case FRIDAY -> System.out.println("শুক্রবার -> Friday");
            default -> System.out.println("Something wrong");
        }


/*
        switch (today.getDayOfWeek()) {
            case SATURDAY:
                System.out.println("শনিবার -> Saturday");
                break;
            case SUNDAY:
                System.out.println("রবিবার -> Sunday");
                break;
            case MONDAY:
                System.out.println("সোমবার -> Monday");
                break;
            case TUESDAY:
                System.out.println("মঙ্গলবার -> Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("বুধবার -> Wednesday");
                break;
            case THURSDAY:
                System.out.println("বৃহস্পতিবার -> Thursday");
                break;
            case FRIDAY:
                System.out.println("শুক্রবার -> Friday");
                break;
            default:
                System.out.println("Something wrong");
        }
*/

    }
}
