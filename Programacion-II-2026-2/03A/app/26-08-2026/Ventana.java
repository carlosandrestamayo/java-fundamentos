import javax.swing.*;

public class Ventana {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Mi aplicación");

        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton boton = new JButton("Grupo 03A");

        ventana.add(boton);
        ventana.setVisible(true);
    }
}