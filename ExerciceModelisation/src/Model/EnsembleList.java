package Model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class EnsembleList<T> implements Ensemble<T>{

    private List<T> data;
    private int tailleMax;
    public EnsembleList(){
        this.data = new ArrayList<>();
        this.tailleMax = DEFAULT_MAX_SIZE;
    }


    @Override
    public void ajouter(T object) {
        if (!data.contains(object) && data.size() < tailleMax) {
            data.add(object);
        }
    }

    @Override
    public boolean estVide() {
        return data.isEmpty();

    }

    @Override
    public boolean appartient(T object) {
        return data.contains(object);
    }

    @Override
    public Integer taille() {
        return data.size();
    }

    @Override
    public Integer tailleMax() {
        return tailleMax;
    }

    @Override
    public Ensemble<T> copie() {
        EnsembleList<T> copie = new EnsembleList<>();
        copie.data.addAll(this.data);
        return copie;
    }

    @Override
    public T retournerEnlever(int index) {
        if (estVide()) {
            throw new IllegalStateException("L'ensemble est vide");
        }
        T element = data.remove(data.size() - 1);
        return element;


    }

    @Override
    public void fusionner(Ensemble<T> array) {
        for (int i = 0; i < array.taille(); i++) {
            T element = ((EnsembleList<T>) array).data.get(i);
            ajouter(element);
        }

    }
}
