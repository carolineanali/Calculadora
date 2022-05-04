package UniespPoo;

public class Main {

    public static void calculos(CalculoMatematico c, double a, double b){
        System.out.println(c.calculo(a,b));
    }

    public static void main(String[] args){
        calculos(new Adicao(), 500, 100);
        calculos(new Subtracao(), 32, 5);
        calculos(new Multiplicacao(), 10, 5);
        calculos(new Divisao(), 10, 2);
    }
}
