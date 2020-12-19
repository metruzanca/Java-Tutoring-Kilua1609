package it.unibo.oop.lab04.robot.arms;

public class BasicArm {
    private static final Double CONSUMPTION_PICKUP = 2.0;
    private static final Double CONSUMPTION_DROPDOWN = 1.0;
    private boolean isGrabbing;
    private String name;

    public BasicArm(String name) {
        this.name = name;
        isGrabbing = false;
    }

    public Double getConsuptionForPickUp(){
        return CONSUMPTION_PICKUP;
    }

    public double getConsuptionForDropDown() {
        return CONSUMPTION_DROPDOWN;
    }

    public boolean isGrabbing() {
        return isGrabbing;
    }

    public boolean pickUp(){
        if(!isGrabbing()) {
            isGrabbing = true;
            return true;
        }
        return false;
    }

    public boolean dropDown(){
        if(isGrabbing()) {
            isGrabbing = false;
            return true;
        }
        return false;
    }

    public String toString(){
        return name;
    }
}
