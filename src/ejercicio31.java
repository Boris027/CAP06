public class ejercicio31 {

    public static int pedirnum(){
        System.out.print("Introduzca cuanto dinero quiere apostar: ");
        int numero=Integer.parseInt(System.console().readLine());
        if(numero<0){
            return 5/0;
        }else return numero;
    }


    public static void tirada(int apuesta){

        
        boolean fase2=false;
        
        int numeroaleatorio1=(int) (Math.random()*6 +1);
        int numeroaleatorio2=(int) (Math.random()*6 +1);
        int devolver=0;
        System.out.printf("Primer numero: %d ,Segundo numero: %d ,Suma: %d%n",numeroaleatorio1,numeroaleatorio2,numeroaleatorio1+numeroaleatorio2);
        if(numeroaleatorio1+numeroaleatorio2==7 || numeroaleatorio1+numeroaleatorio2==11){
            devolver=apuesta+apuesta;
            System.out.printf("Enhorabuena, has ganado %d$ , en total tienes %d$",apuesta,devolver);
        }else if(numeroaleatorio1+numeroaleatorio2==2 || numeroaleatorio1+numeroaleatorio2==3 || numeroaleatorio1+numeroaleatorio2==12 ){
            devolver=apuesta-apuesta;
            System.out.printf("Lo siento, has perdido %d$ , en total tienes %d$",apuesta,devolver);
        }else{
            devolver=numeroaleatorio1+numeroaleatorio2;
             System.out.printf("Vaya, no has ganado ni perdido, iniciando la segunda fase, ganaras si sacas este numero %d y perderas si sacas un 7%n",devolver);
            fase2=true;
        }
        String hola="";
        while (fase2==true) {
            System.out.print("Presione enter para ver el resultado");
            hola=System.console().readLine();
            

            numeroaleatorio1=(int) (Math.random()*6 +1);
            numeroaleatorio2=(int) (Math.random()*6 +1);

            System.out.printf("El numero es: %d %n",numeroaleatorio1+numeroaleatorio2);

            if(numeroaleatorio1+numeroaleatorio2==devolver){
                System.out.println("Enhorabuena, has ganado");
                fase2=false;
            }else if(numeroaleatorio1+numeroaleatorio2==7){
                System.out.println("Vaya, has perdido");
                fase2=false;
            }else{System.out.println("Repitiendo");}


        }
        
        
    }
  

   




    public static void main(String[] args) throws Exception {
        try {
           
            int apuesta=pedirnum();
            tirada(apuesta);
            
         } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
