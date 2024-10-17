package org.example.exercise01;

public class NoGenericMethods {
    private Integer arg1;
    private String arg2;
    private Double arg3;

    // Constructor
    public NoGenericMethods(Integer arg1, String arg2, Double arg3) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    // Getters and Setters for specific types
    public Integer getArg1() {
        return arg1;
    }

    public void setArg1(Integer arg1) {
        this.arg1 = arg1;
    }

    public String getArg2() {
        return arg2;
    }

    public void setArg2(String arg2) {
        this.arg2 = arg2;
    }

    public Double getArg3() {
        return arg3;
    }

    public void setArg3(Double arg3) {
        this.arg3 = arg3;
    }
}



