package JavaStatment;

public class IfStatement {
    public static void main(String [] args){
        int age = 10;

        if(age>=18){
            System.out.println(age+" You are eligible to vote");
        }
        else{
            System.out.println(age+" You are not eligible to vote");
        }



        // elseif Statement

        int a=10;
        int b;

        if(a==1 ){
            b=20;

        }
        else if(a==10){
            b=30;
        }
        else{
            b=10;
        }
        System.out.println(b);
        
    }
    
}
