package com.jcneto.calculette;

public interface Expression {

    public double evaluer();
    public String toInfix();
    public String toPolonaise();
}
