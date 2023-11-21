public class ejercicio26 {


    public static int pedirnum(){

        int numero=Integer.parseInt(System.console().readLine());

        return numero;

    }

    public static void tableta(int altura, int anchura){
        

        

        int randomancho=0;
        int randomalto=(int) (Math.random()*altura +1);
        System.out.println(randomalto);

        
        if(randomalto==1 || randomalto==altura){
             randomancho=(int) (Math.random()*anchura +1);
        }else {
            
            randomancho=(int) (Math.random()*2 +1);
            
            if(randomancho==1){
                randomancho=1;
            }else if(randomancho==2){
                randomancho=anchura;
            }
        }
        
         


        for(int i=1;i<=altura;i++){

            for(int j=1;j<=anchura;j++){
                if(i==randomalto && j==randomancho){
                    System.out.print(" ");
                }else System.out.print("*");
                
            }
            System.out.println("");
        }

        
    }

    public static void main(String[] args) throws Exception {
        try {
            System.out.print("Introduzca la altura de la tableta: ");
            int altura=pedirnum();
            System.out.print("Introduzca la anchura de la tableta: ");
            int anchura=pedirnum();
            
            tableta(altura, anchura);

         } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
