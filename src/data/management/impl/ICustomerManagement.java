package data.management.impl;

import data.management.CustomerManagement;
import data.management.Management;
import data.management.OrderManagement;
import enums.ExceptionEnum;
import exception.ApplicationException;
import service.CustomerService;

import service.impl.ICustomerService;
import util.MenuUtil;

public class ICustomerManagement implements CustomerManagement {
    @Override
    public void customerManage() {
        OrderManagement orderManagement = new IOrderManagement();
        CustomerService customerService = new ICustomerService();
        Management management = new IManagement();
        while(true){
            try {
                byte option = MenuUtil.customerMenu();
                switch (option){
                    case 0:
                        System.exit(-1);
                    case 1:
                        management.manage();
                        break;
                    case 2:
                        customerService.showFlights();
                        break;
                    case 3:
                        orderManagement.orderManage();
                        break;
                    case 4:
                        customerService.cancelTicket();
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
