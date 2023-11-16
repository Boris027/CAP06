public class ejercicio19 {

   

    public static void main(String[] args) throws Exception {
        try {
            int suma=0;
            int pares=0;
            int impares=2147483647;

            for(int i=1;i<=50;i++){

                int random=(int) (Math.random()*301 -100);
                System.out.print(random +" ");
                suma=suma+random;


                if(random%2==0 && random>pares){
                    pares=random;
                }else if(random%3==0 && random<impares){
                    impares=random;
                }



            }
            System.out.println("");
            System.out.println("La media es de: " +suma/50);
            System.out.println("Este es el numero mas grande de los pares: "+pares);
            System.out.println("Este es el numero mas pequeño de los impares: "+impares);


         } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
