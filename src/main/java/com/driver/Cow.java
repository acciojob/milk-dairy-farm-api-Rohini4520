package com.driver;

public class Cow {
	private int id;
    private String name;
    private double milkProduction;

    public Cow() {
        this.milkProduction= 0;
    }

    public Cow(String name) {
    	// your code goes here
        this.name =name;
        this.milkProduction = 0;
    }

    // Getters and Setters

    public int getId() {
    	// your code goes here
        return id;
    }

    public void setId(int id) {
    	// your code goes here
        this.id = id;
    }

    public String getName() {
    	// your code goes here
        return name;
    }

    public void setName(String name) {
    	// your code goes here
        this.name = name;
    }

    public double getMilkProduction() {
    	// your code goes here
        return milkProduction;
    }

    public void setMilkProduction(double milkProduction) {
    	// your code goes here
        this.milkProduction = milkProduction;

    }
}
