import java.util.Arrays;

public class ArrayPush {


    public static int[] push(int[] a, int b){
        int[] s= new int[a.length+1];


        for(int i=0; i<a.length; i++){
            s[i]=a[i];
        }
        s[a.length]=b;


        return s;



    }





}
