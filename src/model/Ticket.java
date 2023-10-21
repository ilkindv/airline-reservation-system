package model;

import java.math.BigDecimal;

public class Ticket {
    private long id;
    private int ticketNumber;
    private String source;
    private String destination;
    private BigDecimal price;
    private long flightId;
    private Flight flight;

    public Ticket(long id, int ticketNumber, String source, String destination, BigDecimal price, long flightId) {
        this.id = id;
        this.ticketNumber = ticketNumber;
        this.source = source;
        this.destination = destination;
        this.price = price;
        this.flightId = flightId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public long getFlightId() {
        return flightId;
    }

    public void setFlightId(long flightId) {
        this.flightId = flightId;
    }

    @Override
    public String toString() {
        return "-------------/ Order Ticket /-------------" + "\n" +
                id + ".Flight" + "\n" +
                "Flight Id: " + flightId + "\n" +
                "Flight Name: " + flight.getName() + "\n" +
                "Source: " + flight.getSource() + "\n" +
                "Destinations: " + flight.getDestination() + "\n" +
                "Date: " + flight.getDate() + "\n" +
                "Starting Time: " + flight.getStartingTime() + "\n" +
                "Reaching Time: " + flight.getReachedTime() + "\n" +
                "Price: " + flight.getPrice() + "\n" +
                "------------------------------------------";

    }
}
