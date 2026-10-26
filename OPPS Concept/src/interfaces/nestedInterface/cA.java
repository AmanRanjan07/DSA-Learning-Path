package interfaces.nestedInterface;

public class cA {
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}

class cB implements cA.NestedInterface{
    @Override
    public boolean isOdd(int num){ return (num & 1) == 1;
    }
}
