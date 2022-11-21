import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
    int ex;
    do {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Choice: 1.Largest of Three Number 2.Smallest of Three Number 3.Prime or Not 4.Even or Not 5.Reverse of Number 6.Exit");
        int option=sc.nextInt();

        switch(option)
        {
            case 1:
                System.out.println("Enter the first Number");
                int a= sc.nextInt();
                System.out.println("Enter Second Number");
                int b= sc.nextInt();
                System.out.println("Enter Third Number");
                int c= sc.nextInt();
                if(a>b&&a>c)
                {
                    System.out.println(a+ "is largest");
                } else if (b>c)
                {
                    System.out.println(b+" is largest");
                }
                else
                {
                    System.out.println(c + "is largest");
                }
                break;

            case 2:
                System.out.println("Enter the first Number");
                int e= sc.nextInt();
                System.out.println("Enter Second Number");
                int f= sc.nextInt();
                System.out.println("Enter Third Number");
                int g= sc.nextInt();
                if(e<f&&e<g)
                {
                    System.out.println(e+ "is smallest");
                } else if (f<g)
                {
                    System.out.println(f+" is smallest");
                }
                else
                {
                    System.out.println(g + "is smallest");
                }
                break;

        }

        System.out.println("Do you Want to continue?1.yes 2.No");
        ex=sc.nextInt();
    }while(ex==1);
    }
}
