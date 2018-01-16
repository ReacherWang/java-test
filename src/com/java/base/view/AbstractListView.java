package com.java.base.view;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by reacher on 17-9-14.
 */
public abstract class AbstractListView extends JFrame {

    protected abstract String[] getColumnNames();

    protected abstract Object[][] getDatas();

    public AbstractListView() throws HeadlessException {
        super("List");
        this.init();
    }

    public void init() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        JScrollPane scroll = new JScrollPane(this.createTable());
        scroll.setSize(500, 400);
        panel.add(this.homeButton());
        panel.add(scroll);

        this.setVisible(true);
    }

    private JTable createTable() {
        JTable table = new JTable(getDatas(), this.getColumnNames());
        /*
		 * 设置JTable的列默认的宽度和高度
		 */
        TableColumn column = null;
        int colunms = table.getColumnCount();
        for(int i = 0; i < colunms; i++)
        {
            column = table.getColumnModel().getColumn(i);
			/*将每一列的默认宽度设置为100*/
            column.setPreferredWidth(100);
        }
        /*
		 * 设置JTable自动调整列表的状态，此处设置为关闭
		 */
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        return table;
    }

    private JButton homeButton() {
        JButton button = new JButton("返回主页");
        button.setBounds(10, 400, 120, 25);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new HomeView();
            }
        });
        return button;
    }
}
