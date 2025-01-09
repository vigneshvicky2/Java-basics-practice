public class maths {
   static void volume_cuboid(int l,int b ,int h){
            System.out.println("voume of Cuboid is : " + (l*b*h));
    }
     void perimiter_cuboid(int l,int b,int h ){
        System.out.println("perimeter Cuboid is : " +(4* (l+b+h)));
    }
     static int sum(int a , int b){
        return a+b;
    }
    public static void main(String[] args) {
        int l = 2;
        int b = 2;
        int h = 2;
        volume_cuboid(l, b, h);
        // maths obj = new maths();
        // obj.perimiter_cuboid(5,6,7);
    }
}
