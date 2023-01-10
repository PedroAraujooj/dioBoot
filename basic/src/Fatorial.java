import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int total=1;
        System.out.println("Qual número você deseja fatorar?");
        num = scan.nextInt();
        for(int i = 1; i<=num; i++){
            total*=i;
        }
        System.out.println(total);
    }
    
}
