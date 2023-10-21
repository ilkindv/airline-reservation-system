package helper;


import enums.TitleEnum;

import model.Flight;
import util.InputUtil;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;


public class AdminServiceHelper {

    private static long flightId;
    public static Flight fillFlight(){
        try {
            int name = GeneralServiceHelper.random(100,1000);
            String source = InputUtil.getInstance().requiredString("Enter the flight source: ");
            String destination = InputUtil.getInstance().requiredString("Enter the flight destination: ");
            LocalDate date = GeneralServiceHelper.dateHelper(TitleEnum.FLIGHT_DATE);
            LocalTime startingTime = GeneralServiceHelper.timeHelper(TitleEnum.FLIGHT_TIME);
            LocalTime reachedTime = GeneralServiceHelper.timeHelper(TitleEnum.FLIGHT_TIME);
            BigDecimal price = BigDecimal.valueOf(GeneralServiceHelper.random(200,2000));
            return new Flight(++flightId,name,source,destination,date,startingTime,reachedTime,price);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        return null;
    }


}


