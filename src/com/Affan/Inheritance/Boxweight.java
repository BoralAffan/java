package com.Affan.Inheritance;

public class Boxweight extends Box{
    double weight;
    double area;

    public Boxweight() {
        this.weight = -1;
    }

    public Boxweight(double area) {
        super(1);
        this.weight=1;
        this.area = -1;
    }

    public Boxweight(double l, double h, double w, double weight) {
        super(l, h, w); //
        this.weight = weight;
    }

    public Boxweight(double l, double h, double w, double weight, double area) {
        super(l, h, w);
        this.weight = weight;
        this.area = area;
    }
}
