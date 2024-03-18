package matematica;
public class Matematica {
    public static int minimo (int x,int y){
        if (x<y)
            return x;
        else
            return  y;
    }
    public static double minimo (double x,double y){
        if (x<y)
            return x;
        else
            return  y;
    }
    public static double minimo (double x,double y,double z){
        if (x<y && x<z)
            return x;
        else if (y<x && y<z)
            return  y;
        else
            return z;
    }
    public static int massimo (int x,int y){
        if (x>y)
            return x;
        else
            return  y;
    }
    public static double massimo (double x,double y){
        if (x>y)
            return x;
        else
            return  y;
    }
    public static double massimo (double x,double y, double z){
        if (x>y && x>z)
            return x;
        else if (y>x && y>z)
            return  y;
        else
            return z;
    }
    public static int assoluto (int x){
        if (x<0)
            return -x;
        else
            return x;
    }
    public static double assoluto (double x){
        if (x<0)
            return -x;
        else
            return x;
    }
    public static int segno (int x){
        if (x<0)
            return -1;
        else if (x>0)
            return 1;
        else
            return 0;
    }
    public static double segno (double x){
        if (x<0)
            return -1.0;
        else if (x>0)
            return 1.0;
        else
            return 0.0;
    }
    public static boolean isPari (int x){
        if (x%2==0)
            return true;
        else
            return false;
    }
    public static boolean isDispari (int x){
        if (x%2!=0)
            return true;
        else
            return false;
    }
    public static int multiplo (int x,int y){
        if (x%y==0)
            return 1;
        else if (y%x==0)
            return  2;
        else
            return 0;
    }
    public static int potenzaInteri (int x,int y){
        int potenza=x;
        for (int i=1;i<y;i++){
            potenza=potenza*x;
        }
        return potenza;
    }
    public static boolean isPrimo (int x){
        if (x==1)
            return false;
        else {
            boolean isPrimo=true;
            for (int i=2;i<x;i++){
                if (x%i==0){
                    isPrimo=false;
                    break;
                }
            }
            return isPrimo;
        }
    }
}