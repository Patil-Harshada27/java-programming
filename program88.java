import java.util.*;

class Number 
{
    public long CalculateFactorial(int iNo)
    {
      int i = 0;
      long iFact = 1;    // important
     
      if(iNo < 0)  
        {
            iNo = -iNo;
        }
    

      for (i = 1 ; i <= iNo; i++)
      {
        iFact = iFact * 1;
      }
      return iFact;

    }
} // End of Number class 

class program88
{
    public static void main(String A[])
    {
        int iValue = 0;
        long iRet = 0;
         
        Scanner sobj = new Scanner (System.in);

        System.out.println("enter number : ");
        iValue = sobj.nextInt();

        Number nobj = new Number();
        iRet = nobj.CalculateFactorial(iValue);

        System.out.println("Fctorail is : "+iRet);
        
       
        // Important
        sobj = null;
        nobj = null;

        System.gc();
        
    }
}