public class ejercicio30 {

    public static void bordes(int ancho){
        for(int k=1;k<=ancho;k++){
                    System.out.print("*");
                }
                System.out.println("");
    }

   public static int pedirnum(){
    int numero=Integer.parseInt(System.console().readLine());
     
    
    return numero;
   }



  

   




    public static void main(String[] args) throws Exception {
        try {
           
            System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
            int altura=pedirnum();
            System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
            int anchura=pedirnum();



            /* */
            
            int randomalto=(int) (Math.random()*(altura-2) +1);
            int randomancho=(int) (Math.random()*(anchura-2) +1);
            
            int randomalto2=(int) (Math.random()*(altura-2) +1);
            int randomancho2=0;
            do {
                 randomancho2=(int) (Math.random()*(anchura-2) +1);
            } while (randomalto2==randomalto && randomancho==randomancho2);
            

            


            bordes(anchura);
            for(int i=1;i<=altura-2;i++){

                

                System.out.print("*");
                for(int j=1;j<=anchura-2;j++){

                    if(randomalto==i && randomancho==j){
                        System.out.print("&");
                    }else if(randomalto2==i && randomancho2==j){
                        System.out.print("@");
                    }else System.out.print(" ");


                }
                System.out.println("*");

            }

            bordes(anchura);


            
         } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
