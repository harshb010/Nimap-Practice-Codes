

enum operation{
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public <T extends Number> double value(T a, T b)
    {
        switch(this)
        {
            case ADD :
            return a.doubleValue()+b.doubleValue();
            case MULTIPLY: return a.doubleValue()*b.doubleValue();
            case DIVIDE: return a.doubleValue()/b.doubleValue();
            case SUBTRACT: return a.doubleValue()-b.doubleValue();
            default:throw new AssertionError("Not expected"+ this);
        }

    }


}

public class EnumGenerics {
    public static void main(String[] args) {
      double res1 = operation.ADD.value(5,8);
      double res2 = operation.DIVIDE.value(10,5);
      double res3 =operation.SUBTRACT.value(9,4);
      double res4 = operation.MULTIPLY.value(4,3);
        System.out.println(res1+"  "+res2+"  "+res3+"  "+res4);
    }

}
