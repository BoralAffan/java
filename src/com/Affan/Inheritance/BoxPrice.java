package com.Affan.Inheritance;

public class BoxPrice extends Boxweight{
    double cost;

    BoxPrice() {
        super();
        this.cost =  -1;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }
    public BoxPrice(double l, double cost,double weight){
       super(1);
       this.cost=90;
    }
}
