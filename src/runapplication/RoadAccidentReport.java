/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runapplication;

/**
 *
 * @author okker
 */
public class RoadAccidentReport extends RoadAccidents {

    public RoadAccidentReport(String vehicleType, String city, int totalAccidents) {
        super(vehicleType, city, totalAccidents);
    }

    public void printAccidentReport() {
        System.out.println("VEHICLE ACCIDENT REPORT");
        System.out.println("******************************");
        System.out.println("VEHICLE TYPE: " + getAccidentVehicleType());
        System.out.println("CITY: " + getCity());
        System.out.println("ACCIDENT TOTAL: " + getAccidentTotal());
    }
}
//---------------------...ooo000 END OF FILE 000ooo...------------------------//*