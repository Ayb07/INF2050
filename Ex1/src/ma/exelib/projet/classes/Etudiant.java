package ma.exelib.projet;

public class Etudiant extends Personne {

    private String cne;

    public void Etudiant(String nom, String prenom,String cne){
        super(nom,prenom);
        this.cne = cne;
    }

    @Override
    public String toString() {
        return super.toString() + " mon CNE est: " + this.cne;
    }

}
