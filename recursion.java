package Assignment1;

 import java.util.Scanner;
public class recursion {
   
    public static void countingdown(int x){
        System.out.println(x);
        --x;
        if(x>=0){
            countingdown(x);
        }

    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int x =scanner.nextInt();
        countingdown(x);

         scanner.close();
    }

}
    

