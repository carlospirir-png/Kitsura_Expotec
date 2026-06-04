
package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MenuPrincipal extends JFrame {
    private FondoPanel fondo;
    
    public MenuPrincipal (){
        fondo = new FondoPanel("/main/fondoDosK.png");
        setContentPane(fondo);
        setTitle("Página Principal");
        setSize(1880,1080);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        fondo.setLayout(null);
        crearComponentes();
        setVisible(true);
    }
    private void crearComponentes(){
        //---------------- T I T U L O ----------------
        JLabel lblTitulo = new JLabel("MENÚ PRINCIPAL");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 36));
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setBounds(810, 120, 500, 50);
        fondo.add(lblTitulo);
        
        //---------------- BOTON PERFIL ----------------
        JButton btnPerfil = new JButton("PERFIL");
        btnPerfil.setFont(new Font("Arial", Font.BOLD, 16));
        btnPerfil.setBounds(820, 320, 285, 65);    
        btnPerfil.setIconTextGap(5);  
        ImageIcon icoPerfil = new ImageIcon(getClass().getResource("/main/pencil.png"));
        Image imgPerfil = icoPerfil.getImage().getScaledInstance(35,35, Image.SCALE_SMOOTH);
        btnPerfil.setIcon(new ImageIcon(imgPerfil));        
        fondo.add(btnPerfil);
        
        //---------------- BOTON MINIJUEGOS ----------------
        JButton btnMinijuegos = new JButton("MINIJUEGOS");
        btnMinijuegos.setFont(new Font("Arial", Font.BOLD, 16));
        btnMinijuegos.setBounds(820, 440, 285, 65);
        btnMinijuegos.setIconTextGap(5);        
        ImageIcon icoMinijuegos = new ImageIcon(getClass().getResource("/main/mandoo.png"));
        Image imgMinijuegos = icoMinijuegos.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnMinijuegos.setIcon(new ImageIcon(imgMinijuegos));       
        fondo.add(btnMinijuegos);
        
        //---------------- BOTON ESTADISTICAS ----------------
        JButton btnLogIn = new JButton("ESTADISTICAS");
        btnLogIn.setFont(new Font("Arial", Font.BOLD, 16));
        btnLogIn.setBounds(820,560,285,65);
        fondo.add(btnLogIn);
        
        //---------------- BOTON SALIR ----------------
        JButton btnSalir = new JButton("SALIR");
        btnSalir.setFont(new Font("Arial", Font.BOLD, 16));
        btnSalir.setBounds(820, 680, 285, 65);
        btnSalir.setIconTextGap(5);        
        ImageIcon icoSalir = new ImageIcon(getClass().getResource("/main/salir.png"));
        Image imgSalir = icoSalir.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        btnSalir.setIcon(new ImageIcon(imgSalir));        
        fondo.add(btnSalir);
        
        //---------------- MASCOTA ----------------
        JLabel mascota = new JLabel();
        ImageIcon mascotaIcon = new ImageIcon(getClass().getResource("/main/mascota3.png"));
        Image mascotaEscalada = mascotaIcon.getImage().getScaledInstance(181, 264, Image.SCALE_SMOOTH);
        mascota.setIcon(new ImageIcon(mascotaEscalada));
        mascota.setBounds(485, 525, 181, 264); 
        fondo.add(mascota);
    }
    
    public static void main(String[] args) {
        new MenuPrincipal();
}
}

