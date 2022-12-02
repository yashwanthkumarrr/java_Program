public class Fibonacci_prime {
    public static void main(String[] args) {
        Fibonacci_prime obj = new Fibonacci_prime();
        obj.fibonacci();

    }

    private void prime(int no) {
        if(no==0||no==1){

        }
        else {
            int i=2;
            boolean re = true;
            while(i<=no/2){
                if(no%i==0){
                    re=false;
                    break;
                }
                i++;
            }
            if (re==true){
                System.out.println(no);
            }
        }
    }

    private void fibonacci() {
        int first =0;
        int second=1;
        int count =1;
        while(count<=100){
            prime(first);//0 1 1 2
            second =first+second;//1 2 3
            first=second-first;//1 2
        }
    }
}
