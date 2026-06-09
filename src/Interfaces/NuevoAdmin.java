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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class NuevoAdmin extends JFrame {

    private FondoPanelSemi fondo;

    private JPanel panelSemi;

    private JLabel lblTitulo;

    private JLabel lblNombre;
    private JLabel lblCorreo;
    private JLabel lblContra;

    private JTextField txtNombre;
    private JTextField txtCorreo;
    private JPasswordField txtContra;

    private JButton btnAnadir;

    private JLabel lblMascota;

    public NuevoAdmin() {

        fondo = new FondoPanelSemi("/img/fondoDosK.png");
        setContentPane(fondo);

        setTitle("Añadir Administrador");
        setSize(1920, 1080);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        fondo.setLayout(null);

        crearComponentes();

        setVisible(true);
    }

    private void crearComponentes() {

        // =========================
        // PANEL SEMITRANSPARENTE
        // =========================

        panelSemi = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);

                Graphics2D g2 = (Graphics2D) g.create();

                g2.setColor(new Color(0, 0, 0, 110));

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

        panelSemi.setOpaque(false);
        panelSemi.setLayout(null);

        panelSemi.setBounds(
                120,
                120,
                850,
                720);

        fondo.add(panelSemi);

        // =========================
        // TITULO
        // =========================

        lblTitulo = new JLabel(
                "AÑADIR ADMINISTRADOR",
                SwingConstants.CENTER);

        lblTitulo.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        42));

        lblTitulo.setForeground(
                Color.WHITE);

        lblTitulo.setBounds(
                100,
                40,
                650,
                60);

        panelSemi.add(lblTitulo);

        // =========================
        // NOMBRE
        // =========================

        lblNombre = new JLabel(
                "Ingrese el nombre del nuevo administrador:");

        lblNombre.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        28));

        lblNombre.setForeground(
                Color.WHITE);

        lblNombre.setBounds(
                60,
                150,
                600,
                40);

        panelSemi.add(lblNombre);

        txtNombre = new JTextField();

        txtNombre.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        24));

        txtNombre.setBounds(
                60,
                210,
                500,
                55);

        panelSemi.add(txtNombre);

        // =========================
        // CORREO
        // =========================

        lblCorreo = new JLabel(
                "Ingrese el correo del nuevo administrador:");

        lblCorreo.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        28));

        lblCorreo.setForeground(
                Color.WHITE);

        lblCorreo.setBounds(
                60,
                340,
                650,
                40);

        panelSemi.add(lblCorreo);

        txtCorreo = new JTextField();

        txtCorreo.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        24));

        txtCorreo.setBounds(
                60,
                400,
                500,
                55);

        panelSemi.add(txtCorreo);

        // =========================
        // CONTRASEÑA
        // =========================

        lblContra = new JLabel(
                "Ingrese la contraseña del nuevo administrador:");

        lblContra.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        28));

        lblContra.setForeground(
                Color.WHITE);

        lblContra.setBounds(
                60,
                530,
                700,
                40);

        panelSemi.add(lblContra);

        txtContra = new JPasswordField();

        txtContra.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        24));

        txtContra.setBounds(
                60,
                590,
                500,
                55);

        panelSemi.add(txtContra);

        // =========================
        // BOTON AÑADIR
        // =========================

        btnAnadir = new JButton(
                "AÑADIR");

        btnAnadir.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        26));

        btnAnadir.setBounds(
                180,
                670,
                220,
                65);

        panelSemi.add(btnAnadir);

        // =========================
        // MASCOTA
        // =========================

        lblMascota = new JLabel();

        ImageIcon mascotaIcon =
                new ImageIcon(
                        getClass().getResource(
                                "/img/ZorroControl.png"));

        Image mascotaEscalada =
                mascotaIcon.getImage().getScaledInstance(
                        700,
                        700,
                        Image.SCALE_SMOOTH);

        lblMascota.setIcon(
                new ImageIcon(
                        mascotaEscalada));

        lblMascota.setBounds(
                1120,
                180,
                700,
                700);

        fondo.add(lblMascota);
    }

    public static void main(String[] args) {

        new NuevoAdmin();
    }
}