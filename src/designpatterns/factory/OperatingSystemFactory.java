package designpatterns.factory;

public class OperatingSystemFactory {
    public static OperatingSystem creatOS(String osType){
        if(osType.equals("a")){
            return new AndroidOS();
        }
        else if(osType.equals("i")){
            return new IOSOS();
        }
        else if(osType.equals("w")) {
            return new WindowsOs();
        }
        return null;
    }

    public static void main (String args[]){
        creatOS("a").specs();
        creatOS("i").specs();
        creatOS("w").specs();
    }
}
