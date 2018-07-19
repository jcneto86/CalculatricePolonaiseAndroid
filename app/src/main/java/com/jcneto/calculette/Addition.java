package com.jcneto.calculette;

public class Addition implements Expression {
    private Expression operandeA;
    private Expression operandeB;


    public Addition(Expression a, Expression b) {
        this.operandeA = a;
        this.operandeB = b;
    }

    @Override
    public double evaluer() {
        return operandeA.evaluer() + operandeB.evaluer();
    }

    @Override
    public String toInfix() {
        return "( " + operandeA.evaluer() + " + " + operandeB.evaluer();
    }

    @Override
    public String toPolonaise() {
        return operandeA.evaluer() + " " + operandeB.evaluer() + " +";
    }
}
