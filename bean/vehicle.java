package bean;

import org.springframework.beans.factory.annotation.Autowired;

public class vehicle {

    private int vehicleNumber;
    private String color;
    private String owner_Name;

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner_Name() {
        return owner_Name;
    }

    public void setOwner_Name(String owner_Name) {
        this.owner_Name = owner_Name;
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "vehicleNumber=" + vehicleNumber +
                ", color='" + color + '\'' +
                ", owner_Name='" + owner_Name + '\'' +
                '}';
    }
}
