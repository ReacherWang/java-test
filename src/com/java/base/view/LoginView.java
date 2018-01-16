package com.java.base.view;

import com.java.base.model.User;
import com.java.base.service.UserService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {

    public LoginView() {
        super("Login");
        this.init();
    }

    private void init() {
        this.setSize(350, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(this.placeComponents());

        this.setVisible(true);
    }

    private JPanel placeComponents() {

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        panel.add(this.loginButton(userText, passwordText));

        return panel;
    }

    private JButton loginButton(final JTextField userText, final JPasswordField passwordText) {
        JButton button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserService userService = new UserService();
                User user = userService.login(userText.getText(), new String(passwordText.getPassword()));
                if (null != user) {
                    dispose();
                    new HomeView();
                }
            }
        });
        return button;
    }

}
