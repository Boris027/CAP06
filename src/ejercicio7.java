public class ejercicio7 {
    
    
    
    public static String aleatorio(){
    String palabra="";
    int random=(int) (Math.random()*3 +1);
    
    switch (random) {
        case 1:
            palabra="1";
            break;
        case 2:
            palabra="X";
            break;
        case 3:
            palabra="2";
        default:
            break;
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