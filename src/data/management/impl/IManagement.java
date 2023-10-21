package data.management.impl;

import data.management.AdminManagement;
import data.management.CustomerManagement;
import data.management.Management;

import enums.ExceptionEnum;
import exception.ApplicationException;
import util.MenuUtil;

public class IManagement implements Management {

    @Override
    public void manage() {
        CustomerManagement customerManagement = new ICustomerManagement();
        AdminManagement adminManagement = new IAdminManagement();
        while (true){
            try {
                byte option = MenuUtil.entryMenu();
                switch (option){
                    case 0:
                        System.exit(-1);
                    case 1:
                        adminManagement.adminManage();
                        break;
                    case 2:
                        customerManagement.customerManage();
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
