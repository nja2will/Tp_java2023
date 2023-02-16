public class Droit {
    public static void main(String[] args){
        System.out.println(appartient(1,0,1,1,0));
    }
    public static void droit(double x1,double y1,double x2,double y2){


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