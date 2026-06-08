package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.SwingConstants;

public class PantallaCarga extends JFrame {

    private JPanel panelOscuro;
    private FondoPanelSemi fondo;
    private JLabel lblGif;
    private JLabel lblFrase;
    private JLabel lblDato;
    private JPanel panelOscuro2;

    public PantallaCarga() {
        fondo = new FondoPanelSemi("/img/FondoPrincipal2.png");
        setContentPane(fondo);

        setTitle("Pantalla de Carga");
        setSize(1920, 1080);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fondo.setLayout(null);

        crearComponentes();

        setVisible(true);
    }

    private void crearComponentes() {

        lblFrase = new JLabel(
                "\"No es magia, es mente\"",
                SwingConstants.CENTER);

        lblFrase.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        40));

        lblFrase.setForeground(
                new Color(
                        220,
                        220,
                        220));

        lblFrase.setBounds(
                420,
                50,
                700,
                60);

        fondo.add(lblFrase);

        lblDato = new JLabel(
                "¿Sabías qué?... Los zorros pueden escuchar pequeños sonidos a más de 30 metros.",
                SwingConstants.CENTER);

        lblDato.setOpaque(true);

        lblDato.setBackground(
                new Color(
                        0,
                        0,
                        0,
                        180));

        lblDato.setForeground(
                Color.WHITE);

        lblDato.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        24));

        lblDato.setBounds(
                100,
                700,
                1366,
                40);

        fondo.add(lblDato);

        lblGif = new JLabel();

        ImageIcon gif
                = new ImageIcon(
                        getClass().getResource(
                                "/img/carga3.gif"));

        lblGif.setIcon(gif);

        lblGif.setBounds(
                0,
                580,
                1540,
                100);

        lblGif.setLayout(null);

        fondo.add(lblGif);

         panelOscuro2 = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {

                Graphics2D g2 = (Graphics2D) g.create();

                g2.setColor(new Color(0, 0, 0, 170));

                g2.fillRoundRect(
                        0,
                        0,
                        getWidth(),
                        getHeight(),
                        25,
                        25);

                g2.dispose();
            }
        };

        panelOscuro2.setOpaque(false);
        panelOscuro2.setLayout(null);
        panelOscuro2.setBounds(0, 0, 1920, 150);

        fondo.add(panelOscuro2);

        
        panelOscuro = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {

                Graphics2D g2 = (Graphics2D) g.create();

                g2.setColor(Color.BLACK);

                g2.fillRoundRect(
                        0,
                        0,
                        getWidth(),
                        getHeight(),
                        25,
                        25);

                g2.dispose();
            }
        };

        panelOscuro.setOpaque(false);
        panelOscuro.setLayout(null);
        panelOscuro.setBounds(0, 680, 1920, 130);

        fondo.add(panelOscuro);

    }

    public static void main(String[] args) {

        new PantallaCarga();
    }
}
