public class Spy_number {
    public static void main(String[] args) {
        Spy_number obj = new Spy_number();
        //obj.spy(123);
       /* int no =145;
        int no2=no;
        int result=0;
        while(no>0) {
                int rem = no%10;
                int count=obj.strong(rem);
                result=count+result;
                no=no/10;
        }
        System.out.println(result);
        if(result==no2){
            System.out.println("it is a strong number");
        }
        else {
            System.out.println("it is a not strong number");
        }*/
        obj.strong(145);
    }

    private int strong(int no) {
        int fact=1;
        while(no>0){
            fact= fact*no;
            no--;
        }
        return fact;

    }

    private void spy(int no) {
        int no2 =no;
        int sum =1;
        int count=0;

        while(no>0) {
            int rem = no % 10;
            sum = rem * sum;
            count=rem+count;
            no = no / 10;
        }
        System.out.println(sum);
        System.out.println(count);
        if(sum==count){
            System.out.println("It is a spy number");
        }
        else{
            System.out.println("It is a not spy number");
        }




    }
}
