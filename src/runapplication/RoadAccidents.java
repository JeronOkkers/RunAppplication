/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runapplication;

/**
 *
 * @author okker
 */
public abstract class RoadAccidents implements iRoadAccidents {
    // Variables to store the vehicle type, city, and total accidents
    private String vehicleType;
    private String city;
    private int totalAccidents;

    // Constructor to initialize vehicleType, city, and totalAccidents
    public RoadAccidents(String vehicleType, String city, int totalAccidents) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.totalAccidents = totalAccidents;
    }

    // my getter methods 
    @Override
    public String getAccidentVehicleType() {
        return vehicleType;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public int getAccidentTotal() {
        return totalAccidents;
    }
}
//---------------------...ooo000 END OF FILE 000ooo...------------------------//*