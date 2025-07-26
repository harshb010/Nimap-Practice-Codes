class Pattern1 {
    public static void main(String[] args) {
        int rows = 5;
        for(int i=0;i<rows;i++)
        {
            char ch = 65;
            int num = 1;
            for(int j=i;j<rows;j++)
            {
                if(i%2==0)
                {
                    System.out.print(ch++);
                }else
                {
                    System.out.print(num++);
                }
            }
            System.out.println("");
        }
    }
}
