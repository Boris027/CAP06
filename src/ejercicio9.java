public class ejercicio9 {


    public static int aleatorio(){

        boolean bucle=false;
        int numero=1;

        while(bucle!=true){
         numero=(int) (Math.random()*101);

        if(numero%2==0){
        bucle=true;
        }

        }
        


        return numero;
    }
    
    public static void main(String[] args) throws Exception {
    

        
        int numerobucle=1;
        int contador=0;

        while(numerobucle!=24){
        
        numerobucle=aleatorio();
        System.out.println(numerobucle);
        contador=contador+1;
        }
             
        System.out.println("El bucle ha generado un total de: "+contador+" numeros");
    }

   
    
}
