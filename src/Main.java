import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)  {

      
        Scanner sc = new Scanner(System.in);
        CarServiceStation hatchback =  new Hatchback();
        CarServiceStation suv =  new SUV();
        CarServiceStation sedan =  new Sedan();

        System.out.println("Welcome to Car Service Station");
        System.out.println();
        System.out.println();
        while (true) {
            System.out.println("Select your Car for which you want to service from the available ");
            System.out.println();
            System.out.println("1. Hatchback");
            System.out.println("2. Sedan");
            System.out.println("3. SUV");
            System.out.println("4. Exit");
            System.out.println("Select your Car");
            int car = sc.nextInt();
            if (car == 1){
                servicesMenu(hatchback , "Hatchback");
                break;
            }
            else if (car == 2){
                servicesMenu(sedan , "Sedan");
                break;
            }
            else if (car == 3){
                servicesMenu(suv , "SUV");
                break;
            }
            else if (car == 4){
                System.out.println("Thank you for visiting Car-Service-Station");
                break;
            }
            else{
                System.out.println("Enter a valid option");
            }

        }
    }

    private static void servicesMenu(CarServiceStation carServiceStation , String carType) {
        Scanner sc = new Scanner(System.in);
        HashMap<String , Integer> services = new HashMap<>();
        System.out.println("Select the services from below given list");
        System.out.println();
        System.out.println();
        System.out.println("****************************************************************************");
        System.out.println("1. Basic Servicing");
        System.out.println("2. Engine Fixing");
        System.out.println("3. Clutch Fixing");
        System.out.println("4. Break Fixing");
        System.out.println("5. Gear Fixing");
        System.out.println("****************************************************************************");

        System.out.println("Enter number of Services you need");
        int number = sc.nextInt();
        int totalBill = 0 ;
        while(number>0){
            System.out.println("Enter Service which you want");
            int service = sc.nextInt();
            if(service == 1){
                int charges = carServiceStation.basicServicing();
                services.put("Basic Servicing" , charges  ) ;
                totalBill+= charges ;
                number-- ;
            }
            else if (service == 2) {
                int charges = carServiceStation.engineFixing();
                services.put("Engine Fixing" , charges);
                totalBill+= charges ;
                number-- ;
            }
            else if (service == 3) {
                int charges = carServiceStation.clutchFixing();
                services.put("Clutch Fixing" , charges);
                totalBill+= charges ;
                number--;
            }
            else if (service == 4) {
                int charges = carServiceStation.breakFixing();
                services.put("Break Fixing" , charges);
                totalBill+= charges ;
                number--;
            }
            else if (service == 5) {
                int charges = carServiceStation.gearFixing();
                services.put("Gear Fixing" , charges);
                totalBill+= charges ;
                number--;
            }
            else {
                System.out.println("Enter a valid Service number");
            }

        }
        generateBill(carType , services , totalBill) ;
}

    private static void generateBill(String carType, HashMap<String, Integer> services, int totalBill) {
        System.out.println("----------------------------------------------------------------");
        System.out.println("                              Bill");
        System.out.println("----------------------------------------------------------------");

        System.out.println("                            "+ carType   );
        System.out.println("----------------------------------------------------------------");
        for(String serviceName : services.keySet()){
            System.out.println(serviceName +  "                              =      " + services.get(serviceName) );
        }
        if(totalBill>10000){
            System.out.println("Free Cleaning" +  "                              =      "  + 0);
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("Total Bill" + "                              =      " + totalBill);
        System.out.println("----------------------------------------------------------------");
    }
}