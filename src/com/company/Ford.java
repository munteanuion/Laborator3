package com.company;

public class Ford implements Masina{

    private String marca = "Ford";
    private double capMotor;
    private int greutate;
    private int diametruDisc;

    public Ford( double capMotor, int greutate, int diametruDisc){

        this.capMotor = capMotor;
        this.greutate = greutate;
        this.diametruDisc = diametruDisc;
    }

    public void setCapMotor(double capMotor) {
        this.capMotor = capMotor;
    }

    public void setDiametruDisc(int diametruDisc) {
        this.diametruDisc = diametruDisc;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapMotor() {
        return capMotor;
    }

    public int getDiametruDisc() {
        return diametruDisc;
    }

    public int getGreutate() {
        return greutate;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public double capMotor(){
        return capMotor;
    }

    @Override
    public int greutate() {
        return greutate;
    }

    @Override
    public int diametruDisc() {
        return diametruDisc;
    }

    @Override
    public String toString() {
        return "Ford{" + "\n" +
                "Marca= " + marca + "\n" +
                "CapMotor= " + this.capMotor() + "\n" +
                "Greutate= " + this.greutate() + "\n" +
                "DiametruDisc= " + this.diametruDisc() + "\n" +
                '}';
    }
}
