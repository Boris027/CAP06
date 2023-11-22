public class ejercicio32 {

    public static int pedirnum(){
        System.out.print("Introduzca la longitud del sendero en metros: ");
        int numero=Integer.parseInt(System.console().readLine());
        if(numero<0){
            return 5/0;
        }else return numero;
    }

    public static int decision(){
        int numero=(int) (Math.random()*3);

        if(numero==2){
            return -1;
        }else if (numero==1){
            return 1;
        }else if(numero==0){
            return 0;
        }

        return 1000;
    }


    public static boolean relleno(){
    
        int resultado=(int) (Math.random()*2 +1);

        if(resultado==1){
            return true;
        }else if(resultado==2){
            return false;
        }

        return false;
    }

    public static String simbolo(){
    
        int resultado=(int) (Math.random()*2 +1);

        if(resultado==1){
            return "O";
        }else if(resultado==2){
            return "*";
        }

        return "uwu";
    }

    public static int posicion(){
    
        int resultado=1;

        while(resultado==1 || resultado==6){
            resultado=(int) (Math.random()*6 +1);
        }


        return resultado;
    }

    public static void camino(int largo){

        int espaciado=6;
        int aleatorio=0;
        boolean relleno=false;
        String simbolo="";
        int posicionpiedra;
        for(int i=1;i<=largo;i++){



            for(int k=1;k<=espaciado;k++){
                System.out.print(" ");
            }
            aleatorio=decision();
            espaciado=espaciado+aleatorio;


            relleno=relleno();
            simbolo=simbolo();
            posicionpiedra=posicion();
            for(int j=1;j<=6;j++){

                if(j==1 || j==6){
                    System.out.print("|");
                }else if(relleno==true && j==posicionpiedra){
                    System.out.print(simbolo);
                }else System.out.print(" ");
                
            }
            System.out.println("");


        }

    }




   




    public static void main(String[] args) throws Exception {
        try {
           
            int largo=pedirnum();
            camino(largo);
            
            
         } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
