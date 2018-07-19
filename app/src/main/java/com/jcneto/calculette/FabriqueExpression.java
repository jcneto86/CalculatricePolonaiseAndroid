package com.jcneto.calculette;

import java.util.Stack;

public class FabriqueExpression {

    public Expression batirFromPolonaise(String polonaise) throws Exception {
        Stack<Expression> pile = new Stack<>();
        String[] polonaiseArray = polonaise.split(" ");
        int operation = 0;
        int nb = 0;
        for (String caracter : polonaiseArray) {
            if (caracter.equals("+") || caracter.equals("-") || caracter.equals("*") || caracter.equals("/"))
                operation++;
            else nb++;
        }
        if (nb - operation != 1) throw new Exception();
        for (String nbAconvertir : polonaiseArray) {
            try {
                Expression expression = new Scalaire(Double.parseDouble(nbAconvertir));
                pile.push(expression);
            } catch (Exception e) {
                if (nbAconvertir.equals("+")) {
                    Expression addition = new Addition(pile.pop(), pile.pop());
                    Expression expressionReturn = new Scalaire(addition.evaluer());
                    pile.push(expressionReturn);
                }
                if (nbAconvertir.equals("-")) {
                    Expression soustraction = new Soustraction(pile.pop(), pile.pop());
                    Expression expressionReturn = new Scalaire(soustraction.evaluer());
                    pile.push(expressionReturn);
                }
                if (nbAconvertir.equals("*")) {
                    Expression multiplication = new Multiplication(pile.pop(), pile.pop());
                    Expression expressionReturn = new Scalaire(multiplication.evaluer());
                    pile.push(expressionReturn);
                }
                if (nbAconvertir.equals("/")) {
                    Expression division = new Division(pile.pop(), pile.pop());
                    Expression expressionReturn = new Scalaire(division.evaluer());
                    pile.push(expressionReturn);
                }
            }

        }
        Expression a = pile.pop();
        return a;
    }
}
