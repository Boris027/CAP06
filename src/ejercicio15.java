public class ejercicio15 {

    public static int grande(){
        

        
        int grande=(int) (Math.random()*7 +1);
        
         
        return grande;

    }
    
    public static String nota(){
        String nota="";
        int notanum=(int) (Math.random()*7 +1);

        switch (notanum) {
            case 1:
                nota="do";
                break;
            case 2: 
                nota="re";
                break;
            case 3:
                nota="mi";
                break;
            case 4:
                nota="fa";
                break;
            case 5:
                nota="sol";
                break;
            case 6:
                nota="la";
                break;
            case 7:
                nota="si";
                break;
            default:

                break;
        }
        return nota;
    }


    public static void main(String[] args) throws Exception {
        try {
            String notaguradada="";
            int grande=grande();
            String nota="";
            for(int i=1;i<=grande;i++){

                for(int j=1;j<=4;j++){

                    if(i==grande && j==4){
                        nota=notaguradada;
                    }else nota=nota();

                    if(j==1 && i!=1){System.out.print(" ");}
                    System.out.printf("%s ",nota);
                    if(i==1 && j==1){notaguradada=nota;}

                    
                }
                System.out.print("|");
                if(i==grande){System.out.print("|");}
            }
        
            
         } catch (Exception e) {
            System.out.println("Error inesperado");
        }
    }
}
