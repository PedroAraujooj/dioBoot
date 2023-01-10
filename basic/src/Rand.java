import java.util.Random;
public class Rand {
    public static void main(String[] args) {
        Random ran = new Random();
        int array[] = new int[7];
        for(int i = 0; i< array.length; i++){
            array[i] = ran.nextInt(100);
            System.out.println(array[i]);
        }
        System.out.println("com matriz");
        int mat[][] = new int[4][4];
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j< mat[i].length; j++){
                mat[i][j] = ran.nextInt(10);
            }
        }
        for (int[] row : mat) {
            for (int data : row) {
                System.out.print(data + " ");

            }
            System.out.println("");
        }
    }

    
}
