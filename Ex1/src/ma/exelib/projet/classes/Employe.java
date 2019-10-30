package ma.exelib.projet;

public class Employe extends Personne {

    protected double salaire = 20.25;

    public void Employe(double salaire){
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire ;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
