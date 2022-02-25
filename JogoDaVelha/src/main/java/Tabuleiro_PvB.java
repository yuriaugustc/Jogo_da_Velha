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

public class Tabuleiro_PvB extends JFrame {

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
    private int vitorias_time_X = 0, vitorias_time_O = 0, jogar_novamente = -2;
    private final boolean[] bottom_pressed = {false, false, false, false, false, false, false, false, false}; // este vetor controla se o botao foi pressionado;
    private final boolean[] victory_fail = {false, false, false, false, false, false, false, false, false}; // este vector controla se as chances de victoria aconteceram, se nenhuma delas acontecer, o vetor ficara todo em true ao decorrer do programa e entrara em um if que controla se deu Velha;
    Bot bot = new Bot();
    
    public Tabuleiro_PvB(String level) {
        bot.setBotDifficulty(level);
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
                setChoice(0);
            }
        });

        casa2.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        casa2.setBounds(10, 149, 137, 90);
        desktopPane.add(casa2);
        casa2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setChoice(1);
            }
        });

        casa3.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        casa3.setBounds(10, 250, 137, 90);
        desktopPane.add(casa3);
        casa3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setChoice(2);
            }
        });

        casa4.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        casa4.setBounds(155, 48, 137, 90);
        desktopPane.add(casa4);
        casa4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setChoice(3);
            }
        });

        casa5.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        casa5.setBounds(155, 149, 137, 90);
        desktopPane.add(casa5);
        casa5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setChoice(4);
            }
        });

        casa6.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        casa6.setBounds(155, 250, 137, 90);
        desktopPane.add(casa6);
        casa6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setChoice(5);
            }
        });

        casa7.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        casa7.setBounds(302, 48, 137, 90);
        desktopPane.add(casa7);
        casa7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setChoice(6);
            }
        });

        casa8.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        casa8.setBounds(302, 149, 137, 90);
        desktopPane.add(casa8);
        casa8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setChoice(7);
            }
        });

        casa9.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        casa9.setBounds(302, 250, 137, 90);
        desktopPane.add(casa9);
        casa9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setChoice(8);
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

    private boolean verifica_vencedor() {
        String c1, c2, c3;
        if(bottom_pressed[0] && bottom_pressed[3] && bottom_pressed[6]){
            c1 = casa1.getText(); c2 = casa4.getText(); c3 = casa7.getText();
            if(c1.equals(c2) && c2.equals(c3)) {
                vitoria(c1);
                jogar_novamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Parabens! O time " + c1 + " venceu!", JOptionPane.YES_NO_OPTION);
                nova_partida(vitorias_time_X, vitorias_time_O);
                return true; 
            }else {
                victory_fail[0] = true; // controlador para saber se deu velha;
            }
        }
        if(bottom_pressed[1] && bottom_pressed[4] && bottom_pressed[7]){
            c1 = casa2.getText(); c2 = casa5.getText(); c3 = casa8.getText();
            if(c1.equals(c2) && c2.equals(c3)) {
                vitoria(c1);
                jogar_novamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Parabens! O time " + c1 + " venceu!", JOptionPane.YES_NO_OPTION);
                nova_partida(vitorias_time_X, vitorias_time_O);
                return true;
            }else {
                victory_fail[1] = true; // controlador para saber se deu velha;
            }
        }
        if(bottom_pressed[2] && bottom_pressed[5] && bottom_pressed[8]){
            c1 = casa3.getText(); c2 = casa6.getText(); c3 = casa9.getText();
            if(c1.equals(c2) && c2.equals(c3)) {
                vitoria(c1);
                jogar_novamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Parabens! O time " + c1 + " venceu!", JOptionPane.YES_NO_OPTION);
                nova_partida(vitorias_time_X, vitorias_time_O);
                return true; 
            }else {
                victory_fail[2] = true; // controlador para saber se deu velha;
            }
        }
        if(bottom_pressed[0] && bottom_pressed[1] && bottom_pressed[2]) {
            c1 = casa1.getText(); c2 = casa2.getText(); c3 = casa3.getText();
            if(c1.equals(c2) && c2.equals(c3)) {
                vitoria(c1);
                jogar_novamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Parabens! O time " + c1 + " venceu!", JOptionPane.YES_NO_OPTION);
                nova_partida(vitorias_time_X, vitorias_time_O);
                return true;
            }else {
                victory_fail[3] = true; // controlador para saber se deu velha;
            }
        }
        if(bottom_pressed[3] && bottom_pressed[4] && bottom_pressed[5]) {
            c1 = casa4.getText(); c2 = casa5.getText(); c3 = casa6.getText();
            if(c1.equals(c2) && c2.equals(c3)) {
                vitoria(c1);
                jogar_novamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Parabens! O time " + c1 + " venceu!", JOptionPane.YES_NO_OPTION);
                nova_partida(vitorias_time_X, vitorias_time_O);
                return true;
            }else {
                victory_fail[4] = true; // controlador para saber se deu velha;
            }
        }
        if(bottom_pressed[6] && bottom_pressed[7] && bottom_pressed[8]) {
            c1 = casa7.getText(); c2 = casa8.getText(); c3 = casa9.getText();
            if(c1.equals(c2) && c2.equals(c3)) {
                vitoria(c1);
                jogar_novamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Parabens! O time " + c1 + " venceu!", JOptionPane.YES_NO_OPTION);
                nova_partida(vitorias_time_X, vitorias_time_O);
                return true;
            }else {
                victory_fail[5] = true; // controlador para saber se deu velha;
            }
        }
        if(bottom_pressed[0] && bottom_pressed[4] && bottom_pressed[8]) {
            c1 = casa1.getText(); c2 = casa5.getText(); c3 = casa9.getText();
            if(c1.equals(c2) && c2.equals(c3)) {
                vitoria(c1);
                jogar_novamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Parabens! O time " + c1 + " venceu!", JOptionPane.YES_NO_OPTION);
                nova_partida(vitorias_time_X, vitorias_time_O);
                return true;
            }else {
                victory_fail[6] = true; // controlador para saber se deu velha;
            }
        }
        if(bottom_pressed[6] && bottom_pressed[4] && bottom_pressed[2]) {
            c1 = casa7.getText(); c2 = casa5.getText(); c3 = casa3.getText();
            if(c1.equals(c2) && c2.equals(c3)) {
                vitoria(c1);
                jogar_novamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Parabens! O time " + c1 + " venceu!", JOptionPane.YES_NO_OPTION);
                nova_partida(vitorias_time_X, vitorias_time_O);
                return true;
            }else {
                victory_fail[7] = true; // controlador para saber se deu velha;
            }
        } // se todos os botoes estiverem pressionados e as opcoes de vitoria falharem, o vetor "victory_fail" estara inteiro como true, entrando nesse if abaixo, significando que deu velha;
        if((victory_fail[0] && victory_fail[1] && victory_fail[2] && victory_fail[3] && victory_fail[4] && victory_fail[5] && victory_fail[6] && victory_fail[7])) {
            Sons.som_empate();
            lblTittle.setText("Deu Velha !");
            jogar_novamente = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Deu velha!", JOptionPane.YES_NO_OPTION);
            nova_partida(vitorias_time_X, vitorias_time_O);
            return true;
        }
        return false;
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
            lblTittle.setText("O Time X começa !");
            jogar_novamente = -2; // resetando a opcao de jogar novamente
            String level = bot.getBotDifficulty();
            bot = new Bot(level);
            for(int i = 0; i < 9; i++) { // resetando os valores novamente para o padr�o;
                bottom_pressed[i] = false;
                victory_fail[i] = false;
            }
        }else if(jogar_novamente == 1 || jogar_novamente == -1) {
            salvar = JOptionPane.showConfirmDialog(null, "Deseja salvar o placar?", "Salvar o Placar.", JOptionPane.YES_NO_OPTION);
            if(salvar == 0) {
                Game_Data.writePvB(placarX, placarO, bot.getBotDifficulty());
            }
            System.exit(0);
        }
    }
    
    public void setChoice(int i){
        if(!bottom_pressed[i]){
            switch(i){
                case 0 -> casa1.setText("X");
                case 1 -> casa2.setText("X");
                case 2 -> casa3.setText("X");
                case 3 -> casa4.setText("X");
                case 4 -> casa5.setText("X");
                case 5 -> casa6.setText("X");
                case 6 -> casa7.setText("X");
                case 7 -> casa8.setText("X");
                case 8 -> casa9.setText("X");
                default -> {}
            }
            lblTittle.setText("Turno do time O !");
            bottom_pressed[i] = true;
            Sons.som_botao();
            boolean bool = verifica_vencedor();
            if(!bool){ // se o usuario nao ganhar, o bot faz a jogada. (sem isso, quando o usuario ganha, o proximo movimento do bot vai para a nova partida); 
                AnalisaTabuleiro();
                BotChoice();
            }
        }
    }
    
    public void BotChoice(){
        int i = bot.BotTime();
        switch (i){
            case 0 -> casa1.setText("O");
            case 1 -> casa2.setText("O");
            case 2 -> casa3.setText("O");
            case 3 -> casa4.setText("O");
            case 4 -> casa5.setText("O");
            case 5 -> casa6.setText("O");
            case 6 -> casa7.setText("O");
            case 7 -> casa8.setText("O");
            case 8 -> casa9.setText("O");
            default -> {}
        }
        lblTittle.setText("Turno do time X !");
        bottom_pressed[i] = true;
        Sons.som_botao();
        verifica_vencedor(); // verificar se o bot ganhou, se nao o bot ganha e o usuario tem que fazer outra jogada para verificar;
    }

    public void AnalisaTabuleiro(){
        char ch;
        if(bottom_pressed[0]){
            ch = casa1.getText().charAt(0);
            bot.setChoose(bottom_pressed[0], ch, 0);
        }
        if(bottom_pressed[1]){
            ch = casa2.getText().charAt(0);
            bot.setChoose(bottom_pressed[1], ch, 1);
        }
        if(bottom_pressed[2]){
            ch = casa3.getText().charAt(0);
            bot.setChoose(bottom_pressed[2], ch, 2);
        }
        if(bottom_pressed[3]){
            ch = casa4.getText().charAt(0);
            bot.setChoose(bottom_pressed[3], ch, 3);
        }
        if(bottom_pressed[4]){
            ch = casa5.getText().charAt(0);
            bot.setChoose(bottom_pressed[4], ch, 4);
        }
        if(bottom_pressed[5]){
            ch = casa6.getText().charAt(0);
            bot.setChoose(bottom_pressed[5], ch, 5);
        }
        if(bottom_pressed[6]){
            ch = casa7.getText().charAt(0);
            bot.setChoose(bottom_pressed[6], ch, 6);
        }
        if(bottom_pressed[7]){
            ch = casa8.getText().charAt(0);
            bot.setChoose(bottom_pressed[7], ch, 7);
        }
        if(bottom_pressed[8]){
            ch = casa9.getText().charAt(0);
            bot.setChoose(bottom_pressed[8], ch, 8);
        }
    }
}