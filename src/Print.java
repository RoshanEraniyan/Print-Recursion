import java.util.*;


class Print
{
    public static int print(int n,int start)
    {
        if(start>n)
        {
            System.out.println("");
            return 0;
        }
        System.out.print(start+" ");
        return print(n,start+=1);
    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int start=1;
        print(n,start);
    }
}
