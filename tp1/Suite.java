public class Suite {
    public static void main(String[] args ){
        showSuiteFibonacci(5);
        suintArithmetique(2,3,3);
        suintGeometrique(2,3,3);
    }
    public static void suintArithmetique(int depart,int raison, int k){
        System.out.println("les "+k+" terme d'une suite arrithmétique de raison "
                +raison+" dont le premier terme est "+depart+" sont ");
       for( int i=0;i<=k-1;i++){
           System.out.println("terme: "+i+" est "+depart+i*raison);
        }
    }
    public static void suintGeometrique(int depart,int raison, int k){
        System.out.println("les "+k+" terme d'une suite géometrie  de raison "
                +raison+" dont le premier terme est "+depart+" sont ");
        for( int i=0;i<=k-1;i++){
            System.out.println("terme: "+i+" est "+depart*expo(raison,i));
        }
    }
    public static int suitFibonacci(int k){
        if (k==0 || k==1){
            return 1;
        }
        else {
            return suitFibonacci(k-2)+suitFibonacci(k-1);
        }

    }
    public static int expo(int q,int n){
        int expogo=1;
        for (int i=0;i<= n-1;i++){
            expogo=expogo*q;
        }
        return expogo;
    }
    public static void showSuiteFibonacci(int k) {
        System.out.println("les "+k+" terme de la suite de fibonacci sont : ");
        for(int i=1 ; i<= k;i++){
            System.out.println("terme: "+i+" est "+suitFibonacci(i));
        }
    }

}