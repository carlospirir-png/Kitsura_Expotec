package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PantallaCarga extends JFrame {

    private JPanel panelOscuro;
    private JPanel panelOscuro2;

    private FondoPanelSemi fondo;

    private JLabel lblFrase;
    private JLabel lblDato;

    public PantallaCarga() {

        fondo = new FondoPanelSemi("/img/FondoPrincipal2.png");
        setContentPane(fondo);

        setTitle("Pantalla de Carga");
        setSize(1920, 1080);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fondo.setLayout(null);

        crearComponentes();

        setVisible(true);
    }

    private void crearComponentes() {


        panelOscuro2 = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);

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

        panelOscuro2.setBounds(
                0,
                0,
                1920,
                180);

        fondo.add(panelOscuro2);


        lblFrase = new JLabel(
                "\"NO ES MAGIA, ES MENTE\"",
                SwingConstants.CENTER);

        lblFrase.setFont(
                new Font(
                        "Segoe UI",
                        Font.BOLD,
                        46));

        lblFrase.setForeground(
                new Color(
                        230,
                        230,
                        230));

        lblFrase.setBounds(
                460,
                50,
                1000,
                70);

        panelOscuro2.add(lblFrase);


        panelOscuro = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);

                Graphics2D g2 = (Graphics2D) g.create();

                g2.setColor(
                        new Color(
                                0,
                                0,
                                0,
                                220));

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

        panelOscuro.setBounds(
                0,
                820,
                1920,
                260);

        fondo.add(panelOscuro);


        lblDato = new JLabel(
                "¿Sabías qué?... Los zorros pueden escuchar pequeños sonidos a más de 30 metros.",
                SwingConstants.CENTER);

        lblDato.setForeground(
                Color.WHITE);

        lblDato.setFont(
                new Font(
                        "Segoe UI",
                        Font.PLAIN,
                        28));

        lblDato.setBounds(
                210,
                50,
                1500,
                50);

        panelOscuro.add(lblDato);
    }

    public static void main(String[] args) {

        new PantallaCarga();
    }
}