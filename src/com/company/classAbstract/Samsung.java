package com.company.classAbstract;

public class Samsung extends Telefoane{

    private int anul;

    public Samsung( int pretul, int anul){

        super("Samsung", pretul);
        this.anul = anul;
    }

    public String starea(){
        return "Second Hand";
    }

    @Override
    public String toString() {
        return "Samsung{" + "\n" +
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
