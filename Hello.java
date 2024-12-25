import java.util.Scanner;

 class Hello
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name=sc.nextLine();
        System.out.println(name);
        System.out.println(name.getClass().getName());
    }
}
class Deepak
{
    public static void main(String[] args) {
        System.out.println("Deepak");
    }
}