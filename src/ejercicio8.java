public class ejercicio8 {
    
    
    
    public static String aleatorio(){
    String palabra="";
    int random=(int) (Math.random()*6 +1);
    
    if(random<=3){
        palabra="1";
    }else if (random==6){
        palabra="2";
    }else if(random>=4 && random<=5){
        palabra="X";
    }
    return palabra;
}
public static void main(String[] args) {

String random="";

for(int i=1;i<=15;i++){
    System.out.print(i +". ");

    if(i<10) {System.out.print(" ");}

    for(int j=1;j<=3;j++){

        random=aleatorio();
        if(j==1){System.out.print("| ");}
        System.out.print(random +" | ");
        
        if(i==15){
            j=4;
        }

    }
System.out.println("");
}


    
}
}