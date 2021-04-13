import java.util.Scanner;

public class ExVetAval
{

    public static void main(String[] args) 
    {
        try (Scanner scan = new Scanner(System.in)) 
        {
			int par[] = new int[5];
			int impar[] = new int[5];
			int g = 0;
			int m = 0;
			
			for (int i = 0; i < 15; i++) 
			{
			    int x = scan.nextInt();
			    if (x % 2 == 0) 
			    {
			        par[g] = x;
			        g++;   
			    } 
			    else 
			    {
			        impar[m] = x;
			        m++;
			    }
			    if (g == 5) 
			    {
			        int c = 0;
			        while (c < g) 
			        {
			            System.out.println("par[" + c + "] = " + par[c]);
			            c++;
			        }
			        g = 0;
			    }
			    if (m == 5) 
			    {
			        int d = 0;
			        while (d < m) 
			        {
			            System.out.println("impar[" + d + "] = " + impar[d]);
			            d++;
			        }
			        m = 0;
			    }
			    if (i == 14) 
			    {
			        int d = 0;
			        while (d < m) 
			        {
			            System.out.println("impar[" + d + "] = " + impar[d]);
			            d++;
			        }

			        int c = 0;
			        while (c < g) 
			        {
			            System.out.println("par[" + c + "] = " + par[c]);
			            c++;
			        }

			    }
			}
		}
    }
}