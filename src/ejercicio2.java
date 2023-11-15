public class ejercicio2 {
    public static void main(String[] args) throws Exception {
        
        int palos=(int) (Math.random()*4 +1);
        String clase="";
        String nombreclase="";
        switch (palos) {
            case 1:
                clase="Picas";
                break;
            case 2:
                clase="corazones";
                break;
            case 3:
                clase="diamantes";
                break;
            case 4:
                clase="treboles";
                break;
            default:
                break;
        }

        int numcarta=(int) (Math.random()*14 +1);
        
        if(numcarta==1){
            nombreclase="AS";
        }else if(numcarta==11){
            nombreclase="J";
        }else if(numcarta==12){
            nombreclase="Q";
        }else if(numcarta==13){
            nombreclase="K";
        }else{
            nombreclase=Integer.toString(numcarta);
        }
        


        System.out.println(nombreclase + " de " +clase);
    }
}
