public class Pattern_Program_1 {
    public static void main(String[] args) {
        Pattern_Program_1 obj = new Pattern_Program_1();
        //obj.pattern_I();
        //obj.pattern_T();
        //obj.pattern_C();
        //obj.pattern_O();
        //obj.pattern_D();
        //obj.pattern_P();
        obj.pattern_R();
        //obj.pattern_B();
       // obj.pattern_8();
    }

    private void pattern_8() {
        for(int row=1;row<=7;row++){
            if(row==1||row==7||row==4){
                for(int hash=1;hash<=7;hash++) {
                    if(hash==1||hash==7)
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

    private void pattern_B() {
        pattern_R();
        for (int star=1;star<=6;star++){
            System.out.print("* ");
        }
    }

    private void pattern_R() {
        pattern_D();
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
    }

    private void pattern_P() {
        pattern_D();
        for(int star=1;star<=7;star++){
            System.out.println("* ");
        }
    }

    private void pattern_D() {
        for(int row =1;row<=7;row++){
            if (row==1||row==7){
                for (int hash=1;hash<=7;hash++){
                    if (hash==7)
                    System.out.print("  ");
                    else
                        System.out.print("* ");
                }

            }
            else {
                for (int col = 1; col <= 7; col++) {
                    if ( col==1||col==7){
                        System.out.print("* ");
                    }
                    else
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private void pattern_O() {
        for(int row=1;row<=7;row++){
            if(row==1||row==7){
                for (int hash=1;hash<=7;hash++){
                    if(hash==1||hash==7)
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

    private void pattern_C() {
        for (int row =1; row<=7;row++){
            if(row==1||row==7){
                for (int hash=1;hash<=7;hash++){
                    if(hash==1||hash==7)
                    System.out.print("  ");
                    else
                        System.out.print("* ");
                }
            }
            else {
                for (int col = 1; col <= 7; col++) {
                    if(col==1)
                    System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private void pattern_T() {
        for(int row =1;row<=7;row++){
            if(row==1){
                for(int hash=1;hash<=7;hash++)
                System.out.print("* ");
            }
            else {
                for (int col = 1; col <= 7; col++) {
                    if(col==4)
                    System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private void pattern_I() {
        for(int row=1;row<=7;row++) {
            if (row == 1 || row == 7) {
                for (int star = 1; star <= 7; star++)
                    System.out.print("* ");
            } else {

                for (int col = 1; col <= 7; col++) {
                    if (col==4)
                    System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
