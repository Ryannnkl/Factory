package botao;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Botao do windows
 */

public class BotaoWindows implements Botao {
    JPanel painel = new JPanel();
    JFrame frame = new JFrame();
    JButton botao;

    public void criar() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel texto = new JLabel("Ola mundo!");
        texto.setOpaque(true);
        texto.setBackground(new Color(235, 233, 126));
        texto.setFont(new Font("Dialog", Font.BOLD, 44));
        texto.setHorizontalAlignment(SwingConstants.CENTER);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(painel);
        painel.add(texto);
        aoClicar();
        painel.add(botao);

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