package botao;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Botao do windows
 */

public class BotaoWindows implements Botao {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton botao;

    public void criar() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Ola mundo!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        aoClicar();
        panel.add(botao);

        frame.setSize(320, 200);
        frame.setVisible(true);
        aoClicar();
    }

    public void aoClicar() {
        botao = new JButton("Sair");
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }
}