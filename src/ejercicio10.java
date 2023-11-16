public class ejercicio10 {



    public static String caracter(){
        
        int caracter=(int) (Math.random()*7 +1);
        String devolver="";
        switch (caracter) {
            case 1:
                devolver="*" ;
                break;
            case 2:
                devolver="-";
                break;
            case 3:
                devolver="=";
                break;
            case 4:
                devolver=".";
                break;
            case 5:
                devolver="|";
            case 6:
                devolver="@";
            default:
                break;
        }

        
        return devolver;
    }
    public static void main(String[] args) throws Exception {
    int longitud;
    int caracter;
        for(int i=1;i<=10;i++){


        longitud=(int) (Math.random()*41 +1);
        
        for(int j=1;j<=longitud;j++){
            
            String devolver=caracter();
            System.out.print(devolver);
        


        }

        System.out.println("");





        }
             

    }

   
    
}
