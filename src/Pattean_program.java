public class Pattean_program {
    public static void main(String[] args) {
        Pattean_program obj = new Pattean_program();
       // obj.pattean_I();
        //obj.pattean_T();
       // obj.pattean_C();
       // obj.pattean_O();
        //obj.pattean_D();
        //obj.pattean_P();
        // obj.pattean_R();
       // obj.pattean_B();
       // obj.pattean_8();

    }

    private void pattean_8() {
        for(int row=1;row<=7; row++)
        {
            if(row==1 || row==7)
            {
                for(int star=1; star<=6;star++)
                {
                    if(star==1)
                        System.out.print("  ");
                    else
                        System.out.print("* ");
                }
            }
            else
            {
                for(int star=1; star<=7;star++)
                {
                    if(star==1 || star==7)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }

            }
            System.out.println();
        }
        for(int row=1; row<=5; row++)
        {
            System.out.print("* ");
            for(int space=1; space<=5; space++)
            {
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }
        for(int star=1;star<=6; star++)
        {
            if(star==1)
                System.out.print("  ");
            else
                System.out.print("* ");
        }
    }

    private void pattean_B() {
        for(int star=1; star<=6; star++)
        {
            System.out.print("* ");
            for(int space=1; space<=5; space++)
            {
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }

    }

    private void pattean_R() {
        pattean_D();
        for(int star=1; star<=6; star++)
        {
            System.out.print("* ");
            for(int space=1; space<=5; space++)
            {
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }
    }

    private void pattean_P() {
        pattean_D();
        for(int star=1; star<=6; star++)
        {
            System.out.println("* ");
        }
    }

    private void pattean_D() {
        for(int row = 1; row<=7;row++)
        {
            if(row==1 || row==7)
            {
                for(int hash=1; hash<=7; hash++)
                {
                    if(hash==1||hash==7)
                        System.out.print("");

                    else
                        System.out.print("* ");
                }
            }
            else {
                for(int star=1; star<=7; star++)
                {
                    if(star==1)
                    {
                        System.out.print("* ");
                    } else if (star==7) {
                        System.out.print(" *");

                    } else
                        System.out.print("  ");
                }
            }
            System.out.println();

        }

    }

    private void pattean_O() {
        for(int row = 1; row<=7;row++)
        {
            if(row==1 || row==7)
            {
                for(int hash=1; hash<=7; hash++)
                {
                    if(hash==1||hash==7)
                        System.out.print("");

                    else
                        System.out.print("* ");
                }
            }
            else {
                for(int star=1; star<=7; star++)
                {
                    if(star==1)
                    {
                        System.out.print("* ");
                    } else if (star==7) {
                        System.out.print(" *");

                    } else
                        System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    private void pattean_C() {
        for(int row = 1; row<=7;row++)
        {
            if(row==1 || row==7)
            {
                for(int hash=1; hash<=7; hash++)
                {
                    if(hash==1||hash==7)
                        System.out.print(" ");
                    else
                    System.out.print("* ");
                }
            }
            else {
                for(int star=1; star<=7; star++)
                {
                    if(star==1)
                    {
                        System.out.print("* ");
                    }
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    private void pattean_T() {
        for(int row = 1; row<=7;row++)
        {
            if(row==1 )
            {
                for(int hash=1; hash<=7; hash++)
                {
                    System.out.print("* ");
                }
            }
            else {
                for(int star=1; star<=7; star++)
                {
                    if(star==4)
                    {
                        System.out.print("* ");
                    }
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    private void pattean_I() {
        for(int row = 1; row<=7;row++)
        {
            if(row==1 || row==7)
            {
                for(int hash=1; hash<=7; hash++)
                {
                    System.out.print("* ");
                }
            }
            else {
                for(int star=1; star<=7; star++)
                {
                    if(star==4)
                    {
                        System.out.print("* ");
                    }
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
