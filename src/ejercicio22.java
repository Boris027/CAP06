public class ejercicio22 {

    public static int pediraltura(){
        System.out.print("Introduce la altura de la serpiente: ");
        int numero=Integer.parseInt(System.console().readLine());
        return numero-1;
    }

    public static int posicion(){

        int posicion=(int) (Math.random()*3 +1 );
        int resultado=9;

        switch (posicion) {
            case 1:
                resultado=0;
                break;
            case 2:
                resultado=1;
                break;
            case 3:
                resultado=-1;
                break;
            default:
                break;
        }
        return resultado;

    }
    public static void main(String[] args) throws Exception {
        try {
            int altura=pediraltura();
            int posicion=12;

            for(int i=1; i<=12;i++){
                System.out.print(" ");
                if(i==12){
                    System.out.println("@");
                }

            }
            
            
            for(int i=1;i<=altura;i++){

            int resultado=posicion();
            posicion=posicion+resultado;
            for(int j=1;j<=posicion;j++){
                System.out.print(" ");
            }
            System.out.print("*");

            System.out.println("");

            

            }
            

         } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
