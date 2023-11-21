public class ejercicio30 {

   public static int pedirnum(){
    int numero=Integer.parseInt(System.console().readLine());
    return numero;
   }



   public static void anchura(int ancho){

    for(int i=1;i<=ancho;i++){
        System.out.print("* ");
    
    }
    System.out.println("");
   }




   public static void espacios(int ancho, int pez){


    for(int i=1;i<=ancho*2-3;i++){

        if(i==pez){
            System.out.print("&");
        }else System.out.print(" ");

    }
   }

   public static void espacios2(int ancho, int pez){


    for(int i=1;i<=ancho*2-3;i++){

        if(i==pez){
            System.out.print("@");
        }else System.out.print("");

    }
   }

   




    public static void main(String[] args) throws Exception {
        try {
           
            System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
            int altura=pedirnum();
            System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
            int ancho=pedirnum();

            
            int alturarandom=(int) (Math.random()*(altura-2)+1);
            int espaciorandom=(int) (Math.random()*(ancho*2-3) +1);



            int espaciorandom2=espaciorandom;
            int alturarandom2=(int) (Math.random()*(altura-2)+1);
            if(espaciorandom==espaciorandom2 && alturarandom==alturarandom2){

                while(espaciorandom2==espaciorandom){
                    espaciorandom2=(int) (Math.random()*(ancho*2-3) +1);
                }
            }
             

            int alturarandom3=(int) (Math.random()*(altura-2)+1);
            int espaciorandom3=(int) (Math.random()*(ancho*2-3) +1);
            
            
            
            
            
            anchura(ancho);

          for(int i=1;i<=altura-2;i++){

            System.out.print("*");
            if(i==alturarandom){
                espacios(ancho, espaciorandom);
            }else espacios(ancho,-5);

            System.out.print("*");
            System.out.println("");
            
          }
          anchura(ancho);


            
         } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
