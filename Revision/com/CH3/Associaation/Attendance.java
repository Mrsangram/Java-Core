package com.CH3.Associaation;

public class Attendance {

    public static void main(String[] args) {
        System.out.println("*****  ASSOCIATION BETWEEN EMPLOYEE AND SMARTCARD *****");
        Employee e = new Employee();
        System.out.println("NEW EMPLOYEE IS CREATED");

        SmartCard scd = new SmartCard();
        scd.MarkAttendance(e);
        e.Login(scd);
    }
}
