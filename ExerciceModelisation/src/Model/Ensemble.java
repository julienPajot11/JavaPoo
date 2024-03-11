package Model;

public interface Ensemble<T> {
     Integer DEFAULT_MAX_SIZE = 100;
     void ajouter(T object);
     boolean estVide();
     boolean appartient(T object);
     Integer taille();
     Integer tailleMax();
     Ensemble<T> copie() ;
     T retournerEnlever(int index) throws IllegalStateException;
     void fusionner(Ensemble<T> array);
}
