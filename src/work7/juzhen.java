package work7;
import java.util.Scanner;
import java.util.ArrayList;
public class juzhen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array size n:");
		int n =input.nextInt();
		int [][] a= new int[n][n];    
		System.out.println("The random array is");
      	for(int i=0;i<n;i++) {
       		for(int j=0;j<n;j++) {
    			a[i][j]=(Math.random()>0.5?0:1);
    	        System.out.print(a[i][j]);  
       		}
    		    System.out.println();
    	}
    	
    	ArrayList<Integer> list1=getrow(a);   	
    	ArrayList<Integer> list2=getcolumn(a);
    	System.out.println("The largest row index: "+getmax(list1));   	
    	System.out.println("The largest column index: "+getmax(list2));
    }	
    
    
    public static ArrayList<Integer> getrow(int[][] a){
    	int n=0;
    	ArrayList<Integer> list=new ArrayList<>();
   	
    	for(int i=0;i<4;i++) {   		
    		for(int j=0;j<4;j++) {   	               
    	        if(a[i][j]==1) 
    	        	n++;   	}	
    		list.add(n);n=0;}
   	return list;
    }
    
    
    public static ArrayList<Integer> getcolumn(int[][] a){
    	ArrayList<Integer> list=new ArrayList<>();
    	
    	for(int e=0;e<4;e++)list.add(0);
    	
    	for(int i=0;i<4;i++)    		
    		for(int j=0;j<4;j++)    	               
    	        if(a[i][j]==1) 
    	        {    	        
    	        	int m=list.get(j);
    	        	list.remove(j);
    	        	list.add(j, m+1);
    	        }
    	return list;
    }
    
    public static int getmax(ArrayList<Integer> list) {
    	int maxvalue=0;
       	for(int d=0;d<list.size();d++)
    		if(list.get(d)>=maxvalue)
    			maxvalue=list.get(d);
        return list.indexOf(maxvalue)+1 ;
       }

}
