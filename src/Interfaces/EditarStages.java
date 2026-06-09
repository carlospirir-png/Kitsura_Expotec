package Interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class EditarStages extends JFrame {

    private FondoPanelSemi fondo;

    private JPanel panelSemi;

    private JLabel lblTitulo;

    private JLabel lblID;
    private JTextField txtID;

    private JLabel lblMascota;

    public EditarStages() {

        fondo = new FondoPanelSemi("/img/fondoDosK.png");
        setContentPane(fondo);

        setTitle("Editar Existente");
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

        panelSemi.setOpaque(false);
        panelSemi.setLayout(null);
        panelSemi.setBounds(
                180,
                130,
                850,
                520);

        fondo.add(panelSemi);


        lblTitulo = new JLabel(
                "EDITAR EXISTENTE",
                SwingConstants.CENTER);

        lblTitulo.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        40));

        lblTitulo.setForeground(
                Color.WHITE);

        lblTitulo.setBounds(
                0,
                30,
                850,
                50);

        panelSemi.add(lblTitulo);



        lblID = new JLabel(
                "Ingrese el ID del Stage a editar:");

        lblID.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        28));

        lblID.setForeground(
                Color.WHITE);

        lblID.setBounds(
                235,
                200,
                450,
                40);

        panelSemi.add(lblID);


        txtID = new JTextField();

        txtID.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        24));

        txtID.setBounds(
                170,
                300,
                500,
                55);

        panelSemi.add(txtID);


        lblMascota = new JLabel();

        ImageIcon mascotaIcon =
                new ImageIcon(
                        getClass().getResource(
                                "/img/ZorroPrincipal.png"));

        Image mascotaEscalada =
                mascotaIcon.getImage().getScaledInstance(
                        650,
                        650,
                        Image.SCALE_SMOOTH);

        lblMascota.setIcon(
                new ImageIcon(
                        mascotaEscalada));

        lblMascota.setBounds(
                1120,
                180,
                650,
                650);

        fondo.add(lblMascota);
    }

    public static void main(String[] args) {

        new EditarStages();
    }
}