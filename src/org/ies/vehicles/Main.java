package org.ies.vehicles;

import org.ies.vehicles.components.GarageReader;
import org.ies.vehicles.components.VehicleReader;
import org.ies.vehicles.model.Garage;
import org.ies.vehicles.model.Vehicle;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Creación componentes
        Scanner scanner = new Scanner(System.in);
        VehicleReader vehicleReader = new VehicleReader(scanner);
        GarageReader garageReader = new GarageReader(scanner, vehicleReader);

        //Ejecutar programa
        Garage garage = garageReader.read();

        //Mostrar el garaje
        System.out.println(garage);
    }


}