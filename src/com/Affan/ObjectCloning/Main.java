package com.Affan.ObjectCloning;

import com.company.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human Affan = new Human(19,"Affan");
        Human  b = new Human(Affan);
       Human twin = (Human) Affan.clone();
         
       System.out.println(twin.age + " " + twin.name);
    }
}
