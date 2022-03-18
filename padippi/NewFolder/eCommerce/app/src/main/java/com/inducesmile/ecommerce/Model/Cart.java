package com.inducesmile.ecommerce.Model;

public class Cart {

    private String pid,pname,price,quantity,discount;

    public Cart()
    {


    }

    public
    Cart(String pid, String pname, String price, String quantity, String discount) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public
    String getPid() {
        return pid;
    }

    public
    String getPname() {
        return pname;
    }

    public
    String getPrice() {
        return price;
    }

    public
    String getQuantity() {
        return quantity;
    }

    public
    String getDiscount() {
        return discount;
    }
}
