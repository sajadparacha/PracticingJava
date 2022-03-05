package polymorphism;

 class Parent {
    public static void foo(){
        System.out.println("This is from parent foo");
    }
    public void bar(){
        System.out.println("This is from parent bar");
    }
}

class Child extends Parent{

    public static void foo(){
        System.out.println("This is from child foo");
    }
    public void bar(){
        System.out.println("This is from child bar");
    }

    public static void main (String args[]){
        Parent parent=new Child();
        Child child= new Child();

       parent.foo();
       child.foo();

       parent.bar();
       child.bar();


        int i=100;
        System.out.println("i-- "+i--);
        System.out.println("--i "+--i);
        System.out.println("i = "+ (i-- - --i));
    }
}