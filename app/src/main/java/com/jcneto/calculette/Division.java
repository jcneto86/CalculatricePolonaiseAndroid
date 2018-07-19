package com.jcneto.calculette;

public class Division implements Expression {
    private Expression operandeA;
    private Expression operandeB;

    public Division(Expression operandeA, Expression operandeB) {
        this.operandeA = operandeA;
        this.operandeB = operandeB;
    }

    @Override
    public double evaluer() {
        return operandeA.evaluer() / operandeB.evaluer();
    }

    @Override
    public String toInfix() {

        return "( " + operandeA.evaluer() + " / " + operandeB.evaluer();
    }

    @Override
    public String toPolonaise() {
        return operandeA.evaluer() + " " + operandeB.evaluer() + " /";
    }
}
