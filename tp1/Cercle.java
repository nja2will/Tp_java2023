public class Cercle {
    public static final double  pi =3.159265;
    public static void main (String[] args){

        for (int i=1;i<=50;i++){
            System.out.println("le périmetre du cercle de rayon"+i+"est :"+perimetre(i)+"l'aire de ce cercle est "+air(i));
        }

    }
    public static double perimetre(double rayon){
        return 2*pi*rayon;
    }
    public static double air(double rayon){
        return pi*rayon*rayon;
    }
}