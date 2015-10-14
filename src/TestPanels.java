import java.awt.*;
import javax.swing.*;

/**U10111033, Computer science 4, Hsueh_Hsin Lu*/

public class TestPanels extends JFrame {
  public TestPanels() {
    // Create panel p1 for the buttons and set GridLayout
    JPanel p1 = new JPanel();
    p1.setLayout(new GridLayout(5, 4));

    p1.add(new JButton("<"));
    p1.add(new JButton("CE"));
    p1.add(new JButton("C"));
    p1.add(new JButton("%"));
    p1.add(new JButton("" + 7));
    p1.add(new JButton("" + 8));
    p1.add(new JButton("" + 9));
    p1.add(new JButton("/"));
    p1.add(new JButton("" + 4));
    p1.add(new JButton("" + 5));
    p1.add(new JButton("" + 6));
    p1.add(new JButton("*"));
    p1.add(new JButton("" + 1));
    p1.add(new JButton("" + 2));
    p1.add(new JButton("" + 3));
    p1.add(new JButton("-"));
    p1.add(new JButton("" + 0));
    p1.add(new JButton("."));
    p1.add(new JButton("+"));
    p1.add(new JButton("="));

    // Create panel p2 to hold a text field and p1
    JPanel p2 = new JPanel(new BorderLayout());
    p2.add(new JTextField("Result to be displayed here"),
      BorderLayout.NORTH);
    p2.add(p1, BorderLayout.CENTER);

    // add contents into the frame
    add(p2, BorderLayout.CENTER);
    /**add(new JButton("Food to be placed here"),
      BorderLayout.CENTER);*/
  }

  /** Main method */
  public static void main(String[] args) {
    TestPanels frame = new TestPanels();
    frame.setTitle("Calculator");
    frame.setSize(250, 300);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
