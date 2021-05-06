public class Calculator {
    //Implement +,-,*,/
    public int x;
    public int y;
    public Calculator(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public int multiply(int one, int two ){
        return one * two;
    }
    public float divide(int one, int two ){
        if(two!=0){
            return one/two;
        }else{
            return 0; //temporary way of dealing with invalid case
        }
    }
    public int subtract(int one, int two ){
        return one - two;
    }
    public int add(int one, int two ){
        return one + two;
    }

}
