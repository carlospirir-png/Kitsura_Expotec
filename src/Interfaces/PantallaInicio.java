package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PantallaInicio extends JFrame {

    private FondoPanelSemi fondo;

    private PanelDecoracion panelDecoracion;

    private JLabel lblLogo;
    private JLabel lblFrase;

    public PantallaInicio() {

        fondo = new FondoPanelSemi("/img/FondoPrincipal2.png");
        setContentPane(fondo);

        setTitle("Kitsura");
        setSize(1366, 768);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fondo.setLayout(null);

        crearComponentes();

        setVisible(true);
    }

    private void crearComponentes() {



        panelDecoracion = new PanelDecoracion();
        panelDecoracion.setBounds(330, 0, 700, 700);

        fondo.add(panelDecoracion);

        FondoPanelSemi panelFrase =
        new FondoPanelSemi(
                new Color(0, 0, 0, 140));

panelFrase.setBounds(280, 620, 800, 70);
panelFrase.setLayout(null);

fondo.add(panelFrase);

        lblLogo = new JLabel();

        ImageIcon logoIcon =
                new ImageIcon(
                        getClass().getResource(
                                "/img/logoKitsura3.png"));

        Image logoEscalado =
                logoIcon.getImage().getScaledInstance(
                        570,
                        600,
                        Image.SCALE_SMOOTH);

        lblLogo.setIcon(new ImageIcon(logoEscalado));

        lblLogo.setBounds(
                400,
                100,
                570,
                600);

        fondo.add(lblLogo);

        // Forzar que el logo quede encima
        fondo.setComponentZOrder(lblLogo, 0);


        lblFrase = new JLabel(
                "\"No es magia, es mente\"",
                SwingConstants.CENTER);

        lblFrase.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        40));

lblFrase.setForeground(new Color(196, 221, 227));

        lblFrase.setBounds(
                250,
                620,
                850,
                60);

        fondo.add(lblFrase);

        fondo.setComponentZOrder(lblFrase, 0);
    }

    public static void main(String[] args) {

        new PantallaInicio();
    }
}