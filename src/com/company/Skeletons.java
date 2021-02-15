package com.company;

public class Skeletons extends Boss {
    private int arrows;


    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public Skeletons(int health, int damage, Weapon weapon, int arrows) {
        super(health, damage, weapon);
        this.arrows = arrows;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+" "+getArrows()  ;
    }
}
