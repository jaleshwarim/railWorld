package JavaStatment;

public class IterativeStatement {
    public static void main(String[] args) {

        // For Loop
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }

        // while Loop
        System.out.println("while loop");
        int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }

        // do while loop
        System.out.println("do while loop");
        int j=1;
        do{
            System.out.println(j);
            j++;
        }while(j<=5);
            
    }
}
