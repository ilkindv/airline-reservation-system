package data.management.impl;

import data.management.CustomerManagement;
import data.management.OrderManagement;
import enums.ExceptionEnum;
import exception.ApplicationException;
import service.CustomerService;
import service.impl.ICustomerService;
import util.MenuUtil;

public class IOrderManagement implements OrderManagement {
    @Override
    public void orderManage() {
        CustomerService customerService = new ICustomerService();
        CustomerManagement customerManagement = new ICustomerManagement();
        while (true){
            try {
                byte option = MenuUtil.searchAndShowMenu();
                switch (option){
                    case 0:
                        System.exit(-1);
                    case 1:
                        customerService.orderTicket();
                        break;
                    case 2:
                        customerService.searchFlights();
                        break;
                    default:
                        throw new ApplicationException(ExceptionEnum.INVALID_OPTION_EXCEPTION);
                }
            }catch (ApplicationException exception){
                System.out.println(exception.getMessage());
            }
        }
    }
}
