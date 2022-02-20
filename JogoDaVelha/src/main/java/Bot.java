public class Bot {
    private final boolean[] bottom_choosed = {false, false, false, false, false, false, false, false, false};
    private final char[] team_choosed = {'n','n','n','n','n','n','n','n','n','n','n'}; // 'n' for null;
    private final int[] lvl_easy_start = {0,2,3,5,6,8}; //o bot level facil começa apenas nas casas superiores ou nas inferiores;
    private final int[] lvl_hard_start = {0,2,6,8}; // o bot hard só começa nas quinas;
    private String BotDifficulty = null;
    java.util.Random number = new java.util.Random();
    int first_move; 
    boolean fm_occured = false;
    
    public Bot(){}
    
    public Bot(String level){
        setBotDifficulty(level);
    }
    
    public final void setBotDifficulty(String level){
        BotDifficulty = level;
        switch (level) {
            case "easy" -> first_move = lvl_easy_start[number.nextInt(6)]; // o first_move será uma casa aleatoria contida dentre o vetor lvl_easy_start;
            case "regular" -> first_move = 4; // o first_move será sempre na casa ao centro;
            //case "hard" -> first_move = lvl_hard_start[number.nextInt(4)];// o first_move será uma casa aleatoria contida dentre o vetor lvl_hard_start;
            default -> {}
        }
    }
    
    public String getBotDifficulty(){
        return BotDifficulty;
    }
    
    public void setChoose(boolean bool, char team, int i){
        bottom_choosed[i] = bool;
        team_choosed[i] = team;
    }
    
    public int BotTime(){
        int choice = -1;
        switch (BotDifficulty) { // o netbeans quem sugeriu esse switch, achei legal, parecido com arrow function em JS;
            case "easy" -> choice = easy_level();
            case "regular" -> choice = regular_level();
            case "hard" -> choice = hard_level();
            default -> {}
        }
        return choice;
    }
    
    public int easy_level(){ //bot apenas preenche, tenta vitorias obvias; Nao impede vitorias;
        if(!fm_occured){ //verifica se ja foi feito o primeiro movimento, atraves da confirmação de botao pressionado;
            fm_occured = true;
            return first_move; // caso ainda tenho ocorrido o first_move;
        }
        else{ // caso já tenha ocorrido o first_move, o bot dará procedimento nas sequencias de jogadas, tentando uma alternativa de vitoria;
            if(team_choosed[first_move] == 'X'){ // se ja foi pressionado o botao, verifica se foi o player quem preencheu;
                int temp = first_move;
                while(first_move == temp){ // se foi o player, o while gera um numero randomico diferente do primeiro;
                    first_move = lvl_easy_start[number.nextInt(6)];
                }
                return first_move;
            }
            if(first_move == 0){ // if caso o first_move tenha sido na casa1;
                if(bottom_choosed[1]){
                    if(bottom_choosed[2]){
                        if(bottom_choosed[3]){
                            if(bottom_choosed[6]){
                                if(bottom_choosed[4]){
                                    if(bottom_choosed[8]){
                                        if(bottom_choosed[5]){
                                            if(bottom_choosed[7]){
                                                System.out.println("Nao sei oq fazer!");
                                                return -1;
                                            }else{
                                                return 7;
                                            }
                                        }else{
                                            return 5;
                                        }
                                    }else{
                                        return 8;
                                    }
                                }else{
                                    return 4;
                                }
                            }else{
                                return 6;
                            }
                        }else{
                            return 3;
                        }
                    }else{
                        return 2;
                    }
                }else {
                    return 1;
                }
            } // if caso o first_move tenha sido na casa1;
            if(first_move == 2){ // if caso o first_move tenha sido na casa3;
                if(bottom_choosed[1]){
                    if(bottom_choosed[0]){
                        if(bottom_choosed[5]){
                            if(bottom_choosed[8]){
                                if(bottom_choosed[4]){
                                    if(bottom_choosed[6]){
                                        if(bottom_choosed[7]){
                                            if(bottom_choosed[3]){
                                                System.out.println("Nao sei oq fazer!");
                                                return -1;
                                            }else{
                                                return 3;
                                            }
                                        }else{
                                            return 7;
                                        }   
                                    }else{
                                        return 6;
                                    }
                                }else{
                                    return 4;
                                }
                            }else{
                                return 8;
                            }
                        }else{
                            return 5;
                        }
                    }else{
                        return 0;
                    }
                }else{
                    return 1;
                }
            } // if caso o first_move tenha sido na casa3;
            if(first_move == 3){ // if caso o first_move tenha sido na casa4;
                if(bottom_choosed[0]){
                    if(bottom_choosed[6]){
                        if(bottom_choosed[4]){
                            if(bottom_choosed[5]){
                                if(bottom_choosed[1]){
                                    if(bottom_choosed[2]){
                                        if(bottom_choosed[7]){
                                            if(bottom_choosed[8]){
                                                System.out.println("Nao sei oq fazer!");
                                                return -1;
                                            }else{
                                                return 8;
                                            }
                                        }else{
                                            return 7;
                                        }   
                                    }else{
                                        return 2;
                                    }
                                }else{
                                    return 1;
                                }
                            }else{
                                return 5;
                            }
                        }else{
                            return 4;
                        }
                    }else{
                        return 6;
                    }
                }else{
                    return 0;
                }
            }// if caso o first_move tenha sido na casa4;
            if(first_move == 5){ // if caso o first_move tenha sido na casa6;
                if(bottom_choosed[4]){
                    if(bottom_choosed[3]){
                        if(bottom_choosed[2]){
                            if(bottom_choosed[1]){
                                if(bottom_choosed[0]){
                                    if(bottom_choosed[8]){
                                        if(bottom_choosed[7]){
                                            if(bottom_choosed[6]){
                                                System.out.println("Nao sei oq fazer!");
                                                return -1;
                                            }else{
                                                return 6;
                                            }
                                        }else{
                                            return 7;
                                        }   
                                    }else{
                                        return 8;
                                    }
                                }else{
                                    return 0;
                                }
                            }else{
                                return 1;
                            }
                        }else{
                            return 2;
                        }
                    }else{
                        return 3;
                    }
                }else{
                    return 4;
                }
            }// if caso o first_move tenha sido na casa6;
            if(first_move == 6){ // if caso o first_move tenha sido na casa7;
                if(bottom_choosed[3]){
                    if(bottom_choosed[0]){
                        if(bottom_choosed[7]){
                            if(bottom_choosed[8]){
                                if(bottom_choosed[4]){
                                    if(bottom_choosed[2]){
                                        if(bottom_choosed[5]){
                                            if(bottom_choosed[1]){
                                                System.out.println("Nao sei oq fazer!");
                                                return -1;
                                            }else{
                                                return 1;
                                            }
                                        }else{
                                            return 5;
                                        }   
                                    }else{
                                        return 2;
                                    }
                                }else{
                                    return 4;
                                }
                            }else{
                                return 8;
                            }
                        }else{
                            return 7;
                        }
                    }else{
                        return 0;
                    }
                }else{
                    return 3;
                }
            }// if caso o first_move tenha sido na casa7;
            if(first_move == 8){ // if caso o first_move tenha sido na casa7;
                if(bottom_choosed[7]){
                    if(bottom_choosed[6]){
                        if(bottom_choosed[5]){
                            if(bottom_choosed[2]){
                                if(bottom_choosed[4]){
                                    if(bottom_choosed[0]){
                                        if(bottom_choosed[3]){
                                            if(bottom_choosed[1]){
                                                System.out.println("Nao sei oq fazer!");
                                                return -1;
                                            }else{
                                                return 1;
                                            }
                                        }
                                        else{
                                            return 3;
                                        }   
                                    }else{
                                        return 0;
                                    }
                                }else{
                                    return 4;
                                }
                            }else{
                                return 2;
                            }
                        }else{
                            return 5;
                        }
                    }else{
                        return 6;
                    }
                }else{
                    return 7;
                }
            }// if caso o first_move tenha sido na casa7;
        }//else
        return -2; // como os is estão encadeados, na logica do bot o return virá do Else, então os ifs estao sem return e o NetBeans acha que todo if deve ter um return;
    }
    
    public int regular_level(){ //bot faz apenas uma estrategia, mas se torna mediano por tentar sempre evitar as vitorias do player, sua fraqueza são armadilhas com dois caminhos de vitoria;
        if(!fm_occured){ //verifica se ja foi feito o primeiro movimento, atraves da confirmação de botao pressionado;
            fm_occured = true;
            return first_move; // caso ainda tenho ocorrido o first_move;
        }
        else{ // caso já tenha ocorrido o first_move, o bot dará procedimento nas sequencias de jogadas, se defendendo antes de tentar a vitoria;
            int defesa = defense();
            if(defesa!= -1){ // -1 é a resposta para caso nao entre em nenhum if no metodo (os if's estao estruturado de forma que, cada if é uma tentativa de vitoria do player, o bot verifica se ele está tentando ganhar de alguma forma e impede preenchendo a casa restante).
                return defesa;
            }    
            if(first_move == 4){ // if caso o first_move tenha sido na casa4;
                if(!bottom_choosed[0]){
                    return 0;
                }else{ // se o botao já foi pressionado, verificar quem preencheu o botao e montar uma sequencia de vitoria a partir disso;
                    if(!bottom_choosed[8]){ // se o caminho estiver livre, o bot tenta ganhar direto; casa1, casa4, casa8;
                        return 8;
                    }
                    else{ // se a casa8 estiver preenchida o bot funcionando, significa que não foi o bot quem preencheu;
                        if(!bottom_choosed[2]){ // neste momento, se a casa2 nao estiver preenchida, o player estará em uma derrota certa;
                            return 2;
                        }
                        else{
                            if(!bottom_choosed[1]){
                                return 1;
                            }else if(!bottom_choosed[6]){
                                return 6;
                            }// caso a casa2 nao seja preenchida pelo bot, o mesmo tenta uma sequencia de vitoria igual, de forma espelhada, do outro lado do tabuleiro;
                            if(!bottom_choosed[6]){
                                return 6;
                            }else if(team_choosed[6] == 'O'){
                                if(!bottom_choosed[3]){ // no caso da acao espelhada, só é possivel uma vitoria, pois ja foi verificado se o 8 está ou nao preenchido;
                                    return 3;
                                }
                            }
                        }
                        if(!bottom_choosed[7]){ // apenas preenchedo o que sobrou de casas;
                            return 7;
                        }
                        if(!bottom_choosed[5]){
                            return 5;
                        }
                    }
                }      
            }// if caso o first_move tenha sido na casa4;              
        }
        return -2; // como os is estão encadeados, na logica do bot o return virá do Else, então os ifs estao sem return e o NetBeans acha que todo if deve ter um return;
    }
    
    public int hard_level(){ // bot mais semelhante possivel com um player humano, pelo menos esse será o objetivo;
        int player_move = -1;
        //criar uma estrutura que analisa o tabuleiro e verifica se a melhor opcao é tentar vencer ou se defender;
        if(!fm_occured){ //verifica se ja foi feito o primeiro movimento, atraves da confirmação de botao pressionado;
            for(int i = 0; i < 9; i++){
                if(team_choosed[i] == 'X'){
                    player_move = i;
                }
            }
            first_move = switch (player_move) {  // caso o player comece pelas quinas, o bot fará um movimento espelhando, dificultando a estratégia do player;
                case 0 -> 8;
                case 2 -> 6;
                case 6 -> 2;
                case 8 -> 0;
                default -> lvl_hard_start[number.nextInt(4)]; //caso o player nao comece pelas quinas, o bot o fará;
            };
            fm_occured = true;
            return first_move; // caso ainda tenho ocorrido o first_move;
        }
        else{ // caso já tenha ocorrido o first_move, o bot dará procedimento nas sequencias de jogadas, tentando uma alternativa de vitoria;
            int i = defense();
            if(i != -1){
                return i;
            }
            int j = attack();
            if(j != -1){
                return j;
            }
            if(bottom_choosed[0]){ // if caso o first_move tenha sido na casa1;
                if(bottom_choosed[2]){
                    if(bottom_choosed[6]){
                        if(bottom_choosed[8]){
                            if(bottom_choosed[4]){
                                if(bottom_choosed[3]){
                                    if(bottom_choosed[1]){
                                        if(bottom_choosed[5]){
                                            if(bottom_choosed[7]){
                                                System.out.println("Nao sei oq fazer!");
                                                return -1;
                                            }else{
                                                return 7;
                                            }
                                        }else{
                                            return 5;
                                        }
                                    }else{
                                        return 1;
                                    }
                                }else{
                                    return 3;
                                }
                            }else{
                                return 4;
                            }
                        }else{
                            return 8;
                        }
                    }else{
                        return 6;
                    }
                }else {
                    return 2;
                }
            }else{
                return 0;
            }
        }
    }
    
    // adicionar ao bot hard estrategias de vitoria;
    // um exemplo para entendimento, sera um X em 3 das 4 pontas, dessa forma com possibilidade de ganhar de tres formas diferentes.
    /*            __ | __ | _X_
     *            __ | __ | __
     *             X |    |  X
     */
    
    private int defense(){
        // Aqui será montada a estrutura de defesa contra vitoria, o bot se defenderá antes de tentar a vitoria;
        if((team_choosed[0] == 'X') && (team_choosed[1] == 'X') && (!bottom_choosed[2])){
            return 2; // defesa contra vitoria na vertical esquerda;
        }
        if((team_choosed[2] == 'X') && (team_choosed[1] == 'X') && (!bottom_choosed[0])){
            return 0; // defesa contra vitoria na vertical esquerda (inverso);
        }
        if((team_choosed[0] == 'X') && (team_choosed[2] == 'X') && (!bottom_choosed[1])){
            return 1; // defesa contra vitoria caso prenchimento comece pelas pontas e por fim ao meio;
        }
        if((team_choosed[3] == 'X') && (team_choosed[4] == 'X') && (!bottom_choosed[5])){
            return 5; // defesa contra vitoria na vertical central;
        }
        if((team_choosed[5] == 'X') && (team_choosed[4] == 'X') && (!bottom_choosed[3])){
            return 3; // defesa contra vitoria na vertical central (inverso);
        }
        if((team_choosed[3] == 'X') && (team_choosed[5] == 'X') && (!bottom_choosed[4])){
            return 4; // defesa contra vitoria caso prenchimento comece pelas pontas e por fim ao meio;
        }
        if((team_choosed[6] == 'X') && (team_choosed[7] == 'X') && (!bottom_choosed[8])){
            return 8; // defesa contra vitoria na vertical direita;
        }
        if((team_choosed[8] == 'X') && (team_choosed[7] == 'X') && (!bottom_choosed[6])){
            return 6; // defesa contra vitoria na vertical direita (inverso);
        }
        if((team_choosed[6] == 'X') && (team_choosed[8] == 'X') && (!bottom_choosed[7])){
            return 7; // defesa contra vitoria caso prenchimento comece pelas pontas e por fim ao meio;
        }
        if((team_choosed[0] == 'X') && (team_choosed[3] == 'X') && (!bottom_choosed[6])){
            return 6; // defesa contra vitoria na horizontal superior;
        }
        if((team_choosed[6] == 'X') && (team_choosed[3] == 'X') && (!bottom_choosed[0])){
            return 0; // defesa contra vitoria na horizontal superior (inverso);
        }
        if((team_choosed[0] == 'X') && (team_choosed[6] == 'X') && (!bottom_choosed[3])){
            return 3; // defesa contra vitoria caso prenchimento comece pelas pontas e por fim ao meio;
        }
        if((team_choosed[1] == 'X') && (team_choosed[4] == 'X') && (!bottom_choosed[7])){
            return 7; // defesa contra vitoria na horizontal central;
        }
        if((team_choosed[7] == 'X') && (team_choosed[4] == 'X') && (!bottom_choosed[1])){
            return 1; // defesa contra vitoria na horizontal central (inverso);
        }
        if((team_choosed[1] == 'X') && (team_choosed[7] == 'X') && (!bottom_choosed[4])){
            return 1; // defesa contra vitoria caso prenchimento comece pelas pontas e por fim ao meio;
        }
        if((team_choosed[2] == 'X') && (team_choosed[5] == 'X') && (!bottom_choosed[8])){
            return 8; // defesa contra vitoria na horizontal inferior;
        }
        if((team_choosed[8] == 'X') && (team_choosed[5] == 'X') && (!bottom_choosed[2])){
            return 2; // defesa contra vitoria na horizontal inferior (inverso);
        }
        if((team_choosed[2] == 'X') && (team_choosed[8] == 'X') && (!bottom_choosed[5])){
            return 5; // defesa contra vitoria caso prenchimento comece pelas pontas e por fim ao meio;
        }
        if((team_choosed[0] == 'X') && (team_choosed[4] == 'X') && (!bottom_choosed[8])){
            return 8; // defesa contra vitoria na diagonal;
        }
        if((team_choosed[8] == 'X') && (team_choosed[4] == 'X') && (!bottom_choosed[0])){
            return 0; // defesa contra vitoria na diagonal;
        }
        if((team_choosed[0] == 'X') && (team_choosed[8] == 'X') && (!bottom_choosed[4])){
            return 4; // defesa contra vitoria na diagonal, com preenchimento comecando pelas pontas;
        }
        if((team_choosed[6] == 'X') && (team_choosed[4] == 'X') && (!bottom_choosed[2])){
            return 2; // defesa contra vitoria na diagonal;
        }
        if((team_choosed[2] == 'X') && (team_choosed[4] == 'X') && (!bottom_choosed[6])){
            return 6; // defesa contra vitoria na diagonal;
        }
        if((team_choosed[2] == 'X') && (team_choosed[6] == 'X') && (!bottom_choosed[4])){
            return 4; // defesa contra vitoria na diagonal, com preenchimento comecando pelas pontas;
        }
        //fim da estrutura de defesa, daqui em diante, segue a estrutura de tentativa de vitoria;
        return -1;
    }
    
    private int attack(){
        // Aqui será montada a estrutura de defesa contra vitoria, o bot se defenderá antes de tentar a vitoria;
        if((team_choosed[0] == 'O') && (team_choosed[1] == 'O') && (!bottom_choosed[2])){
            return 2; // defesa contra vitoria na vertical esquerda;
        }
        if((team_choosed[2] == 'O') && (team_choosed[1] == 'O') && (!bottom_choosed[0])){
            return 0; // defesa contra vitoria na vertical esquerda (inverso);
        }
        if((team_choosed[0] == 'O') && (team_choosed[2] == 'O') && (!bottom_choosed[1])){
            return 1; // defesa contra vitoria caso prenchimento comece pelas pontas e por fim ao meio;
        }
        if((team_choosed[3] == 'O') && (team_choosed[4] == 'O') && (!bottom_choosed[5])){
            return 5; // defesa contra vitoria na vertical central;
        }
        if((team_choosed[5] == 'O') && (team_choosed[4] == 'O') && (!bottom_choosed[3])){
            return 3; // defesa contra vitoria na vertical central (inverso);
        }
        if((team_choosed[3] == 'O') && (team_choosed[5] == 'O') && (!bottom_choosed[4])){
            return 4; // defesa contra vitoria caso prenchimento comece pelas pontas e por fim ao meio;
        }
        if((team_choosed[6] == 'O') && (team_choosed[7] == 'O') && (!bottom_choosed[8])){
            return 8; // defesa contra vitoria na vertical direita;
        }
        if((team_choosed[8] == 'O') && (team_choosed[7] == 'O') && (!bottom_choosed[6])){
            return 6; // defesa contra vitoria na vertical direita (inverso);
        }
        if((team_choosed[6] == 'O') && (team_choosed[8] == 'O') && (!bottom_choosed[7])){
            return 7; // defesa contra vitoria caso prenchimento comece pelas pontas e por fim ao meio;
        }
        if((team_choosed[0] == 'O') && (team_choosed[3] == 'O') && (!bottom_choosed[6])){
            return 6; // defesa contra vitoria na horizontal superior;
        }
        if((team_choosed[6] == 'O') && (team_choosed[3] == 'O') && (!bottom_choosed[0])){
            return 0; // defesa contra vitoria na horizontal superior (inverso);
        }
        if((team_choosed[0] == 'O') && (team_choosed[6] == 'O') && (!bottom_choosed[3])){
            return 3; // defesa contra vitoria caso prenchimento comece pelas pontas e por fim ao meio;
        }
        if((team_choosed[1] == 'O') && (team_choosed[4] == 'O') && (!bottom_choosed[7])){
            return 7; // defesa contra vitoria na horizontal central;
        }
        if((team_choosed[7] == 'O') && (team_choosed[4] == 'O') && (!bottom_choosed[1])){
            return 1; // defesa contra vitoria na horizontal central (inverso);
        }
        if((team_choosed[1] == 'O') && (team_choosed[7] == 'O') && (!bottom_choosed[4])){
            return 1; // defesa contra vitoria caso prenchimento comece pelas pontas e por fim ao meio;
        }
        if((team_choosed[2] == 'O') && (team_choosed[5] == 'O') && (!bottom_choosed[8])){
            return 8; // defesa contra vitoria na horizontal inferior;
        }
        if((team_choosed[8] == 'O') && (team_choosed[5] == 'O') && (!bottom_choosed[2])){
            return 2; // defesa contra vitoria na horizontal inferior (inverso);
        }
        if((team_choosed[2] == 'O') && (team_choosed[8] == 'O') && (!bottom_choosed[5])){
            return 5; // defesa contra vitoria caso prenchimento comece pelas pontas e por fim ao meio;
        }
        if((team_choosed[0] == 'O') && (team_choosed[4] == 'O') && (!bottom_choosed[8])){
            return 8; // defesa contra vitoria na diagonal;
        }
        if((team_choosed[8] == 'O') && (team_choosed[4] == 'O') && (!bottom_choosed[0])){
            return 0; // defesa contra vitoria na diagonal;
        }
        if((team_choosed[0] == 'O') && (team_choosed[8] == 'O') && (!bottom_choosed[4])){
            return 4; // defesa contra vitoria na diagonal, com preenchimento comecando pelas pontas;
        }
        if((team_choosed[6] == 'O') && (team_choosed[4] == 'O') && (!bottom_choosed[2])){
            return 2; // defesa contra vitoria na diagonal;
        }
        if((team_choosed[2] == 'O') && (team_choosed[4] == 'O') && (!bottom_choosed[6])){
            return 6; // defesa contra vitoria na diagonal;
        }
        if((team_choosed[2] == 'O') && (team_choosed[6] == 'O') && (!bottom_choosed[4])){
            return 4; // defesa contra vitoria na diagonal, com preenchimento comecando pelas pontas;
        }
        //fim da estrutura de defesa, daqui em diante, segue a estrutura de tentativa de vitoria;
        return -1;
    }
}
