public class StringManipulation {


    public void swapValues(int a,int b){
        int c=b;
        b=a;
        a=c;


        System.out.println("Swaped values are a="+a+"  b="+b);

    }


    public static void main (String args[]){

        String a="Sajjad";
        int lengthOfString=a.length();
        char[] b=a.toCharArray();
        StringBuilder c= new StringBuilder("");

        for(int i=lengthOfString-1;i>=0;i-- ){
           // c+=b[i];
            c.append(b[i]);
        }

        System.out.println(c);

        StringManipulation stringManipulation=new StringManipulation();
        stringManipulation.swapValues(1,2);
    }
}
