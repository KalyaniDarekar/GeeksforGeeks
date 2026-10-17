public class Program8
{
    public static void main (String A [])
    {

 int iCnt = 0;
 while (iCnt <3)
 {
    iCnt++;
    System.out.println("Before" + iCnt);

    if(iCnt == 2)
    continue;
   
    System.out.println("After" + iCnt);

 }
 }
} 