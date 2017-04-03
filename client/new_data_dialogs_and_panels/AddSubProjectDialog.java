package new_data_dialogs_and_panels;

import Controller.DbController;
import Controller.TableNames;
import db.Db;
import model.Project;
import model.SubProject;
import model.TableElement;
import model.exception.CanNotCreateObjectException;
import model_params.ProjectType;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.NumberFormatter;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.List;

/**
 * Created by Ariel Ramati
 */
public class AddSubProjectDialog extends NewDataAbstractDialog {
    private final JPanel contentPanel = new JPanel();
    private JComboBox<String> projectNameComboBox;
    private List<Project> allProjects;
    private Project fullProject;
    private JTextField subProjectTextField;
    private JFormattedTextField estimatedCostForMe;
    private JComboBox projectTypeComboBox;

    public AddSubProjectDialog () {
        fullProject = null;
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setTitle("הוספת פרוייקט משנה");

        setBounds(100, 100, 450, 244);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.NORTH);
        GridBagLayout gbl_contentPanel = new GridBagLayout();
        gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
        gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
        gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        contentPanel.setLayout(gbl_contentPanel);
        {
            projectNameComboBox = new JComboBox();
            GridBagConstraints gbc_combo = new GridBagConstraints();
            gbc_combo.insets = new Insets(0, 50, 5, 5);
            gbc_combo.gridx = 6;
            gbc_combo.gridy = 1;
            allProjects = DbController.getAllProjects();
            for (Project project : allProjects) {
                projectNameComboBox.addItem(project.getProjectName());
            }
            projectNameComboBox.setBounds(180, 50, 140, 20);
            projectNameComboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed (ActionEvent e) {
                    fullProject = allProjects.get(projectNameComboBox.getSelectedIndex());
                    if (!fullProject.getProjectName().equals(projectNameComboBox.getSelectedItem())) {
                        for (Project project : allProjects) {
                            if (projectNameComboBox.getSelectedItem().equals(project.getProjectName())) {
                                fullProject = project;
                            }
                        }
                    }
                }
            });
            contentPanel.add(projectNameComboBox, gbc_combo);
        }
        {
            JLabel label = new JLabel("בחר פרוייקט ראשי:");
            GridBagConstraints gbc_label = new GridBagConstraints();
            gbc_label.insets = new Insets(0, 0, 5, 5);
            gbc_label.gridx = 9;
            gbc_label.gridy = 1;
            contentPanel.add(label, gbc_label);
        }
        {
            subProjectTextField = new JTextField();
            GridBagConstraints gbc_textField = new GridBagConstraints();
            gbc_textField.insets = new Insets(0, 0, 5, 5);
            gbc_textField.fill = GridBagConstraints.HORIZONTAL;
            gbc_textField.gridx = 6;
            gbc_textField.gridy = 2;
            contentPanel.add(subProjectTextField, gbc_textField);
            subProjectTextField.setColumns(10);
        }
        {
            JLabel label = new JLabel("שם פרוייקט המשנה:");
            GridBagConstraints gbc_label = new GridBagConstraints();
            gbc_label.insets = new Insets(0, 0, 5, 5);
            gbc_label.gridx = 9;
            gbc_label.gridy = 2;
            contentPanel.add(label, gbc_label);
        }
        {
            projectTypeComboBox = new JComboBox();
            GridBagConstraints gbc_comboBox = new GridBagConstraints();
            gbc_comboBox.insets = new Insets(0, 0, 5, 5);
            gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
            gbc_comboBox.gridx = 6;
            gbc_comboBox.gridy = 3;
            for (ProjectType type : ProjectType.values()) {
                projectTypeComboBox.addItem(type);
            }
            contentPanel.add(projectTypeComboBox, gbc_comboBox);
        }
        {
            JLabel label = new JLabel("\u05E1\u05D5\u05D2 \u05D4\u05E4\u05E8\u05D5\u05D9\u05D9\u05E7\u05D8:");
            GridBagConstraints gbc_label = new GridBagConstraints();
            gbc_label.insets = new Insets(0, 0, 5, 5);
            gbc_label.gridx = 9;
            gbc_label.gridy = 3;
            contentPanel.add(label, gbc_label);
        }
        {
            NumberFormat format = NumberFormat.getInstance();
            NumberFormatter formatter = new NumberFormatter(format);
            formatter.setValueClass(Integer.class);
            formatter.setMinimum(0);
            formatter.setMaximum(Integer.MAX_VALUE);
            formatter.setAllowsInvalid(false);
            // If you want the value to be committed on each keystroke instead of focus lost
            formatter.setCommitsOnValidEdit(true);
            estimatedCostForMe = new JFormattedTextField(formatter);
            GridBagConstraints gbc_textField_1 = new GridBagConstraints();
            gbc_textField_1.insets = new Insets(0, 0, 0, 5);
            gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
            gbc_textField_1.gridx = 6;
            gbc_textField_1.gridy = 4;
            contentPanel.add(estimatedCostForMe, gbc_textField_1);
            estimatedCostForMe.setColumns(10);
        }
        {
            JLabel label = new JLabel("\u05E2\u05DC\u05D5\u05EA \u05DE\u05D5\u05E2\u05E8\u05DB\u05EA \u05DC\u05E4\u05E8\u05D5\u05D9\u05D9\u05E7\u05D8 \u05D4\u05DE\u05E9\u05E0\u05D4 \u05E2\u05D1\u05D5\u05E8\u05D9:");
            GridBagConstraints gbc_label = new GridBagConstraints();
            gbc_label.insets = new Insets(0, 0, 0, 5);
            gbc_label.gridx = 9;
            gbc_label.gridy = 4;
            contentPanel.add(label, gbc_label);
        }


        addOkCancelPanel();

        setVisible(true);
    }

    @Override
    protected TableNames getTable () {
        return TableNames.SUB_PROJECT;
    }

    @Override
    protected TableElement packToTableElement () throws CanNotCreateObjectException {
        return new SubProject(fullProject.getSerialNumber(),
                subProjectTextField.getText(),
                fullProject.getProjectAddress(),
                (ProjectType) projectTypeComboBox.getSelectedItem(),
                Integer.valueOf(estimatedCostForMe.getText()));
    }

}
