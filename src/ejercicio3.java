public class ejercicio3 {
    public static void main(String[] args) throws Exception {
        
        int palos=(int) (Math.random()*4 +1);
        String clase="";
        String nombreclase="";
        switch (palos) {
            case 1:
                clase="Oros";
                break;
            case 2:
                clase="Copas";
                break;
            case 3:
                clase="Espadas";
                break;
            case 4:
                clase="Bastos";
                break;
            default:
                break;
        }

        int numcarta=(int) (Math.random()*10 +1);
        
        
        if(numcarta==8){
            nombreclase="Sota";
        }else if(numcarta==9){
            nombreclase="Caballo";
        }else if(numcarta==10){
            nombreclase="Rey";
        }else{
            nombreclase=Integer.toString(numcarta);
        }
        


        System.out.println(nombreclase + " de " +clase);
    }
}
