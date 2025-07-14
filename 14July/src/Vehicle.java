import java.util.ArrayList;
import java.util.List;

class Vehicl {
    public int getWheels()
    {
        return 2;
    }

}
class Engine extends Vehicl
{
    public Boolean hasEngine()
    {
        return true;
    }
}

class MotorCycle extends Engine
{

}

class Car extends Engine
{
    public int getWheels(){
        return 4;
    }

}

class Bicycle extends Vehicl{

}

public class Vehicle{
    public static void main(String[] args) {
        List<Vehicl> list = new ArrayList<>();
        list.add(new Car());
        list.add(new MotorCycle());
        list.add(new Bicycle());

        for(Vehicl veh : list)
        {
            System.out.println(veh.getWheels());
        }
    }
}

