package com.example.xyzhw.domain;

public class Bill {
    private String ticketId;
    private int cost;
    private String description;

    public Bill(String ticketId, int cost, String description) {
        this.ticketId = ticketId;
        this.cost = cost;
        this.description = description;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "ticketId='" + ticketId + '\'' +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                '}';
    }
}
