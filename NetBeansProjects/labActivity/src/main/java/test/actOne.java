package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.*;

public class actOne extends JFrame implements ActionListener{
    private LinkedList<String> linkedlist;
    private DefaultListModel listModel;
    private JList<String> list;
    private JScrollPane scroll;
    private JTextField txtfield;
    private JLabel taskLabel;
    private JButton btnAdd, btnRemove, btnComplete;
    
    actOne () {
        linkedlist = new LinkedList<>();
        listModel = new DefaultListModel();
        
        setSize(400, 400);
        setTitle("Task Manager");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        list = new JList<>(listModel);
        scroll = new JScrollPane(list);
        scroll.setBounds(20, 115, 225, 225);
        add(scroll);
        
        txtfield = new JTextField();
        txtfield.setBounds(20, 50, 225, 40);
        add(txtfield);
        
        taskLabel = new JLabel("Enter Task");
        taskLabel.setBounds(270, 50, 100, 40);
        add(taskLabel);
       
        btnAdd = new JButton("ADD");
        btnAdd.setBounds(260, 130, 110, 40);
        add(btnAdd);
        
        btnRemove = new JButton("REMOVE");
        btnRemove.setBounds(260, 200, 110, 40);
        add(btnRemove);
        
        btnComplete = new JButton("COMPLETE");
        btnComplete.setBounds(260, 270, 110, 40);
        add(btnComplete);
        
        btnAdd.addActionListener(this);
        btnRemove.addActionListener(this);
        btnComplete.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnAdd) {
            String task = txtfield.getText();
            if(!task.isEmpty()) {
                linkedlist.add(task);
                listModel.addElement(task);
                txtfield.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Add item to the list", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnRemove) {
            int indexSelected = list.getSelectedIndex();
            if (indexSelected != -1) {
                linkedlist.remove();
                listModel.removeElementAt(indexSelected);
            } else {
                JOptionPane.showMessageDialog(this, "Select item to the list", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnComplete) {
            int indexS = list.getSelectedIndex();

            if(indexS != -1) {
                String task = linkedlist.get(indexS);
                String complete = task + "[Completed]";
                linkedlist.set(indexS, complete);
                listModel.setElementAt(complete, indexS);
            } else {
                JOptionPane.showMessageDialog(this, "Select item to the list", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
