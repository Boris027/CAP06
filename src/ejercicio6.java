public class ejercicio6 {
    public static void main(String[] args) throws Exception {
        

        int numeroaleatorio=(int) (Math.random()*101 +1);
        int preguntanumero;
        
        for(int i=5;i>=1;i--){
            System.out.print("Le quedan "+i+" intentos, introduce el numero: ");
            preguntanumero=Integer.parseInt(System.console().readLine());
            if(preguntanumero>100 || preguntanumero<0){
                System.out.println("Error, el numero es entre 0 y 100");
                break;
            }
            if(preguntanumero==numeroaleatorio){
                System.out.println("Numero correcto!!!");
                break;
            }else System.out.println("Numero incorrecto");


        }

        
    }
}
