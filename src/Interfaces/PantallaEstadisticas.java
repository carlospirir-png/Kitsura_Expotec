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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PantallaEstadisticas extends JFrame {

    private FondoPanelSemi fondo;
    private JPanel panelFondo;

    private JLabel lblTitulo;

    private JLabel lblInfoTiempo;
    private JLabel lblInfoMayor;
    private JLabel lblInfoUltima;
    private JLabel lblInfoTotal;

    private JTable tabla;
    private JScrollPane scrollTabla;

    private JLabel lblUltimaPartida;
    private JTextField txtUltimaPartida;

    private JLabel lblGanadas;
    private JTextField txtGanadas;

    private JLabel lblUltimaPuntuacion;
    private JTextField txtUltimaPuntuacion;

    private JLabel lblPuntuacionTotal;
    private JTextField txtPuntuacionTotal;

    private JButton btnVolver;

    private JLabel lblLogo;
    private JLabel lblMascota;

    public PantallaEstadisticas() {

        fondo = new FondoPanelSemi("/img/fondoDosK.png");
        setContentPane(fondo);

        setTitle("Tabla Global");
        setSize(1920, 1080);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        fondo.setLayout(null);

        crearComponentes();

        setVisible(true);
    }

    private void crearComponentes() {

        lblTitulo = new JLabel(
                "Tabla Global");

        lblTitulo.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        60));

        lblTitulo.setBounds(
                130,
                60,
                500,
                80);

        lblTitulo.setForeground(new Color(196, 221, 227));

        fondo.add(lblTitulo);

        DefaultTableModel modelo
                = new DefaultTableModel();

        modelo.addColumn("JUGADOR");
        modelo.addColumn("TIEMPO");
        modelo.addColumn("MAYOR PUNTUACIÓN");

        modelo.addRow(
                new Object[]{
                    "wasa-insano.admin.67-skibidi",
                    "00:00:00",
                    "50000000"
                });

        tabla = new JTable(modelo);

        tabla.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        24));

        tabla.setRowHeight(50);

        tabla.getTableHeader().setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        28));

        scrollTabla
                = new JScrollPane(tabla);

        scrollTabla.setBounds(
                120,
                150,
                900,
                420);

        fondo.add(scrollTabla);


        lblUltimaPartida = new JLabel(
                "Última partida");

        lblUltimaPartida.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        36));

        lblUltimaPartida.setBounds(
                120,
                570,
                250,
                50);

        lblUltimaPartida.setForeground(new Color(196, 221, 227));
        fondo.add(lblUltimaPartida);

        txtUltimaPartida = new JTextField(
                "Minijuego1");

        txtUltimaPartida.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        30));

        txtUltimaPartida.setBounds(
                120,
                620,
                340,
                50);

        fondo.add(txtUltimaPartida);

        lblGanadas = new JLabel(
                "Partidas Ganadas");

        lblGanadas.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        36));

        lblGanadas.setBounds(
                120,
                670,
                400,
                50);

        lblGanadas.setForeground(new Color(196, 221, 227));

        fondo.add(lblGanadas);

        txtGanadas = new JTextField(
                "0");

        txtGanadas.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        30));

        txtGanadas.setBounds(
                120,
                715,
                340,
                50);

        fondo.add(txtGanadas);


        lblUltimaPuntuacion = new JLabel(
                "Última puntuación");

        lblUltimaPuntuacion.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        36));

        lblUltimaPuntuacion.setBounds(
                850,
                570,
                400,
                50);

        lblUltimaPuntuacion.setForeground(new Color(196, 221, 227));

        fondo.add(lblUltimaPuntuacion);

        txtUltimaPuntuacion = new JTextField(
                "2000000 pts");

        txtUltimaPuntuacion.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        30));

        txtUltimaPuntuacion.setBounds(
                850,
                620,
                340,
                50);

        fondo.add(txtUltimaPuntuacion);

        // =========================
        // PUNTUACION TOTAL
        // =========================
        lblPuntuacionTotal = new JLabel(
                "Puntuación total");

        lblPuntuacionTotal.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        36));

        lblPuntuacionTotal.setBounds(
                850,
                670,
                340,
                50);

                lblPuntuacionTotal.setForeground(new Color(196, 221, 227));
        
        fondo.add(lblPuntuacionTotal);

        txtPuntuacionTotal = new JTextField(
                "999999999999 pts");

        txtPuntuacionTotal.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        30));

        txtPuntuacionTotal.setBounds(
                850,
                710,
                340,
                50);

        fondo.add(txtPuntuacionTotal);

        btnVolver = new JButton(
                "Volver");

        btnVolver.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        40));

        btnVolver.setBounds(
                540,
                670,
                240,
                50);

        fondo.add(btnVolver);

        lblMascota = new JLabel();

        ImageIcon mascotaIcon
                = new ImageIcon(
                        getClass().getResource(
                                "/img/ZorroTrofeo.png"));

        Image mascotaEscalada
                = mascotaIcon.getImage().getScaledInstance(
                        500,
                        550,
                        Image.SCALE_SMOOTH);

        lblMascota.setIcon(
                new ImageIcon(
                        mascotaEscalada));

        lblMascota.setBounds(
                1000,
                70,
                500,
                550);

        fondo.add(lblMascota);
        
        
               panelFondo = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {

                Graphics2D g2 = (Graphics2D) g.create();

                g2.setColor(new Color(110, 110, 110, 190));

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

        panelFondo.setOpaque(false);
        panelFondo.setLayout(null);
        panelFondo.setBounds(120, 30, 900, 540);

        fondo.add(panelFondo);
        
        

    }

    
    
    public static void main(String[] args) {

        new PantallaEstadisticas();
    }
}
