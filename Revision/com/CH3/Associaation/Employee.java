package com.CH3.Associaation;

import java.util.Scanner;

public class Employee {

    int empid;
    Employee(){
        System.out.println("Enter the Employee id");
        Scanner sc = new Scanner(System.in);
        this.empid = sc.nextInt();

    }

    int getEmpid(){
        return  empid;

    }

    public void Login(SmartCard sc){
//        instruction of Login Functionality;
//        get empid of the smart card holder
        int eid = sc.getEmp_idn(this);
//        Login and Mark attendance
        System.out.println("Login Successful for employee"+eid);

    }
}
