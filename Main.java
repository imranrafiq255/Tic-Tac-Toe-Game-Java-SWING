import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static JFrame frame;
    static JPanel panel;
    static JButton[] buttons = new JButton[9];
    static int counter = 0;
    public static void main(String[] args) {
        frame = new JFrame("Tic Tac Toe");
        frame.setBounds(100, 100, 400, 500);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        panel = new JPanel();
        panel.setSize(300, 300);
        panel.setLayout(new GridLayout(3, 3, 5, 5));
        Font font = new Font("My Font", Font.BOLD, 49);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(i + "");
            buttons[i].setBackground(Color.BLACK);
            buttons[i].setForeground(Color.WHITE);
            buttons[i].setOpaque(true);
            buttons[i].setBorderPainted(false);
            buttons[i].setFont(font);
            buttons[i].setFocusable(false);
            panel.add(buttons[i]);
        }

        for (int i = 0; i < buttons.length; i++) {
            int finalI = i;
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (buttons[finalI].getBackground().equals(Color.BLACK)) {
                        buttons[finalI].setBackground(Color.WHITE);
                        buttons[finalI].setForeground(Color.BLACK);
                    } else {
                        buttons[finalI].setBackground(Color.BLACK);
                        buttons[finalI].setForeground(Color.WHITE);
                    }
                    if (counter % 2 == 0)
                    {
                        buttons[finalI].setText("X");
                        counter++;
                        if (buttons[0].getText() == "X" && buttons[1].getText() == "X" && buttons[2].getText() == "X" )
                        {
                            JOptionPane.showMessageDialog(null, "You won the game");
                            return;
                        }
                        else if (buttons[0].getText() == "X" && buttons[3].getText() == "X" && buttons[6].getText() == "X" )
                        {
                            JOptionPane.showMessageDialog(null, "You won the game");
                            return;
                        }
                        else if (buttons[0].getText() == "X" && buttons[4].getText() == "X" && buttons[8].getText() == "X" )
                        {
                            JOptionPane.showMessageDialog(null, "Mr X won the game");
                            return;
                        }
                        else if (buttons[3].getText() == "X" && buttons[4].getText() == "X" && buttons[5].getText() == "X" )
                        {
                            JOptionPane.showMessageDialog(null, "Mr X won the game");
                            return;
                        }
                        else if (buttons[6].getText() == "X" && buttons[7].getText() == "X" && buttons[8].getText() == "X" )
                        {
                            JOptionPane.showMessageDialog(null, "Mr X won the game");
                            return;
                        }
                        else if (buttons[1].getText() == "X" && buttons[4].getText() == "X" && buttons[7].getText() == "X" )
                        {
                            JOptionPane.showMessageDialog(null, "Mr X won the game");
                            return;
                        }
                        else if (buttons[2].getText() == "X" && buttons[5].getText() == "X" && buttons[8].getText() == "X" )
                        {
                            JOptionPane.showMessageDialog(null, "Mr X won the game");
                            return;
                        }
                        else if (buttons[2].getText() == "X" && buttons[4].getText() == "X" && buttons[6].getText() == "X" )
                        {
                            JOptionPane.showMessageDialog(null, "Mr X won the game");
                            return;
                        }
                    }
                    else {
                        buttons[finalI].setText("O");
                        counter++;
                        if (buttons[0].getText() == "O" && buttons[1].getText() == "O" && buttons[2].getText() == "O" )
                        {
                            JOptionPane.showMessageDialog(null, "Mr O won the game");
                            return;
                        }
                        else if (buttons[0].getText() == "O" && buttons[3].getText() == "O" && buttons[6].getText() == "O" )
                        {
                            JOptionPane.showMessageDialog(null, "Mr O won the game");
                            return;
                        }
                        else if (buttons[0].getText() == "O" && buttons[4].getText() == "O" && buttons[8].getText() == "O" )
                        {
                            JOptionPane.showMessageDialog(null, "Mr O won the game");
                            return;
                        }
                        else if (buttons[3].getText() == "O" && buttons[4].getText() == "O" && buttons[5].getText() == "O" )
                        {
                            JOptionPane.showMessageDialog(null, "Mr O won the game");
                            return;
                        }
                        else if (buttons[6].getText() == "O" && buttons[7].getText() == "O" && buttons[8].getText() == "O" )
                        {
                            JOptionPane.showMessageDialog(null, "Mr O won the game");
                            return;
                        }
                        else if (buttons[1].getText() == "O" && buttons[4].getText() == "O" && buttons[7].getText() == "O" )
                        {
                            JOptionPane.showMessageDialog(null, "Mr O won the game");
                            return;
                        }
                        else if (buttons[2].getText() == "O" && buttons[5].getText() == "O" && buttons[8].getText() == "O" )
                        {
                            JOptionPane.showMessageDialog(null, "Mr O won the game");
                            return;
                        }
                        else if (buttons[2].getText() == "O" && buttons[4].getText() == "O" && buttons[6].getText() == "O" )
                        {
                            JOptionPane.showMessageDialog(null, "Mr O won the game");
                            return;
                        }
                    }
                    buttons[finalI].repaint();
                }
            });
        }

        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
