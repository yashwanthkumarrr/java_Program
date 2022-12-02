public class Looping_class {
    public static void main(String[] args) {

        Looping_class obj = new Looping_class();
       //obj.divisor_of_given_num(21);
        //obj.count_divisor(21);
        //obj.prime_num(9);
        int no=20;
        int i=2;
        while(i<=20) {
            obj.pri(i);
        }

        }

    private void pri(int no) {
        int i=2;
        int count=0;
        int total =0;
        while(i<=no/2){
            if(no%i==0){
               // System.out.println("It is not a prime number");
                count=1;
                break;
            }
            i++;
        }
        if(count==0){
            //System.out.println("it is a prime number");
            System.out.println(no);
            total++;

        }

    }

    private void prime_num(int no) {
        int i=2;

        boolean re = true;
        while(i<=no/2){
            if(no%i==0){
                System.out.println("it is a not prime");
                re=false;
                break;
            }

            i++;
        }
        if(re==true){
            System.out.println("it is a prime number");
        }


    }

    private void count_divisor(int no) {
        int i=1;
        int count=0;
        while(i<=no){
            if(no%i==0){

                count=count+1;
            }
            i++;
        }
        System.out.println(count);

    }

    private void divisor_of_given_num(int no) {
        int i=2;
        int  count = 0;
        while(i<=no/2){

            if(no%i==0){
                //System.out.println(i);
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}

    

