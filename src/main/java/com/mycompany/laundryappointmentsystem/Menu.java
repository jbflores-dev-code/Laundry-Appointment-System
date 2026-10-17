/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laundryappointmentsystem;

/**
 *
 * @author JB3827
 */



import java.util.*;

public class Menu {

    public static void showMenu() {
        Scanner scn = new Scanner(System.in);
        int inp;

        do {
            System.out.print("+----------------------------------------+\n" +
                             "|       LAUNDRY APPOINTMENT SYSTEM       |\n" +
                             "+----------------------------------------+\n" +
                             "|  [1] BOOK APPOINTMENT                  |\n" +
                             "|  [2] STAFF LOG IN                      |\n" +
                             "+----------------------------------------+\n" +
                             "|  [0] EXIT                              |\n" +
                             "+----------------------------------------+\n" +
                             "|  SELECT OPTION: ");

            while (!scn.hasNextInt()) {
                System.out.println("ERROR: Use numbers 0 to 2 only!");
                scn.nextLine();
                System.out.print("|  SELECT OPTION: ");
            }

            inp = scn.nextInt();

            switch (inp) {
                case 1:
                    BookAppointment.showMenu();
                    break;
                case 2:
                    StaffLogin.showMenu();
                    break;
                case 0:
                    System.out.println("Thank you for using this program. Exiting...");
                    break;
                default:
                    System.out.println("ERROR: Use numbers 0 to 2 only!");
            }

        } while (inp != 0);
    }
}

