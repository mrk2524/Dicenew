import java.util.Scanner;

public class Dice{
	int noF;
	
	
	public Dice(int no) {
		
		if(no>1&&no<=6)
		{
		  if(no==2)
		  {
			  int min=1;
			  int max=2;
			
				    int x = (int) ((Math.random()*((max-min)+1))+min);
				    
				if(x==1) {System.out.println("H");}
				if(x==2) {System.out.println("T");}
				   
		  }
		  if(no>=3&&no<=6)
		  { 
			  int min=1;
			  int max=no;
			
				    int x = (int) ((Math.random()*((max-min)+1))+min);
				    System.out.println(x);
				   
				}
			  
		  }
		
		  
		
	
		else
		{
			System.out.println("invalid dice faces");	
		}
		
	}

	

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of faces in dice");
		int n=sc.nextInt();
		Dice obj=new Dice(n);
		
		
		
			
			
			
			
		}
		
       
	}