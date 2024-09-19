import java.util.Scanner;

public class Arrays{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int array = input.nextInt(); 
        System.out.println("Enter your list " + array + " values: ");

        int arrayList[] = new int[array];

        System.out.print("Enter " + arrayList.length + " values: ");
            for(int i = 0; i < arraylist.length; i++) {
            arrayList[i] = input.nextInt();
            }

        int i;
        for(i = 0; i < arrayList.length; i++ ){
            System.out.println(arrayList[i] + " ");
        }            

        
    }
}