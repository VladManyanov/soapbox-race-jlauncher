/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.soapboxrace.jlauncher.swing;

import java.util.ResourceBundle;
import java.util.Locale;

import br.com.soapboxrace.jlauncher.vo.ServerInfoVO;
import com.google.gson.Gson;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * @author Vanquish
 */
public class ServerInfo extends javax.swing.JFrame {

    private ResourceBundle Text = ResourceBundle.getBundle("locales.locale", Locale.getDefault());

    /**
     * @param args the command line arguments
     */
    private static OkHttpClient client = new OkHttpClient();

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ServerInfo().setVisible(true);
        });

    }

    public static String getJSON(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    public static ServerInfoVO getServerInfo(String serverIP) {
        String json = null;
        try {
            json = getJSON("http://" + serverIP + ":8680/soapbox-race-core/Engine.svc/GetServerInformation");
        } catch (IOException e) {
        }

        Gson gson = new Gson();

        ServerInfoVO serverInfo = gson.fromJson(json, ServerInfoVO.class);
        return serverInfo;
    }

    /**
     * Creates new form ServerInfo
     */
    public ServerInfo() {
        String serverIP = "173.230.136.12";
                String json = null;
        try {
            json = getJSON("http://" + serverIP + ":8680/soapbox-race-core/Engine.svc/GetServerInformation");
        } catch (IOException e) {
        }

        Gson gson = new Gson();

        ServerInfoVO serverInfo = gson.fromJson(json, ServerInfoVO.class);
        initComponents();
        serverName.setText(serverInfo.getServerName());
        serverDescription.setText(serverInfo.getMessageSrv());
        serverLocation.setText(serverInfo.getCountry());
        usersOnline.setText(serverInfo.getOnlineNumber());
        usersRegistered.setText(serverInfo.getNumberOfRegistered());
        ownerList.setText(serverInfo.getOwnerList());
        adminList.setText(serverInfo.getAdminList());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        serverNameLabel = new javax.swing.JLabel();
        serverName = new javax.swing.JLabel();
        serverDescriptionLabel = new javax.swing.JLabel();
        serverDescription = new javax.swing.JLabel();
        serverLocationLabel = new javax.swing.JLabel();
        serverLocation = new javax.swing.JLabel();
        usersOnlineLabel = new javax.swing.JLabel();
        usersOnline = new javax.swing.JLabel();
        usersRegisteredLabel = new javax.swing.JLabel();
        usersRegistered = new javax.swing.JLabel();
        ownerListLabel = new javax.swing.JLabel();
        ownerList = new javax.swing.JLabel();
        adminList = new javax.swing.JLabel();
        adminListLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Server Information");

        serverNameLabel.setText(Text.getString("ServerName"));

        serverName.setText("W.I.P");

        serverDescriptionLabel.setText(Text.getString("ServerDescription"));

        serverDescription.setText("W.I.P");

        serverLocationLabel.setText(Text.getString("originCountry"));

        serverLocation.setText("W.I.P");

        usersOnlineLabel.setText(Text.getString("onlineUsers"));

        usersOnline.setText("W.I.P");

        usersRegisteredLabel.setText(Text.getString("registeredUsers"));

        usersRegistered.setText("W.I.P");

        ownerListLabel.setText(Text.getString("ownerName"));

        ownerList.setText("W.I.P");

        adminList.setText("W.I.P");

        adminListLabel.setText(Text.getString("adminList"));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serverDescriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serverDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serverLocationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serverLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usersOnlineLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usersOnline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usersRegisteredLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(usersRegistered, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ownerListLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serverName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serverNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ownerList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminListLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serverNameLabel)
                .addGap(4, 4, 4)
                .addComponent(serverName)
                .addGap(9, 9, 9)
                .addComponent(serverDescriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serverDescription)
                .addGap(11, 11, 11)
                .addComponent(serverLocationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serverLocation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usersOnlineLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usersOnline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usersRegisteredLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usersRegistered)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ownerListLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ownerList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminListLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminList)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminList;
    private javax.swing.JLabel adminListLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel ownerList;
    private javax.swing.JLabel ownerListLabel;
    private javax.swing.JLabel serverDescription;
    private javax.swing.JLabel serverDescriptionLabel;
    private javax.swing.JLabel serverLocation;
    private javax.swing.JLabel serverLocationLabel;
    private javax.swing.JLabel serverName;
    private javax.swing.JLabel serverNameLabel;
    private javax.swing.JLabel usersOnline;
    private javax.swing.JLabel usersOnlineLabel;
    private javax.swing.JLabel usersRegistered;
    private javax.swing.JLabel usersRegisteredLabel;
    // End of variables declaration//GEN-END:variables
}
