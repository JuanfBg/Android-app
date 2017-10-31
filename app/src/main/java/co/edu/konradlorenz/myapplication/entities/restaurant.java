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
}

