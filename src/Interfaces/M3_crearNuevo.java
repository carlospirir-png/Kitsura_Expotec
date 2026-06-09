package Interfaces;

import java.awt.*;
import javax.swing.*;

public class M3_crearNuevo extends JFrame {

    private FondoPanelSemi fondo;
    private JPanel panelSemi;
    private JLabel lblTitulo;

    private JLabel lblPregunta;
    private JTextArea txtPregunta;

    private JLabel lblRespuestaCorrecta;
    private JLabel lblRespuestaIncorrecta;

    private JTextField txtCorrecta;
    private JTextField txtIncorrecta;
    private JTextField txtIncorrecta2;
    private JTextField txtIncorrecta3;
    private JTextField txtIncorrecta4;
    private JTextField txtIncorrecta5;

    private JLabel lblCheck;
    private JLabel lblIncorrecto;
    private JLabel lblIncorrecto2;
    private JLabel lblIncorrecto3;
    private JLabel lblIncorrecto4;
    private JLabel lblIncorrecto5;

    private JButton btnSiguiente;

    private JLabel lblMascota;

    public M3_crearNuevo() {

        fondo = new FondoPanelSemi("/img/fondoDosK.png");
        setContentPane(fondo);

        setTitle("Crear Nuevo - Minijuego 3");
        setSize(1920, 1080);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        fondo.setLayout(null);

        crearComponentes();

        setVisible(true);
    }

    private void crearComponentes() {

        lblTitulo = new JLabel(
                "CREAR NUEVO (MINIJUEGO 3)");

        lblTitulo.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        30));

        lblTitulo.setBounds(
                30,
                50,
                500,
                30);

        fondo.add(lblTitulo);

        lblPregunta = new JLabel(
                "Ingrese la pregunta:");

        lblPregunta.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        18));

        lblPregunta.setBounds(
                40,
                105,
                200,
                25);

        fondo.add(lblPregunta);

        txtPregunta = new JTextArea();

        txtPregunta.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        18));

        txtPregunta.setLineWrap(true);
        txtPregunta.setWrapStyleWord(true);

        txtPregunta.setBounds(
                40,
                150,
                1000,
                300);

        fondo.add(txtPregunta);

        lblCheck = new JLabel();

        ImageIcon checkIcon
                = new ImageIcon(
                        getClass().getResource(
                                "/img/check.png"));

        Image checkEscalado
                = checkIcon.getImage().getScaledInstance(
                        40,
                        40,
                        Image.SCALE_SMOOTH);

        lblCheck.setIcon(
                new ImageIcon(
                        checkEscalado));

        lblCheck.setBounds(
                30,
                540,
                40,
                40);

        fondo.add(lblCheck);

        lblRespuestaCorrecta = new JLabel(
                "Ingrese la respuesta correcta del nivel:");

        lblRespuestaCorrecta.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        16));

        lblRespuestaCorrecta.setBounds(
                50,
                500,
                280,
                25);

        fondo.add(lblRespuestaCorrecta);

        txtCorrecta = new JTextField();

        txtCorrecta.setBounds(
                80,
                540,
                260,
                38);

        fondo.add(txtCorrecta);

        lblIncorrecto = new JLabel();

        ImageIcon IncorrectoIcon
                = new ImageIcon(
                        getClass().getResource(
                                "/img/incorrecto.png"));

        Image IncorrectoEscalado
                = IncorrectoIcon.getImage().getScaledInstance(
                        40,
                        40,
                        Image.SCALE_SMOOTH);

        lblIncorrecto.setIcon(
                new ImageIcon(
                        IncorrectoEscalado));

        lblIncorrecto.setBounds(
                355,
                540,
                40,
                40);

        fondo.add(lblIncorrecto);

        txtIncorrecta = new JTextField();

        txtIncorrecta.setBounds(
                400,
                540,
                270,
                38);

        fondo.add(txtIncorrecta);

        lblIncorrecto2 = new JLabel();

        ImageIcon Incorrecto2Icon
                = new ImageIcon(
                        getClass().getResource(
                                "/img/incorrecto.png"));

        Image IncorrectoEscalado2
                = Incorrecto2Icon.getImage().getScaledInstance(
                        40,
                        40,
                        Image.SCALE_SMOOTH);

        lblIncorrecto2.setIcon(
                new ImageIcon(
                        IncorrectoEscalado2));

        lblIncorrecto2.setBounds(
                30,
                600,
                40,
                40);

        fondo.add(lblIncorrecto2);

        txtIncorrecta2 = new JTextField();

        txtIncorrecta2.setBounds(
                730,
                600,
                270,
                38);

        fondo.add(txtIncorrecta2);

        lblIncorrecto3 = new JLabel();

        ImageIcon Incorrecto3Icon
                = new ImageIcon(
                        getClass().getResource(
                                "/img/incorrecto.png"));

        Image IncorrectoEscalado3
                = Incorrecto3Icon.getImage().getScaledInstance(
                        40,
                        40,
                        Image.SCALE_SMOOTH);

        lblIncorrecto3.setIcon(
                new ImageIcon(
                        IncorrectoEscalado3));

        lblIncorrecto3.setBounds(
                680,
                540,
                40,
                40);

        fondo.add(lblIncorrecto3);

        txtIncorrecta3 = new JTextField();

        txtIncorrecta3.setBounds(
                400,
                600,
                270,
                38);

        fondo.add(txtIncorrecta3);

        lblIncorrecto4 = new JLabel();

        ImageIcon Incorrecto4Icon
                = new ImageIcon(
                        getClass().getResource(
                                "/img/incorrecto.png"));

        Image IncorrectoEscalado4
                = Incorrecto4Icon.getImage().getScaledInstance(
                        40,
                        40,
                        Image.SCALE_SMOOTH);

        lblIncorrecto4.setIcon(
                new ImageIcon(
                        IncorrectoEscalado4));

        lblIncorrecto4.setBounds(
                355,
                600,
                40,
                40);

        fondo.add(lblIncorrecto4);

        txtIncorrecta4 = new JTextField();

        txtIncorrecta4.setBounds(
                730,
                540,
                270,
                38);

        fondo.add(txtIncorrecta4);

        lblIncorrecto5 = new JLabel();

        ImageIcon Incorrecto5Icon
                = new ImageIcon(
                        getClass().getResource(
                                "/img/incorrecto.png"));

        Image IncorrectoEscalado5
                = Incorrecto5Icon.getImage().getScaledInstance(
                        40,
                        40,
                        Image.SCALE_SMOOTH);

        lblIncorrecto5.setIcon(
                new ImageIcon(
                        IncorrectoEscalado4));

        lblIncorrecto5.setBounds(
                680,
                600,
                40,
                40);

        fondo.add(lblIncorrecto5);

        txtIncorrecta5 = new JTextField();

        txtIncorrecta5.setBounds(
               80,
                600,
                260,
                38);

        fondo.add(txtIncorrecta5);

        lblRespuestaIncorrecta = new JLabel(
                "Ingrese la respuesta incorrecta del nivel:");

        lblRespuestaIncorrecta.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        16));

        lblRespuestaIncorrecta.setBounds(
                400,
                500,
                320,
                25);

        fondo.add(lblRespuestaIncorrecta);

        btnSiguiente = new JButton(
                "SIGUIENTE");

        btnSiguiente.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        18));

        btnSiguiente.setBounds(
                40,
                680,
                255,
                40);

        fondo.add(btnSiguiente);

        lblMascota = new JLabel();

        ImageIcon mascotaIcon
                = new ImageIcon(
                        getClass().getResource(
                                "/img/TopoPala.png"));

        Image mascotaEscalada
                = mascotaIcon.getImage().getScaledInstance(
                        550,
                        350,
                        Image.SCALE_SMOOTH);

        lblMascota.setIcon(
                new ImageIcon(
                        mascotaEscalada));

        lblMascota.setBounds(
                1050,
                30,
                550,
                350);

        fondo.add(lblMascota);

        panelSemi = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);

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

        panelSemi.setOpaque(false);
        panelSemi.setLayout(null);
        panelSemi.setBounds(10, 10, 1100, 720);

        fondo.add(panelSemi);

    }

    public static void main(String[] args) {

        new M3_crearNuevo();
    }
}
