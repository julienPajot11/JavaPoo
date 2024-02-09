package fr.diginamic.entites;

public class Cercle {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double perimetreCercle(){
        return 2*Math.PI*this.rayon;
    }

    public double surfaceCercle(){
        return this.rayon*this.rayon * Math.PI;
    }
}
