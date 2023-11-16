public class ejercicio18 {

    public static final String RESET = "\033[0m";
    public static final String RED = "\033[91m";
    public static final String BLUE = "\033[94m";
    public static final String GREEN = "\033[92m";
    public static final String YELLOW = "\033[93m";
    public static final String VIOLET = "\033[95m";
    public static final String ORANGE = "\033[38;5;208m";



    public static void escogercolor(int randomnumber,int i){


        

        switch (randomnumber) {
            case 1:
                System.out.print(RED +"dormitorio "+i);
                break;
            case 2:
                System.out.print(BLUE +"dormitorio "+i);
                break;
            case 3:
                System.out.print(GREEN +"dormitorio "+i);
                break;
            case 4:
                System.out.print(YELLOW +"dormitorio "+i);
                break;
            case 5:
                System.out.print(VIOLET +"dormitorio "+i);
                break;
            case 6:
                System.out.print(ORANGE +"dormitorio "+i);
                break;
            
            default:
                break;
        }
        System.out.print(RESET+" ");
        
    }

    public static void main(String[] args) throws Exception {
        try {
           
            int registro=0;
            int registro1=100;
            int randomnumber=0;
          for(int i=1;i<=3;i++){

            while(registro==randomnumber || randomnumber==registro1){
                randomnumber=(int) (Math.random()*6 +1);
            }
            registro=randomnumber;
             
            if(i==1){
            registro1=randomnumber;
            }
            
            escogercolor(randomnumber,i);

          }

            
         } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
