import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Tabuleiro_PvP extends JFrame {

    private static final long serialVersionUID = 1L;
    
    ImageIcon iconX = new ImageIcon("img/drawX.gif");
    ImageIcon iconO = new ImageIcon("img/drawO.gif");

    private final JPanel contentPane;
    private final JTextField txt_placar_X;
    private final JTextField txt_placar_O;
    JLabel lblTittle = new JLabel("O Time X começa !");
    JButton casa1 = new JButton();
    JButton casa2 = new JButton();
    JButton casa3 = new JButton();
    JButton casa4 = new JButton();
    JButton casa5 = new JButton();
    JButton casa6 = new JButton();
    JButton casa7 = new JButton();
    JButton casa8 = new JButton();
    JButton casa9 = new JButton();
    private int cliques = 0, vitorias_time_X = 0, vitorias_time_O = 0, jogar_novamente = -2;
    private final boolean[] bottom_pressed = {false, false, false, false, false, false, false, false, false}; // este vetor controla se o botao foi pressionado;
    private final boolean[] victory_fail = {false, false, false, false, false, false, false, false, false}; // este vector controla se as chances de victoria aconteceram, se nenhuma delas acontecer, o vetor ficara todo em true ao decorrer do programa e entrara em um if que controla se deu Velha;

    public Tabuleiro_PvP() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage("img/icon.png"));
        setBounds(100, 100, 475, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JDesktopPane desktopPane = new JDesktopPane();
        contentPane.add(desktopPane, BorderLayout.CENTER);

        casa1.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        casa1.setBounds(10, 48, 137, 90);
        desktopPane.add(casa1);
        casa1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(((cliques % 2) == 0) && (!bottom_pressed[0])) {
                    //casa1.setIcon(iconX);
                    casa1.setText("X");
                    lblTittle.setText("Turno do time O !");
                    cliques++;
                    bottom_pressed[0] = true;
                    Sons.som_botao();
                }
                else if (((cliques % 2) == 1) && (!bottom_pressed[0])) {
                    //casa1.setIcon(iconO);
                    casa1.setText("O");
                    lblTittle.setText("Turno do time X !");
                    cliques++;
                    bottom_pressed[0] = true;
                    Sons.som_botao();
                }
                verifica_vencedor();
            }
        });

        casa2.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        casa2.setBounds(10, 149, 137, 90);
        desktopPane.add(casa2);
        casa2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(((cliques % 2) == 0) && (!bottom_pressed[1])) {
                    //casa2.setIcon(iconX);
                    casa2.setText("X");
                    lblTittle.setText("Turno do time O !");
                    cliques++;
                    bottom_pressed[1] = true;
                    Sons.som_botao();
                }
                else if (((cliques % 2) == 1) && (!bottom_pressed[1])) {
                    //casa2.setIcon(iconO);
                    casa2.setText("O");
                    lblTittle.setText("Turno do time X !");
                    cliques++;
                    bottom_pressed[1] = true;
                    Sons.som_botao();
                }
                verifica_vencedor();
            }
        });

        casa3.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        casa3.setBounds(10, 250, 137, 90);
        desktopPane.add(casa3);
        casa3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(((cliques % 2) == 0) && (!bottom_pressed[2])) {
                    //casa3.setIcon(iconX);
                    casa3.setText("X");
                    lblTittle.setText("Turno do time O !");
                    cliques++;
                    bottom_pressed[2] = true;
                    Sons.som_botao();
                }
                else if (((cliques % 2) == 1) && (!bottom_pressed[2])) {
                    //casa3.setIcon(iconO);
                    casa3.setText("O");
                    lblTittle.setText("Turno do time X !");                    
                    cliques++;
                    bottom_pressed[2] = true;
                    Sons.som_botao();
                }
                verifica_vencedor();
            }
        });

        casa4.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        casa4.setBounds(155, 48, 137, 90);
        desktopPane.add(casa4);
        casa4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(((cliques % 2) == 0) && (!bottom_pressed[3])) {
                    //casa4.setIcon(iconX);
                    casa4.setText("X");
                    lblTittle.setText("Turno do time O !");
                    cliques++;
                    bottom_pressed[3] = true;
                    Sons.som_botao();
                }
                else if (((cliques % 2) == 1) && (!bottom_pressed[3])) {
                    //casa4.setIcon(iconO);
                    casa4.setText("O");
                    lblTittle.setText("Turno do time X !");
                    cliques++;
                    bottom_pressed[3] = true;
                    Sons.som_botao();
                }
                verifica_vencedor();
            }
        });

        casa5.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        casa5.setBounds(155, 149, 137, 90);
        desktopPane.add(casa5);
        casa5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(((cliques % 2) == 0) && (!bottom_pressed[4])) {
                    //casa5.setIcon(iconX);
                    casa5.setText("X");
                    lblTittle.setText("Turno do time O !");
                    cliques++;
                    bottom_pressed[4] = true;
                    Sons.som_botao();

                }
                else if (((cliques % 2) == 1) && (!bottom_pressed[4])) {
                    //casa5.setIcon(iconO);
                    casa5.setText("O");
                    lblTittle.setText("Turno do time X !");
                    cliques++;
                    bottom_pressed[4] = true;
                    Sons.som_botao();
                }
                verifica_vencedor();
        }
        });

        casa6.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        casa6.setBounds(155, 250, 137, 90);
        desktopPane.add(casa6);
        casa6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(((cliques % 2) == 0) && (!bottom_pressed[5])) {
                    //casa6.setIcon(iconX);
                    casa6.setText("X");
                    lblTittle.setText("Turno do time O !");
                    cliques++;
                    bottom_pressed[5] = true;
                    Sons.som_botao();
                }
                else if (((cliques % 2) == 1) && (!bottom_pressed[5])) {
                    //casa6.setIcon(iconO);
                    casa6.setText("O");
                    lblTittle.setText("Turno do time X !");
                    cliques++;
                    bottom_pressed[5] = true;
                    Sons.som_botao();
                }
                verifica_vencedor();
            }
        });

        casa7.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        casa7.setBounds(302, 48, 137, 90);
        desktopPane.add(casa7);
        casa7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(((cliques % 2) == 0) && (!bottom_pressed[6])) {
                    //casa7.setIcon(iconX);
                    casa7.setText("X");
                    lblTittle.setText("Turno do time O !");
                    cliques++;
                    bottom_pressed[6] = true;
                    Sons.som_botao();
                }
                else if (((cliques % 2) == 1) && (!bottom_pressed[6])) {
                    //casa7.setIcon(iconO);
                    casa7.setText("O");
                    lblTittle.setText("Turno do time X !");
                    cliques++;
                    bottom_pressed[6] = true;
                    Sons.som_botao();
                }
                verifica_vencedor();
            }
        });

        casa8.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        casa8.setBounds(302, 149, 137, 90);
        desktopPane.add(casa8);
        casa8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(((cliques % 2) == 0) && (!bottom_pressed[7])) {
                    //casa8.setIcon(iconX);
                    casa8.setText("X");
                    lblTittle.setText("Turno do time O !");
                    cliques++;
                    bottom_pressed[7] = true;
                    Sons.som_botao();
                }
                else if (((cliques % 2) == 1) && (!bottom_pressed[7])) {
                    //casa8.setIcon(iconO);
                    casa8.setText("O");
                    lblTittle.setText("Turno do time X !");
                    cliques++;
                    bottom_pressed[7] = true;
                    Sons.som_botao();
                }
                verifica_vencedor();
            }
        });

        casa9.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        casa9.setBounds(302, 250, 137, 90);
        desktopPane.add(casa9);
        casa9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(((cliques % 2) == 0) && (!bottom_pressed[8])) {
                    //casa9.setIcon(iconX);
                    casa9.setText("X");
                    lblTittle.setText("Turno do time O !");
                    cliques++;
                    bottom_pressed[8] = true;
                    Sons.som_botao();
                }
                else if (((cliques % 2) == 1) && (!bottom_pressed[8])) {
                    //casa9.setIcon(iconO);
                    casa9.setText("O");
                    lblTittle.setText("Turno do time X !");
                    cliques++;
                    bottom_pressed[8] = true;
                    Sons.som_botao();
                }
                verifica_vencedor();
            }
        });
        
        lblTittle.setFont(new Font("Bookman Old Style", Font.ITALIC, 13));
        lblTittle.setBounds(10, 11, 195, 26);
        desktopPane.add(lblTittle);

        JLabel lbl_X = new JLabel("X :");
        lbl_X.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lbl_X.setBounds(300, 11, 25, 26);
        desktopPane.add(lbl_X);

        txt_placar_X = new JTextField();
        txt_placar_X.setText(Integer.toString(vitorias_time_X));
        txt_placar_X.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        txt_placar_X.setEditable(false);
        txt_placar_X.setColumns(10);
        txt_placar_X.setBounds(327, 11, 25, 26);
        desktopPane.add(txt_placar_X);

        JLabel lbl_O = new JLabel("O :");
        lbl_O.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lbl_O.setBounds(359, 11, 33, 26);
        desktopPane.add(lbl_O);

        txt_placar_O = new JTextField();
        txt_placar_O.setText(Integer.toString(vitorias_time_O));
        txt_placar_O.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        txt_placar_O.setEditable(false);
        txt_placar_O.setColumns(10);
        txt_placar_O.setBounds(389, 11, 25, 26);
        desktopPane.add(txt_placar_O);

        JLabel lblPlacar = new JLabel("Placar:");
        lblPlacar.setFont(new Font("Bookman Old Style", Font.ITALIC, 13));
        lblPlacar.setBounds(239, 11, 53, 26);
        desktopPane.add(lblPlacar);
    }

    private void verifica_vencedor() {
        String c1 = null, c2 = null, c3 = null;
        if(bottom_pressed[0] && bottom_pressed[3] && bottom_pressed[6]) {
            c1 = casa1.getText(); c2 = casa4.getText(); c3 = casa7.getText();
            if(c1.equals(c2) && c2.equals(c3)) {
                vitoria(c1);
                jogar_novamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Parabens! O time " + c1 + " venceu!", JOptionPane.YES_NO_OPTION);
                victory_fail[0] = false; // controlador para saber se deu velha;
            }else {
                victory_fail[0] = true;
            }
        }
        if(bottom_pressed[1] && bottom_pressed[4] && bottom_pressed[7]) {
            c1 = casa2.getText(); c2 = casa5.getText(); c3 = casa8.getText();
            if(c1.equals(c2) && c2.equals(c3)) {
                vitoria(c1);
                jogar_novamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Parabens! O time " + c1 + " venceu!", JOptionPane.YES_NO_OPTION);
                victory_fail[1] = false; // controlador para saber se deu velha;
            }else {
                victory_fail[1] = true;
            }
        }
        if(bottom_pressed[2] && bottom_pressed[5] && bottom_pressed[8]) {
            c1 = casa3.getText(); c2 = casa6.getText(); c3 = casa9.getText();
            if(c1.equals(c2) && c2.equals(c3)) {
                vitoria(c1);
                jogar_novamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Parabens! O time " + c1 + " venceu!", JOptionPane.YES_NO_OPTION);
                victory_fail[2] = false; // controlador para saber se deu velha;
            }else {
                victory_fail[2] = true;
            }
        }
        if(bottom_pressed[0] && bottom_pressed[1] && bottom_pressed[2]) {
            c1 = casa1.getText(); c2 = casa2.getText(); c3 = casa3.getText();
            if(c1.equals(c2) && c2.equals(c3)) {
                vitoria(c1);
                jogar_novamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Parabens! O time " + c1 + " venceu!", JOptionPane.YES_NO_OPTION);
                victory_fail[3] = false; // controlador para saber se deu velha;
            }else {
                victory_fail[3] = true;
            }
        }
        if(bottom_pressed[3] && bottom_pressed[4] && bottom_pressed[5]) {
            c1 = casa4.getText(); c2 = casa5.getText(); c3 = casa6.getText();
            if(c1.equals(c2) && c2.equals(c3)) {
                vitoria(c1);
                jogar_novamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Parabens! O time " + c1 + " venceu!", JOptionPane.YES_NO_OPTION);
                victory_fail[4] = false; // controlador para saber se deu velha;
            }else {
                victory_fail[4] = true;
            }
        }
        if(bottom_pressed[6] && bottom_pressed[7] && bottom_pressed[8]) {
            c1 = casa7.getText(); c2 = casa8.getText(); c3 = casa9.getText();
            if(c1.equals(c2) && c2.equals(c3)) {
                vitoria(c1);
                jogar_novamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Parabens! O time " + c1 + " venceu!", JOptionPane.YES_NO_OPTION);
                victory_fail[5] = false; // controlador para saber se deu velha;
            }else {
                victory_fail[5] = true;
            }
        }
        if(bottom_pressed[0] && bottom_pressed[4] && bottom_pressed[8]) {
            c1 = casa1.getText(); c2 = casa5.getText(); c3 = casa9.getText();
            if(c1.equals(c2) && c2.equals(c3)) {
                vitoria(c1);
                jogar_novamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Parabens! O time " + c1 + " venceu!", JOptionPane.YES_NO_OPTION);
                victory_fail[6] = false; // controlador para saber se deu velha;
            }else {
                victory_fail[6] = true;
            }
        }
        if(bottom_pressed[6] && bottom_pressed[4] && bottom_pressed[2]) {
            c1 = casa7.getText(); c2 = casa5.getText(); c3 = casa3.getText();
            if(c1.equals(c2) && c2.equals(c3)) {
                vitoria(c1);
                jogar_novamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Parabens! O time " + c1 + " venceu!", JOptionPane.YES_NO_OPTION);
                victory_fail[7] = false; // controlador para saber se deu velha;
            }else {
                victory_fail[7] = true;
            }
        } // se todos os botoes estiverem pressionados e as opcoes de vitoria falharem, o vetor "victory_fail" estara inteiro como true, entrando nesse if abaixo, significando que deu velha;
        if((victory_fail[0] && victory_fail[1] && victory_fail[2] && victory_fail[3] && victory_fail[4] && victory_fail[5] && victory_fail[6] && victory_fail[7])) {
            Sons.som_empate();
            lblTittle.setText("Deu Velha !");
            jogar_novamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Deu velha!", JOptionPane.YES_NO_OPTION);
        }
        nova_partida(vitorias_time_X, vitorias_time_O);
    }

    private void vitoria(String vencedor) { // verificador de qual time ganhou;
        Sons.som_vitoria();
        if(vencedor.equals("X")){
            lblTittle.setText("Vitoria do time X !");
            vitorias_time_X++;
            txt_placar_X.setText(Integer.toString(vitorias_time_X));
        }
        else if(vencedor.equals("O")){
            lblTittle.setText("Vitoria do time O !");
            vitorias_time_O++;
            txt_placar_O.setText(Integer.toString(vitorias_time_O));
        }
    }

    private void nova_partida(int placarX, int placarO) {
        int salvar = -2;
        if(jogar_novamente == 0) {
            casa1.setText(""); //limpando o Tabuleiro_PvP;
            casa2.setText("");
            casa3.setText("");
            casa4.setText("");
            casa5.setText("");
            casa6.setText("");
            casa7.setText("");
            casa8.setText("");
            casa9.setText("");
            lblTittle.setText("O time X começa !");
            jogar_novamente = -2; // resetando a opcao de jogar novamente
            cliques = 0;
            for(int i = 0; i < 9; i++) { // resetando os valores novamente para o padr�o;
                bottom_pressed[i] = false;
                victory_fail[i] = false;
                }	
        }else if(jogar_novamente == 1 || jogar_novamente == -1) {
            salvar = JOptionPane.showConfirmDialog(null, "Deseja salvar o placar?", "Salvar o Placar.", JOptionPane.YES_NO_OPTION);
            if(salvar == 0) {
                Game_Data.writePvP(placarX, placarO);
            }
            System.exit(0);
        }
    }
}
