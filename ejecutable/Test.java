package ejecutable;

import javax.swing.JOptionPane;

import modelo.Circulo;
import modelo.Rectangulo;

public class Test {
    public static void main(String[] args) {
        //Rectangulo
        double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base: " ));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura: " ));
        Rectangulo rectangulo = new Rectangulo(base, altura);
        rectangulo.calcular();
        JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + rectangulo.getArea());
        JOptionPane.showMessageDialog(null, "El perimetro del rectangulo es: " + rectangulo.getPerimetro());

        //Circulo
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio: " ));
        Circulo circulo = new Circulo(radio);
        circulo.calcular();
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + circulo.getArea());
        JOptionPane.showMessageDialog(null, "El perimetro del circulo es: " + circulo.getPerimetro());
        System.exit(0);
    }
}