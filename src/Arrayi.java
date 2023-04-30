import java.util.Scanner;

public class Arrayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eded = scanner.nextInt();


        int[] bolunenler={2,3,4,5,6,7,8,9};
        int count=0;
        for(int i=2; i<10; i++){
            if(eded%i==0){

                count++;
            }
        }

        if(count==0){
            System.out.println("Sade Ededir");
        }else{
            System.out.println("Murekkebdir");
        }



    }
}
