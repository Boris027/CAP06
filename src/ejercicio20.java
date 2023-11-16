public class ejercicio20 {

    public static int pedirnum(){
        System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
        int numero=Integer.parseInt(System.console().readLine());

        if(numero<1){
            return 5/0;
        }else return numero;
    }

    public static void cuba(int altura){

        int random=(int) (Math.random()*(altura+1));
        
        for(int i=altura;i>=1;i--){
            System.out.print("*");

            if(i>random){
                for(int j=1;j<=6-2;j++){
                System.out.print(" ");
            }
            }else{
                for(int j=1;j<=6-2;j++){
                System.out.print("=");
            }
            }
            
            System.out.println("*");
        }



        System.out.println("******");

        System.out.printf("La cuba tiene una capacidad de %d litros y contiene %d litros de agua",altura,random);
    }

    public static void main(String[] args) throws Exception {
        try {
           
            int altura=pedirnum();
            cuba(altura);

         } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
