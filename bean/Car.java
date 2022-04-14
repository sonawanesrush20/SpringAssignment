package bean;

public class Car {
    private String company;
    private String model;
    private vehicle veh;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public vehicle getVeh() {
        return veh;
    }

    public void setVeh(vehicle veh) {
        this.veh = veh;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", veh=" + veh +
                '}';
    }
}
