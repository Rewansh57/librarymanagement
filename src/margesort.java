import java.util.Random;
import java.util.Scanner;

class merge_sort{
    public void divide(int[] input_array){
        int mainlen=input_array.length;
        int midlen=mainlen/2;
        int [] leftside=new int[midlen];
        int [] rightside=new int [mainlen-midlen];
        if (mainlen<2){
            return;}
        for(int i=0;i<midlen;i++){
            leftside[i]=input_array[i];

        }
        for(int i=midlen;i<input_array.length;i++){
            rightside[i-midlen]=input_array[i];


        }
        divide(leftside);
        divide(rightside);
        merge(input_array,leftside,rightside);






    }
    public void merge(int[] input_array,int[] leftside,int [] rightside ){
        int leftsize=leftside.length;
        int rightsize=rightside.length;
        int mainlen=input_array.length;
        int i=0,j=0,k=0;




        while(i < leftsize && j < rightsize){
            if(leftside[i]<=rightside[j]){
                input_array[k]=leftside[i];
                i++;
            }
            else{
                input_array[k]=rightside[j];
                j++;
            }
            k++;

        }
        while(i<leftsize){
            input_array[k]=leftside[i];
            i++;
            k++;


        }
        while(j<rightsize){
            input_array[k]=rightside[j];
            j++;
            k++;


        }

    }
}

public class margesort{
    public static void main(String[] args){
        System.out.println("enter the number of elements you want in the array");
        Scanner scn=new Scanner(System.in);
        Random ran=new Random();
        merge_sort mrg=new merge_sort();


        int n=scn.nextInt();
        int [] input_array=new int[n];
        for(int i=0;i<input_array.length;i++){
            int num=ran.nextInt(10000);
            input_array[i]=num;


        }
        int[]  unsorted_array=input_array;
        sys_array(unsorted_array);
        System.out.println("\n"+"This is the unsorted array");
        mrg.divide(unsorted_array);
        sys_array(unsorted_array);
        System.out.println("\n"+"this is the sorting array");




    }
    public static void sys_array(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");

        }
    }
}