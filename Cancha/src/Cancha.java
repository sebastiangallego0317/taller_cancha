import javax.swing.JOptionPane;

class Cancha {
    double ladoA;
   double ladoB;
   double costoPorMetroCuadrado;

    public void ingresarDatos() {
        ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del Lado A de la cancha (en metros):"));
        ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del Lado B de la cancha (en metros):"));
        costoPorMetroCuadrado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo por metro cuadrado de la grama:"));
    }

    public void calcularCosto() {
        double areaCancha = ladoA * ladoB;
        double costoGramilla = areaCancha * costoPorMetroCuadrado;

        JOptionPane.showMessageDialog(null, "El costo de cambiar la grama de la cancha es: " + costoGramilla + " dólares.");
    }
}
