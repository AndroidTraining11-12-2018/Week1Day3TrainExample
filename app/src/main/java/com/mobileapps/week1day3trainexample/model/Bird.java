package com.mobileapps.week1day3trainexample.model;

public class Bird {
    private String reproduction = "egg";
    private String outerCovering = "feather";

    public void flyUp() {
        System.out.println("Flying up...");
    }
    public void flyDown() {
        System.out.println("Flying down...");

    }

    public String getReproduction() {
        return reproduction;
    }

    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }

    public String getOuterCovering() {
        return outerCovering;
    }

    public void setOuterCovering(String outerCovering) {
        this.outerCovering = outerCovering;
    }
}
