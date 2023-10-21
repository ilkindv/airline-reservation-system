package data.management.impl;

import data.management.AdminManagement;
import enums.ExceptionEnum;
import exception.ApplicationException;
import service.AdminService;
import service.impl.IAdminService;
import util.MenuUtil;

public class IAdminManagement implements AdminManagement {


    @Override
    public void adminManage() {
        AdminService adminService = new IAdminService();
        while(true){
            try {
                byte option = MenuUtil.adminMenu();
                switch (option){
                    case 0:
                        System.exit(-1);
                    case 1:
                        MenuUtil.entryMenu();
                        break;
                    case 2:
                        adminService.addFlight();
                        break;
                    case 3:
                        adminService.showTickets();
                        break;
                    case 4:
                        adminService.showPassenger();
                        break;
                    case 5:
                        adminService.showNoticeBoard();
                        break;
                    case 6:
                        adminService.showFlight();
                        break;
                    case 7:
                        adminService.searchAll();
                        break;
                    case 8:
                        adminService.addFlight();
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
