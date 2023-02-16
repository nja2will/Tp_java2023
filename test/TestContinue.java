public class TestContinue {
    public static void main(String[] args){
        System.out.println(sommePaire(10));
        System.out.println("hello world ");
    }
    public static int sommePaire(int end){
        int somme = 0;
        for (int i= 0;i<= end ; i++){
            if(i%2 == 0)
                continue;
            somme+= i;
        }
        return somme;
    }
}