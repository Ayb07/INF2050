import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 *INF1120
 *
 *Soit une application qui permet de saisir les données sélectionnées par un client,
 *des trois forfaits Télé ou Internet, grace à leurs identifiants respectifs,
 *pour ensuite générer toute information concernante la facturation mensuelle par
 *rapport aux types de forfaits choisis, fournient par l’entreprise
 *Télé & Internet Pour Tous (TIPT). De plus l’application permet de traiter
 *plusieurs factures, l’une a la suite de l’autre.
 *
 *BAIA03019506
 *
 *@author Ayoub Baia
 *@version 17 octobre 2018
 */

public class TP2 {
    public static void main(String[] args) {

        // Declaration des Constantes
        final float PRIX_TELE_B = 15.95f;
        final float PRIX_TELE_T = 20.95f;
        final float PRIX_TELE_E = 25.95f;
        final String FORFAIT_TELE_B = "15.95";
        final String FORFAIT_TELE_T = "20.95";
        final String FORFAIT_TELE_E = "25.95";
        final String CHOIX_TELE_T = "T";
        final String CHOIX_TELE_B = "B";
        final String CHOIX_TELE_E = "E";
        final float PRIX_INTERNET_60 = 40.95f;
        final float PRIX_INTERNET_30 = 30.95f;
        final float PRIX_INTERNET_120 = 50.95f;
        final String FORFAIT_INTERNET_30 = "30.95";
        final String FORFAIT_INTERNET_60 = "40.95";
        final String FORFAIT_INTERNET_120 = "50.95";
        final String CHOIX_INTERNET_30 = "30";
        final String CHOIX_INTERNET_60 = "60";
        final String CHOIX_INTERNET_120 = "120";
        final String DESCRI_TELE_B = "Forfait Bien – choix de 15 chaînes à la carte                                   $15.95\n";
        final String DESCRI_TELE_T = "Forfait Très Bien– choix de 25 chaînes à la carte                               $20.95\n";
        final String DESCRI_TELE_E = "Forfait Excellent – choix de 35 chaînes à la carte                              $25.95\n";
        final String DESCRI_INTERNET_30 = "Internet Fibre hybride 30 - Téléchargement = 30Mb/s et téléversement = 10Mb/s   $30.95  ";
        final String DESCRI_INTERNET_60 = "Internet Fibre hybride 60 - Téléchargement = 60Mb/s et téléversement = 10Mb/s   $40.95  ";
        final String DESCRI_INTERNET_120 = "Internet Fibre hybride 120 -Téléchargement = 120Mb/s et téléversement = 20Mb/s  $50.95";
        final float TPS = 0.05f;
        final float TVQ = 0.09975f;
        final char SERVICE_TELE = '1';
        final char SERVICE_INTERNET = '2';
        final char SERVICE_TELE_INTERNET = '3';
        final String NOM_ENTREPRISE = "Télé & Internet Pour Tous (TIPT)";
        final String ADRESSE_ENTREPRISE = "2020 Matata, Hakuna, QC";
        final String NUM_ENTREPRISE = "(450)515-0055";
        final String REMERCIMENT = "Merci d'avoir choisi TIPT!";
        final String BIENVENUE = "Bienvenue chez Télé & Internet Pour Tous (TIPT), voici le menu de facturation des services de télévision et Internet.";

        // Declaration des Variables
        String nom;
        String prenom;
        String adresse;
        String numTelephone;
        float montantTps;
        float montantTvq;
        float montantTotal;
        char nouvelleCommande;
        int serviceEntre;
        String forfaitEntre;
        float prix = 0;
        String forfaitAfficher= "";
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d-MM-yyyy HH:mm:ss");
        String dateHeure = simpleDateFormat.format(date);
        int numFacture = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("\n"+ BIENVENUE);

        do {

            System.out.println("\nDésirez-vous facturer une nouvelle commande ?");
            System.out.print("Entrez 'O' ou 'o' pour oui et 'N' ou 'n' pour non. : ");
            nouvelleCommande = sc.next().charAt(0);
            nouvelleCommande = Character.toUpperCase(nouvelleCommande);

            while (nouvelleCommande != 'O' && nouvelleCommande != 'N') {
                System.out.println("Réponse invalide, veuiller recommencer.:");
                nouvelleCommande = sc.next().charAt(0);
                nouvelleCommande = Character.toUpperCase(nouvelleCommande);



            }
            // Saisie des données
            if (nouvelleCommande == 'O'){
                numFacture++;
                System.out.println("Entrez votre nom:");
                nom = sc.nextLine();
                nom = nom.trim();
                System.out.println("Entrez votre prenom:");
                prenom = sc.nextLine();
                prenom = prenom.trim();
                System.out.println("Entrez votre numero de telephone:");
                numTelephone = sc.nextLine();
                System.out.println("Entrez votre adresse, suivis de votre code postal:");
                adresse = sc.nextLine();

                System.out.println("Entrez le choix de service (1 =Télé, 2 = Internet, et" +
                        " 3 = Télé et Internet ) :");
                serviceEntre = sc.next().charAt(0);

                //Validation du choix de service
                while (serviceEntre != '1' && serviceEntre != '2' && serviceEntre != '3' ) {
                    System.out.println("Réponse invalide, veuiller recommencer.:");
                    System.out.println("Entrez le choix de service (1 =Télé, 2 = Internet, et" +
                            " 3 = Télé et Internet:");
                    serviceEntre = sc.next().charAt(0);

                }


                if (serviceEntre == SERVICE_TELE || serviceEntre == SERVICE_TELE_INTERNET){
                    System.out.println("Entrez l’identifiant du forfait Télé (B = Forfait Bien," +
                            " T = Forfait Très Bien, et E = Excellent:");
                    forfaitEntre = sc.nextLine();

                    //Validation du forfait télé entré
                    while ( !forfaitEntre.equals("B") && !forfaitEntre.equals("T") &&
                            !forfaitEntre.equals("E") ){
                        System.out.println("Réponse invalide, veuiller recommencer.:");
                        System.out.println("Entrez l’identifiant du forfait Télé (B = Forfait Bien," +
                                " T = Forfait Très Bien, et E = Excellent : ");
                        forfaitEntre = sc.nextLine();
                    }

                    if (forfaitEntre.equals(CHOIX_TELE_B)){
                        prix = PRIX_TELE_B;
                        forfaitAfficher = DESCRI_TELE_B;

                    } else if (forfaitEntre.equals(CHOIX_TELE_T) ) {
                        prix = PRIX_TELE_T;
                        forfaitAfficher = DESCRI_TELE_T;

                    } else if (forfaitEntre.equals(CHOIX_TELE_E) ){
                        prix = PRIX_TELE_E;
                        forfaitAfficher = DESCRI_TELE_E;
                    }


                }

                if (serviceEntre == SERVICE_INTERNET || serviceEntre == SERVICE_TELE_INTERNET){
                    System.out.println("Entrez l'identifiant du forfait internet (30 = " +
                            " forait 30Mb/s, 60 = forfait 60Mb/s, 120 = forfait 120Mb/s):");
                    forfaitEntre = sc.nextLine();

                    //Validation du forfait internet entré
                    while (!forfaitEntre.equals(CHOIX_INTERNET_30) &&
                            !forfaitEntre.equals(CHOIX_INTERNET_60) &&
                            !forfaitEntre.equals(CHOIX_INTERNET_120) ){
                        System.out.println("Réponse invalide, veuiller recommencer.:");
                        System.out.println("Entrez l'identifiant du forfait internet (30 = " +
                                " forait 30Mb/s, 60 = forfait 60Mb/s, 120 = forfait 120Mb/s:");
                        forfaitEntre = sc.nextLine();
                    }


                    if (serviceEntre == SERVICE_TELE_INTERNET) {
                        if (forfaitEntre.equals(CHOIX_INTERNET_30)) {
                            prix = prix + PRIX_INTERNET_30;
                            forfaitAfficher = forfaitAfficher + DESCRI_INTERNET_30;
                        } else if (forfaitEntre.equals(CHOIX_INTERNET_60)) {
                            prix = prix + PRIX_INTERNET_60;
                            forfaitAfficher = forfaitAfficher + DESCRI_INTERNET_60;
                        } else if (forfaitEntre.equals(CHOIX_INTERNET_120)) {
                            prix = prix + PRIX_INTERNET_120;
                            forfaitAfficher = forfaitAfficher + DESCRI_INTERNET_120;
                        }
                    } else {
                        if (forfaitEntre.equals(CHOIX_INTERNET_30)) {
                            prix = PRIX_INTERNET_30;
                            forfaitAfficher = DESCRI_INTERNET_30;
                        } else if (forfaitEntre.equals(CHOIX_INTERNET_60)) {
                            prix = PRIX_INTERNET_60;
                            forfaitAfficher = DESCRI_INTERNET_60;
                        } else if (forfaitEntre.equals(CHOIX_INTERNET_120)) {
                            prix = PRIX_INTERNET_120;
                            forfaitAfficher = DESCRI_INTERNET_120;
                        }
                    }

                }
                //Calcul
                montantTps = prix * TPS;
                montantTvq = prix * TVQ;
                montantTotal = prix + montantTps + montantTvq;

                //Bloc d'affichage
                System.out.println("\n                          "+ NOM_ENTREPRISE);
                System.out.println("\n" + ADRESSE_ENTREPRISE +"                                          "+ NUM_ENTREPRISE);
                System.out.println("......................................................................................");
                System.out.println("\nDate et heure:" + dateHeure);
                System.out.println("                                     Facture no:" + numFacture);
                System.out.println("Nom et prénom:" + nom + " " + prenom);
                System.out.println("Adresse:"+ adresse);
                System.out.println("                                   Telephone:" +numTelephone);
                System.out.println("                                                                                 Prix");
                System.out.println("Description:\n" + forfaitAfficher );
                System.out.printf("\n%-10s%27s%-8.2f\n","Sous total", "$",prix);
                System.out.printf("\n%-11s%26s%-8.2f\n","Montant TPS", "$",montantTps);
                System.out.printf("\n%-11s%26s%-8.2f\n","Montant TVQ", "$",montantTvq);
                System.out.printf("\n%-13s%24s%-8.2f\n","Montant total", "$",montantTotal);
                System.out.println("\n"+REMERCIMENT);
            }
            System.out.println("fin du programme.");
        } while(nouvelleCommande == 'O');
    }
}
