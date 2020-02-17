import java.util.Scanner;

public class insertNewValueToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        int[] array;
        do {
            System.out.println("Enter size: ");
            size = scanner.nextInt();
            if(size > 10){
                System.out.println("size should ot exceed 20!");
            }
        }while(size > 30);

        array = new int[size];
        int i = 0;
        while(i < array.length){
            System.out.print("Enter value in array " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("before insert: ");
        for(int j = 0; j < array.length; j++){
            System.out.print(array[j]+"\t");
        }
        System.out.println("Enter value to insert: ");
        int value = scanner.nextInt();

        System.out.println("enter index: ");
        int index = scanner.nextInt();

        int arrLength = array.length;
        int[] arrNew = new int[6];
        for (int k = 0; k < index; k++ ){
             arrNew[k] = array[k];
        }


        for(int j = arrLength - 1; j >= index ; j--){
            arrNew[j+1] = array[j];
            //System.out.print(array[j+1]);
        }

        arrNew[index] = value;
        for(int j = 0; j < arrNew.length; j++){
            System.out.print(arrNew[j] + "\t");
        }
    }
}
