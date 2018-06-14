package server;

public class CalculatorOperations {

    public float sum(float num1, float num2) {
        return num1 + num2;
    }

    public float sub(float num1, float num2){
        return num1 - num2;
    }

    public float div(float num1, float num2){
        return num1 / num2;
    }

    public float mult(float num1, float num2){
        return num1 - num2;
    }

    public double pow(float num1, float num2) {
        return Math.pow(num1, num2);
    }
}