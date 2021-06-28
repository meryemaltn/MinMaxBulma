import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        
    	int k;
        Scanner scan=new Scanner(System.in);
        System.out.println("Kaç sayý gireceksiniz?: " );
        k = scan.nextInt();

        int max=0;
        int min=0;
        
        
        for (int i=1; i<=k; i++)
        {
            System.out.println(i+". sayiyi giriniz: ");
            int num = scan.nextInt();
            
            if (i==1)
            {
                max=num;
                min=num;
            }
            
            if (num>max)
                max=num;
            
            if (num<min)
                min=num;
        }
        
        System.out.println("girdiginiz " +k+ " sayi icinden en buyuk olani: "+max);
        System.out.println("girdiginiz " +k+ " sayi icinden en kucuk olani: "+min);
    }
 
}