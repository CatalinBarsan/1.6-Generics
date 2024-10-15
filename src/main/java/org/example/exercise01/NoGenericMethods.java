package org.example.exercise01;

public class NoGenericMethods<T1, T2, T3> {
    private T1 arg1;
    private T2 arg2;
    private T3 arg3;

    // Constructor
    public NoGenericMethods(T1 arg1, T2 arg2, T3 arg3) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.arg3 = arg3;
    }

    // Getters and Setters
    public T1 getArg1() {
        return arg1;
    }

    public void setArg1(T1 arg1) {
        this.arg1 = arg1;
    }

    public T2 getArg2() {
        return arg2;
    }

    public void setArg2(T2 arg2) {
        this.arg2 = arg2;
    }

    public T3 getArg3() {
        return arg3;
    }

    public void setArg3(T3 arg3) {
        this.arg3 = arg3;
    }
}


