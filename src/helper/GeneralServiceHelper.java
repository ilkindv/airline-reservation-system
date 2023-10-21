package helper;

import enums.ExceptionEnum;
import enums.TitleEnum;
import exception.ApplicationException;
import util.InputUtil;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Random;

public class GeneralServiceHelper {
    public static LocalDate dateHelper(TitleEnum titleEnum){
        LocalDate date = null;
        boolean isTrueDate = false;

        while (!isTrueDate){
            String inputDate = InputUtil.getInstance().requiredString(titleEnum.getMessage());
            try{
                String[] splitDate = inputDate.split("/");
                if(splitDate.length == 3){
                    int day = Integer.parseInt(splitDate[0]);
                    int month = Integer.parseInt(splitDate[1]);
                    int year = Integer.parseInt(splitDate[2]);
                    date = LocalDate.of(year,month,day);
                    isTrueDate = true;
                }else{
                    throw new ApplicationException(ExceptionEnum.WRONG_DATE_FORMAT);
                }
            }catch (DateTimeParseException | NumberFormatException | ApplicationException e) {
                System.out.println(e.getMessage());
            }
        }
        return date;
    }

    public static LocalTime timeHelper(TitleEnum titleEnum) {
        LocalTime time = null;
        boolean isTrueTime = false;

        while (!isTrueTime) {
            String inputTime = InputUtil.getInstance().requiredString(titleEnum.getMessage());
            try {
                String[] splitTime = inputTime.split(":");
                if (splitTime.length == 2) {
                    int hour = Integer.parseInt(splitTime[0]);
                    int minute = Integer.parseInt(splitTime[1]);
                    time = LocalTime.of(hour, minute);
                    isTrueTime = true;
                } else {
                    throw new ApplicationException(ExceptionEnum.WRONG_TIME_FORMAT);
                }
            } catch (DateTimeParseException | NumberFormatException | ApplicationException e) {
                System.out.println(e.getMessage());
            }
        }
        return time;
    }
    public static int random(int num1, int num2){
        Random random = new Random();
        return random.nextInt(num1,num2);
    }

    public static void checkList(List<?> list, ExceptionEnum emptyListEnum) {
        if (list.isEmpty()) {
            throw new ApplicationException(emptyListEnum);
        }
        list.forEach(System.out::println);
    }
}
