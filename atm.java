package sorting;

import java.util.*;
import java.sql.*; 
public class atm 
{
        public static void main(String[] args) 
        
   {
        	Connection con=null;
       try {
               Class.forName("com.mysql.jdbc.Driver");
  //              DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    	         con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/shivam","root","");
               String q="insert into atm(serialno,name,pin,balance) values(?,?,?,?)";
//               PreparedStatement pstmt=con.prepareStatement(q);
//               pstmt.setInt(1,1);
//               pstmt.setString(2,"shivam");
//               pstmt.setInt(3,1234);
//               pstmt.setInt(4,3000000);
//               pstmt.executeUpdate();
               Statement stat= con.createStatement();
               Scanner sc=new Scanner(System.in);
               System.out.println("WELCOME\n");
               System.out.println("enter your pin");
               int pinno = sc.nextInt(); 
               ResultSet rs=stat.executeQuery("Select * from atm where pin="+pinno );
               System.out.println("1.WITHDRAW\n2.DEPOSIT\n3.CHECK BALANCE\n4.EXIT");
               System.out.println("Enter your choice:");
               int choice=sc.nextInt();
               String name = null;
               int balance=0; 
               int count=0;
               while(rs.next())
               {
                  name= rs.getString(2);
                  balance=rs.getInt(4);
                  count++;
               }
               if(count>0)
               {
                   System.out.println("hello"+name);
               switch(choice) 
                   {
                       case 1 :
                           System.out.println("Enter the amount you want to withdraw:");
                           int wamt=sc.nextInt();
                           
                            if(wamt>balance)
                            {
                               System.out.println("insufficient balance");
                            }
                            else
                             {
                               balance-=wamt;
                               System.out.println("total balance is "+balance);
                               int bal=stat.executeUpdate("update atm set balance where pin="+pinno);
//                           String bal = "update atm" +"set balance"+ "where pin="+pinno;
//                           stat.executeUpdate(bal);
                             }
                           break;
                       case 2 :
                           System.out.println("Enter the amount you want to deposit:");
                           int damt=sc.nextInt();
                           balance+=damt;
                            int bal=stat.executeUpdate("update atm set balance where pin="+pinno);
//                           String bal="update atm"+ "set balance"+" where pin ="+pinno;
//                           stat.executeUpdate(bal);
                            System.out.println("total balance is "+balance);
                           break;
                       case 3 :
                           System.out.println("total balance is "+balance);
                           break;
                       case 4 :
                           System.exit(0);
                       default :
                           System.exit(0);
                   }
               }
               else {
                   System.out.println("invalid pin");
               }
           }
       catch(Exception e) 
           {
             System.out.println(e);
           }
       finally {
    	   try {
    		   con.close();
    	   }
    	   catch(SQLException e) {
    		   e.printStackTrace();
    	   }
       }
    }
   
}
