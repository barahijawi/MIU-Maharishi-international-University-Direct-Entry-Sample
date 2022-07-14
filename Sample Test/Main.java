import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bara Batta \n");
        System.out.println(isCentered(new int[]{5, 6, 3, 4, 5, 6}));
        System.out.println(sumEvenOdd(new int[] {1,2,3,4}));
        System.out.println(Arrays.toString(subArray(new char[]{'a','b','c'},0,2)));
    }

    ///Q3
    public static char[] subArray(char[] a, int start, int len){
        int arrayLength = a.length;
        if(start <0 || start >= arrayLength-1) return null;//the last element
        if(start + len >arrayLength) return null;
        char [] subArray= new char[len];
        for(int i =start, j = 0; i< len;i++,j++){
            subArray[i] = a[i];
        }
        return subArray;
    }
    ///Q2
    public static int sumEvenOdd(int[] array) {
        int oddNumbers = 0;
        int evenNumbers = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0)
                evenNumbers += array[i];
            else oddNumbers += array[i];

            return oddNumbers - evenNumbers;
    }

    ///Q1
    public static int isCentered(int[] array) {
        int size = array.length;
        if (size % 2 == 0 || size < 3) return 0;
        int middleElement = array[size / 2];
        for (int i = 0; i < size; i++) {
            if (array[i] <= middleElement && i != size / 2) {
                return 0;
            }
        }
        return 1;
    }
}