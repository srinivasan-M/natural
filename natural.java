import java.util.*;
class natural
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int i=1,sum=0;
do{
sum+=i;
i+=1;
}while(i<=n);
System.out.println("Sum of"+n+"natural number is="+sum);
}
}
