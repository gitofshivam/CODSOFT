import java.util.*;
class numgame {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Random r=new Random();
    int[] arr =new int[300];
    System.out.println("enter S to start and any other key to exit");
    String c=sc.next();
  do{  if( c.equalsIgnoreCase("s")||c.equalsIgnoreCase("r"))
    {  int rand=r.nextInt(300);
        int count =0;
    for(int i=0;i<5;i++){
        System.out.println("its your "+(i+1)+" attempt out of 5 enter a number");
        int n=sc.nextInt();
         arr[i]=n;
         
         count++;
        if(n==rand){
            System.out.println("hurray!!!!!!! perfect");
            break;
        }
        else if(n<rand){
             System.out.println("hey the number you entered is smaller than the random number");
            System.out.println("you have "+(5-i-1)+" attempts left");
        }
        else {
             System.out.println("hey the number you entered is larger then the random");
            System.out.println("you have "+(5-i-1)+" attempts left");
        
        }
    
    }
      
    System.out.println("the random number generated was "+rand);
    System.out.println("the numbers you entered are:");
    for(int i=0;i<count;i++)
    {
    System.out.print(arr[i]+"\t");
    }
     
   }
   
   else {
    System.exit(0);
   }
    System.out.println("press R to replay");
        c=sc.next();
}while(c.equalsIgnoreCase("r"));

    }
}
