package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car coche1 = new Car("Audi", "A4", "Gasoleo");

        System.out.println("Coche: " + coche1);
        System.out.println("Tacometro a 0? " + coche1.isTachometerEqualToZero());
        coche1.start();
        System.out.println("Tacometro correcto? " + coche1.isTachometerGreaterThanZero());
        coche1.start();
        coche1.stop();
        System.out.println("Tacometro correcto? " + coche1.isTachometerEqualToZero());
        coche1.start();
        coche1.accelerate();
        coche1.stop();
        for (int i = 0; i < 24; i++) {
            coche1.accelerate();
        }
        System.out.println("Velocidade actual: " + coche1.speedometer);
        for (int i = 0; i < 25; i++) {
            coche1.brake();
        }
        System.out.println("Velocidade actual: " + coche1.speedometer);
        coche1.turnAngleOfWheels(20);
        coche1.turnAngleOfWheels(46);
        coche1.turnAngleOfWheels(-46);
        coche1.brake();
        coche1.setReverse(true);
        coche1.setReverse(false);
        coche1.accelerate();
        coche1.setReverse(true);

        coche1.showDetails();
    }

}