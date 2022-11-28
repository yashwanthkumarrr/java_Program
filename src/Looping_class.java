public class Looping_class {
    public static void main(String[] args) {

        Looping_class obj = new Looping_class();
       // obj.divisor_of_given_num(21);
        obj.count_divisor(21);


        }

    private void count_divisor(int no) {
        int i=1;
        int count=0;
        while(i<=no){
            if(no%i==0){
                //System.out.println(i);
                count=count+1;
            }
            i++;
        }
        System.out.println(count);

    }

    private void divisor_of_given_num(int no) {
        int i=1;
        while(i<=no){
            if(no%i==0){
                System.out.println(i);
            }
            i++;
        }
    }
}

    

