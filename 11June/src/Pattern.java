class Pattern {
    public static void main(String[] args) {
        int rows = 5;

        int num = 1;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<rows-i;j++)
            {
                if(j%2==0)
                {
                    System.out.print(num);
                }else
                {
                    System.out.print("*");
                }
            }
            num = num + 2;
            System.out.println("");
        }
    }
}