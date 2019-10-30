package src;

public class CalculTaxes {

    private static final double TPS = 5;
    private static final double TVQ = 9.975;


    public static long calculerTaxeDeVentes(long montantHorsTaxe,boolean appliquerTPS,boolean appliquerTVQ){


        if (montantHorsTaxe <= 0){
            throw new IllegalArgumentException("Le montant doit etre superieur a zero");
        }

        long montantTps = 0;
        long montantTvq = 0;

        if(appliquerTPS){

            montantTps =(long) (montantHorsTaxe * (TPS/100));
        }

        if(appliquerTVQ ){

            montantTvq = (long)(montantHorsTaxe * TVQ/100);
        }

        return  montantHorsTaxe + montantTps + montantTvq;
    }


}
