package org.ies.vehicles.model;

import java.util.Arrays;
import java.util.Objects;

public class Garage {
    private String Name;
    private String Address;
    private Vehicle[] vehicles;

    public Garage(String name, String direccion, Vehicle[] vehicles) {
        Name = name;
        Address = direccion;
        this.vehicles = vehicles;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Vehicle[] getVehicle() {
        return vehicles;
    }

    public void setVehicle(Vehicle[] vehicle) {
        this.vehicles = vehicle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Garage garage = (Garage) o;
        return Objects.equals(Name, garage.Name) && Objects.equals(Address, garage.Address) && Objects.deepEquals(vehicles, garage.vehicles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Address, Arrays.hashCode(vehicles));
    }

    @Override
    public String toString() {
        return "Garage{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", vehicles=" + Arrays.toString(vehicles) +
                '}';
    }
}
