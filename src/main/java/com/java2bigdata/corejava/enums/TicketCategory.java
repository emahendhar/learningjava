package com.java2bigdata.corejava.enums;

public enum TicketCategory {
    CRITICAL("critical"),
    HIGH ("high"),
    MEDIUM("medium"),
    LOW("low");

    private String description;
    TicketCategory(String description){
        this.description=description;
    }

    public String getDescription() {
    return description;
    }
}
