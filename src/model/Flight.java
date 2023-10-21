package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Flight {
    private final long id;
    private int name;
    private String source;
    private String destination;
    private LocalDate date;
    private LocalTime startingTime;
    private LocalTime reachedTime;
    private BigDecimal price;

    public Flight(long id, int name, String source, String destination,
                  LocalDate date, LocalTime startingTime, LocalTime reachedTime, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.date = date;
        this.startingTime = startingTime;
        this.reachedTime = reachedTime;
        this.price = price;
    }
    public  Flight(long id){
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(LocalTime startingTime) {
        this.startingTime = startingTime;
    }

    public LocalTime getReachedTime() {
        return reachedTime;
    }

    public void setReachedTime(LocalTime reachedTime) {
        this.reachedTime = reachedTime;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", date=" + date +
                ", startingTime=" + startingTime +
                ", reachedTime=" + reachedTime +
                ", price=" + price +
                '}';
    }
}
