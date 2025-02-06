package chatwithSwing.components;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlternarPaneles extends JFrame {

    // Paneles que vamos a alternar
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;

    // El contenedor principal
    private JPanel contenedor;

    public AlternarPaneles() {
        // Configuración básica del JFrame
        setTitle("Alternar entre paneles con JMenuBar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Inicializamos los paneles
        initPaneles();

        // Creamos el JMenuBar con JMenu y JMenuItem
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opciones");

        JMenuItem itemPanel1 = new JMenuItem("Mostrar Panel 1");
        JMenuItem itemPanel2 = new JMenuItem("Mostrar Panel 2");
        JMenuItem itemPanel3 = new JMenuItem("Mostrar Panel 3");

        // Agregamos los JMenuItems al JMenu
        menu.add(itemPanel1);
        menu.add(itemPanel2);
        menu.add(itemPanel3);

        // Agregamos el JMenu al JMenuBar
        menuBar.add(menu);

        // Establecemos el JMenuBar en el JFrame
        setJMenuBar(menuBar);

        // Inicializamos el panel contenedor y establecemos un CardLayout
        contenedor = new JPanel(new CardLayout());
        contenedor.add(panel1, "Panel 1");
        contenedor.add(panel2, "Panel 2");
        contenedor.add(panel3, "Panel 3");

        // Agregamos el contenedor al JFrame
        add(contenedor);

        // Escuchadores para alternar entre los paneles
        itemPanel1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Alternamos al Panel 1
                alternarPanel("Panel 1");
            }
        });

        itemPanel2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Alternamos al Panel 2
                alternarPanel("Panel 2");
            }
        });

        itemPanel3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Alternamos al Panel 3
                alternarPanel("Panel 3");
            }
        });
    }

    private void initPaneles() {
        // Configuramos el Panel 1
        panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.add(new JLabel("Este es el Panel 1"));

        // Configuramos el Panel 2
        panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.add(new JLabel("Este es el Panel 2"));

        // Configuramos el Panel 3
        panel3 = new JPanel();
        panel3.setBackground(Color.BLUE);
        panel3.add(new JLabel("Este es el Panel 3"));
    }

    // Método para alternar entre paneles usando CardLayout
    private void alternarPanel(String nombrePanel) {
        CardLayout cl = (CardLayout)(contenedor.getLayout());
        cl.show(contenedor, nombrePanel);
    }

    public static void main(String[] args) {
        // Ejecutamos la aplicación en el hilo de eventos de Swing
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Creamos y mostramos la ventana
                AlternarPaneles ventana = new AlternarPaneles();
                ventana.setVisible(true);
            }
        });
    }
}
