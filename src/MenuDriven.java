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

        }

        System.out.println("Do you Want to continue?1.yes 2.No");
        ex=sc.nextInt();
    }while(ex==1);
    }
}
