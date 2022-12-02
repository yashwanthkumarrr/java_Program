 public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
       // obj.fibonacci();
        //obj.fibonacci_without_third();
        //obj.fibonacci_count();
       // obj.prime(9);
       obj.fibonacci_prime();
    }

     private void prime(int no) {
        int i=2;
        if(no==0||no==1){

        }
        else {
            boolean re = true;
            while (i <= no / 2) {
                if (no % i == 0) {
                    re = false;
                    break;
                }
                i++;
            }
            if (re == true) {
                System.out.println(no);
            }
        }

     }

     private void fibonacci_prime() {
         int first =0;
         int second=1;

         while(first<=100){//
            //System.out.println(first); //0 1 1 2
             prime(first);
             second=first+second;//0+1 =1, 2 ,3

             first=second-first;//1-0=1,1,2
         }


     }

     private void fibonacci_count() {

        int first=0;
        int second=1;
        int count =1;
        while (count<=100){

            System.out.println(first);//0 1 1


            second=first+second;
            first = second-first;
            count++;

        }


     }

     private void fibonacci_without_third() {
        int first =0;
        int second=1;

        while(first<=13){// 0 1 1 2 3 5 8 13
            System.out.println(first); //0 1 1 2 3
            second=first+second;//2 3 5
            first=second-first;//1 1 2 3


        }

     }

     private void fibonacci() {
        int first =0;
        int second=1;

        while(first<=100){
            System.out.println(first);//0 1 1 2 3 5
            int third=first+second;// 0+1=1, 1+1=2,1+2=3,2+3=,3+5=8
            first=second;//1,1,2, 3,5
            second=third;//1, 2, 3,5,8
        }
     }
 }
