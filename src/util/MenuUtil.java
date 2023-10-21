package util;

public class MenuUtil {
    public static byte entryMenu(){
        System.out.println("""
                ---------/ Airline Reservation System /---------
                [0] - > Exit
                [1] - > Admin
                [2] - > Customer
                """);
        return InputUtil.getInstance().requiredByte("Choose the option: ");
    }

    public static byte adminMenu(){
        System.out.println("""
                -----------------/ Admin Menu /-----------------
                [0] - > Exit
                [1] - > Back
                [2] - > Add Flight
                [3] - > View Planes
                [4] - > View Tickets
                [5] - > View Passenger
                [6] - > View Notice Board
                [7] - > View Flight
                [8] - > Search All
                """);
        return InputUtil.getInstance().requiredByte("Choose the option: ");
    }

    public static byte customerMenu(){
        System.out.println("""
                ---------------/ Customer Menu /---------------
                [0] - > Exit
                [1] - > Back
                [2] - > View Flights
                [3] - > Order Ticket
                [4] - > Cancel Ticket
                                
                """);
        return InputUtil.getInstance().requiredByte("Choose the option: ");
    }

    public static byte searchAndShowMenu(){
        System.out.println("""
                ---------/ Show or Search Menu /---------
                [0] - > Exit
                [1] - > View Flights
                [2] - > Search Flight
                """);
        return InputUtil.getInstance().requiredByte("Choose the option: ");
    }
}
