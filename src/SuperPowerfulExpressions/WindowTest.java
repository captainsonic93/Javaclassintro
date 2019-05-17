package SuperPowerfulExpressions;


    import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


    public class WindowTest extends Intro{
        public static void main(final String[] args) {
            final JFrame parent = new JFrame();
            final JFrame money = new JFrame();
            JButton button = new JButton();
            JButton button1 = new JButton();

            button.setText("Click me to show Changes!");
            button1.setText("How Much?");
            parent.add(button);
            money.add(button1);
            parent.pack();
            parent.setVisible(true);
            money.pack();
            money.setVisible(true);

           /** button1.addActionListener(new java.awt.event.ActionListener()){
                @Override
                        public void moneysaved(java.awt.event.ActionListener evt){
                    String cost = JOptionPane.showInputDialog(money,"does it cost?")
                }

            }*/

            button1.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    String cost = JOptionPane.showInputDialog(money,
                            "What is your cost?", null);
                    System.out.println(cost+ 45);

                }

            });
        }

}
