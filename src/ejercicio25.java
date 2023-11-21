public class ejercicio25 {


    public static void comprobacion(int random){

        int suma=0;
        for (int i=1;i<=random;i++){
            if(random%i==0){
            suma++;
            }
        }
        
        if(suma==2){
            System.out.printf("#%d# ",random);
        }

        if(random%5==0){
            System.out.printf("[%d] ",random);
        }else System.out.print(random +" ");



    }

    public static void main(String[] args) throws Exception {
        try {
            int random=0;
            for(int i=1;i<=100;i++){

                random=(int) (Math.random()*191 +10);
                comprobacion(random);
                

            }


         } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
