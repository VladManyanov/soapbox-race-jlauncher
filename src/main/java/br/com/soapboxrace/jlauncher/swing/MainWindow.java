/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.soapboxrace.jlauncher.swing;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JFileChooser;

import br.com.soapboxrace.jlauncher.LoginCreate;
import br.com.soapboxrace.jlauncher.Main;
import br.com.soapboxrace.jlauncher.util.ServerList;
import br.com.soapboxrace.jlauncher.vo.ConfigVO;
import br.com.soapboxrace.jlauncher.vo.LoginOkVO;
import org.jdesktop.swingx.prompt.PromptSupport;

/**
 *
 * @author nils and Vanquish
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 5483993078168848130L;

    private LoginOkVO loginOkVO;
    private ConfigVO configVO = Main.loadConfig();
    private ServerList serverList = new ServerList();
    private ResourceBundle Text = ResourceBundle.getBundle("locales.locale", Locale.getDefault());

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        serverAddrCombo.removeAllItems();
        serverAddrCombo.addItem(configVO.getServerURL());
        if (!configVO.getGameExePath().isEmpty()) {
            pathLabel.setText(configVO.getGameExePath());
            checkGameFile(configVO.getGameExePath());
        }
        String passwordSHA1 = configVO.getPasswordSHA1();
        loginSaveCredentialsCheckBox.setSelected(configVO.isSaveCredentials());
        if (configVO.getEmail().equals("")) {
            PromptSupport.setPrompt(Text.getString("Email"), loginEmailText);
        } else {
            loginEmailText.setText(configVO.getEmail());
        }
        if (passwordSHA1.equals("")) {
            PromptSupport.setPrompt(Text.getString("Password"), loginPasswordText);
        } else {
            loginPasswordText.setText("********************");
        }
        loginSaveCredentialsCheckBox.setSelected(configVO.isSaveCredentials());
        PromptSupport.setPrompt(Text.getString("EnterEmail"), createEmailText);
        PromptSupport.setPrompt(Text.getString("EnterPassword"), createPasswd1Text);
        PromptSupport.setPrompt(Text.getString("ConfirmPassword"), createPasswd2Text);
        PromptSupport.setPrompt(Text.getString("InviteTicket"), createTicketText);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        mainPanel = new javax.swing.JPanel();
        loginRegisterTabbedPanel = new javax.swing.JTabbedPane();
        loginTab = new javax.swing.JPanel();
        loginEmailText = new javax.swing.JTextField();
        loginPasswordText = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        loginSaveCredentialsCheckBox = new javax.swing.JCheckBox();
        registerTab = new javax.swing.JPanel();
        createTicketText = new javax.swing.JTextField();
        createPasswd1Text = new javax.swing.JPasswordField();
        createPasswd2Text = new javax.swing.JPasswordField();
        createEmailText = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        serverAddressText = new javax.swing.JLabel();
        pathLabel = new javax.swing.JLabel();
        changeGamePathButton = new javax.swing.JButton();
        launchButton = new javax.swing.JButton();
        messageBase = new javax.swing.JPanel();
        messageLabel = new javax.swing.JLabel();
        serverAddrCombo = new javax.swing.JComboBox<>();
        srvListButton = new javax.swing.JButton();
        serverInfoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SoapBox World Racing Launcher");

        loginRegisterTabbedPanel.setEnabled(false);

        loginEmailText.setEnabled(false);

        loginPasswordText.setEnabled(false);

        loginButton.setText(Text.getString("Login"));
        loginButton.setEnabled(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        loginSaveCredentialsCheckBox.setEnabled(false);
        loginSaveCredentialsCheckBox.setLabel(Text.getString("SaveCredentials"));

        javax.swing.GroupLayout loginTabLayout = new javax.swing.GroupLayout(loginTab);
        loginTab.setLayout(loginTabLayout);
        loginTabLayout.setHorizontalGroup(
            loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginTabLayout.createSequentialGroup()
                        .addGap(0, 534, Short.MAX_VALUE)
                        .addComponent(loginButton))
                    .addComponent(loginEmailText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loginPasswordText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginTabLayout.createSequentialGroup()
                        .addComponent(loginSaveCredentialsCheckBox)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        loginTabLayout.setVerticalGroup(
            loginTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginSaveCredentialsCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(loginButton)
                .addContainerGap())
        );

        loginRegisterTabbedPanel.addTab("Launcher", loginTab);

        createButton.setText(Text.getString("CreateAccount"));
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerTabLayout = new javax.swing.GroupLayout(registerTab);
        registerTab.setLayout(registerTabLayout);
        registerTabLayout.setHorizontalGroup(
            registerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerTabLayout.createSequentialGroup()
                .addGroup(registerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(registerTabLayout.createSequentialGroup()
                        .addGap(0, 544, Short.MAX_VALUE)
                        .addComponent(createButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerTabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(registerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(createPasswd1Text)
                            .addComponent(createEmailText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createTicketText)
                            .addComponent(createPasswd2Text, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
        );
        registerTabLayout.setVerticalGroup(
            registerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createPasswd1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createPasswd2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createTicketText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(createButton)
                .addContainerGap())
        );

        loginRegisterTabbedPanel.addTab("Create Account", registerTab);

        serverAddressText.setText(Text.getString("ServerAddress"));

        pathLabel.setText(Text.getString("ChooseGamePath"));

        changeGamePathButton.setText(Text.getString("ChangeGamePath"));
        changeGamePathButton.setToolTipText("");
        changeGamePathButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeGamePathButtonActionPerformed(evt);
            }
        });

        launchButton.setText(Text.getString("LaunchGame"));
        launchButton.setEnabled(false);
        launchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                launchButtonActionPerformed(evt);
            }
        });

        messageBase.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setText("<html><b>SoapBox Race World Online Launcher Beta v0.0.6</b></html>");

        javax.swing.GroupLayout messageBaseLayout = new javax.swing.GroupLayout(messageBase);
        messageBase.setLayout(messageBaseLayout);
        messageBaseLayout.setHorizontalGroup(
            messageBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messageBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageLabel)
                .addContainerGap())
        );
        messageBaseLayout.setVerticalGroup(
            messageBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messageBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        messageLabel.getAccessibleContext().setAccessibleName("messageLabel");

        serverAddrCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { Text.getString("SelectServer") }));
        serverAddrCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverAddrComboActionPerformed(evt);
            }
        });

        srvListButton.setText(Text.getString("GetServerList"));
        srvListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srvListButtonActionPerformed(evt);
            }
        });

        serverInfoButton.setText(Text.getString("GetServerInfo"));
        serverInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverInfoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginRegisterTabbedPanel, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(messageBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(launchButton))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(changeGamePathButton)
                                .addGap(18, 18, 18)
                                .addComponent(pathLabel))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(serverAddressText)
                                .addGap(18, 18, 18)
                                .addComponent(serverAddrCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(srvListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(serverInfoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(serverAddressText)
                        .addComponent(serverAddrCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(srvListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serverInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(changeGamePathButton)
                        .addComponent(pathLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginRegisterTabbedPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(launchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void serverInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverInfoButtonActionPerformed
        new ServerInfo().setVisible(true);
    }//GEN-LAST:event_serverInfoButtonActionPerformed

    private void serverAddrComboActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_serverAddrComboActionPerformed
        // TODO add your handling code here:
        serverAddrCombo.getItemAt(0);
    }// GEN-LAST:event_serverAddrComboActionPerformed

    private void srvListButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_srvListButtonActionPerformed
        serverAddrCombo.removeAllItems();
        try {
            String[] serverListStr = serverList.getServerList();
            for (String string : serverListStr) {
                serverAddrCombo.addItem(string);
            }
        } catch (Exception e) {
            setErrorMessage("Error loading server list");
        }
    }// GEN-LAST:event_srvListButtonActionPerformed

    private void changeGamePathButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_changeGamePathButtonActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            String path = file.getAbsolutePath();
            pathLabel.setText(path);
            Main.saveGamePath(path);
            checkGameFile(path);
        }
    }// GEN-LAST:event_changeGamePathButtonActionPerformed

    private void launchButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_launchButtonActionPerformed
        String token = loginOkVO.getLoginToken();
        String userId = loginOkVO.getUserId();
        String srvStr = getUrl() + "/soapbox-race-core/Engine.svc";
        String gamePath = pathLabel.getText();
        ProcessBuilder processBuilder = new ProcessBuilder(gamePath, "US", srvStr, token, userId);
        try {
            processBuilder.start();
            System.exit(0);
        } catch (IOException e) {
            setErrorMessage(e.getMessage());
        }
    }// GEN-LAST:event_launchButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_createButtonActionPerformed
        if (!Main.copyModules(pathLabel.getText())) {
            setErrorMessage("Can't copy module files to game folder, please check folder permissions, or run as admin");
            launchButton.setEnabled(false);
            return;
        }
        try {
            String url = getUrl();
            String email = createEmailText.getText();
            String password1 = new String(createPasswd1Text.getPassword());
            String password2 = new String(createPasswd2Text.getPassword());
            String ticket = createTicketText.getText();
            LoginCreate create = Main.create(url, email, password1);
            boolean doCreate = create.doCreate(password2, ticket);
            if (!doCreate) {
                launchButton.setEnabled(false);
                setErrorMessage(create.getMessage());
            } else {
                launchButton.setEnabled(true);
                setMessage(create.getMessage() + " Launch Game!");
            }
            loginOkVO = create.getLoginOkVO();
        } catch (Exception e) {
            setErrorMessage(e.getMessage());
        }
    }// GEN-LAST:event_createButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loginButtonActionPerformed
        if (!Main.copyModules(pathLabel.getText())) {
            setErrorMessage("Can't copy module files to game folder, please check folder permissions, or run as admin");
            launchButton.setEnabled(false);
            return;
        }
        String url = getUrl();
        String email = loginEmailText.getText();
        String password = new String(loginPasswordText.getPassword());
        LoginCreate login = Main.login(url, email, password, loginSaveCredentialsCheckBox.isSelected());
        if (login.doLogin()) {
            loginOkVO = login.getLoginOkVO();
            launchButton.setEnabled(true);
            setMessage("Login OK, Launch Game!");
        } else {
            loginOkVO = null;
            String message = login.getMessage();
            launchButton.setEnabled(false);
            setErrorMessage(message);
        }
    }// GEN-LAST:event_loginButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeGamePathButton;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField createEmailText;
    private javax.swing.JPasswordField createPasswd1Text;
    private javax.swing.JPasswordField createPasswd2Text;
    private javax.swing.JTextField createTicketText;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton launchButton;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField loginEmailText;
    private javax.swing.JPasswordField loginPasswordText;
    private javax.swing.JTabbedPane loginRegisterTabbedPanel;
    private javax.swing.JCheckBox loginSaveCredentialsCheckBox;
    private javax.swing.JPanel loginTab;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel messageBase;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel pathLabel;
    private javax.swing.JPanel registerTab;
    private javax.swing.JComboBox<String> serverAddrCombo;
    private javax.swing.JLabel serverAddressText;
    private javax.swing.JButton serverInfoButton;
    private javax.swing.JButton srvListButton;
    // End of variables declaration//GEN-END:variables

    public void setErrorMessage(String message) {
        messageLabel.setText("<html><font color='red'><b>" + message + "</b></font></html>");
    }

    public void setMessage(String message) {
        messageLabel.setText("<html><b>" + message + "</b></html>");
    }

    public void enableAll() {
        loginRegisterTabbedPanel.setEnabled(true);
        loginEmailText.setEnabled(true);
        loginPasswordText.setEnabled(true);
        loginSaveCredentialsCheckBox.setEnabled(true);
        loginButton.setEnabled(true);
    }

    public void disableAll() {
        loginRegisterTabbedPanel.setSelectedIndex(0);
        loginRegisterTabbedPanel.setEnabled(false);
        loginEmailText.setEnabled(false);
        loginPasswordText.setEnabled(false);
        loginSaveCredentialsCheckBox.setEnabled(false);
        loginButton.setEnabled(false);
    }

    private void checkGameFile(String path) {
        if (Main.checkGameMd5(path)) {
            enableAll();
            setMessage("SoapBox Race World Online Launcher Beta v0.0.6");
        } else {
            disableAll();
            setErrorMessage("Invalid or modded game file!");
        }
    }

    private String getUrl() {
        String selectedItem = (String) serverAddrCombo.getSelectedItem();
        String[] split = selectedItem.split(";");
        System.out.println(split[1]);
        return split[1];
    }
}
