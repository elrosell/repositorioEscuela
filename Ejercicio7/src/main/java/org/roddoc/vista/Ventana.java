package org.roddoc.vista;

import org.gerdoc.historial.Historiales;
import org.roddoc.model.figura.Circulo;
import org.roddoc.model.figura.Cuadrado;
import org.roddoc.model.figura.Equilatero;
import org.roddoc.model.figura.Figura;
import org.roddoc.model.figura.Hexagono;
import org.roddoc.model.figura.Rectangulo;
import org.roddoc.model.figura.Romboide;
import org.roddoc.model.figura.figura2.Escaleno;
import org.roddoc.model.figura.figura2.Isosceles;
import javax.swing.*;

public class Ventana extends JFrame implements Ejecutable {
    private static Ventana ventana;
    private JComboBox<String> comboFigura;
    private JLabel label1, label2, label3, label4, label5;
    private JTextField tf1, tf2, tf3, tf4, tf5;
    private JButton calcularButton;

    private Ventana() {
        super("Programa de Figuras");
        init();
    }

    private void init() {
        getContentPane().setLayout(null);
        setBounds(100, 100, 400, 350);
        comboFigura = new JComboBox<>(new String[]{"Cuadrado", "Equilatero", "Isosceles", "Escaleno", "Circulo", "Hexagono", "Romboide", "Rectángulo"});
        comboFigura.setBounds(10, 10, 150, 25);
        getContentPane().add(comboFigura);
        label1 = new JLabel();
        label1.setBounds(10, 50, 100, 25);
        getContentPane().add(label1);
        tf1 = new JTextField();
        tf1.setBounds(120, 50, 100, 25);
        getContentPane().add(tf1);
        label2 = new JLabel();
        label2.setBounds(10, 90, 100, 25);
        getContentPane().add(label2);
        tf2 = new JTextField();
        tf2.setBounds(120, 90, 100, 25);
        getContentPane().add(tf2);
        label3 = new JLabel();
        label3.setBounds(10, 130, 100, 25);
        getContentPane().add(label3);
        tf3 = new JTextField();
        tf3.setBounds(120, 130, 100, 25);
        getContentPane().add(tf3);
        label4 = new JLabel();
        label4.setBounds(10, 170, 100, 25);
        getContentPane().add(label4);
        tf4 = new JTextField();
        tf4.setBounds(120, 170, 100, 25);
        getContentPane().add(tf4);
        label5 = new JLabel();
        label5.setBounds(10, 210, 100, 25);
        getContentPane().add(label5);
        tf5 = new JTextField();
        tf5.setBounds(120, 210, 100, 25);
        getContentPane().add(tf5);
        calcularButton = new JButton("Calcular");
        calcularButton.setBounds(10, 250, 100, 25);
        getContentPane().add(calcularButton);
        comboFigura.addActionListener(e -> updateFields());
        calcularButton.addActionListener(e -> calcularFigura());
        updateFields();
    }

    private void updateFields() {
        String fig = (String) comboFigura.getSelectedItem();
        if (fig.equals("Cuadrado")) {
            label1.setText("Lado:");
            label1.setVisible(true);
            tf1.setVisible(true);
            label2.setVisible(false);
            tf2.setVisible(false);
            label3.setVisible(false);
            tf3.setVisible(false);
            label4.setVisible(false);
            tf4.setVisible(false);
            label5.setVisible(false);
            tf5.setVisible(false);
        } else if (fig.equals("Circulo")) {
            label1.setText("Radio:");
            label1.setVisible(true);
            tf1.setVisible(true);
            label2.setVisible(false);
            tf2.setVisible(false);
            label3.setVisible(false);
            tf3.setVisible(false);
            label4.setVisible(false);
            tf4.setVisible(false);
            label5.setVisible(false);
            tf5.setVisible(false);
        } else if (fig.equals("Hexagono")) {
            label1.setText("Lado:");
            label1.setVisible(true);
            tf1.setVisible(true);
            label2.setVisible(false);
            tf2.setVisible(false);
            label3.setVisible(false);
            tf3.setVisible(false);
            label4.setVisible(false);
            tf4.setVisible(false);
            label5.setVisible(false);
            tf5.setVisible(false);
        } else if (fig.equals("Rectángulo") || fig.equals("Romboide")) {
            label1.setText("Base:");
            label2.setText("Altura:");
            label1.setVisible(true);
            tf1.setVisible(true);
            label2.setVisible(true);
            tf2.setVisible(true);
            label3.setVisible(false);
            tf3.setVisible(false);
            label4.setVisible(false);
            tf4.setVisible(false);
            label5.setVisible(false);
            tf5.setVisible(false);
        } else if (fig.equals("Equilatero")) {
            label1.setText("Base:");
            label2.setText("Altura:");
            label3.setText("Lado:");
            label1.setVisible(true);
            tf1.setVisible(true);
            label2.setVisible(true);
            tf2.setVisible(true);
            label3.setVisible(true);
            tf3.setVisible(true);
            label4.setVisible(false);
            tf4.setVisible(false);
            label5.setVisible(false);
            tf5.setVisible(false);
        } else if (fig.equals("Isosceles")) {
            label1.setText("Base:");
            label2.setText("Altura:");
            label3.setText("Lado 1:");
            label4.setText("Lado 2:");
            label1.setVisible(true);
            tf1.setVisible(true);
            label2.setVisible(true);
            tf2.setVisible(true);
            label3.setVisible(true);
            tf3.setVisible(true);
            label4.setVisible(true);
            tf4.setVisible(true);
            label5.setVisible(false);
            tf5.setVisible(false);
        } else if (fig.equals("Escaleno")) {
            label1.setText("Base:");
            label2.setText("Altura:");
            label3.setText("Lado 1:");
            label4.setText("Lado 2:");
            label5.setText("Lado 3:");
            label1.setVisible(true);
            tf1.setVisible(true);
            label2.setVisible(true);
            tf2.setVisible(true);
            label3.setVisible(true);
            tf3.setVisible(true);
            label4.setVisible(true);
            tf4.setVisible(true);
            label5.setVisible(true);
            tf5.setVisible(true);
        }
    }

    private void calcularFigura() {
        String fig = (String) comboFigura.getSelectedItem();
        Figura figura = null;
        try {
            switch (fig) {
                case "Cuadrado":
                    double lado = Double.parseDouble(tf1.getText());
                    figura = new Cuadrado(lado);
                    break;
                case "Circulo":
                    double radio = Double.parseDouble(tf1.getText());
                    figura = new Circulo(radio);
                    break;
                case "Hexagono":
                    double ladoH = Double.parseDouble(tf1.getText());
                    figura = new Hexagono(ladoH);
                    break;
                case "Rectángulo":
                    double baseR = Double.parseDouble(tf1.getText());
                    double alturaR = Double.parseDouble(tf2.getText());
                    figura = new Rectangulo(baseR, alturaR);
                    break;
                case "Romboide":
                    double baseRo = Double.parseDouble(tf1.getText());
                    double alturaRo = Double.parseDouble(tf2.getText());
                    figura = new Romboide(baseRo, alturaRo);
                    break;
                case "Equilatero":
                    double baseE = Double.parseDouble(tf1.getText());
                    double alturaE = Double.parseDouble(tf2.getText());
                    double ladoE = Double.parseDouble(tf3.getText());
                    figura = new Equilatero(baseE, alturaE, ladoE);
                    break;
                case "Isosceles":
                    double baseI = Double.parseDouble(tf1.getText());
                    double alturaI = Double.parseDouble(tf2.getText());
                    double ladoI1 = Double.parseDouble(tf3.getText());
                    double ladoI2 = Double.parseDouble(tf4.getText());
                    figura = new Isosceles(baseI, alturaI, ladoI1, ladoI2);
                    break;
                case "Escaleno":
                    double baseEs = Double.parseDouble(tf1.getText());
                    double alturaEs = Double.parseDouble(tf2.getText());
                    double ladoE1 = Double.parseDouble(tf3.getText());
                    double ladoE2 = Double.parseDouble(tf4.getText());
                    double ladoE3 = Double.parseDouble(tf5.getText());
                    figura = new Escaleno(baseEs, alturaEs, ladoE1, ladoE2, ladoE3);
                    break;
            }
            JOptionPane.showMessageDialog(this, "Área: " + figura.area() + "\nPerímetro: " + figura.perimetro(), "Resultados", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en los datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static Ventana getInstance() {
        if (ventana == null) {
            ventana = new Ventana();
        }
        return ventana;
    }

    @Override
    public void run() {
        setVisible(true);
    }

    @Override
    public void addHistoriales(Historiales historiales) {

    }
}
