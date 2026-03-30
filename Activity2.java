import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserActivityLogger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Date formatter
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter displayFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");

        // USER LOGIN
        System.out.print("Enter username: ");
        String username = input.nextLine();

        LocalDateTime loginTime = LocalDateTime.now();

        System.out.println("\nLogin successful!");
        System.out.println("User: " + username);
        System.out.println("Login time: " + loginTime.format(format));

        // USER ACTIVITY
        System.out.print("\nEnter your activity: ");
        String activity = input.nextLine();

        LocalDateTime activityTime = LocalDateTime.now();

        System.out.println("\n----- USER ACTIVITY LOG -----");
        System.out.println("User: " + username);
        System.out.println("Activity: " + activity);
        System.out.println("Activity time: " + activityTime.format(displayFormat));

        // LOGOUT
        System.out.print("\nPress ENTER to logout...");
        input.nextLine(); // wait for enter key

        LocalDateTime logoutTime = LocalDateTime.now();

        System.out.println("\nLogout successful!");
        System.out.println("User: " + username);
        System.out.println("Logout time: " + logoutTime.format(displayFormat));

        input.close();
    }
}
