public class ejercicio12 {
public static final String RESET = "\033[0m"; // Text Reset
public static final String RED_BACKGROUND = "\033[41m"; // RED
public static final String GREEN = "\033[92m";
public static final String BLUE_BACKGROUND = "\033[44m"; // BLUE
public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE

public static void main(String[] args) throws InterruptedException {

int hola=1;
char random=5;
while(hola<=500){
    for(int i=1;i<=150;i++){
        random=(char) (Math.random()*95 +32);
        String hola2=Character.toString(random);
        System.out.print(GREEN+hola2);
    }
    System.out.println("");
hola=hola+1;
}

System.out.print(RESET);
}
}
