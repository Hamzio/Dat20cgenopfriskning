package genopfrisk;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;


public class Main {
    public static void sortStringArray(String[] stringArray, int sizeOfArray){
        String temp = null;
        for(int i = 0 ; i<sizeOfArray;i++){
            for(int j = 1; j<sizeOfArray-i;j++){
                if(stringArray[j-1].compareToIgnoreCase(stringArray[j])> 0){
                    temp = stringArray[j-1];
                    stringArray[j-1] = stringArray[j];
                    stringArray[j] = temp;

                }
            }
        }
        System.out.println("Sorteret ord i alfabetisk rækkefølge : ");
        for(String s : stringArray){
            System.out.println(s);
        }


    }
    public static void main(String[] args) {
        System.out.println("indtast hvor mange ord du vil have : ");
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        String [] stringArray = new String[sizeOfArray];
        for(int i=0 ; i<sizeOfArray; i++){
            System.out.println("indtast ord " + (i+1) + " : ");
            stringArray[i]= sc.next();
        }
        System.out.println(" **************** ");

        sortStringArray(stringArray,sizeOfArray);
}


}

