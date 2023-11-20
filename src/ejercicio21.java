public class ejercicio21 {

    public static String moneda(){

        int moneda=(int) (Math.random()*8 +1);
        String monedavalor="";
        switch (moneda) {
            case 1:
                monedavalor="1 céntimo  ";
                break;
            case 2:
                monedavalor="2 céntimos ";
                break;
            case 3:
                monedavalor="5 céntimos ";
                break;
            case 4:
                monedavalor="10 céntimos";
                break;
            case 5:
                monedavalor="20 céntimos";
                break;
            case 6:
                monedavalor="50 céntimos";
                break;
            case 7:
                monedavalor="1 euro     ";
                break;
            case 8:
                monedavalor="2 euros    ";
                break;
            default:
                break;
        }
        return monedavalor;
    }

    public static String caracruz(){

        int random=(int) (Math.random()*2 +1);
        String resultado="";
        switch (random) {
            case 1:
                resultado="cara";
                break;
            case 2:
                resultado="cruz";
                break;
            default:
                break;
        }
    
        return resultado;
    }


    public static void main(String[] args) throws Exception {
        try {
            String moneda="";
            String resultado="";
            for(int i=1;i<=5;i++){
                moneda=moneda();
                resultado=caracruz();
                System.out.println(moneda + " - " +resultado);
            }
            
            

         } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
