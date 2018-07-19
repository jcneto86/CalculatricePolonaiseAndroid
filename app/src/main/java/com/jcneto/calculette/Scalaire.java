package com.jcneto.calculette;


public class Scalaire implements Expression {
    private double scalaire;
    public Scalaire(double scalaire) {
        this.scalaire = scalaire;
    }
    @Override
    public String toString() { return String.valueOf(scalaire); }
    @Override
    public double evaluer() {
        return scalaire;
    }
    @Override
    public String toInfix() { return String.valueOf(scalaire); }
    @Override
    public String toPolonaise() { return String.valueOf(scalaire); }

}
