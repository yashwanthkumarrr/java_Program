public class Neon_number {
    public static void main(String[] args) {
        Neon_number obj = new Neon_number();
        //obj.neon(9);
        obj.perfect(6);
    }

    private void perfect(int no) {
        int no2=no;
        int i=1;
        int count=0;
        while(i<=no/2){
            if(no%i==0){
                count=i+count;

            }
            i++;
        }
        System.out.println(count);
        String result =(no2==count)?"it is a perfect number":"it is a not perfect number";
        System.out.println(result);

    }

    private void neon(int no) {
        int no2 = no;
        no = no*no;
        int sum=0;
        while(no>0) {
            int rem = no % 10;
            sum = rem + sum;
            no =  no/ 10;
        }
        if(no2==sum){
            System.out.println("It is a neon number");
        }
        else{
            System.out.println("It is a not neon number");
        }
        System.out.println(8/8);
        System.out.println();
    }
}
