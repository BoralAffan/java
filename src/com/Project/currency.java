package com.Project;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import com.currencyConverter.Currency;
public class currency {
    public static void main(String[] args) {
        boolean running = true;
        do {
            HashMap<Integer, String> CurrencyCodes = new HashMap<Integer, String>();
            CurrencyCodes.put(1, "INR");
            CurrencyCodes.put(2, "USD");
            CurrencyCodes.put(3, "CAD");
            CurrencyCodes.put(4, "YEN");
            CurrencyCodes.put(5, "GBP");
//        CurrencyCodes.put(1,"INR");
//        CurrencyCodes.put(1,"INR");
            Integer from, to;
            String fromCode, toCode;
            double amt;

            Scanner sc = new Scanner(System.in);
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t*********Currency Converter*********");
            System.out.println("Currency you want to convert from?\n");
            System.out.println("1:INR(Indian Rupees) \n 2:USD(Us Dollars) \n 3:CAD(Canadian Dollar) \n 4:YEN(Japanese yen) \n 5:GBP(United kingdom)");
            from = sc.nextInt();
            while (from < 1 || from > 5) {
                System.out.println("Enter valid currency code");
                System.out.println("1:INR(Indian Rupees) \n 2:USD(Us Dollars) \n 3:CAD(Canadian Dollar) \n 4:YEN(Japanese yen) \n 5:GBP(United kingdom)");
                from = sc.nextInt();
            }
          //  fromCode = CurrencyCodes.get(from);

            //  fromCode = CurrencyCodes.get(sc.nextInt());

            System.out.println("Currency you want to convert To?\n");
            System.out.println("1:INR(Indian Rupees) \n 2:USD(Us Dollars) \n 3:CAD(Canadian Dollar)  \n 4:YEN(Japanese yen)\n 5:GBP(United kingdom)");
            //  toCode = CurrencyCodes.get(sc.nextInt());
            to = sc.nextInt();
            while (to < 1 || to > 5) {
                System.out.println("Enter valid currency code");
                System.out.println("1:INR(Indian Rupees) \n 2:USD(Us Dollars) \n 3:CAD(Canadian Dollar) \n 4:YEN(Japanese yen) \n 5:GBP(United kingdom)");
                to = sc.nextInt();
            }
            toCode = CurrencyCodes.get(to);
            System.out.println("Enter amount you want to convert");
            amt = sc.nextFloat();

            System.out.println("Would you like to make another conversion");
            System.out.println("1:YES \t Any other key to exit: EXIT");
            if (sc.nextInt() !=1){
                running=false;
            }
            // sendHTTPGETRequest(fromCode,toCode,amt);
        }while (running);
        System.out.println("Thankyou for using our currency converter!!!!");
    }

//    private static void sendHTTpRequest(String fromCode,String toCode, double amt){
//        String GET,URL = "https://api.exchangeratesapi.io/latest?base="+ toCode + "&symbols" + fromCode;
//    }
}
