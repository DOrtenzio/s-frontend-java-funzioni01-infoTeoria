package matematica;

public class TestMatematica {
    public static void main (String [] args){
        int x=1;
        int y=2;
        System.out.println("Il minimo tra 1 e 2 è "+Matematica.minimo(x,y));
        System.out.println("Il massimo tra 1 e 2 è "+Matematica.massimo(x,y));
        double u=1,r=2,w=3;
        System.out.println("Il minimo tra 1,2 e 3 è "+Matematica.minimo(u,r,w));
        System.out.println("Il massimo tra 1,2 e 3 è "+Matematica.massimo(u,r,w));
        int ass=-99;
        double assd=-88.99;
        System.out.println("I valori assoluti di -99 e -88.99 sono:"+Matematica.assoluto(ass)+" e "+Matematica.assoluto(assd));
        System.out.println("I segni di -99 e -88.99 sono:"+Matematica.segno(ass)+" e "+Matematica.segno(assd));
        int p=2;
        int d=6;
        System.out.println("Verifichiamo se è pari "+Matematica.isPari(p)+" e d è dispari invece ?: "+Matematica.isDispari(d));
        int n1=3,n2=9;
        System.out.println("Verifichiamo se 3 e 9 sono multipli dovrebbe dare 2: "+Matematica.multiplo(n1,n2));
        System.out.println("Facciamo 3^9 = "+Matematica.potenzaInteri(n1,n2));
        System.out.println("3 è primo? = "+Matematica.isPrimo(n1)+ " e 9 ? = "+Matematica.isPrimo(n2));
    }
}
