
public class TelaInicial extends javax.swing.JFrame {

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    public TelaInicial(){
        
        frame = new PanelBackground();
        lblTitle = new javax.swing.JLabel();
        btnPvB = new javax.swing.JButton();
        btnPvP = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblVersion = new javax.swing.JLabel();
        
        frame.setImgBackground(new javax.swing.ImageIcon("img/background.png"));
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage("img/icon.png"));
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(410, 312));
        setName("frame"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(410, 310));
        
        lblTitle.setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 24)); // NOI18N
        lblTitle.setText("Bem Vindo ao Jogo da Velha!");

        btnPvB.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPvB.setText("Um Jogador");
        btnPvB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPvBActionPerformed(evt);
                dispose();
            }
        });

        btnPvP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPvP.setText("Dois Jogadores");
        btnPvP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPvPActionPerformed(evt);
                dispose();
            }
        });

        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnExit.setText("Sair");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblVersion.setFont(new java.awt.Font("Bookman Old Style", java.awt.Font.BOLD, 12)); // NOI18N
        lblVersion.setText("v1.0.3");
        
        javax.swing.GroupLayout frame1Layout = new javax.swing.GroupLayout(frame);
        frame.setLayout(frame1Layout);
        frame1Layout.setHorizontalGroup(
            frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblVersion)
                .addContainerGap())
            .addGroup(frame1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPvP, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPvB, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(frame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        frame1Layout.setVerticalGroup(
            frame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPvB, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPvP, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblVersion)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnPvPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPvPActionPerformed
        Tabuleiro_PvP tabuleiro = new Tabuleiro_PvP();
        tabuleiro.setVisible(true);
        tabuleiro.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPvPActionPerformed

    private void btnPvBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPvBActionPerformed
        BotChoice bot = new BotChoice();
        bot.setVisible(true);
        bot.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPvBActionPerformed
     
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaInicial frame = new TelaInicial();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private final javax.swing.JButton btnExit;
    private final javax.swing.JButton btnPvB;
    private final javax.swing.JButton btnPvP;
    private final PanelBackground frame;
    private final javax.swing.JLabel lblTitle;
    private final javax.swing.JLabel lblVersion;
    // End of variables declaration//GEN-END:variables
    
}
