public class Name_pattern_program {
    static int re;
    static int h;
    static int m;
    public static void main(String[] args) {
        Name_pattern_program name = new Name_pattern_program();

         name.pattern_Yashwanth_kumar();

    }

    private void pattern_R() {
        for(int row=1;row<=7;row++){
            if(row==4){
                for (int s=1;s<=5;s++){
                    if(s==5)
                        System.out.print("  ");
                    else
                    System.out.print("* ");
                }
            }
           else if(row==1){
                for (int h=1;h<=5;h++) {
                    if(h==5){
                        System.out.print("  ");
                    }
                    else
                    System.out.print("* ");
                }
            }
            else {
                for (int col = 1; col <= 5; col++) {
                    if (col == 1||col==5&&row<=4)
                        System.out.print("* ");
                    else if(row-col==2)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    private void pattern_M() {
        for(int row=1;row<=7;row++){
            for(int col=1;col<=7;col++){
                if(col==1||col==7||(row==col)&&row<=4||(row+col==8)&&row<=4)
                    System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        re++;
        m++;
        pattern_A();

    }

    private void pattern_U() {
        for(int row=1;row<=7;row++){
            if(row==7){
                for(int h=1;h<=7;h++){
                    if(h==7||h==1)
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
        System.out.println();
        pattern_M();
    }

    private void pattern_K() {
        for(int row=1;row<=7;row++){
            for (int col=1;col<=7;col++){
                if(col==1||(row+col)==5||(row-col)==3)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        pattern_U();
    }

    private void pattern_T() {
        for(int row=1;row<=7;row++){
            if(row==1){
                for (int h=1;h<=7;h++){
                    System.out.print("* ");
                }
            }
            else {
                for (int col = 1; col <= 7; col++) {
                    if (col == 4)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();

        }
        System.out.println();
        h++;
        pattern_H();
    }

    private void pattern_N() {
        for(int row=1;row<=7;row++){
            for(int col=1;col<=7;col++){
                if(col==1||col==7||row==col)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        pattern_T();
    }

    private void pattern_W() {
        for (int row=7;row>=1;row--){
            for(int col=1;col<=7;col++){
                if(row==col&&row<=4||col==1||col==7 || row<=4&&(row+col)==8)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
       re++;
       pattern_A();
    }

    private void pattern_H() {
        for (int row=1;row<=7;row++){
            if(row==4){
                for (int h=1;h<=7;h++){
                    System.out.print("* ");
                }
            }
            else {
                for (int col = 1; col <= 7; col++) {
                    if (col == 1 || col == 7)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        if(h==1){
            pattern_K();
        }
        else
        pattern_W();
    }

    private void pattern_S() {
        for (int row=1;row<=7;row++){
            if(row==1||row==7||row==4){
                for (int h=1;h<=7;h++) {
                    if(h==1||h==7)
                        System.out.print("  ");
                    else
                    System.out.print("* ");
                }
            }
            else {
                for (int col = 1; col <= 7; col++) {
                    if(col==1&&row<4 || col==7 && row>4)
                    System.out.print("* ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        pattern_H();
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
        System.out.println();
        if(re==1) {
            pattern_S();
        }
        else if(m==1)
            pattern_R();
        else
            pattern_N();


    }

    private void pattern_Yashwanth_kumar() {
        for (int row=1;row<=7;row++){
            for (int col=1;col<=7;col++){
                if((row==col)&&(row<=4)||(row+col==8)&&(row<=4))
                System.out.print("* ");
                else if((row>=5)&&(col==4))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
        re++;
        pattern_A();

    }


}
