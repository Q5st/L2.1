package com.company;

public class Student {
    private String name;
    private int rating;
    public Student() {}
    public Student (String name, int rating){
        this.name = name;
        this.rating = rating;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getRating(){
        return  this.rating;
    }
    public void setRating(int rating){
        this.rating = rating;
    }
    public static float avgRating;
    public static void print() {
        System.out.println(avgRating);
    }
}
