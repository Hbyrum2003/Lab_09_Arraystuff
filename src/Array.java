import java.util.Random;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int Array_Size = 100;
        int[] dataPoints = new int[Array_Size];
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;

        }
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.printf(" | ");
            System.out.print(dataPoints[i]);
        }
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum = sum + dataPoints[i];
        }
        int average = sum / dataPoints.length;
        System.out.println("\nThe average of data points array is : " + average);
        System.out.println("The sum of the data points array is : " + sum);
        boolean foundTarget;
        do {
            System.out.println("Enter your search target ");
            int searchTarget = 0;
            foundTarget = false;
            searchTarget = in.nextInt();
            in.nextLine();
            for(int i=0; i< dataPoints.length;i++){
                if(dataPoints[i] ==searchTarget){
                    foundTarget = true;
                    System.out.println("Found  " +  searchTarget  + " At index " + i);
                    break;
                } if(!foundTarget){
                    System.out.println("Target" + searchTarget + "Not found");
                }
            }
        } while (!foundTarget);
        int min = dataPoints[0];
        int max=dataPoints[0];
        for(int i=0;i<dataPoints.length;i++){
            if(min>dataPoints[i]){
                min=dataPoints[i];
            }if(max<dataPoints[i]){
                max=dataPoints[i];
            }
        }
        System.out.println("The minimun of data points array is: " +min);
        System.out.println("The maximum of data points array is : " +max);
    }
    
}




