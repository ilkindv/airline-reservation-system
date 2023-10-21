import data.management.Management;
import data.management.impl.IManagement;

public class Main {
    public static void main(String[] args) {
        Management management = new IManagement();
        management.manage();
    }
}