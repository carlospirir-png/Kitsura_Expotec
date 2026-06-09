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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;

public class UsuarioMostrar extends JFrame {

    private FondoPanelSemi fondo;

    private JPanel panelIzquierdo;
    private JPanel panelTabla;

    private JButton btnEliminar;
    private JButton btnBuscar;

    private JLabel lblID;
    private JTextField txtID;

    private JLabel lblTitulo;

    private JTable tablaUsuarios;
    private JScrollPane scrollTabla;

    private JLabel lblMascota;

    public UsuarioMostrar() {

        fondo = new FondoPanelSemi("/img/fondoDosK.png");
        setContentPane(fondo);

        setTitle("Usuarios");
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
        // PANEL IZQUIERDO
        // =========================

        panelIzquierdo = new JPanel() {

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

        panelIzquierdo.setOpaque(false);
        panelIzquierdo.setLayout(null);

        panelIzquierdo.setBounds(
                60,
                80,
                650,
                850);

        fondo.add(panelIzquierdo);

        // =========================
        // BOTON ELIMINAR
        // =========================

        btnEliminar = new JButton(
                "ELIMINAR");

        btnEliminar.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        22));

        btnEliminar.setBounds(
                50,
                40,
                220,
                70);

        panelIzquierdo.add(btnEliminar);

        // =========================
        // BOTON BUSCAR
        // =========================

        btnBuscar = new JButton(
                "BUSCAR");

        btnBuscar.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        22));

        btnBuscar.setBounds(
                340,
                40,
                220,
                70);

        panelIzquierdo.add(btnBuscar);

        // =========================
        // LABEL ID
        // =========================

        lblID = new JLabel(
                "Ingrese el ID del usuario:");

        lblID.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        28));

        lblID.setForeground(
                Color.WHITE);

        lblID.setBounds(
                50,
                170,
                400,
                40);

        panelIzquierdo.add(lblID);

        // =========================
        // TEXTFIELD
        // =========================

        txtID = new JTextField();

        txtID.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        24));

        txtID.setBounds(
                50,
                230,
                510,
                55);

        panelIzquierdo.add(txtID);

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
                        420,
                        420,
                        Image.SCALE_SMOOTH);

        lblMascota.setIcon(
                new ImageIcon(
                        mascotaEscalada));

        lblMascota.setBounds(
                90,
                340,
                420,
                420);

        panelIzquierdo.add(lblMascota);

        // =========================
        // PANEL TABLA
        // =========================

        panelTabla = new JPanel() {

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

        panelTabla.setOpaque(false);
        panelTabla.setLayout(null);

        panelTabla.setBounds(
                780,
                80,
                1050,
                850);

        fondo.add(panelTabla);

        // =========================
        // TITULO
        // =========================

        lblTitulo = new JLabel(
                "USUARIOS",
                SwingConstants.CENTER);

        lblTitulo.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        42));

        lblTitulo.setForeground(
                Color.WHITE);

        lblTitulo.setBounds(
                250,
                30,
                500,
                50);

        panelTabla.add(lblTitulo);

        // =========================
        // TABLA
        // =========================

        String[] columnas = {
            "ID",
            "Nombre",
            "Correo",
            "Contraseña"
        };

        DefaultTableModel modelo =
                new DefaultTableModel(
                        columnas,
                        5);

        tablaUsuarios =
                new JTable(modelo);

        tablaUsuarios.setRowHeight(70);

        tablaUsuarios.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        20));

        tablaUsuarios.getTableHeader().setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        20));

        scrollTabla =
                new JScrollPane(
                        tablaUsuarios);

        scrollTabla.setBounds(
                40,
                120,
                960,
                650);

        panelTabla.add(scrollTabla);
    }

    public static void main(String[] args) {

        new UsuarioMostrar();
    }
}