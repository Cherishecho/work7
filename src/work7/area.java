package work7;
import java.text.DecimalFormat;
import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        System.out.print("Enter the number of the points: ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        double[] array=new double[n*2+1];
        System.out.print("Enter the coordinates of the points: ");
        for(int i=0;i<n*2;i++){
            array[i+1]=input.nextDouble();
        }
        double sum=0;
        for(int i=1;i<(n-1)*2;i=i+2){
            sum=sum+array[i]*array[i+3]-array[i+2]*array[i+1];
        }
        sum+=array[n*2-1]*array[2]-array[1]*array[n*2];
        DecimalFormat df = new DecimalFormat(".000");
        System.out.println("the total area is "+ df.format(Math.abs(sum/2)));
    }
}