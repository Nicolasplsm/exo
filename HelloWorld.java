import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        // Création de la fenêtre
        JFrame frame = new JFrame("Hello World");
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création du label
        JLabel label = new JLabel("Hello World", SwingConstants.CENTER);

        // Ajout du label à la fenêtre
        frame.add(label);
        frame.setVisible(true);
    }
}
