package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GenericClass genericClass = new GenericClass();
        Array p = new Array();
        Array p2 = null;
        Array p3 = null;
        Array p4 = null;
        Array p5 = null;


        int code;

        String user;
        int pass;
        int grade;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("insert your code : ");
        code = scanner.nextInt();
        genericClass.setA(code);
        System.out.println("insert your user name : ");
        user = scanner1.nextLine();
        genericClass.setB(user);
        System.out.println("insert your password : ");
        pass = scanner.nextInt();
        genericClass.setC(pass);
        //clone part
        for (int i = 1; i <= 5; i++) {
            System.out.println("insert your " + i + "grade");
            grade = scanner.nextInt();
            p.Setter(grade);


        }

        try {
            p2 = (Array) p.clone();
        } catch
        (CloneNotSupportedException e) {
            System.out.println("clone not supported!");

        }
        try {
            p3 = (Array) p.clone();
        } catch
        (CloneNotSupportedException e) {
            System.out.println("clone not supported!");

        }
        try {
            p4 = (Array) p.clone();
        } catch
        (CloneNotSupportedException e) {
            System.out.println("clone not supported!");

        }
        try {
            p5 = (Array) p.clone();
        } catch
        (CloneNotSupportedException e) {
            System.out.println("clone not supported!");

        }
    }}
