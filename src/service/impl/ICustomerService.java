package service.impl;

import data.GlobalData;
import enums.ExceptionEnum;
import helper.AdminServiceHelper;
import helper.CustomerServiceHelper;
import helper.GeneralServiceHelper;
import model.Flight;
import service.CustomerService;
import util.InputUtil;

public class ICustomerService implements CustomerService {

    @Override
    public void showFlights() {
        GeneralServiceHelper.checkList(GlobalData.ticketList, ExceptionEnum.FLIGHT_LIST_IS_EMPTY);

    }

    @Override
    public void searchFlights() {
        Flight flight = AdminServiceHelper.fillFlight();
        assert flight != null;
        CustomerServiceHelper.registerPassengerAndFinishOrder(flight.getId());
    }

    @Override
    public void orderTicket() {
        showFlights();
        int selectedTicked = InputUtil.getInstance().requiredInt("Choose the ticked: ");
        CustomerServiceHelper.registerPassengerAndFinishOrder(selectedTicked);
    }

    @Override
    public void cancelTicket() {
        GeneralServiceHelper.checkList(GlobalData.ticketList, ExceptionEnum.TICKET_LIST_IS_EMPTY);
    }
}
