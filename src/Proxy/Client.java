package Proxy;

import java.util.Scanner;

/**
 * Created by Ethan and Jeel on 4/2/15.
 */
public class Client {

    public static void main(String []args){
        System.out.println("Enter the employees name..");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        OfficeInternetAccess officeInternetAccess = new ProxyInternetAccess(name);
        officeInternetAccess.grantInternetAccess();
    }
}
