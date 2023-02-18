package com.CH3.Associaation;

public class SmartCard {
    int emp_idn;
    public  void MarkAttendance(Employee e){
        emp_idn = e.getEmpid();
//        instroction of mark paresent for empliye id ...........
        System.out.println("Employee "+emp_idn+"is marked Prasent");

    }

    public  int getEmp_idn(Employee e){
        return  e.empid;
    }
}
