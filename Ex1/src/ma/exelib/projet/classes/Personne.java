package ma.exelib.projet;

public class Personne {
    protected int id;
    protected String nom;
    protected String prenom;

    private static int comp;


    public void Personne(int id, String nom, String prenom){
        this.id = ++comp;
        this.nom = nom;
        this.prenom = prenom;
    }



    public String toString() {
        return "Je suis " + this.nom.toUpperCase() + " "
                + this.prenom.substring(0, 1).toUpperCase() + ""
                + this.prenom.substring(1).toLowerCase();
    }


}
