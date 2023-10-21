package model;

import java.math.BigDecimal;
import java.util.concurrent.locks.ReentrantLock;

public class Airport {
    private final String name;
    private final String area;
    private BigDecimal totalAmount;

    private static Airport instance;

    private static Airport getInstance(){
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        instance = instance == null ? new Airport() : instance;
        lock.unlock();
        return instance;
    }

    public Airport() {
        this.name = "Azerbaijan Airlines";
        this.area = "11 Azadlig Avenue &#160; AZ1000";
    }

    public String getName() {
        return name;
    }

    public String getArea() {
        return area;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void incrementTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = this.totalAmount.add(totalAmount);
    }

    @Override
    public String toString() {
        return "Airport{" +
                ", name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
