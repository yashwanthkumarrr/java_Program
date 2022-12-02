public class Pattern_digit {
    public static void main(String[] args) {
        Pattern_digit obj = new Pattern_digit();
         //obj.pattern_3();
        // obj.pattern_y();
        obj.pattern_A();
       // obj.pattern_a();
        // obj.pattern_6();
       // obj.pattern_di_6();
       // obj.pattern_1();


    }

    private void pattern_a() {
        for (int row=1;row<=7;row++){
            if(row==4){
                for (int s=1;s<=7;s++){
                    System.out.print("* ");
                }
            }

            else if(row==1){
                for(int h=1;h<=7;h++){
                    if (h==1||h==7)
                        System.out.print("  ");
                    else
                        System.out.print("* ");
                }
            }
            else {
                for (int col = 1; col <= 7; col++) {
                    if(col==1||col==7)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private void pattern_A() {
        for(int row=1;row<=6;row++){

            if(row==4){
                for (int h=1;h<=11;h++){
                    if(h<3||h>9)
                        System.out.print("  ");
                    else
                        System.out.print("* ");
                }
            }
            else {
                for (int col = 1; col <= 11; col++) {
                    if (row + col == 7)
                        System.out.print("* ");
                    else if (col - row == 5)
                        System.out.print("* ");
                    else
                        System.out.print("  ");

                }
            }
            System.out.println();
        }
    }

    private void pattern_1() {
        for(int row=5; row>=1; row--)
        {

                for (int num = row; num >= 1; num--) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    


    private void pattern_di_6() {
        for (int row=1;row<=7;row++){
            if(row==4){
                for (int star=1;star<=7;star++){
                    if(star==7){
                        System.out.print("  ");
                    }
                    else
                    System.out.print("* ");
                }

            }

           else if(row==1||row==7){
                for (int s=1;s<=7;s++){
                    if(s==1||s==7)
                        System.out.print("  ");
                    else
                    System.out.print("* ");
                }

            }
            else {
                for (int col = 1; col <= 7; col++) {
                    if(col==1){
                        System.out.print("* ");
                    }
                    else if(col==7&& row>=5)
                        System.out.print("* ");
                    else
                    System.out.print("  ");
                }
            }
            System.out.println();
        }



    }

    private String pattern_6() {

        for(int row =1;row<=7;row++){
            if (row==1||row==7){
                for (int hash=1;hash<=7;hash++){
                    if (hash==7||hash==1)
                        System.out.print("  ");
                    else
                        System.out.print("* ");
                }

            }
            else {
                for (int col = 1; col <= 7; col++) {
                    if ( col==1){
                        System.out.print("* ");
                    }
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int star =1;star<=5;star++){

            for (int col=1;col<=7;col++){
                if(col==7||col==1){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (int star=1;star<=6;star++){
            if(star==1){
                System.out.print("  ");
            }
            else
            System.out.print("* ");
        }
        return " ";
    }

    private String pattern_3() {
        for(int row =1;row<=7;row++){
            if(row==1||row==7||row==4){
                for(int star=1;star<=6;star++){
                    if(star==6){
                        System.out.print("  ");
                    }
                    else
                    System.out.print("* ");
                }
            }
            else {
                for (int col = 1; col <= 6; col++) {
                    if(col==6){
                        System.out.print("* ");
                    }
                    else
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

return pattern_6();
    }
    private void pattern_y() {
        for(int row=1;row<=7;row++){
            for (int col=1;col<=7;col++){
                if((row==col)&&(row<=4)||(row+col==8))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
