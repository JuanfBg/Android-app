package co.edu.konradlorenz.myapplication.Entities;

public class Restaurant {
    String name;
    String address;
    long averagePrice;
    long telephone;

    public Restaurant() {

    }

    public Restaurant(String name, String address, long averagePrice, long telephone) {
        this.name = name;
        this.address = address;
        this.averagePrice = averagePrice;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(long averagePrice) {
        this.averagePrice = averagePrice;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }
}

