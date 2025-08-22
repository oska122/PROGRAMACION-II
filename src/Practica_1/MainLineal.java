package Practica_1;



public class MainLineal {
    public static void main(String[] args) {
        double a1 = 1.0, b1 = 2.0, c1 = 2.0, d1 = 4.0, e1 = 4.0, f1 = 5.0;
        EcuacionLineal eq1 = new EcuacionLineal(a1, b1, c1, d1, e1, f1);

        if (eq1.tieneSolucion()) {
            System.out.printf("Ejemplo 1 x = %.2f, y = %.2f\n", eq1.getX(), eq1.getY());
        } else {
            System.out.println("Ejemplo 1 La ecuación no tiene solución");
        }

    }
}
//69786801