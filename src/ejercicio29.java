public class ejercicio29 {

    public static void tabla(){
        System.out.println("1. Primavera");
        System.out.println("2. Verano");
        System.out.println("3. Otoño");
        System.out.println("4. Invierno");
    }
    
    public static int pedirnum(){
        System.out.print("Seleccione la estación del año (1-4): ");
        int numero=Integer.parseInt(System.console().readLine());

        if(numero<1 || numero>4){
            return 5/0;
        }else return numero;
    }
       
    public static void resultado(int tempmin, int tempmax, String probabilidad){
        System.out.println("Prevision del tiempo para mañana");
        System.out.println("---------------------------------");
        System.out.printf("Temperatura mínima: %dºC%n",tempmin);
        System.out.printf("Temperatura máxima: %dºC%n",tempmax);
        System.out.printf("%s",probabilidad);
    }
    
    public static String probabilidad(int numero){
        int soleado=0;
        int nublado=0;
        String resultado="";

        int random=(int)(Math.random()*10 +1);
        switch (numero) {
            case 1:
                soleado=6;
                nublado=4;
                if(random<=nublado){resultado="Nublado";}else resultado="Soleado";
                break;
            case 2:
                soleado=8;
                nublado=2;
                if(random<=nublado){resultado="Nublado";}else resultado="Soleado";
                break;
            case 3:
                soleado=4;
                nublado=6;
                if(random<=soleado){resultado="Soleado";}else resultado="Nublado";
                break;
            case 4:
                soleado=2;
                nublado=8;
                if(random<=soleado){resultado="Soleado";}else resultado="Nublado";
                break;
            default:
                break;
        }

        

        

        


        return resultado;
    }

    public static int temperaturamin(int numero){
        int max=0;
        int min=0;
        switch (numero) {
            case 1:
                max=15;
                min=15;
                break;
            case 2:
                max=25;
                min=20;
                break;
            case 3:
                max=11;
                min=20;
                break;
            case 4:
                max=26;
                min=0;
                break;
            default:
                break;
        }

        int random=(int) (Math.random()*max +min);
        return random; 
    }

    public static int temperaturamax(int numero,int tempmin){
        int max=0;
        int random=0;
        switch (numero) {
            case 1:
                max=30;
                
                break;
            case 2:
                max=45;
                
                break;
            case 3:
                max=30;
                
                break;
            case 4:
                max=25;
                
                break;
            default:
                break;
        }

        do {
            
            random=(int) (Math.random()*(max+1));
            
        } while (random<tempmin);

        return random;
    }

    public static void main(String[] args) throws Exception {
        try {
            

            tabla();
            int numero=pedirnum();
            int tempmin=temperaturamin(numero);
            int tempmax=temperaturamax(numero,tempmin);
            String probabilidad=probabilidad(numero);
            resultado(tempmin,tempmax,probabilidad);

         } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
