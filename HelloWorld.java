import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        // Création de la fenêtre
        JFrame frame = new JFrame(Constantes.HELLO_WORLD_TITLE);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.RED);

        // Création du label
        JLabel label = new JLabel(Constantes.HELLO_WORLD_TEXT, SwingConstants.CENTER);
        label.setForeground(Color.BLUE);

        // Ajout du label à la fenêtre
        frame.add(label);
        frame.setVisible(true);
    }
}

