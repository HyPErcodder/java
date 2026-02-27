import java.util.Scanner;
class year{
   public static void main(String args[] ){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a%100 ==0){
            if (a % 400==0){
                System.out.println(a +" is a leap year");
            }
            else{
                System.out.println(a +" is not a leap year");
            }
        }
        else{
            if (a % 4 ==0){
                System.out.println(a +" is a leap year");
            }
            else{
                System.out.println(a +" is not a leap year");
            }
        }
   }
}
