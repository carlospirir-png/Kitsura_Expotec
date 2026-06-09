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

public class UsuarioMenu extends JFrame {

    private FondoPanelSemi fondo;

    private JPanel panelSemi;

    private JLabel lblTitulo;


    private JButton btnAgregarAdmin;
    private JButton btnEditar;
    private JButton btnMostrar;

    private JLabel lblMascota;

    public UsuarioMenu() {

        fondo = new FondoPanelSemi("/img/fondoDosK.png");
        setContentPane(fondo);

        setTitle("Usuario");
        setSize(1920, 1080);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        fondo.setLayout(null);

        crearComponentes();

        setVisible(true);
    }

    private void crearComponentes() {

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
                80,
                80,
                900,
                820);

        fondo.add(panelSemi);


        lblTitulo = new JLabel(
                "USUARIO",
                SwingConstants.CENTER);

        lblTitulo.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        45));

        lblTitulo.setForeground(
                Color.WHITE);

        lblTitulo.setBounds(
                250,
                40,
                400,
                60);

        panelSemi.add(lblTitulo);


        btnAgregarAdmin = new JButton(
                "AÑADIR ADMINISTRADOR");

        btnAgregarAdmin.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        24));

        btnAgregarAdmin.setBounds(
                180,
                300,
                420,
                70);

        panelSemi.add(btnAgregarAdmin);


        btnEditar = new JButton(
                "EDITAR");

        btnEditar.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        24));

        btnEditar.setBounds(
                180,
                470,
                250,
                70);

        panelSemi.add(btnEditar);


        btnMostrar = new JButton(
                "MOSTRAR");

        btnMostrar.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        24));

        btnMostrar.setBounds(
                180,
                640,
                250,
                70);

        panelSemi.add(btnMostrar);

        lblMascota = new JLabel();

        ImageIcon mascotaIcon =
                new ImageIcon(
                        getClass().getResource(
                                "/img/ZorroTablet.png"));

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

        new UsuarioMenu();
    }
}