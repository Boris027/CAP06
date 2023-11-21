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
            
 
            
            boolean condicion=true;
            if(randomalto==randomalto2 && anchura==4){
                 condicion=false;
            }
            
            int randomalto3=0;
            do {
                randomalto3=(int) (Math.random()*(altura-2) +1);
                if(condicion==false && randomalto3!=randomalto){
                    condicion=true;
                }
            } while (condicion==false);
            
           
            int randomancho3=0;
            do {
                 randomancho3=(int) (Math.random()*(anchura-2) +1);
            } while (randomalto3==randomalto && randomancho3==randomancho || randomalto3==randomalto2 && randomancho3==randomancho2);



            bordes(anchura);
            for(int i=1;i<=altura-2;i++){

                

                System.out.print("*");
                for(int j=1;j<=anchura-2;j++){

                    if(randomalto==i && randomancho==j){
                        System.out.print("&");
                    }else if(randomalto2==i && randomancho2==j){
                        System.out.print("@");
                    }else if(randomalto3==i && randomancho3==j){
                        System.out.print("$");
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
