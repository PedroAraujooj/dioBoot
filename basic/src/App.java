import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Qual número você deseja saber a tabuada?");
        num = scan.nextInt();
        for(int i = 0; i<10; i++){
            System.out.println((i+1)*num);
        }



    }
}
