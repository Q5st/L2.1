package com.company;

public class Main {

    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student("Carrot", 10);
        std1.setName("Fish");
        std1.setRating(6);
        std2.setName("Chicken");
        std2.setRating(4);
        System.out.println(std1.getName());
        System.out.println(std1.getRating());
        System.out.println(std2.getName());
        System.out.println(std2.getRating());
        System.out.println(std3.getName());
        System.out.println(std3.getRating());
        Student.avgRating=(std1.getRating()+std2.getRating()+std3.getRating())/3;
        Student.print();

    }
}
