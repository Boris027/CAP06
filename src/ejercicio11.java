public class ejercicio11 {

    public static int notas(){


        int nota=(int) (Math.random()*10 +1);

        return nota;
    }

    

    public static String palabra(int nota){
        
        String resultado="";
        if(nota<5){
            resultado="suspenso";
        }else if(nota==5){
            resultado="suficiente";
        }else if(nota>=5 && nota<7){
            resultado="bien";
        }else if(nota>6 && nota<9){
            resultado="notable";
        }else if(nota>=9 && nota<=10){
            resultado="sobresaliente";
        }



    return resultado;

    }

    public static void main(String[] args) throws Exception {
    int numsuspenso=0;
    int numsuficiente=0;
    int numbien=0;
    int numnotable=0;
    int numsobresaliente=0;
    int nota;

    for(int i=1;i<=20;i++){
    nota=notas();
    String palabra=palabra(nota);
    System.out.println(nota+ " "+palabra);


    if (palabra.equals("suspenso")){
        numsuspenso=numsuspenso+1;
    }else if(palabra.equals("suficiente")){
        numsuficiente=numsuficiente+1;
    }else if(palabra.equals("bien")){
        numbien=numbien+1;
    }else if(palabra.equals("notable")){
        numnotable=numnotable+1;
    }else if(palabra.equals("sobresaliente")){
        numsobresaliente=numsobresaliente+1;
    }
    }

    System.out.printf("El numero de suspensos es de: %d , el numero de suficientes es de: %d , el numero de bien es de: %d , el numero de notable es de %d , el numero de sobresaliente es de %d",numsuspenso,numsuficiente,numbien,numnotable,numsobresaliente);
    


             

    }
    
}
