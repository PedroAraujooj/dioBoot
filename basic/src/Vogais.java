import java.util.Scanner;

public class Vogais {
    public static void main(String[] args) {
        String[] array = new String[9];
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira 9 letras");

        for(int i = 0; i < array.length; i++){
            System.out.println("Insira a letra número " + (i+1));
            
            String temp = scan.next();
            if(temp.equalsIgnoreCase("a")||
            temp.equalsIgnoreCase("e")||
            temp.equalsIgnoreCase("i")||
            temp.equalsIgnoreCase("o")||
            temp.equalsIgnoreCase("u")){
               array[i] = temp;

            }
        }

        for (String letter : array) {
            if(letter != null){
                System.out.print(letter);

            }
            
        }


    }
    
}
