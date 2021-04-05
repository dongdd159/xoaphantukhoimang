import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class xoaphantukhoimang {
    public static void main(String[] args) {
        int size;
        int[] array;
        int x;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.print("Enter a number:");
        x=scanner.nextInt();
        size=findanddeletenumber(x,array,size);
        System.out.print("New property list: ");
        for (int j =0;j<size;j++){
            System.out.print(array[j] + "\t");
        }
    }
    public static int findanddeletenumber(int n,int[] array,int s){
        int index=0;
        for (int i =0;i< array.length;i++){
            if (n==array[i]){
                System.out.println("phan tu ton tai trong mang");
                return deletenumber(i,array,s);
            }
        }
        System.out.println("phan tu ko ton tai trong mang");
        return index;


    }
    public static int deletenumber(int index,int[] array,int s){
        if (index==s-1){
            return s-1;
        }else {
            for (int i=index;i<s-1;i++){
                array[i]=array[i+1];
            }
            return s-1;
        }
    }
}
