package es1;

public class es1 {
    public static void main(String[] args) {
        System.out.println(stringaPariDispari("ciao"));
        System.out.println(annoBisestile(2001));
    }
    public static boolean stringaPariDispari(String a) {
        return a.length() % 2 == 0;
    }
    public static boolean annoBisestile(int num){
        return (num % 4 == 0) || (num % 100 == 0 && num % 400 == 0);
}
}
