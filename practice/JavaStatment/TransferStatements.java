package JavaStatment;

public class TransferStatements {
    public static void main(String[] args) {
        
        // Break Staement 
   System.out.println("Break Statement");
       for(int num= 10; num<=20; num++){

        if(num==15)
            break;
          System.out.println(num);
        
       }
    
     System.out.println("continue statemen");
      for(int num= 10; num<=20; num++){

        if(num==15)
            continue;
          System.out.println(num);
        
       }
    }

    
}
