package com.katheprc.calculator.logic;

/**
 *
 * @author KathePrc
 */
public interface CalculatorLogic {

    public static double suma(double num, double num2) {
        return (num + num2);
    }

    public static double resta(double num, double num2) {
        return (num - num2);
    }

    public static double multiplicacion(double num, double num2) {
        return (num * num2);
    }

    public static double division(double num, double num2) {
        return (num / num2);
    }

    public static double porcentaje(double num, double num2) {
        return ((num * num2) / 100);
    }

    public static double raiz(double num) {
        return (Math.sqrt(num));
    }

    public static double potencia2(double num) {
        return (num * num);
    }

    public static double potencia3(double num) {
        return (num * num * num);
    }
}
