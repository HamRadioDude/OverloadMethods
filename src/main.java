import com.sun.org.apache.bcel.internal.generic.LineNumberGen;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int user_choice;
        String res_fname;
        String res_lname;
        String phone_number;
        String business_name;
        String business_fname;
        String business_lname;
        System.out.println("Enter What Type of Customer you are");
        System.out.println("1. Business");
        System.out.println("2. Residential");
        Scanner user_input1 = new Scanner(System.in);
        user_choice =  user_input1.nextInt();

        switch (user_choice) {

            case 1:
                System.out.println("Enter the business name:");
                business_name = scan.nextLine();
                System.out.println("Enter the first name of a contact: ");
                business_fname = scan.nextLine();
                System.out.println("Enter the last name of a contact: ");
                business_lname = scan.nextLine();
                System.out.println("Enter a phone number");
                phone_number = scan.nextLine();
                client_info(business_name,business_fname,business_lname, phone_number);
                break;

            case 2:
                System.out.println("Enter your First Name: ");
                res_fname = scan.nextLine();
                System.out.println("Enter your Last Name: ");
                res_lname = scan.nextLine();
                System.out.println("Enter your phone number: ");
                phone_number = scan.nextLine();
                client_info(res_fname,res_lname,phone_number);
                break;

            default:
                System.out.println("That was not a valid option");
                break;
        }
    }

    private static void client_info(String business_name, String business_fname, String business_lname, String phone_number) {
            System.out.println("BUSINESS NAME: " + business_name);
            System.out.println("Point of Contact: " + business_fname + " " + business_lname);
            System.out.println("Business Phone: " + phone_number);


    }
     private static void client_info(String res_fname, String phone_number, String res_lname) {

         System.out.println("Customer First Name: " + res_fname);
         System.out.println("Customer Last Name " + res_lname);
         System.out.println("Customer Phone: " + phone_number);

     }
    }

