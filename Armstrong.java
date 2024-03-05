
class Armstrong
{
public static void min(String[] args)
{
int n,arm=0,rem,c;
c=n;
n=152;
while(n>0)
{
rem=n%10;
arm=(rem*rem*rem)+arm;
n=n/10;
}
if(c==arm)
{
System.out.println("Armstrong Number");
}
}
}
