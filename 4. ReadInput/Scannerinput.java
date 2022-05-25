import java.util.Scanner;
class Scannerinput {
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println("Entered String is : " + s);
        int i = sc.nextInt();
        System.out.println("Entered integer is : " + i);
        byte b= sc.nextByte();
        System.out.println("Entered byte is : " + b);
    }
}