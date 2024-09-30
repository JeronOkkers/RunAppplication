/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runapplication;
import java.util.Scanner;

/**
 *
 * @author okker
 */
public class RunApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the accident vehicle type: ");
        String vehicleType = scanner.nextLine();

        System.out.print("Enter the city for the vehicle accidents: ");
        String city = scanner.nextLine();
        
        System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
        int totalAccidents = scanner.nextInt();

        RoadAccidentReport report = new RoadAccidentReport(vehicleType, city, totalAccidents);
        report.printAccidentReport();
    }
    
}
//---------------------...ooo000 END OF FILE 000ooo...------------------------//*