# Vehicle Accident Report Console Application

This Java console application allows users to generate a vehicle accident report by entering details such as vehicle type, the city where the accident occurred, and the total number of accidents.

## Features

- Collects user input for vehicle type, city, and total accidents.
- Displays a formatted report with the provided details.
- Implements Object-Oriented Programming (OOP) principles such as inheritance and interfaces.

## Design Overview

### 1. `iRoadAccidents` (Interface)
Defines methods for accessing accident details such as:
- `getAccidentVehicleType()`: Returns the type of vehicle involved.
- `getCity()`: Returns the city where the accident occurred.
- `getAccidentTotal()`: Returns the total number of accidents.

### 2. `RoadAccidents` (Abstract Class)
Implements the `iRoadAccidents` interface and defines common attributes like:
- Vehicle Type
- City
- Total Number of Accidents

It also provides getter methods to access these values.

### 3. `RoadAccidentReport` (Subclass)
Inherits from the `RoadAccidents` abstract class and adds a method `printAccidentReport()` to display the accident details.

### 4. `RunApplication` (Main Class)
Handles user input, creates an instance of `RoadAccidentReport`, and prints the report to the console.

## How to Run the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/vehicle-accident-report.git
