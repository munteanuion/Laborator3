package com.company.classAbstract;

public abstract class Telefoane {

    private String marca;
    private int pretul;

    public Telefoane(String marca, int pretul){
        this.marca = marca;
        this.pretul = pretul;
    }

    @Override
    public String toString() {
        return  "Marca: " + this.marca + "\n" +
                "Pretul: " + this.pretul + "\n"
                ;
    }

    public abstract String starea();

    public String getMarca() {
        return marca;
    }

    public int getPretul() {
        return pretul;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPretul(int pretul) {
        this.pretul = pretul;
    }
}
