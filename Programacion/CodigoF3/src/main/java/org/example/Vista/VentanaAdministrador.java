package org.example.Vista;

import org.example.Controladores.VistaController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAdministrador extends JFrame {
    public JPanel panel1;
    private JButton button1;
    private JButton altaJugadorButton;
    private JButton modificarJugadorButton;
    private JButton bajaJugadorButton;
    private JButton altaEquipoButton;
    private JButton modificarEquipoButton;
    private JButton bajaEquipoButton;
    private JButton introducirResultadosButton;
    private JButton verInformesButton;
    private static VistaController vc;


    /**
     * Clase que representa la ventana principal del administrador.
     * Esta ventana permite al administrador realizar varias acciones como
     * dar de alta, modificar y dar de baja jugadores y equipos, así como
     * introducir resultados en la competición.
     */
    public VentanaAdministrador(VistaController vc, String aNombre) {
        this.vc = vc;
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MenuPrincipal");
        setSize(500, 580);
        setLocationRelativeTo(null);
        setResizable(false);

        JMenuBar menuBar = new JMenuBar();

        JMenu Jusuario = new JMenu("Usuario");
        JMenu JotrasOpciones = new JMenu("Otras opciones");

        JMenuItem Jnombre = new JMenuItem(aNombre);
        JMenuItem JcambiarUsuario = new JMenuItem("Cambiar de Usuario");
        JMenuItem Jsalir = new JMenuItem("Salir");

        Jusuario.add(Jnombre);
        Jusuario.add(JcambiarUsuario);
        JotrasOpciones.add(Jsalir);

        Jnombre.setEnabled(false);

        menuBar.add(Jusuario);
        menuBar.add(JotrasOpciones);

        setJMenuBar(menuBar);

        JcambiarUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                vc.mostrarVentanaInicio();
            }
        });

        Jsalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        altaJugadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAltaJugador ventanaAltaJugador = new VentanaAltaJugador(vc);
                ventanaAltaJugador.setVisible(true);
            }
        });
        modificarJugadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaModificarJugador ventanaModificarJugador = new VentanaModificarJugador(vc);
                ventanaModificarJugador.setVisible(true);
            }
        });
        bajaJugadorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaBajaJugador ventanaBajaJugador = new VentanaBajaJugador(vc);
                ventanaBajaJugador.setVisible(true);
            }
        });

        altaEquipoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAltaEquipo ventanaAltaEquipo = new VentanaAltaEquipo(vc);
                ventanaAltaEquipo.setVisible(true);
            }
        });
        modificarEquipoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaModificarEquipo ventanaModificarEquipo = new VentanaModificarEquipo(vc);
                ventanaModificarEquipo.setVisible(true);
            }
        });
        bajaEquipoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaBajaEquipo ventanaBajaEquipo = new VentanaBajaEquipo(vc);
                ventanaBajaEquipo.setVisible(true);
            }
        });
        introducirResultadosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaIntroducirResultados ventanaIntroducirResultados = new VentanaIntroducirResultados(vc);
                ventanaIntroducirResultados.setVisible(true);
            }
        });

        verInformesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaInformes ventanaInformes = new VentanaInformes(vc);
                ventanaInformes.setVisible(true);
            }
        });
    }
}
