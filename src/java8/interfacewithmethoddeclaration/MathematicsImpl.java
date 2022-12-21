package java8.interfacewithmethoddeclaration;

public class MathematicsImpl implements Mathematics{
    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }
    public static void main(String...args){
        Mathematics mathematics=new MathematicsImpl();
        System.out.println(mathematics.multiply(20,10));
    }
}
