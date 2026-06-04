// INICIAR SESIOOOOOOOOOOOOOOOON
package main;

import java.awt.*;
import javax.swing.*;

public class IniciarSesion extends JFrame {
    private FondoPanel fondo;
    
     public IniciarSesion () {
        fondo = new FondoPanel("/main/fondoUnoK.png");
        setContentPane(fondo);
        setTitle("Inicio de sesión");
        setSize(1880,1080);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        fondo.setLayout(null);
        crearComponentes();
        setVisible(true);
    }
     private void crearComponentes() {
        //---------------- L O G O ----------------
        JLabel logo = new JLabel();
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/main/logofK.png"));
        Image logoEscalado = logoIcon.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH );
        logo.setIcon(new ImageIcon(logoEscalado));
        logo.setBounds(900,40,150,150);
        fondo.add(logo);
        
        //---------------- MASCOTA ----------------
        JLabel mascota = new JLabel();
        ImageIcon mascotaIcon = new ImageIcon(getClass().getResource("/main/mascota1.png"));
        Image mascotaEscalada = mascotaIcon.getImage().getScaledInstance(191,264,Image.SCALE_SMOOTH);
        mascota.setIcon(new ImageIcon(mascotaEscalada));
        mascota.setBounds(1250,550,191,264);
        fondo.add(mascota);
        
        //---------------- ESLOGAN ----------------
        JLabel titulo = new JLabel("No es magia, es mente ");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(Color.WHITE);
        titulo.setBounds(865,190,400,60);
        fondo.add(titulo);
        
        //---------------- USUARIO ----------------
        JLabel lblUsuario = new JLabel("NOMBRE: ");
        lblUsuario.setFont(new Font("Arial", Font.BOLD, 18));
        lblUsuario.setForeground(Color.WHITE);
        lblUsuario.setBounds(760,350,200,30);
        fondo.add(lblUsuario);
        
        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(760,385,400,50);
        fondo.add(txtUsuario);
        
        //---------------- PASSWORD ----------------
        JLabel lblPassword = new JLabel("CONTRASEÑA");
        lblPassword.setFont(new Font("Arial", Font.BOLD, 18));
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setBounds(760,450,200,30);
        fondo.add(lblPassword);
        JPasswordField txtPassword = new JPasswordField();
        txtPassword.setBounds(760,485,400,50);
        fondo.add(txtPassword);

        //---------------- BOTON ----------------
        JButton btnLogIn = new JButton("INICIAR SESION");
        btnLogIn.setBounds(820,600,285,60);
        fondo.add(btnLogIn);
    }

    public static void main(String[] args) {

        new IniciarSesion();
}
}