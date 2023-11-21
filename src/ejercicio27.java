public class ejercicio27 {

    public static String pediraccion(){
        System.out.print("Turno del jugador (introduzca piedra, papel o tijeras): ");
        String accion=System.console().readLine();
        int hola=0;
        if(accion.equals("piedra") || accion.equals("papel") || accion.equals("tijeras")){
           hola=1;
        }
        if(hola!=1){
            hola=5/0;
        }else return accion;
        return "";
    }
    
    public static void turnoordenador(String resultado){

        

        

        int ordenador=(int) (Math.random()*3 +1);
        String resultadomaquina="";
        switch (ordenador) {
            case 1:
                resultadomaquina="piedra";
                break;
            case 2:
                resultadomaquina="papel";
                break;
            case 3:
                resultadomaquina="tijeras";
                break;
            default:
                break;
        }

        System.out.println("Turno del ordenador: "+resultadomaquina);

        if(resultadomaquina.equals(resultado)){
            System.out.println("Empate");
        }

        if(resultadomaquina.equals("papel") && resultado.equals("piedra")){
            System.out.println("Gana el ordenador");
        }else if (resultadomaquina.equals("piedra") && resultado.equals("papel")){
            System.out.println("Gana el jugador");
        }else if (resultadomaquina.equals("tijeras") && resultado.equals("papel")){
            System.out.println("Gana el ordenador");
        }else if (resultadomaquina.equals("papel") && resultado.equals("tijeras")){
            System.out.println("Gana el jugador");
        }else if (resultadomaquina.equals("tijeras") && resultado.equals("papel")){
            System.out.println("Gana el ordenador");
        }else if (resultadomaquina.equals("papel") && resultado.equals("tijeras")){
            System.out.println("Gana el jugador");
        }else if (resultadomaquina.equals("tijeras") && resultado.equals("piedra")){
            System.out.println("Gana el jugador");
        }else if (resultadomaquina.equals("piedra") && resultado.equals("tijeras")){
            System.out.println("Gana el ordenador");
        }

        
    }
    

    public static void main(String[] args) throws Exception {
        try {
            
            String resultado=pediraccion();
            turnoordenador(resultado);

         } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
