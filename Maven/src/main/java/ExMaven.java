public class AlgoBinaire {
        public static void main(String[] args){



            int n = 200;
            int power = 0;

            if( n > 0){
                power = 1;
            }
            for(n = 2 ; n < 200; n++){
                power = power * n;
            }
            System.out.println(power);
        }


}
