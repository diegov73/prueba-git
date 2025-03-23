import java.io.*;
import java.util.Random;

public class ary {

    static Random ram = new Random();

    static void llenar(int[] A){
        
        for (int i = 0; i < A.length; i++) {
            int x = ram.nextInt(10)+1;
            A[i] = x;
        }
    }

    static void SOP(int[] A){
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println(" ");
    }

    static void BS(int[] A){

        int aux;

        for(int i = 0; i<A.length-1; i++){
            for (int j = i+1; j < A.length; j++) {
                System.out.println("i:"+i+" "+"j:"+j);
                if(A[i]>A[j]){
                    aux = A[i];
                    A[i]=A[j];
                    A[j]=aux;
                }
                SOP(A);
                }
            }
        }
    

    static void QS(int[] A){
        int aux;
        int qs=A.length-1;
        for (int i = 0; i < A.length-1; i++){
            for (int j = i+1; j < A.length; j++){
                int ii = qs-i;
                int jj = qs-j;
                System.out.println("i: " + i + "  " + A[i] + " /j: " + j + "  " + A[j] + " /ii: " + ii + "  " + A[ii] + " /jj: " + jj + "  " + A[jj]);
                
                if(A[i]>A[j]){
                    aux = A[i];
                    A[i]=A[j];
                    A[j]=aux;
                }
                if(A[ii]<A[jj]){
                    aux = A[ii];
                    A[ii]=A[jj];
                    A[jj]=aux;
                }
                SOP(A);
            }
        }
    }

    public static void main(String [] args) throws IOException{
        
        BufferedWriter BR = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader BW = new BufferedReader(new InputStreamReader(System.in));
        
        int C = 6;
        int[] A = new int[C];

        llenar(A);
        SOP(A);
        QS(A);        
    }
}
