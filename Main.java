import java.util.Scanner;

class Prime {
   public boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }
        else if(n == 2){
            return true;
        }
        else {
            for(int i=2;i<n;i++){
                if(n % 2 == 0){
                    return false;
                }
            }
            return true;
        }
    }
    class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            Prime prime = new Prime();
            for(int i=a;i<=b;i++){
                boolean res = prime.isPrime(i);
                if(res == true){
                    System.out.print(i+" ");
                }
            }

        }
    
    }
}