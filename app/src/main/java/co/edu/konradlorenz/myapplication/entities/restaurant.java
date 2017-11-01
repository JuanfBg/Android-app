package co.edu.konradlorenz.myapplication.Entities;

public class restaurant {
    String Name;
    String address;
    int AveragePrice;
    int telephone;

    public restaurant(String name,  String address, int averagePrice,int phone) {
        Name = name;
        AveragePrice = averagePrice;
        this.address = address;
        this.telephone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAveragePrice() {
        return AveragePrice;
    }

    public void setAveragePrice(int averagePrice) {
        AveragePrice = averagePrice;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
}

