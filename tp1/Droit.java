public class Droit {
    public static void main(String[] args){
        System.out.println(appartient(1,0,1,1,0));
        droit(1,2,5,6);
    }
    public static void droit(double x1,double y1,double x2,double y2){
        double b = -(x2-x1);
        double a = y2-y1;
        double c = a*x1+b*x2;
        System.out.println("a= "+a+" , b =  "+b+" et c = "+c);
    }
    public static boolean appartient (double a,double b,double c,double x,double y){
        if (c==(a*x+b*y)){
            return true;
        }
        else {
            return false;
        }

    }

}