package service.impl;

import data.GlobalData;
import enums.ExceptionEnum;
import exception.ApplicationException;
import helper.AdminServiceHelper;
import helper.GeneralServiceHelper;
import model.Flight;
import model.Passenger;
import service.AdminService;
import util.InputUtil;

import java.util.List;

public class IAdminService implements AdminService {
    @Override
    public boolean addFlight() {
        Flight flight = AdminServiceHelper.fillFlight();
        if(flight != null){
            GlobalData.flightList.add(flight);
            return true;
        }
        return false;
    }

    @Override
    public void showTickets() {
        GeneralServiceHelper.checkList(GlobalData.ticketList, ExceptionEnum.TICKET_LIST_IS_EMPTY);
    }

    @Override
    public void showPassenger() {
        GeneralServiceHelper.checkList(GlobalData.ticketList, ExceptionEnum.PASSENGER_LIST_IS_EMPTY);
    }

    @Override
    public void showNoticeBoard() {
        GeneralServiceHelper.checkList(GlobalData.ticketList, ExceptionEnum.NOTICE_BOARD_LIST_IS_EMPTY);
    }

    @Override
    public void showFlight() {
        GeneralServiceHelper.checkList(GlobalData.ticketList, ExceptionEnum.FLIGHT_LIST_IS_EMPTY);
    }

    @Override
    public void searchAll() {
        String searchedPassportNumber = InputUtil.getInstance().requiredString("Enter the passportNumber: ");
        List<Passenger> list = GlobalData.passengerList.stream()
                .filter(passenger -> passenger.getPassportNumber().contains(searchedPassportNumber))
                .toList();
        list.forEach(System.out::println);
    }
}
