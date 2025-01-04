package com.java2bigdata.corejava.enums;

public class EnumMain {

    public static void main(String[] args) {
        System.out.println(TicketCategory.LOW.ordinal());
        for(TicketCategory date: TicketCategory.values()){
            System.out.println(date  +" "+date.getDescription());
        }
    }
}
