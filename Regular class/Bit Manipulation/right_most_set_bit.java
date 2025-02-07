public class right_most_set_bit{
    public static void main(String[] args) {
        int n =12;
        //how it works
        //1100 -->12
        //0011 --> invert 
        //0001 --> +1
        //------
        //0100 --> -12
        //1100 -->12
        //----  --> do and operation
        //0100 --> 4  
        System.out.println(n&-n);
    }
}