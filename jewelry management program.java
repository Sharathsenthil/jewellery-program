import java.util.*;
interface inter{
    public int gold(int [] e,int t,String a);
    public void ring();
    public void necklace();
    public void bangles();
    public void earrings();
}
class price implements inter
{
    Scanner s = new Scanner(System.in);
    int rate=5030;
    int count=0;
    int count2=0;  
    int q=1;int g=0;
public int gold(int [] e,int t,String a)
    {
        System.out.println("|   GRAM    |    JEWELLERY     |     AMOUNT     |");
        for(int i=0;i<t;i++)
        {   
            
            System.out.println("______________________________________________________________");
            System.out.println("|    "+e[i]+"      |     "+a+"     |    Rs:"+e[i]*rate+"/-  |");
            count+=e[i]*rate;
        }
        System.out.println("____________________________________________________________________");
        System.out.println("TOTAL AMOUNT FOR BUYING "+a+"S IS |Rs:"+count+"/-");
        System.out.println("_____________________________________________________________________");
        
        return count;
    }
public void ring()
    {
                //ring
                String c="RING";
                System.out.println("RINGS");
                System.out.println("1 GRAM = RS.5030/-");
                System.out.println("GST FOR 1 GRAM GOLD IS 8%");
                System.out.println("ENTER NO OF RINGS NEEDED");
                int n1=s.nextInt();
                int a[]=new int[n1];
                 for(int j=0;j<n1;j++)
                {
                  System.out.println("ENTER YOUR RING "+(j+1)+" GRAM NEEDED :");
                  a[j]=s.nextInt();  
                }
                 g=g+gold(a,n1,c); 
                // M.money(g);
            } 
public void bangles()
{
                //bangle
                String c="BANGLE";
                System.out.println("BANGLE");
                System.out.println("1 GRAM = RS.5030/-");
                System.out.println("GST FOR 1 GRAM GOLD IS 8%");
                System.out.println("ENTER NO OF BANGLE NEEDED");
                int n1=s.nextInt();
                int a[]=new int[n1];
                 for(int j=0;j<n1;j++)
                {
                  System.out.println("ENTER YOUR BANGLE "+(j+1)+" GRAM NEEDED ");
                  a[j]=s.nextInt();  
                }
            
                 g+=gold(a,n1,c); 
                 //M.money(g);
                 
            }
public void necklace()
{
                //NECKLACE
                String c="NECKLACE";
                System.out.println("NECKLACE");
                System.out.println("1 GRAM = RS.5030/-");
                System.out.println("GST FOR 1 GRAM GOLD IS 8%");
                System.out.println("ENTER NO OF NECKLACE NEEDED");
                int n1=s.nextInt();
                int a[]=new int[n1];
                 for(int j=0;j<n1;j++)
                {
                  System.out.println("ENTER YOUR NECKLACE "+(j+1)+" GRAM NEEDED ");
                  a[j]=s.nextInt();  
                }
                 g+=gold(a,n1,c);
}
public void earrings(){
  //earring
                 String c="EARRING";
                System.out.println("EARRING");
                System.out.println("1 GRAM = RS.5030/-");
                System.out.println("GST FOR 1 GRAM GOLD IS 8%");
                System.out.println("ENTER NO OF EARRING PAIRS NEEDED");
                int n1=s.nextInt();
                int a[]=new int[n1];
                 for(int j=0;j<n1;j++)
                {
                  System.out.println("ENTER YOUR EARRING "+(j+1)+" GRAM NEEDED ");
                  a[j]=s.nextInt();  
                }
                 g+=gold(a,n1,c);   
}
    
}

class Main extends price
{
    
    
    public static void main(String args[])
    {
        price p = new price();
    int ch;
    int i=1;
    System.out.println("\t\t\t\t----------JEWELLY APPILICATION----------");
    Scanner s=new Scanner(System.in);
    
   
    Main M=new Main();
    int q=1;
   while(q==1)
   { while(i==1)
    {
    System.out.println("\t\t\t--------------------------------------------------------");
    System.out.println("\t\t\t\t\t\t1)RINGS");
    System.out.println("\t\t\t\t\t\t2)BANGLES");
    System.out.println("\t\t\t\t\t\t3)NECKLACES");
    System.out.println("\t\t\t\t\t\t4)EARRINGS");
    System.out.println("\t\t\t\t\t\tENTER YOUR OPTION: ");
     ch=s.nextInt();
    System.out.println("\t\t\t--------------------------------------------------------");
    
        switch(ch)
    {
        case 1:
            p.ring();
            q=0;
                break;
         case 2:p.bangles();
           
            q=0;
                break;
          case 3:p.necklace();
           
                 
                 q=0;
                break;
            
            case 4:p.earrings();
           
               
                q=0;
                break;
            
            default:
            {
                System.out.println("ENTER VALID OPTION");
                break;
            }
            
        }
         int t=1;
        while(t==1)
        {
        System.out.println("DO YOU WANT TO BUY MORE \n ENTER YES(1) OR NO(0)");
        int y=s.nextInt();
        if(y==1)
        {
            i=1;break;
        }
        else if(y==0)
        {
          
           System.out.println("\t\t\t\tTOTAL AMOUNT :  "+p.g);
            System.out.println("\t\t\t!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("\t\t\t\t\tTHANKS FOR BUYING");
             System.out.println("\t\t\t!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
           i=0;break;
        }
        else
        {
            System.out.println("!!!!ENTER VALID OPTION!!!!");
        }
        }
        }
       
        
    }
    }
}







