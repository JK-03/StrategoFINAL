package Stratego;


import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author jenniferbueso
 */
public class MenuPrincipal extends javax.swing.JFrame {
    ArrayList<UsuariosInfo> listaUsuarios;
    ArrayList<LogsInfo> listaLogs;
    ArrayList<UsuariosEliminadosInfo> listaUsuariosEliminados;
    String nombreUsuario;
    
    //Atributos por Default de la Cuenta
    String usuarioGPerfil;
    private boolean modoTutorial = true;
    
    public MenuPrincipal(ArrayList<UsuariosInfo> listaUsuariosExterna, ArrayList<LogsInfo> listaLogsExterna, String nombreUsuario, ArrayList<UsuariosEliminadosInfo> listaUsuariosEliminadosExterna, boolean ModoJuego) {
        this.nombreUsuario = nombreUsuario;
        usuarioGPerfil = nombreUsuario;
        listaUsuarios = listaUsuariosExterna;
        listaLogs = listaLogsExterna;
        listaUsuariosEliminados = listaUsuariosEliminadosExterna;
        modoTutorial = ModoJuego;
        
        //Centrar Ventana
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1180, 626);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonStratego = new javax.swing.JLabel();
        BotonConfiguracion = new javax.swing.JLabel();
        BotonUniversoMarvel = new javax.swing.JLabel();
        BotonMiPerfil = new javax.swing.JLabel();
        BotonCerrarSesion = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonStratego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosInterfaz/BotonStrategoMenuPrincipal.png"))); // NOI18N
        BotonStratego.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonStratego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonStrategoMouseClicked(evt);
            }
        });
        jPanel1.add(BotonStratego, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 275, 470, 100));

        BotonConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosInterfaz/BotonConfiguracion.png"))); // NOI18N
        BotonConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonConfiguracionMouseClicked(evt);
            }
        });
        jPanel1.add(BotonConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 320, 70));

        BotonUniversoMarvel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosInterfaz/BotonUniversoMarvel.png"))); // NOI18N
        BotonUniversoMarvel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonUniversoMarvel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonUniversoMarvelMouseClicked(evt);
            }
        });
        jPanel1.add(BotonUniversoMarvel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, 320, 70));

        BotonMiPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosInterfaz/BotonMiPerfil.png"))); // NOI18N
        BotonMiPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonMiPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMiPerfilMouseClicked(evt);
            }
        });
        jPanel1.add(BotonMiPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 320, 70));

        BotonCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosInterfaz/BotonCerrarSesion.png"))); // NOI18N
        BotonCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCerrarSesionMouseClicked(evt);
            }
        });
        jPanel1.add(BotonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1008, 100, 80, 70));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FondosInterfaz/MenuPrincipal(833 x 462 px).png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarSesionMouseClicked
        String mensaje = "¿Estás seguro de que quieres cerrar la sesión?";
        String titulo = "Confirmar cierre de sesión";

        int respuesta = JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.YES_NO_OPTION);

        if (respuesta == JOptionPane.YES_OPTION) {
        PantallaPrincipal pantallaPrincipal = new PantallaPrincipal(listaUsuarios, listaLogs, listaUsuariosEliminados,modoTutorial);
        pantallaPrincipal.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_BotonCerrarSesionMouseClicked

    private void BotonConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonConfiguracionMouseClicked
        Configuracion configuracion = new Configuracion(listaUsuarios, this.listaLogs, nombreUsuario,this.listaUsuariosEliminados,modoTutorial);
        configuracion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonConfiguracionMouseClicked

    private void BotonMiPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMiPerfilMouseClicked
        MiPerfil miPerfil = new MiPerfil(this.listaUsuarios, this.listaLogs, nombreUsuario,this.listaUsuariosEliminados,modoTutorial);
        miPerfil.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_BotonMiPerfilMouseClicked

    private void BotonUniversoMarvelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonUniversoMarvelMouseClicked
        UniversoMarvel universoMarvel = new UniversoMarvel(listaUsuarios, listaLogs, nombreUsuario,listaUsuariosEliminados,modoTutorial);
        universoMarvel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonUniversoMarvelMouseClicked
    
    private GameBoard gameBoard;
    
    private void BotonStrategoMouseClicked(java.awt.event.MouseEvent evt) {
        if (listaUsuarios.size() < 2) {
            JOptionPane.showMessageDialog(null, "Se requieren al menos dos usuarios para iniciar el juego. Por favor, cree más usuarios antes de comenzar.", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
         int confirmationResult = JOptionPane.showConfirmDialog(null, "¿Realmente deseas comenzar una nueva partida?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (confirmationResult == JOptionPane.YES_OPTION) {
             if (gameBoard != null) {
                 gameBoard.close(); // Cerrar el tablero de juego actual si existe
             }
             SwingUtilities.invokeLater(() -> {
                 gameBoard = new GameBoard(this.listaUsuarios, this.listaLogs, nombreUsuario, this.listaUsuariosEliminados, this.modoTutorial);
                 gameBoard.setVisible(true);
                 this.setVisible(false);
             });
         }
         // Si el usuario elige "No" en la confirmación, no se realiza ninguna acción.
     }
   }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal(null, null, null,null,true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonCerrarSesion;
    private javax.swing.JLabel BotonConfiguracion;
    private javax.swing.JLabel BotonMiPerfil;
    private javax.swing.JLabel BotonStratego;
    private javax.swing.JLabel BotonUniversoMarvel;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
