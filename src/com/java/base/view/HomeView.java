package com.java.base.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by reacher on 17-9-14.
 */
public class HomeView extends JFrame {

    public HomeView() throws HeadlessException {
        super("Home");
        this.init();
    }

    private void init() {

        this.setSize(350, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        this.add(panel);

        panel.setLayout(null);

        panel.add(this.createButton());
        panel.add(this.findAllButton());

        this.setVisible(true);
    }

    private JButton createButton() {
        JButton button = new JButton("创建用户");
        button.setBounds(10, 30, 80, 25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO
            }
        });
        return button;
    }

    private JButton findAllButton() {
        JButton button = new JButton("查看数据");
        button.setBounds(100, 30, 80, 25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new UserListView();
            }
        });
        return button;
    }
}
