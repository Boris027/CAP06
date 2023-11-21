public class ejercicio24 {

    public static int pedirnum(){

        System.out.print("Introduce un numero: ");
        int numero=Integer.parseInt(System.console().readLine());

        return numero;
    }


    public static void aleatorio(int numero){

        int largo=Integer.toString(numero).length();

        int random=(int) (Math.random()*largo +1);

        for (int i=1;i<=largo;i++){
            if(i==random){
                System.out.println(numero%10);
            }
            numero=numero/10;
        }

    }

    public static void main(String[] args) throws Exception {
        try {
            
            int numero=pedirnum();
            aleatorio(numero);


         } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
