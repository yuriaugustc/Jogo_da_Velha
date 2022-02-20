
public class BotChoice extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    public BotChoice(){

        choice = new PanelBackground();
        lblTitle = new javax.swing.JLabel();
        btnBotFacil = new javax.swing.JButton();
        btnBotMedio = new javax.swing.JButton();
        btnBotDificil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage("img/icon.png"));
        setMinimumSize(new java.awt.Dimension(410, 312));
        setName("frame2"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(302, 310));
        setResizable(false);
        setSize(new java.awt.Dimension(410, 310));

        choice.setImgBackground(new javax.swing.ImageIcon("img/background.png"));
        
        lblTitle.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblTitle.setText("Por favor escolha um nível de dificuldade:");

        btnBotFacil.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBotFacil.setText("Fácil");
        btnBotFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBotFacilActionPerformed(evt);
                dispose();
            }
        });

        btnBotMedio.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBotMedio.setText("Difícil");
        btnBotMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBotDificilActionPerformed(evt);
                dispose();
            }
        });

        btnBotDificil.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBotDificil.setText("Médio");
        btnBotDificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBotMedioActionPerformed(evt);
                dispose();
            }
        });

        javax.swing.GroupLayout choiceLayout = new javax.swing.GroupLayout(choice);
        choice.setLayout(choiceLayout);
        choiceLayout.setHorizontalGroup(
            choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, choiceLayout.createSequentialGroup()
                .addGap(0, 83, Short.MAX_VALUE)
                .addGroup(choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBotMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBotDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBotFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(choiceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        choiceLayout.setVerticalGroup(
            choiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(choiceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBotFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBotDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBotMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(choice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(choice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(400, 320));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBotFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBotFacilActionPerformed
        Tabuleiro_PvB tabuleiro = new Tabuleiro_PvB("easy");
        tabuleiro.setVisible(true);
        tabuleiro.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBotFacilActionPerformed

    private void btnBotMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBotMedioActionPerformed
        Tabuleiro_PvB tabuleiro = new Tabuleiro_PvB("regular");
        tabuleiro.setVisible(true);
        tabuleiro.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBotMedioActionPerformed

    private void btnBotDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBotDificilActionPerformed
        Tabuleiro_PvB tabuleiro = new Tabuleiro_PvB("hard");
        tabuleiro.setVisible(true);
        tabuleiro.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnBotDificilActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private final javax.swing.JButton btnBotDificil;
    private final javax.swing.JButton btnBotFacil;
    private final javax.swing.JButton btnBotMedio;
    private final PanelBackground choice;
    private final javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
