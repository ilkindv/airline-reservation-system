package model;

import java.util.List;

public class NoticeBoard {
    private final long id;
    private List<Flight> flightList;

    public NoticeBoard(long id, List<Flight> flightList) {
        this.id = id;
        this.flightList = flightList;
    }

    public long getId() {
        return id;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }

    @Override
    public String toString() {
        return "NoticeBoard{" +
                "id=" + id +
                ", flightList=" + flightList +
                '}';
    }
}
