package com.ajawhar.actions;

import com.intellij.ide.passwordSafe.PasswordSafe;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.uiDesigner.core.AbstractLayout;
import com.intellij.util.ui.GridBag;
import com.intellij.util.ui.JBUI;
import com.intellij.util.ui.UIUtil;
import org.jetbrains.annotations.Nullable;
import com.intellij.ui.components.JBLabel;

import java.awt.*;
import javax.swing.*;


/**
 * @author Alaa Jawhar
 */
public class SqlGeneratorDialogWrapper extends DialogWrapper {

    private JPanel panel = new JPanel(new GridBagLayout());
    private JTextField txtMode = new JTextField();
    private JTextField txtUsername = new JTextField();
    private JPasswordField txtPassword = new JPasswordField();

    @Override
    protected void init() {
        super.init();
        this.setTitle("MyIdeaDemo Data");
    }

    protected SqlGeneratorDialogWrapper(@Nullable Project project) {
        super(project, true);
        init();
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        System.out.println("Start createCenterPanel");
        GridBag gb = new GridBag()
                .setDefaultInsets(new Insets(0, 0, AbstractLayout.DEFAULT_VGAP, AbstractLayout.DEFAULT_HGAP))
                .setDefaultWeightX(1.0)
                .setDefaultFill(GridBagConstraints.HORIZONTAL);

        panel.setPreferredSize(new Dimension(400, 200));

        panel.add(label("Table Name"), gb.nextLine().next().weightx(0.2));
        panel.add(txtMode, gb.next().weightx(0.8));
        panel.add(label("SQL Constant Class Name: "), gb.nextLine().next().weightx(0.2));
        panel.add(txtUsername, gb.next().weightx(0.8));
        panel.add(label("SQL Args Class Name"), gb.nextLine().next().weightx(0.2));
        panel.add(txtPassword, gb.next().weightx(0.8));

        return panel;
    }

    private JComponent label(String text) {
        JBLabel label = new JBLabel(text);
        label.setComponentStyle(UIUtil.ComponentStyle.SMALL);
        label.setFontColor(UIUtil.FontColor.BRIGHTER);
        label.setBorder(JBUI.Borders.empty(0, 5, 2, 0));
        return label;
    }

    @Override
    protected void doOKAction() {
        String mode = txtMode.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getPassword().toString();
        System.out.println(mode + " | " + username + " | " + password);
    }
}
