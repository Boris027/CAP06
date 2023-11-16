public class ejercicio13 {

    public static int tiradado(){

        int numero=(int) (Math.random()*6 +1);
        return numero;
    }

    public static void main(String[] args) throws Exception {
      
    int dado1=0;
    int dado2=1;


    while(dado1!=dado2){


        dado1=tiradado();
        dado2=tiradado();

        System.out.printf("El primer dado ha salido: %d y el segundo dado ha salido: %d",dado1,dado2);
        System.out.println("");
    }


    }
    
}
