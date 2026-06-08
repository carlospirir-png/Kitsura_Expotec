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
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class PantallaDificultad extends JFrame {

    private FondoPanelSemi fondo;

    private JPanel panelTexto;
    private JLabel lblTitulo;
    private JLabel lblMensaje;
    private JLabel lblEmpieza;
    private JLabel lblContador;
    private JLabel lblAlerta;

    private int tiempo = 3;

    public PantallaDificultad() {

        fondo = new FondoPanelSemi("/img/fondoUnoK.png");
        setContentPane(fondo);

        setTitle("Aumento de Dificultad");
        setSize(1920, 1080);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        fondo.setLayout(null);

        crearComponentes();
        iniciarContador();

        setVisible(true);
    }

    private void crearComponentes() {


        JLabel mascota = new JLabel();

        ImageIcon mascotaIcon
                = new ImageIcon(getClass().getResource("/img/ZorroAlerta.png"));

        Image mascotaEscalada
                = mascotaIcon.getImage().getScaledInstance(
                        550, 550, Image.SCALE_SMOOTH);

        mascota.setIcon(new ImageIcon(mascotaEscalada));
        mascota.setBounds(200, 200, 550, 550);

        fondo.add(mascota);


        panelTexto = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {

                Graphics2D g2 = (Graphics2D) g.create();

                g2.setColor(new Color(0, 0, 0, 170));
                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);

                g2.dispose();
            }
        };

        panelTexto.setOpaque(false);
        panelTexto.setLayout(null);
        panelTexto.setBounds(750, 150, 700, 550);

        fondo.add(panelTexto);


        lblAlerta = new JLabel();

        ImageIcon alertaIcon
                = new ImageIcon(getClass().getResource("/img/alerta.png"));

        Image alertaEscalada
                = alertaIcon.getImage().getScaledInstance(
                        100, 100, Image.SCALE_SMOOTH);

        lblAlerta.setIcon(new ImageIcon(alertaEscalada));
        lblAlerta.setBounds(300, 20, 100, 100);

        panelTexto.add(lblAlerta);


        lblTitulo = new JLabel("¡ALERTA!", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 50));
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setBounds(150, 130, 400, 60);

        panelTexto.add(lblTitulo);


        lblMensaje = new JLabel(
                "Se aumenta la dificultad",
                SwingConstants.CENTER);

        lblMensaje.setFont(new Font("Arial", Font.BOLD, 30));
        lblMensaje.setForeground(Color.WHITE);
        lblMensaje.setBounds(70, 230, 550, 50);

        panelTexto.add(lblMensaje);


        lblEmpieza = new JLabel(
                "Empieza en:",
                SwingConstants.CENTER);

        lblEmpieza.setFont(new Font("Arial", Font.BOLD, 30));
        lblEmpieza.setForeground(Color.WHITE);
        lblEmpieza.setBounds(150, 320, 400, 50);

        panelTexto.add(lblEmpieza);

        // CONTADOR
        lblContador = new JLabel("(3s)", SwingConstants.CENTER);
        lblContador.setFont(new Font("Arial", Font.BOLD, 50));
        lblContador.setForeground(Color.WHITE);
        lblContador.setBounds(200, 400, 300, 70);

        panelTexto.add(lblContador);
    }

    private void iniciarContador() {

        Timer timer = new Timer(1000, e -> {

            tiempo--;

            if (tiempo == 2) {
                lblContador.setText("(2s)");

            } else if (tiempo == 1) {
                lblContador.setText("(1s)");

            } else if (tiempo == 0) {

                lblContador.setText("(YA!)");

                ((Timer) e.getSource()).stop();

                mostrarNuevaDificultad();
            }
        });

        timer.start();
    }

    private void mostrarNuevaDificultad() {

        lblAlerta.setVisible(false);

        lblTitulo.setText("DIFICULTAD AUMENTADA");
        lblTitulo.setBounds(5, 130, 700, 60);

        lblMensaje.setText("El nivel ha aumentado");
        lblMensaje.setBounds(45, 230, 600, 50);

        lblEmpieza.setText("¡Continúa jugando!");
        lblEmpieza.setBounds(85, 320, 500, 50);

        lblContador.setText("");

        panelTexto.revalidate();
        panelTexto.repaint();
    }

    public static void main(String[] args) {
        new PantallaDificultad();
    }
}