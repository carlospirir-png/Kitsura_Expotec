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
        setSize(1366, 768);
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
                .getScaledInstance(300, 150, Image.SCALE_SMOOTH);

        lblLogo.setIcon(new ImageIcon(logoEscalado));
        lblLogo.setBounds(120, 0, 300, 150);

        fondo.add(lblLogo);

        lblMascota = new JLabel();

        ImageIcon mascotaIcon = new ImageIcon(
                getClass().getResource("/img/ZorroPrincipal.png"));

        Image mascotaEscalada = mascotaIcon.getImage()
                .getScaledInstance(550, 550, Image.SCALE_SMOOTH);

        lblMascota.setIcon(new ImageIcon(mascotaEscalada));
        lblMascota.setBounds(50, 130, 550, 550);

        fondo.add(lblMascota);

        panelMenu = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {

                Graphics2D g2 = (Graphics2D) g.create();

                g2.setColor(new Color(0, 0, 0, 120));

                g2.fillRoundRect(
                        0,
                        0,
                        getWidth(),
                        getHeight(),
                        30,
                        30);

                g2.dispose();
            }
        };

        panelMenu.setOpaque(false);
        panelMenu.setLayout(null);
        panelMenu.setBounds(500, 70, 700, 560);

        fondo.add(panelMenu);


        lblTitulo = new JLabel(
                "Menú Principal",
                SwingConstants.CENTER);

        lblTitulo.setFont(new Font("Arial", Font.BOLD, 40));
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setBounds(100, 30, 500, 60);
        
        panelMenu.add(lblTitulo);


        lblIconPerfil = new JLabel();

        ImageIcon perfilIcon = new ImageIcon(
                getClass().getResource("/img/Editar.png"));

        Image perfilEscalado = perfilIcon.getImage()
                .getScaledInstance(55, 55, Image.SCALE_SMOOTH);

        lblIconPerfil.setIcon(new ImageIcon(perfilEscalado));
        lblIconPerfil.setBounds(120, 130, 55, 55);

        panelMenu.add(lblIconPerfil);

        btnPerfil = new JButton("PERFIL");
        btnPerfil.setFont(new Font("Arial", Font.BOLD, 24));
        btnPerfil.setBounds(190, 120, 280, 70);

        panelMenu.add(btnPerfil);


        lblIconJuego = new JLabel();

        ImageIcon juegoIcon = new ImageIcon(
                getClass().getResource("/img/Control.png"));

        Image juegoEscalado = juegoIcon.getImage()
                .getScaledInstance(55, 55, Image.SCALE_SMOOTH);

        lblIconJuego.setIcon(new ImageIcon(juegoEscalado));
        lblIconJuego.setBounds(120, 240, 55, 55);

        panelMenu.add(lblIconJuego);

        // ==========================
        // BOTON MINIJUEGOS
        // ==========================
        btnMinijuegos = new JButton("MINIJUEGOS");
        btnMinijuegos.setFont(new Font("Arial", Font.BOLD, 24));
        btnMinijuegos.setBounds(190, 230, 280, 70);

        panelMenu.add(btnMinijuegos);


        lblIconEstadisticas = new JLabel();

        ImageIcon estadisticasIcon = new ImageIcon(
                getClass().getResource("/img/Estadisticas.png"));

        Image estadisticasEscalada = estadisticasIcon.getImage()
                .getScaledInstance(55, 55, Image.SCALE_SMOOTH);

        lblIconEstadisticas.setIcon(
                new ImageIcon(estadisticasEscalada));

        lblIconEstadisticas.setBounds(120, 350, 55, 55);

        panelMenu.add(lblIconEstadisticas);


        btnEstadisticas = new JButton("ESTADÍSTICAS");
        btnEstadisticas.setFont(new Font("Arial", Font.BOLD, 22));
        btnEstadisticas.setBounds(190, 340, 280, 70);

        panelMenu.add(btnEstadisticas);


        lblIconSalir = new JLabel();

        ImageIcon salirIcon = new ImageIcon(
                getClass().getResource("/img/Salir.png"));

        Image salirEscalado = salirIcon.getImage()
                .getScaledInstance(55, 55, Image.SCALE_SMOOTH);

        lblIconSalir.setIcon(new ImageIcon(salirEscalado));
        lblIconSalir.setBounds(120, 460, 55, 55);

        panelMenu.add(lblIconSalir);


        btnSalir = new JButton("SALIR");
        btnSalir.setFont(new Font("Arial", Font.BOLD, 24));
        btnSalir.setBounds(190, 450, 280, 70);

        panelMenu.add(btnSalir);
    }

    public static void main(String[] args) {
        new PantallaPrincipal();
    }
}