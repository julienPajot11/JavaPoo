package fr.diginamic.banque.entites;

public abstract class Operation {
    protected String dateOperation;
    protected float montantOperation;

    public Operation(String dateOperation, float montantOperation) {
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "dateOperation='" + dateOperation + '\'' +
                ", montantOperation=" + montantOperation +
                '}';
    }

    public abstract String afficherType();

    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public float getMontantOperation() {
        return montantOperation;
    }

    public void setMontantOperation(float montantOperation) {
        this.montantOperation = montantOperation;
    }
}
