import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ToDoApp extends JFrame {
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;
    private JTextField taskInput;

    public ToDoApp() {
        setTitle("To-Do List App 📝");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center window

        // Layout
        setLayout(new BorderLayout());

        // Top input panel
        JPanel inputPanel = new JPanel();
        taskInput = new JTextField(20);
        JButton addButton = new JButton("Add Task");

        inputPanel.add(taskInput);
        inputPanel.add(addButton);
        add(inputPanel, BorderLayout.NORTH);

        // Task list in center
        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);
        add(new JScrollPane(taskList), BorderLayout.CENTER);

        // Bottom button panel
        JPanel bottomPanel = new JPanel();
        JButton removeButton = new JButton("Remove Selected");
        bottomPanel.add(removeButton);
        add(bottomPanel, BorderLayout.SOUTH);

        // Event: Add task
        addButton.addActionListener(e -> {
            String task = taskInput.getText().trim();
            if (!task.isEmpty()) {
                taskListModel.addElement(task);
                taskInput.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Task cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        });

        // Event: Remove task
        removeButton.addActionListener(e -> {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                taskListModel.remove(selectedIndex);
            } else {
                JOptionPane.showMessageDialog(this, "No task selected!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        // Run GUI in the Event Dispatch Thread (important!)
        SwingUtilities.invokeLater(() -> new ToDoApp());
    }
}
