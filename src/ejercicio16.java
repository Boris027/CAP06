public class ejercicio16 {

    public static int random(){

        int random=(int) (Math.random()*5 +1);

        return random;
    }

    public static String devolver(int random){
        String devolver="";

        switch (random) {
            case 1:
                devolver="corazón";
                break;
            case 2:
                devolver="diamante";
                break;
            case 3: 
                devolver="herradura";
                break;
            case 4: 
                devolver="campana";
                break;
            case 5: 
                devolver="limón";
                break;
            
            default:
                break;
        }
        return devolver;
    }

    public static void main(String[] args) throws Exception {
        try {
           


           int random1=random();
           int random2=random();
           int random3=random();
           
           
           System.out.printf("%s %s %s%n",devolver(random1),devolver(random2),devolver(random3));

           if(random1==random2 && random1==random3){
            System.out.println("Enhorabuena, ha ganado 10 monedas");
           }else if(random1==random2 || random1==random3 || random2==random3){
            System.out.println("Bien, ha recuperado su moneda");
           }else System.out.println("Lo siento, ha perdido.");
            
        


            
         } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
