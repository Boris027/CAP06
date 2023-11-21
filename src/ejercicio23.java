public class ejercicio23 {

    public static String aleatorio(){

        int numero=(int) (Math.random()*6 +1);
        String devolver="a";

        switch (numero) {
            case 1:
                devolver="As";
                break;
            case 2:
                devolver="K";
                break;
            case 3:
                devolver="Q";
                break;
            case 4:
                devolver="J";
                break;
            case 5:
                devolver="7";
                break;
            case 6:
                devolver="8";
                break;
            default:
                break;
        }


        return devolver;
    }


    public static void main(String[] args) throws Exception {
        try {
            String palabra="";

            for(int i=1;i<=5;i++){
            palabra=aleatorio();
            System.out.print(palabra +" ");
            }

         } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
