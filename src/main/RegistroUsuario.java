
// REGISTRO USUARIOOOOOOOO
package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegistroUsuario extends JFrame {
    private FondoPanel fondo;

    public RegistroUsuario() {
        fondo = new FondoPanel("/main/fondoUnoK.png");
        setContentPane(fondo);
        setTitle("Registro");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        fondo.setLayout(null);
        crearComponentes();
        setVisible(true);
    }

    private void crearComponentes() {
        //---------------- LOGO ----------------
        JLabel logo = new JLabel();
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/main/logofK.png"));
        Image logoEscalado = logoIcon.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH);
        logo.setIcon(new ImageIcon(logoEscalado));
        logo.setBounds(900, 40, 150, 150);
        fondo.add(logo);
        
        //---------------- MASCOTA ----------------
        JLabel mascota = new JLabel();
        ImageIcon mascotaIcon = new ImageIcon(getClass().getResource("/main/mascota1.png"));
        Image mascotaEscalada = mascotaIcon.getImage().getScaledInstance(191,264,Image.SCALE_SMOOTH);
        mascota.setIcon(new ImageIcon(mascotaEscalada));
        mascota.setBounds(1250, 550, 191, 264);
        fondo.add(mascota);

        //---------------- LABEL NOMBRE ----------------
        JLabel lblNombre = new JLabel("NOMBRE");
        lblNombre.setFont(new Font("Arial", Font.BOLD, 18));
        lblNombre.setForeground(Color.WHITE);
        lblNombre.setBounds(760, 380, 200, 30);
        fondo.add(lblNombre);

        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(760,415,400,50);
        fondo.add(txtNombre);
        
        //---------------- LABEL CORREO ----------------
        JLabel lblCorreo = new JLabel("CORREO");
        lblCorreo.setFont(new Font("Arial", Font.BOLD, 18));
        lblCorreo.setForeground(Color.WHITE);
        lblCorreo.setBounds(760, 480, 200, 30);
        fondo.add(lblCorreo);
        JTextField txtCorreo = new JTextField();
        txtCorreo.setBounds(760,515,400,50);
        fondo.add(txtCorreo);
        
        //---------------- LABEL CONTRASEÑA ----------------
        JLabel lblPassword = new JLabel("CONTRASEÑA");
        lblPassword.setFont(new Font("Arial", Font.BOLD, 18));
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setBounds(760, 580, 200, 30);
        fondo.add(lblPassword);
        JPasswordField txtPassword =new JPasswordField();
        txtPassword.setBounds(760,615,400,50);
        fondo.add(txtPassword);

        //---------------- BOTON JUGAR ----------------//
        JButton btnJugar = new JButton("JUGAR");
        btnJugar.setBounds(820, 815, 285,60);
        fondo.add(btnJugar);
    }

    public static void main(String[] args) {

        new RegistroUsuario();

    }
}
