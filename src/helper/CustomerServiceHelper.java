package helper;

import data.GlobalData;
import enums.ExceptionEnum;
import enums.TitleEnum;
import exception.ApplicationException;
import model.Flight;
import model.Passenger;
import util.InputUtil;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class CustomerServiceHelper {
    private static long passengerId;
    public static Passenger fillPassenger(long selectedTicked){
        try {
            String name = InputUtil.getInstance().requiredString("Enter the first name: ");
            String surname = InputUtil.getInstance().requiredString("Enter the surname: ");
            LocalDate birthdate = GeneralServiceHelper.dateHelper(TitleEnum.BIRTHDATE);
            int age = calculateAge(birthdate);
            String phoneNumber = InputUtil.getInstance().requiredString("Enter the phone number: ");
            String email = InputUtil.getInstance().requiredString("Enter the email address: ");
            String passportNumber = InputUtil.getInstance().requiredString("Enter the passportNumber: ");
            String gender = InputUtil.getInstance().requiredString("Enter the gender: ");
            BigDecimal balance = BigDecimal.valueOf(2000);
            int seatNumber = GeneralServiceHelper.random(0,101);
            return new Passenger(++passengerId,name,surname,age,birthdate,phoneNumber,email,passportNumber
                    ,gender,balance,selectedTicked,seatNumber);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public static int calculateAge(LocalDate birthdate) {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthdate, currentDate);
        return period.getYears();
    }

    public static String cashReceipt(Passenger passenger, Flight flight){
        return "--------- Cash Receipt ---------" + "\n" +
                "Date                     " + LocalDateTime.now() + "\n" +
                "Flight name              " + "J-" + flight.getName() + "\n" +
                "Seat number              " + "M" + passenger.getSeatNumber() + "\n" +
                "                               " + "\n" +
                "Passenger full name      " + passenger.getName() + " " + passenger.getSurname()  + "\n" +
                "Passenger phone number   " + passenger.getPhoneNumber()     + "\n" +
                "Passenger email          " + passenger.getEmail() + "\n" +
                "                               " + "\n" +
                "Source                   " + flight.getSource() + "\n" +
                "Destination              " + flight.getDestination() + "\n" +
                "Date                     " + flight.getDate() + "\n" +
                "StartingTime             " + flight.getStartingTime() + "\n" +
                "ReachingTime             " + flight.getReachedTime() + "\n";
    }

    public static void registerPassengerAndFinishOrder (long tickedId){
        Flight selectedFlight = GlobalData.flightList.stream()
                .filter(flight -> flight.getId() == tickedId)
                .findFirst()
                .orElseThrow(() -> new ApplicationException(ExceptionEnum.FLIGHT_NOT_FOUND));
        Passenger passenger = CustomerServiceHelper.fillPassenger(selectedFlight.getId());
        if (passenger == null) throw new AssertionError();
        passenger.setBalance(BigDecimal.valueOf(passenger.getBalance().doubleValue() - selectedFlight.getPrice().doubleValue()));
        CustomerServiceHelper.cashReceipt(passenger,selectedFlight);
    }

}
