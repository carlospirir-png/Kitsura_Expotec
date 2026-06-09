package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PantallaPrincipal extends JFrame {

    private FondoPanelSemi fondo;

    private JPanel panelMenu;

    private JLabel lblLogo;
    private JLabel lblMascota;
    private JLabel lblTitulo;

    private JLabel lblIconPerfil;
    private JLabel lblIconJuego;
    private JLabel lblIconEstadisticas;
    private JLabel lblIconSalir;

    private JButton btnPerfil;
    private JButton btnMinijuegos;
    private JButton btnEstadisticas;
    private JButton btnSalir;

    public PantallaPrincipal() {

        fondo = new FondoPanelSemi("/img/fondoDosK.png");
        setContentPane(fondo);

        setTitle("Página Principal");
        setSize(1920, 1080);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fondo.setLayout(null);

        crearComponentes();

        setVisible(true);
    }

    private void crearComponentes() {


        lblLogo = new JLabel();

        ImageIcon logoIcon = new ImageIcon(
                getClass().getResource("/img/LogoKitsura2.png"));

        Image logoEscalado = logoIcon.getImage()
                .getScaledInstance(
                        450,
                        220,
                        Image.SCALE_SMOOTH);

        lblLogo.setIcon(
                new ImageIcon(
                        logoEscalado));

        lblLogo.setBounds(
                80,
                10,
                450,
                220);

        fondo.add(lblLogo);


        lblMascota = new JLabel();

        ImageIcon mascotaIcon = new ImageIcon(
                getClass().getResource("/img/ZorroPrincipal.png"));

        Image mascotaEscalada = mascotaIcon.getImage()
                .getScaledInstance(
                        750,
                        750,
                        Image.SCALE_SMOOTH);

        lblMascota.setIcon(
                new ImageIcon(
                        mascotaEscalada));

        lblMascota.setBounds(
                40,
                220,
                750,
                750);

        fondo.add(lblMascota);


        panelMenu = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {

                Graphics2D g2 = (Graphics2D) g.create();

                g2.setColor(
                        new Color(
                                0,
                                0,
                                0,
                                120));

                g2.fillRoundRect(
                        0,
                        0,
                        getWidth(),
                        getHeight(),
                        40,
                        40);

                g2.dispose();
            }
        };

        panelMenu.setOpaque(false);
        panelMenu.setLayout(null);

        panelMenu.setBounds(
                850,
                120,
                900,
                760);

        fondo.add(panelMenu);


        lblTitulo = new JLabel(
                "MENÚ PRINCIPAL",
                SwingConstants.CENTER);

        lblTitulo.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        52));

        lblTitulo.setForeground(
                Color.WHITE);

        lblTitulo.setBounds(
                150,
                40,
                600,
                70);

        panelMenu.add(lblTitulo);


        lblIconPerfil = new JLabel();

        ImageIcon perfilIcon = new ImageIcon(
                getClass().getResource("/img/Editar.png"));

        Image perfilEscalado = perfilIcon.getImage()
                .getScaledInstance(
                        75,
                        75,
                        Image.SCALE_SMOOTH);

        lblIconPerfil.setIcon(
                new ImageIcon(
                        perfilEscalado));

        lblIconPerfil.setBounds(
                120,
                170,
                75,
                75);

        panelMenu.add(lblIconPerfil);


        btnPerfil = new JButton(
                "PERFIL");

        btnPerfil.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        30));

        btnPerfil.setBounds(
                240,
                165,
                400,
                85);

        panelMenu.add(btnPerfil);


        lblIconJuego = new JLabel();

        ImageIcon juegoIcon = new ImageIcon(
                getClass().getResource("/img/Control.png"));

        Image juegoEscalado = juegoIcon.getImage()
                .getScaledInstance(
                        75,
                        75,
                        Image.SCALE_SMOOTH);

        lblIconJuego.setIcon(
                new ImageIcon(
                        juegoEscalado));

        lblIconJuego.setBounds(
                120,
                300,
                75,
                75);

        panelMenu.add(lblIconJuego);


        btnMinijuegos = new JButton(
                "MINIJUEGOS");

        btnMinijuegos.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        30));

        btnMinijuegos.setBounds(
                240,
                295,
                400,
                85);

        panelMenu.add(btnMinijuegos);


        lblIconEstadisticas = new JLabel();

        ImageIcon estadisticasIcon = new ImageIcon(
                getClass().getResource("/img/Estadisticas.png"));

        Image estadisticasEscalada = estadisticasIcon.getImage()
                .getScaledInstance(
                        75,
                        75,
                        Image.SCALE_SMOOTH);

        lblIconEstadisticas.setIcon(
                new ImageIcon(
                        estadisticasEscalada));

        lblIconEstadisticas.setBounds(
                120,
                430,
                75,
                75);

        panelMenu.add(lblIconEstadisticas);


        btnEstadisticas = new JButton(
                "ESTADÍSTICAS");

        btnEstadisticas.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        28));

        btnEstadisticas.setBounds(
                240,
                425,
                400,
                85);

        panelMenu.add(btnEstadisticas);


        lblIconSalir = new JLabel();

        ImageIcon salirIcon = new ImageIcon(
                getClass().getResource("/img/Salir.png"));

        Image salirEscalado = salirIcon.getImage()
                .getScaledInstance(
                        75,
                        75,
                        Image.SCALE_SMOOTH);

        lblIconSalir.setIcon(
                new ImageIcon(
                        salirEscalado));

        lblIconSalir.setBounds(
                120,
                560,
                75,
                75);

        panelMenu.add(lblIconSalir);

        btnSalir = new JButton(
                "SALIR");

        btnSalir.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        30));

        btnSalir.setBounds(
                240,
                555,
                400,
                85);

        panelMenu.add(btnSalir);
    }

    public static void main(String[] args) {

        new PantallaPrincipal();
    }
}