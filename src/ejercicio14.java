public class ejercicio14 {


    public static int pedirnum(){

        int numero=Integer.parseInt(System.console().readLine());

        if(numero<0 || numero>100){
            return 5/0;
        }else return numero;
    }

    public static int numrandom(int base, int top, int minimo, int maximo){
        int random=-1;

        while(random>maximo || random<minimo){
             random=(int) (Math.random()*top +base);
        }
        

        return random;
    }

    public static String grandepeque(){
        String grandepeque=System.console().readLine();

        return grandepeque;
    }


    public static void main(String[] args) throws Exception {
        try {
            
       
        System.out.print("Introduce un numero aleatorio del 0 al 100: ");
        int numero=pedirnum();
        int numerorandom;
        int base=0;
        int top=101;
        int minimo=0;
        int maximo=101;
        boolean comprobacion=false;



        for(int i=4;i>=0;i--){
            
            numerorandom=numrandom(base,top,minimo,maximo);

            if(numerorandom==numero){
                System.out.println("Bien, he acertado, el numero era: " +numerorandom);
                break;
            }else {System.out.println("Mal, he fallado, el numero no era: " +numerorandom +" y me quedan: " +i +" intentos");
            if(i==0){break;}
            System.out.print("¿El numero es mas grande o mas pequeño?(G/P): ");
            String grandepeque=grandepeque();

            if(grandepeque.equals("G")){

            
                base=numerorandom;
                top=101-base;
            
                minimo=numerorandom;
            
            
            
            
            
            }else if(grandepeque.equals("P")){

                top=numerorandom-base;
                
                comprobacion=true;
                maximo=numerorandom;
            }else base=5/0;


            }
        


        }

         } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
