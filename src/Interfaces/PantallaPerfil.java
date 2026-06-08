package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class PantallaPerfil extends JFrame {

    private FondoPanelSemi fondo;

    private JPanel panelCuenta;
    private JPanel panelPerfil;

    private JLabel lblLogo;
    private JLabel lblMascota;

    private JLabel lblTitulo;

    private JLabel lblCorreo;
    private JLabel lblPassword;
    private JLabel lblIdUsuario;
    private JLabel lblFechaCreacion;

    private JTextField txtCorreo;
    private JPasswordField txtPassword;

    private JLabel lblEditarCorreo;
    private JLabel lblEditarPassword;

    private JLabel lblEstado;
    private JLabel lblUsuario;

    private JLabel lblFotoPerfil;

    private JButton btnEditarNombre;
    private JButton btnVolver;

    private JScrollPane scrollImagenes;

    public PantallaPerfil() {

        fondo = new FondoPanelSemi("/img/fondoDosK.png");
        setContentPane(fondo);

        setTitle("Gestión de Cuenta");
        setSize(1366, 768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fondo.setLayout(null);

        crearComponentes();

        setVisible(true);
    }

    private void crearComponentes() {


        lblLogo = new JLabel();

        ImageIcon logoIcon
                = new ImageIcon(
                        getClass().getResource(
                                "/img/logoKitsura.png"));

        Image logoEscalado
                = logoIcon.getImage().getScaledInstance(
                        200,
                        200,
                        Image.SCALE_SMOOTH);

        lblLogo.setIcon(new ImageIcon(logoEscalado));
        lblLogo.setBounds(40, 10, 200, 200);

        fondo.add(lblLogo);

        lblMascota = new JLabel();

        ImageIcon mascotaIcon
                = new ImageIcon(
                        getClass().getResource(
                                "/img/ZorroPerfil.png"));

        Image mascotaEscalada
                = mascotaIcon.getImage().getScaledInstance(
                        300,
                        300,
                        Image.SCALE_SMOOTH);

        lblMascota.setIcon(new ImageIcon(mascotaEscalada));
        lblMascota.setBounds(540, 10, 300, 300);

        fondo.add(lblMascota);

        panelCuenta = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {

                Graphics2D g2 = (Graphics2D) g.create();

                g2.setColor(new Color(220, 220, 220, 220));

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

        panelCuenta.setOpaque(false);
        panelCuenta.setLayout(null);
        panelCuenta.setBounds(70, 190, 680, 350);

        fondo.add(panelCuenta);

        lblTitulo = new JLabel("Gestión de Cuenta");

        lblTitulo.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        30));

        lblTitulo.setBounds(
                180,
                30,
                350,
                40);

        panelCuenta.add(lblTitulo);


        lblCorreo = new JLabel("Correo Electrónico");

        lblCorreo.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        18));

        lblCorreo.setBounds(
                25,
                110,
                250,
                30);

        panelCuenta.add(lblCorreo);

        txtCorreo = new JTextField(
                "usuario@correo.com");

        txtCorreo.setBounds(
                25,
                150,
                300,
                35);

        panelCuenta.add(txtCorreo);

        lblEditarCorreo = new JLabel("Editar");

        lblEditarCorreo.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        18));

        lblEditarCorreo.setBounds(
                340,
                150,
                100,
                35);

        panelCuenta.add(lblEditarCorreo);


        lblPassword = new JLabel("Contraseña");

        lblPassword.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        18));

        lblPassword.setBounds(
                25,
                210,
                200,
                30);

        panelCuenta.add(lblPassword);

        txtPassword = new JPasswordField(
                "123456789");

        txtPassword.setBounds(
                25,
                250,
                300,
                35);

        panelCuenta.add(txtPassword);

        lblEditarPassword = new JLabel("Editar");

        lblEditarPassword.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        18));

        lblEditarPassword.setBounds(
                340,
                250,
                100,
                35);

        panelCuenta.add(lblEditarPassword);

        lblIdUsuario = new JLabel(
                "<html><b>ID Usuario</b><br>19503236</html>");

        lblIdUsuario.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        18));

        lblIdUsuario.setBounds(
                500,
                120,
                150,
                80);

        panelCuenta.add(lblIdUsuario);


        lblFechaCreacion = new JLabel(
                "<html><b>Fecha de creación</b><br>00/00/2026</html>");

        lblFechaCreacion.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        18));

        lblFechaCreacion.setBounds(
                500,
                220,
                180,
                80);

        panelCuenta.add(lblFechaCreacion);

        panelPerfil = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {

                Graphics2D g2 = (Graphics2D) g.create();

                g2.setColor(new Color(220, 220, 220, 220));

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

        panelPerfil.setOpaque(false);
        panelPerfil.setLayout(null);
        panelPerfil.setBounds(940, 0, 450, 730);

        fondo.add(panelPerfil);


        lblEstado = new JLabel(
                "<html><b>Estado:</b> Activo</html>");

        lblEstado.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        22));

        lblEstado.setBounds(
                145,
                15,
                300,
                40);

        panelPerfil.add(lblEstado);

        lblFotoPerfil = new JLabel();

        ImageIcon fotoIcon
                = new ImageIcon(
                        getClass().getResource(
                                "/img/Victoria.png"));

        Image fotoEscalada
                = fotoIcon.getImage().getScaledInstance(
                        180,
                        180,
                        Image.SCALE_SMOOTH);

        lblFotoPerfil.setIcon(
                new ImageIcon(fotoEscalada));

        lblFotoPerfil.setBounds(
                128,
                65,
                180,
                180);

        lblFotoPerfil.setBorder(
                BorderFactory.createLineBorder(
                        Color.GRAY,
                        4));

        lblFotoPerfil.setToolTipText(
                "Cambiar imagen de perfil");

        panelPerfil.add(lblFotoPerfil);

        lblUsuario = new JLabel(
                "Nombre de usuario");

        lblUsuario.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        20));

        lblUsuario.setBounds(
                125,
                265,
                220,
                30);

        panelPerfil.add(lblUsuario);


        btnEditarNombre
                = new JButton(
                        "EDITAR NOMBRE");

        btnEditarNombre.setBounds(
                115,
                330,
                200,
                45);

        panelPerfil.add(btnEditarNombre);


        JLabel lblImagenActual
                = new JLabel(
                        "Imagen seleccionada actualmente");

        lblImagenActual.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14));

        lblImagenActual.setBounds(
                100,
                400,
                250,
                20);

        panelPerfil.add(lblImagenActual);

        JPanel panelImagenes
                = new JPanel();

        panelImagenes.setPreferredSize(
                new java.awt.Dimension(
                        300,
                        250));

        scrollImagenes
                = new JScrollPane(
                        panelImagenes);

        scrollImagenes.setBounds(
                75,
                450,
                300,
                250);

        panelPerfil.add(scrollImagenes);

        btnVolver = new JButton(
                "Volver");

        btnVolver.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        22));

        btnVolver.setBounds(
                330,
                580,
                160,
                50);

        fondo.add(btnVolver);
    }

    public static void main(String[] args) {

        new PantallaPerfil();
    }
}
