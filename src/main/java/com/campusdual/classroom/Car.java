package com.campusdual.classroom;


public class Car {

    static final int MAX_SPEED = 120;
    private static final int MIN_WHEEL_ANGLE = -45;
    private static final int MAX_WHEEL_ANGLE = 45;
    private static final int ACCELERATION_INCREMENT = 5;
    private static final int BRAKE_DECREMENT = 5;

    public String brand;
    public String model;
    public String fuel;
    public int speedometer;
    public int tachometer;
    public String gear;
    public boolean reverse ;
    public int wheelsAngle;

    public Car(){
        this.speedometer = 0;
        this.tachometer = 0;
        this.gear = "N"; // Neutro por defecto
        this.reverse = false;
        this.wheelsAngle = 0;
    }

    public Car(String brand, String model, String fuel) {
        this();
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

    public void start() {
        if(this.isTachometerGreaterThanZero()){
            System.out.println("O Vehiculo xa está encendido");
        } else {
            this.tachometer = 1000;
            System.out.println("Vehiculo acendido");
        }
    }

    public void stop() {
        if( this.speedometer == 0 ) {
            this.tachometer = 0;
            System.out.println("Vehiculo apagado");
        } else {
            System.out.println("Non se pode apagar o vehiculo, primero ten que estar detenido");
        }
    }


    public void accelerate(){
        if(this.speedometer < MAX_SPEED) {
            this.speedometer += ACCELERATION_INCREMENT;
            System.out.println("acelerando Vehiculo");
        } else {
            System.out.println("Non se pode acelerar mas o vehiculo");
        }
    }

    public void brake(){
        if(this.speedometer > 0) {
            this.speedometer -= BRAKE_DECREMENT;
            System.out.println("frenando Vehiculo");
        } else {
            System.out.println("Vehiculo detenido");
        }
    }


    public void turnAngleOfWheels(int angle){
        if(angle < MIN_WHEEL_ANGLE) {
            this.wheelsAngle = MIN_WHEEL_ANGLE;
        } else this.wheelsAngle = Math.min(angle, MAX_WHEEL_ANGLE);
        System.out.println("Ángulo de las ruedas ajustado a: " + this.wheelsAngle + " grados.");
    }

    public void setReverse(boolean reverse){
        this.reverse = reverse;
        if(this.speedometer == 0 && reverse) {
            this.gear = "R";
        } else if(reverse) {
            System.out.println("No es posible cambiar a reversa mientras el vehículo está en movimiento.");
        }else {
            this.gear = "N";
            System.out.println("Saliendo de marcha atrás.");
        }
    }

    public boolean isTachometerGreaterThanZero(){
        return this.tachometer > 0;
    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public void showDetails() {
        System.out.println("Detalles del vehículo:");
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
        System.out.println("Tipo de combustible: " + this.fuel);
        System.out.println("Velocímetro: " + this.speedometer + " km/h.");
        System.out.println("Tacómetro: " + this.tachometer + " rpm.");
        System.out.println("Marcha actual: " + this.gear);
        System.out.println("Reversa: " + (this.reverse ? "Activada" : "Desactivada"));
        System.out.println("Ángulo de las ruedas: " + this.wheelsAngle + " grados.");
    }
}