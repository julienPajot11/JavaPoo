package Model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EnsembleTableau<T> implements Ensemble<T> {

    private T[] data;
    private int tailleMax;
    private int taille;

    public EnsembleTableau(){
        data= (T[]) new Object[tailleMax];
        this.tailleMax = DEFAULT_MAX_SIZE;
        this.taille = 0;
    }
    @Override
    public void ajouter(T object) {
        if (!appartient(object) && taille < tailleMax){
            data[taille++] = object;
        }
    }

    @Override
    public boolean estVide() {
        return taille == 0;
    }

    @Override
    public boolean appartient(T object) {
        for (T elem : data){
            if (elem != null && elem.equals(object)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer taille() {
        return taille;
    }

    @Override
    public Integer tailleMax() {
        return tailleMax;
    }

    @Override
    public Ensemble<T> copie() {
        EnsembleTableau<T> copie = new EnsembleTableau<>();
        copie.data = Arrays.copyOf(this.data, this.tailleMax);
        copie.taille = this.taille;
        return copie;
    }

    @Override
    public T retournerEnlever(int index) {
        if (estVide()) {
            throw new IllegalStateException("L'ensemble est vide");
        }
        T element = data[--taille];
        data[taille] = null;
        return element;
    }

    @Override
    public void fusionner(Ensemble<T> array) {
        for (int i = 0; i < array.taille(); i++) {
            T element = ((EnsembleTableau<T>) array).data[i];
            ajouter(element);
        }
    }
}
