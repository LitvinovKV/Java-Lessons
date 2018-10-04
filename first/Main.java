package com.company;
import java.util.*;

public class Main {

    static int findElement(int[][] IntArray) {
        int result = IntArray[0][0], posI = 0, posJ = 0;

        for (int i = 0; i < IntArray.length; i++) {
            for (int j = 0; j < IntArray[i].length; j++) {
                if (IntArray[i][j] > result && IntArray[i][j] <= 10) {
                    result = IntArray[i][j];
                    posI = i;
                    posJ = j;
                }
            }
        }

        System.out.print("i = " + posI + " j = " + posJ);
        System.out.println();
        return result;
    }

    public static void main(String[] args)
    {
//        int a = 7, b = 6, c = 8;
//
//	    if (a < b) {
//	        a = a + b;
//	        b = a - b;
//	        a = a - b;
//        }
//
//        if (b < c) {
//	        b = b + c;
//	        c = b - c;
//	        b = b - c;
//        }
//
//        if (a < b) {
//            a = a + b;
//            b = a - b;
//            a = a - b;
//        }
//
//        // a > b > c
//        System.out.println(c);
//        System.out.println(b);
//        System.out.println(a);


//        int size = 6;
//        int[][] IntArr = new int[6][];
//        int value = 0;
//        for(int i = 0; i < IntArr.length; i++) {
//            IntArr[i] = new int[i + 1];
//            for(int j = 0; j < IntArr[i].length; j++) {
//                IntArr[i][j] = ++value;
//            }
//        }
//
//        for (int[] arr : IntArr) {
//            for(int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("Element = " + findElement(IntArr));


        Employee[] EmployeeArray = new Employee[10];
        EmployeeArray[0] = new Employee("Andrey");
        EmployeeArray[1] = new Employee("Nikita");
        EmployeeArray[2] = new Employee("Afanasii");
        EmployeeArray[3] = new Employee("Jenya", "Santehnik");
        EmployeeArray[4] = new Employee("Nastya", "Operator", 50000);
        EmployeeArray[5] = new Employee("Matvei", "Svarshik");
        EmployeeArray[6] = new Employee("Katya", "Poshiv", 35000.33f);
        EmployeeArray[7] = new Employee("Julia", "Svyazist", 10000);
        EmployeeArray[8] = new Employee("Misha", "Youtube");
        EmployeeArray[9] = new Employee("Sosok");
        Employee.ShowEmployees(EmployeeArray);
        Employee.SalarSumm(EmployeeArray);
    }
}
