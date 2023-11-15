public class ejercicio1 {
    public static void main(String[] args) throws Exception {
        int random1= (int)(Math.random()*10 +1);
        System.out.println("La primera tirada es de: " +random1);
        int random2=(int) (Math.random()*10 +1);
        System.out.println("La segunda tirada es de: " +random2);
        int random3=(int) (Math.random()*10 +1);
        System.out.println("La tercera tirada es de: " +random3);
        System.out.println("La suma de los numeros de los dados es de: "+(random1+random2+random3));

        
    }
}
