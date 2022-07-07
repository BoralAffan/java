package com.company;

class animal {
    public int age;
    public String name;
    animal(){
        System.out.println("I am an animal and my details are as follows");
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//This dog1 class will contain all the methods which are in class animal like age and name
 class Dog1 extends animal {
    String breed;
//    Dog1(){
//        System.out.println("I am a Dog and my breed age name are as follows ");
//    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
 class hen extends animal{
         int egg;

     public int getEgg() {
         return egg;
     }

     public void setEgg(int egg) {
         this.egg = egg;
     }
 }




public class Inheritance {
    public static void main(String[] args) {
     animal cat=new animal();
  cat.setAge(4);
     cat.setName("zuzu  \n");
        System.out.println(cat.getAge());
        System.out.println(cat.getName());

        Dog1 dodo=new Dog1();
        dodo.setName("oreo \n");
        dodo.setBreed("Labrador");
        dodo.setAge(5);

        System.out.println(dodo.getBreed());
        System.out.println(dodo.getAge());
        System.out.println(dodo.getName());

        hen chick=new hen();
        System.out.println("i give this eggs per day its mentioned below");
        chick.setEgg(5);
        chick.setName("chuza");
        System.out.println(chick.getName());
    }
}
