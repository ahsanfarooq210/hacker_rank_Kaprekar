public class MainCLass
{
    public static void main(String[] args)
    {

    }
    static void kaprekarNumbers(int p, int q) {
        boolean isfound=false;
        for(int i=p;i<=q;i++)
        {
            long num=(long) i*i;
            String str = String.valueOf(num);
            String left = str.substring(0,str.length()/2);
            String right =str.substring(str.length()/2);
            int numl=(left.isEmpty())?0:Integer.parseInt(left);
            int numr=(right.isEmpty())?0:Integer.parseInt(right);

            if(numl+numr==i)
            {
                System.out.print(i+" ");
                isfound=true;
            }
        }
        if(!isfound)
        {
            System.out.println("INVALID RANGE");
        }

    }
}
