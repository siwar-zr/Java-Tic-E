package revision;

class SoldeInsuffisantException extends Exception{
    public SoldeInsuffisantException(String msg){
        super(msg);
    }
}

public class CompteBancaire {
    private String numeroCompte;
    private double solde;

    public CompteBancaire(String numeroCompte, double solde) {

        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }
    public void setSolde(double montant) {

        this.solde = montant;
    }
    public double getSolde() {
        return solde;
    }
    public void retrait(double montant) throws SoldeInsuffisantException {
        if (montant > solde) {
            throw new SoldeInsuffisantException("Fonds Insuffisants");
        }
        else {
            solde -= montant;
            System.out.println(montant + " retiré avec succès.");
        }
    }
    public void depot(double montant) {
        solde += montant;
        System.out.println(montant + " déposé avec succès.");
    }
}
