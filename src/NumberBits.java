import java.util.Scanner;
public class NumberBits {
    static void check(int a)
    {
        int count=0;
        while(a>0)
        {
            int temp = a % 2;
            count += temp;
            a /= 2;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        check(a);
    }
}
