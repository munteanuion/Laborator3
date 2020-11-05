package com.company.classAbstract;

public class Iphone extends Telefoane{

    private int anul;

    public Iphone( int pretul, int anul){

        super("Iphone", pretul);
        this.anul = anul;
    }

    public String starea(){
        return "Nou";
    }

    @Override
    public String toString() {
        return "Iphone{" + "\n" +
                super.toString() +
                "Anul: " + anul + "\n" +
                '}';
    }

    public int getAnul() {
        return anul;
    }

    public void setAnul(int anul) {
        this.anul = anul;
    }

}
