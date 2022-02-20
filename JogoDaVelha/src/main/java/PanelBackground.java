public class PanelBackground extends javax.swing.JPanel{
    
        private javax.swing.ImageIcon img;

        public PanelBackground(){
           img = new javax.swing.ImageIcon();
        }

        @Override
        public void paintComponent(java.awt.Graphics g){
            super.paintComponent(g);
            g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
        }

        public void setImgBackground(javax.swing.ImageIcon img){
            this.img = img;
        }

        public javax.swing.ImageIcon getImgBackGround(){
            return this.img;
        }
    }