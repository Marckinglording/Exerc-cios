import java.util.Random;
import java.util.Scanner;

public class Forca {
 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random aleatorio = new Random();

        int escolha, categoria, letras;
        int contaerros = 0;
        int contaletras = 0;
        String[] erros = new String[10];
        String[] registro = new String[26];
        char[] progresso;
        char letra;
        String categoria_escolhida = "";
        String palavra;
        String[][] palavras = {
        {"CINEMA","OSCAR","Premiação bastante desejada"},
        {"CINEMA","ROTEIRO","Sem isso a história se perde"},
        {"CINEMA","ATOR","Interpreta sem ser ele mesmo"},
        {"CINEMA","DIRETOR","Comanda por trás das câmeras"},
        {"CINEMA","TRILOGIA","História contada em três partes"},
        {"CINEMA","PIPOCA","Companhia clássica da sessão"},
        {"CINEMA","DRAMA","Emoções pesadas em destaque"},
        {"CINEMA","COMEDIA","Busca provocar risadas"},
        {"CINEMA","SUSPENSE","Tensão até o fim"},
        {"CINEMA","LEGENDAS","Ajuda quem lê assistindo"},
        {"CINEMA","CAMERA","Captura tudo sem memória própria"},
        {"CINEMA","CENA","Pequeno pedaço do filme"},
        {"CINEMA","HEROI","Costuma salvar o dia"},
        {"CINEMA","VILAO","Dificulta a paz alheia"},
        {"CINEMA","PREMIERE","Primeira exibição importante"},
        {"CINEMA","ANIMACAO","Desenhos ganham movimento"},
        {"CINEMA","DUBLAGEM","Outra voz assume o papel"},
        {"CINEMA","TELA","Onde tudo aparece"},
        {"CINEMA","INGRESSO","Papel que abre a sessão"},
        {"CINEMA","ESTREIA","Primeiro encontro com o público"},
        {"CINEMA","BILHETERIA","Números que indicam sucesso financeiro"},
        {"CINEMA","CLOSETUP","Enquadra o rosto bem de perto"},
        {"CINEMA","TRAILER","Mostra pouco para vender muito"},
        {"CINEMA","SEQUENCIA","Continuação de uma história conhecida"},
        {"CINEMA","FRANQUIA","Universo expandido em vários filmes"},
        {"CINEMA","ANTAGONISTA","Existe para contrariar o protagonista"},
        {"CINEMA","PROTAGONISTA","Personagem central da narrativa"},
        {"CINEMA","FIGURINO","Roupa que também conta história"},
        {"CINEMA","MAQUIAGEM","Transforma rostos e épocas"},
        {"CINEMA","EFEITOS","Magia criada por técnica"},
        {"CINEMA","CROMAKEY","Fundo trocado por imaginação digital"},
        {"CINEMA","MONTAGEM","Peças filmadas viram narrativa"},
        {"CINEMA","EDICAO","Corte preciso do tempo gravado"},
        {"CINEMA","LOCACAO","Lugar escolhido para filmar"},
        {"CINEMA","BASTIDORES","Onde o caos organiza a arte"},
        {"CINEMA","FOTOGRAFIA","Luz pensada quadro a quadro"},
        {"CINEMA","ENQUADRAMENTO","Escolha do que entra na imagem"},
        {"CINEMA","DIALOGO","Palavras que movem cenas"},
        {"CINEMA","NARRATIVA","Modo como a história caminha"},
        {"CINEMA","CREDITO","Nome subindo após aplausos"},

        {"LITERATURA","ROMANCE","Pode ser amor ou livro"},
        {"LITERATURA","POEMA","Poucas linhas, muito sentido"},
        {"LITERATURA","AUTOR","Assina mundos invisíveis"},
        {"LITERATURA","CAPITULO","Parte de uma narrativa"},
        {"LITERATURA","ENREDO","Sequência dos acontecimentos"},
        {"LITERATURA","FABULA","Animais costumam falar aqui"},
        {"LITERATURA","SONETO","Poema de regras rígidas"},
        {"LITERATURA","METAFORA","Diz sem dizer direto"},
        {"LITERATURA","LEITOR","Viaja sem sair do lugar"},
        {"LITERATURA","LIVRARIA","Loja cheia de viagens"},
        {"LITERATURA","CONTO","História curta"},
        {"LITERATURA","CRONICA","Texto do cotidiano"},
        {"LITERATURA","RIMA","Encontro sonoro entre palavras"},
        {"LITERATURA","VERSO","Linha de poesia"},
        {"LITERATURA","PROLOGO","Antes do começo real"},
        {"LITERATURA","EPILOGO","Depois do final"},
        {"LITERATURA","NARRADOR","Conta sem necessariamente viver"},
        {"LITERATURA","BIBLIOTECA","Silêncio cercado de páginas"},
        {"LITERATURA","MANUSCRITO","Texto escrito à mão"},
        {"LITERATURA","BESTSELLER","Vende muito"},
        {"LITERATURA","PERSONAGEM","Habita páginas e memórias"},
        {"LITERATURA","PREFACIO","Texto que abre caminho ao livro"},
        {"LITERATURA","EDITORA","Transforma manuscritos em obra publicada"},
        {"LITERATURA","RESENHA","Opinião escrita sobre leitura"},
        {"LITERATURA","PARAGRAFO","Bloco organizado de ideias"},
        {"LITERATURA","ESTROFE","Grupo de versos reunidos"},
        {"LITERATURA","NOVELA","Narrativa entre conto e romance"},
        {"LITERATURA","TRAGEDIA","Destino pesado e inevitável"},
        {"LITERATURA","COMEDIA","Humor em forma de narrativa"},
        {"LITERATURA","SATIRA","Critica sorrindo de lado"},
        {"LITERATURA","BIOGRAFIA","Vida real contada em páginas"},
        {"LITERATURA","AUTOBIOGRAFIA","Autor narrando a própria jornada"},
        {"LITERATURA","POESIA","Sentido concentrado em palavras"},
        {"LITERATURA","GRAMATICA","Regras que disciplinam a língua"},
        {"LITERATURA","DICIONARIO","Onde palavras moram em ordem"},
        {"LITERATURA","REPERTORIO","Bagagem cultural acumulada"},
        {"LITERATURA","INTERPRETACAO","Leitura além da superfície"},
        {"LITERATURA","SIMBOLISMO","Sentido escondido em imagens"},
        {"LITERATURA","REALISMO","Busca retratar sem enfeite"},
        {"LITERATURA","MODERNISMO","Quebrou moldes e abriu janelas"},

        {"ESPORTE","FUTEBOL","Onze de cada lado"},
        {"ESPORTE","TENIS","Rede no meio"},
        {"ESPORTE","BASQUETE","A cesta fica no alto"},
        {"ESPORTE","ATLETA","Treino constante"},
        {"ESPORTE","MEDALHA","Metal ganho com suor"},
        {"ESPORTE","CORRIDA","Parar atrapalha"},
        {"ESPORTE","NATACAO","Velocidade na água"},
        {"ESPORTE","ARBITRO","Nem sempre agrada"},
        {"ESPORTE","TROFEU","Objeto erguido na vitória"},
        {"ESPORTE","OLIMPIADA","Mundo competindo"},
        {"ESPORTE","GINASTICA","Força e precisão em movimentos"},
        {"ESPORTE","VOLEI","Rede alta separa os lados"},
        {"ESPORTE","XADREZ","Esporte também mental"},
        {"ESPORTE","SURFE","Equilíbrio sobre ondas"},
        {"ESPORTE","SKATE","Rodas e manobras"},
        {"ESPORTE","MARATONA","Corrida longa e famosa"},
        {"ESPORTE","BOXE","Luta com luvas"},
        {"ESPORTE","JUDO","Queda vale ponto"},
        {"ESPORTE","CICLISMO","Velocidade sobre duas rodas"},
        {"ESPORTE","REVEZAMENTO","Equipe dividindo percurso"},
        {"ESPORTE","HANDEBOL","Bola veloz lançada com as mãos"},
        {"ESPORTE","NADADOR","Coleciona braçadas e metros"},
        {"ESPORTE","CAMPEONATO","Disputa longa por um título"},
        {"ESPORTE","TORCIDA","Joga sem entrar em campo"},
        {"ESPORTE","ESTADIO","Arquibancadas cercam emoções"},
        {"ESPORTE","PENALTI","Momento de silêncio tenso"},
        {"ESPORTE","GOLFE","Precisão vale mais que pressa"},
        {"ESPORTE","RAQUETE","Extensão do braço em alguns esportes"},
        {"ESPORTE","PODIO","Degraus reservados aos melhores"},
        {"ESPORTE","TREINADOR","Orienta suor e estratégia"},
        {"ESPORTE","RESISTENCIA","Segue quando o corpo reclama"},
        {"ESPORTE","VELOCIDADE","Importa quando o relógio manda"},
        {"ESPORTE","SUPLENTE","Espera pronto para entrar"},
        {"ESPORTE","PLACAR","Números que contam a batalha"},
        {"ESPORTE","EMPATE","Ninguém sorri inteiro"},
        {"ESPORTE","TRIATLO","Três desafios em sequência"},
        {"ESPORTE","ESCALADA","Subir vira modalidade"},
        {"ESPORTE","MERGULHO","Entrada elegante na água"},
        {"ESPORTE","PATINACAO","Deslize com técnica e arte"},
        {"ESPORTE","CAPITAO","Lidera usando braçadeira ou respeito"},

        {"CULTURA","SAMBA","Ritmo que desfila sorrindo"},
        {"CULTURA","TEATRO","Palco sem botão pause"},
        {"CULTURA","MUSEU","Passado em exposição"},
        {"CULTURA","FOLCLORE","Lendas moram aqui"},
        {"CULTURA","CARNAVAL","Rua vira espetáculo"},
        {"CULTURA","PINTURA","Arte com pigmento"},
        {"CULTURA","ESCULTURA","Arte em três dimensões"},
        {"CULTURA","DANCA","Corpo falando sem voz"},
        {"CULTURA","ORQUESTRA","Muitos instrumentos, um comando"},
        {"CULTURA","MASCARA","Esconde rosto, cria personagem"},
        {"CULTURA","BALLET","Precisão em ponta dos pés"},
        {"CULTURA","OPERA","Drama cantado"},
        {"CULTURA","GRAFITE","Arte urbana nos muros"},
        {"CULTURA","LENDAS","Histórias que atravessam gerações"},
        {"CULTURA","MITO","Narrativa simbólica antiga"},
        {"CULTURA","FESTIVAL","Arte reunida em evento"},
        {"CULTURA","CERAMICA","Barro transformado em arte"},
        {"CULTURA","CIRCO","Riso, risco e espetáculo"},
        {"CULTURA","MODA","Tecido seguindo tendências"},
        {"CULTURA","DESFILE","Passarela em movimento"},
        {"CULTURA","ARTESANATO","Mãos transformando matéria"},
        {"CULTURA","PATRIMONIO","Bem preservado pela memória coletiva"},
        {"CULTURA","TRADICAO","Costume passado entre gerações"},
        {"CULTURA","RITUAL","Ato simbólico repetido com sentido"},
        {"CULTURA","EXPOSICAO","Obras reunidas para visita"},
        {"CULTURA","GALERIA","Casa elegante para arte"},
        {"CULTURA","LITERATURA","Cultura também escrita"},
        {"CULTURA","MURAL","Parede que decidiu falar"},
        {"CULTURA","FANTASIA","Roupa que vira personagem"},
        {"CULTURA","TAMBOR","Som antigo que chama gente"},
        {"CULTURA","COREOGRAFIA","Movimentos planejados em sequência"},
        {"CULTURA","MARIONETE","Boneco guiado por fios"},
        {"CULTURA","PALESTRA","Ideias apresentadas ao público"},
        {"CULTURA","CANTORIA","Vozes reunidas em celebração"},
        {"CULTURA","ACERVO","Coleção guardada com valor"},
        {"CULTURA","MANIFESTACAO","Expressão coletiva nas ruas ou artes"},
        {"CULTURA","TRUPE","Grupo unido para espetáculo"},
        {"CULTURA","BORDADO","Linha desenhando tecido"},
        {"CULTURA","POESIA","Arte que cabe em versos"},
        {"CULTURA","CELEBRACAO","Encontro marcado por significado"},

        {"CIÊNCIA","ATOMO","Pequeno gigante da matéria"},
        {"CIÊNCIA","GRAVIDADE","Puxa tudo para perto"},
        {"CIÊNCIA","GALAXIA","Cidade de estrelas"},
        {"CIÊNCIA","ENERGIA","Move sem aparecer"},
        {"CIÊNCIA","CELULA","Unidade básica da vida"},
        {"CIÊNCIA","PLANETA","Orbita uma estrela"},
        {"CIÊNCIA","LABORATORIO","Hipóteses usam jaleco"},
        {"CIÊNCIA","MICROBIO","Pequeno demais para plateia nua"},
        {"CIÊNCIA","FOSSIL","Tempo endurecido"},
        {"CIÊNCIA","VULCAO","Montanha explosiva"},
        {"CIÊNCIA","DNA","Receita biológica compacta"},
        {"CIÊNCIA","GENETICA","Herança estudada em detalhes"},
        {"CIÊNCIA","QUIMICA","Misturas e reações"},
        {"CIÊNCIA","FISICA","Entende regras do universo"},
        {"CIÊNCIA","BIOLOGIA","Estuda seres vivos"},
        {"CIÊNCIA","ECOSSISTEMA","Vida em rede"},
        {"CIÊNCIA","METEORO","Visitante veloz do céu"},
        {"CIÊNCIA","LASER","Luz muito disciplinada"},
        {"CIÊNCIA","NEURONIO","Mensageiro elétrico cerebral"},
        {"CIÊNCIA","BACTERIA","Minúscula e numerosa"},
        {"CIÊNCIA","MOLECULA","Grupo de átomos unidos"},
        {"CIÊNCIA","CELULAONCO","Quando divisão sai do controle"},
        {"CIÊNCIA","TELESCOPIO","Olhos longínquos da ciência"},
        {"CIÊNCIA","MICROSCOPIO","Revela mundos invisíveis"},
        {"CIÊNCIA","EVOLUCAO","Mudança lenta entre gerações"},
        {"CIÊNCIA","VACINA","Treina defesas do corpo"},
        {"CIÊNCIA","VIRUS","Pequeno invasor biológico"},
        {"CIÊNCIA","PROTON","Partícula de carga positiva"},
        {"CIÊNCIA","ELETRON","Partícula veloz negativa"},
        {"CIÊNCIA","NEUTRON","Partícula neutra do núcleo"},
        {"CIÊNCIA","PESQUISA","Busca respostas testáveis"},
        {"CIÊNCIA","EXPERIMENTO","Teste feito com método"},
        {"CIÊNCIA","HIPOTESE","Ideia esperando prova"},
        {"CIÊNCIA","REACAO","Transformação entre substâncias"},
        {"CIÊNCIA","FUSAO","União liberando energia"},
        {"CIÊNCIA","CLONAGEM","Cópia biológica planejada"},
        {"CIÊNCIA","OSSO","Estrutura rígida do corpo"},
        {"CIÊNCIA","SANGUE","Rio vermelho interno"},
        {"CIÊNCIA","PULMAO","Respira em pares"},
        {"CIÊNCIA","GENOMA","Mapa completo genético"},

        {"TECNOLOGIA","ALGORITMO","Passos lógicos para resolver algo"},
        {"TECNOLOGIA","SENHA","Chave que não abre portas físicas"},
        {"TECNOLOGIA","MONITOR","Janela luminosa do computador"},
        {"TECNOLOGIA","TECLADO","Piano das palavras"},
        {"TECNOLOGIA","INTERNET","Rede sem pescador"},
        {"TECNOLOGIA","ROTEADOR","Distribui caminhos invisíveis"},
        {"TECNOLOGIA","CELULAR","Cabe no bolso e no cotidiano"},
        {"TECNOLOGIA","BATERIA","Energia portátil"},
        {"TECNOLOGIA","SOFTWARE","Existe sem ocupar espaço"},
        {"TECNOLOGIA","PROCESSADOR","Pensa em velocidade elétrica"},
        {"TECNOLOGIA","MEMORIA","Guarda dados sem nostalgia"},
        {"TECNOLOGIA","MOUSE","Aponta sem miar"},
        {"TECNOLOGIA","IMPRESSORA","Transforma arquivo em papel"},
        {"TECNOLOGIA","PLANILHA","Linhas e colunas obedientes"},
        {"TECNOLOGIA","NAVEGADOR","Explora mares digitais"},
        {"TECNOLOGIA","SERVIDOR","Atende pedidos eletrônicos"},
        {"TECNOLOGIA","CODIGO","Texto que vira ação"},
        {"TECNOLOGIA","HARDWARE","Parte física da máquina"},
        {"TECNOLOGIA","DOWNLOAD","Trazer arquivo para perto"},
        {"TECNOLOGIA","UPLOAD","Enviar arquivo para longe"},
        {"TECNOLOGIA","ALGORITMO","Passos lógicos para resolver algo"},
        {"TECNOLOGIA","BANCODEDADOS","Guarda informação organizada"},
        {"TECNOLOGIA","NUVEM","Arquivos morando online"},
        {"TECNOLOGIA","FIREWALL","Muralha digital protetora"},
        {"TECNOLOGIA","ANTIVIRUS","Caçador de ameaças virtuais"},
        {"TECNOLOGIA","LOGIN","Entrada autorizada no sistema"},
        {"TECNOLOGIA","USUARIO","Pessoa dentro da plataforma"},
        {"TECNOLOGIA","SCRIPT","Pequeno texto que executa tarefas"},
        {"TECNOLOGIA","COMPILADOR","Traduz código para máquina"},
        {"TECNOLOGIA","JAVA","Linguagem famosa no mercado"},
        {"TECNOLOGIA","PYTHON","Linguagem de sintaxe amigável"},
        {"TECNOLOGIA","HTML","Estrutura páginas da web"},
        {"TECNOLOGIA","CSS","Cuida da aparência visual"},
        {"TECNOLOGIA","JAVASCRIPT","Dá movimento às páginas"},
        {"TECNOLOGIA","API","Ponte entre sistemas diferentes"},
        {"TECNOLOGIA","BACKEND","Bastidores da aplicação"},
        {"TECNOLOGIA","FRONTEND","Parte visível ao usuário"},
        {"TECNOLOGIA","CACHE","Memória rápida temporária"},
        {"TECNOLOGIA","MODEM","Traduz sinal de conexão"},
        {"TECNOLOGIA","BLUETOOTH","Conexão curta sem fios"},
        {"TECNOLOGIA","WIFI","Internet pelo ar"},

        {"GEOGRAFIA","DESERTO","Muito chão, pouca chuva"},
        {"GEOGRAFIA","OCEANO","Azul em escala gigante"},
        {"GEOGRAFIA","MONTANHA","Pedra tentando tocar nuvens"},
        {"GEOGRAFIA","FLORESTA","Multidão de árvores"},
        {"GEOGRAFIA","CAPITAL","Cidade de decisões"},
        {"GEOGRAFIA","MAPA","Mundo dobrável"},
        {"GEOGRAFIA","FRONTEIRA","Linha que separa sem tinta"},
        {"GEOGRAFIA","ILHA","Terra cercada de água"},
        {"GEOGRAFIA","RIO","Estrada líquida"},
        {"GEOGRAFIA","CHUVA","Nuvem em queda"},
        {"GEOGRAFIA","LAGOA","Água parada com paisagem"},
        {"GEOGRAFIA","PENINSULA","Quase ilha"},
        {"GEOGRAFIA","CONTINENTE","Grande pedaço de mundo"},
        {"GEOGRAFIA","VALE","Baixada entre relevos"},
        {"GEOGRAFIA","CACHOEIRA","Rio em queda livre"},
        {"GEOGRAFIA","VULCANISMO","Fogo vindo da Terra"},
        {"GEOGRAFIA","CLIMA","Humor atmosférico constante"},
        {"GEOGRAFIA","GELEIRA","Rio lento de gelo"},
        {"GEOGRAFIA","PLANICIE","Terra sem pressa de subir"},
        {"GEOGRAFIA","ARQUIPELAGO","Coleção de ilhas"},
        {"GEOGRAFIA","CORDILHEIRA","Sequência extensa de montanhas"},
        {"GEOGRAFIA","PAMPA","Campo aberto do sul"},
        {"GEOGRAFIA","SAVANA","Gramíneas e árvores espaçadas"},
        {"GEOGRAFIA","TUNDRA","Frio que domina o solo"},
        {"GEOGRAFIA","ESTUARIO","Encontro de rio e mar"},
        {"GEOGRAFIA","DELTA","Foz ramificada de rio"},
        {"GEOGRAFIA","BAIA","Entrada do mar na costa"},
        {"GEOGRAFIA","GOLFO","Grande reentrância marítima"},
        {"GEOGRAFIA","ISTMO","Faixa estreita ligando terras"},
        {"GEOGRAFIA","MEGALOPOLE","Cidades unidas em sequência"},
        {"GEOGRAFIA","LATITUDE","Medida norte ou sul"},
        {"GEOGRAFIA","LONGITUDE","Medida leste ou oeste"},
        {"GEOGRAFIA","EQUADOR","Linha central do planeta"},
        {"GEOGRAFIA","HEMISFERIO","Metade imaginária da Terra"},
        {"GEOGRAFIA","RELEVO","Formas da superfície terrestre"},
        {"GEOGRAFIA","EROSAO","Desgaste natural do terreno"},
        {"GEOGRAFIA","BACIA","Área drenada por rios"},
        {"GEOGRAFIA","MANGUEZAL","Vida entre lama e maré"},
        {"GEOGRAFIA","FALÉSIA","Costa alta e íngreme"},
        {"GEOGRAFIA","MONCAO","Vento sazonal marcante"},

        {"HISTÓRIA","IMPERIO","Poder espalhado por terras"},
        {"HISTÓRIA","REVOLUCAO","Mudança barulhenta"},
        {"HISTÓRIA","MONARQUIA","Reino com coroa"},
        {"HISTÓRIA","REPUBLICA","Governo sem trono"},
        {"HISTÓRIA","GUERRA","Conflito em larga escala"},
        {"HISTÓRIA","TRATADO","Paz assinada"},
        {"HISTÓRIA","COLONIA","Território dominado"},
        {"HISTÓRIA","DITADOR","Manda sem dividir"},
        {"HISTÓRIA","DEMOCRACIA","Poder distribuído por votos"},
        {"HISTÓRIA","PIRAMIDE","Pedra organizada para durar"},
        {"HISTÓRIA","FARAO","Rei associado ao Nilo"},
        {"HISTÓRIA","CASTELO","Fortaleza com memória"},
        {"HISTÓRIA","CAVALEIRO","Guerreiro montado"},
        {"HISTÓRIA","IDADEMEDIA","Período entre eras famosas"},
        {"HISTÓRIA","RENASCIMENTO","Arte e ideias florescendo"},
        {"HISTÓRIA","ESCRAVIDAO","Capítulo sombrio humano"},
        {"HISTÓRIA","MURALHA","Defesa em grande escala"},
        {"HISTÓRIA","NAVEGACAO","Exploração por mares"},
        {"HISTÓRIA","VIKING","Povo lembrado por barcos"},
        {"HISTÓRIA","INDEPENDENCIA","Rompimento político buscado"},
        {"HISTÓRIA","CRUZADAS","Expedições religiosas armadas"},
        {"HISTÓRIA","GLADIADOR","Lutava para plateias antigas"},
        {"HISTÓRIA","SENADO","Conselho político tradicional"},
        {"HISTÓRIA","LEGIAO","Unidade militar romana"},
        {"HISTÓRIA","TRONO","Assento máximo do poder"},
        {"HISTÓRIA","DINASTIA","Família governando gerações"},
        {"HISTÓRIA","CENSURA","Controle sobre ideias divulgadas"},
        {"HISTÓRIA","MIGRACAO","Povos mudando de lugar"},
        {"HISTÓRIA","CIVILIZACAO","Sociedade complexa organizada"},
        {"HISTÓRIA","SUMERIOS","Povo antigo da Mesopotâmia"},
        {"HISTÓRIA","ESPARTA","Cidade famosa pela disciplina"},
        {"HISTÓRIA","ATENAS","Berço clássico do debate"},
        {"HISTÓRIA","NAPOLEAO","General que virou imperador"},
        {"HISTÓRIA","ABOLICAO","Fim legal da escravidão"},
        {"HISTÓRIA","INDUSTRIAL","Ligado à era das fábricas"},
        {"HISTÓRIA","DITADURA","Regime de poder concentrado"},
        {"HISTÓRIA","CONSTITUICAO","Lei maior de um país"},
        {"HISTÓRIA","TIRADENTES","Nome marcante no Brasil colonial"},
        {"HISTÓRIA","DESCOLONIZACAO","Processo de fim colonial"},

        {"MÚSICA","VIOLAO","Cordas dedilhadas"},
        {"MÚSICA","PIANO","Teclas que cantam"},
        {"MÚSICA","BATERIA","Ritmo em conjunto de peças"},
        {"MÚSICA","MELODIA","Linha principal sonora"},
        {"MÚSICA","RITMO","Pulso da canção"},
        {"MÚSICA","HARMONIA","Notas convivendo bem"},
        {"MÚSICA","ORQUESTRA","Muitos sons coordenados"},
        {"MÚSICA","MICROFONE","Amplifica vozes e ideias"},
        {"MÚSICA","SHOW","Apresentação ao vivo"},
        {"MÚSICA","COMPOSITOR","Cria músicas no silêncio"},
        {"MÚSICA","TAMBOR","Batida ancestral"},
        {"MÚSICA","FLAUTA","Sopro em tubo afinado"},
        {"MÚSICA","CORAL","Muitas vozes, um conjunto"},
        {"MÚSICA","PALCO","Chão iluminado"},
        {"MÚSICA","ENCORE","Pedido para voltar"},
        {"MÚSICA","PARTITURA","Música escrita"},
        {"MÚSICA","CONCERTO","Execução formal sonora"},
        {"MÚSICA","ACORDE","Notas tocadas juntas"},
        {"MÚSICA","REFRAO","Parte que retorna"},
        {"MÚSICA","SINFONIA","Grande obra orquestral"},
        {"MÚSICA","GUITARRA","Cordas ligadas à energia"},
        {"MÚSICA","BAIXO","Graves sustentando a banda"},
        {"MÚSICA","UKULELE","Pequeno instrumento havaiano"},
        {"MÚSICA","VIOLINO","Cordas guiadas por arco"},
        {"MÚSICA","CELLO","Instrumento grave entre as pernas"},
        {"MÚSICA","SAXOFONE","Metal soprando jazz"},
        {"MÚSICA","TROMPETE","Brilho sonoro em metal"},
        {"MÚSICA","CLARINETE","Sopro de palheta única"},
        {"MÚSICA","REGENTE","Conduz músicos sem tocar"},
        {"MÚSICA","CANTOR","Instrumento humano principal"},
        {"MÚSICA","DUETO","Dois artistas em diálogo"},
        {"MÚSICA","TRIO","Três vozes ou músicos"},
        {"MÚSICA","QUARTETO","Quatro artistas em conjunto"},
        {"MÚSICA","ALBUM","Coleção oficial de faixas"},
        {"MÚSICA","SINGLE","Lançamento de uma faixa"},
        {"MÚSICA","PLAYLIST","Fila escolhida de músicas"},
        {"MÚSICA","ESTUDIO","Lugar onde sons nascem"},
        {"MÚSICA","AFINACAO","Busca pelo tom correto"},
        {"MÚSICA","BATUTA","Varinha do comandante musical"},
        {"MÚSICA","IMPROVISO","Criado no instante sonoro"},

        {"VARIADOS","RELOGIO","Mostra o tempo sem parar"},
        {"VARIADOS","GELADEIRA","Frio doméstico constante"},
        {"VARIADOS","ESPELHO","Imita você instantaneamente"},
        {"VARIADOS","CHAVEIRO","Guarda pequenas soluções"},
        {"VARIADOS","MOCHILA","Leva o peso alheio"},
        {"VARIADOS","LANTERNA","Sol portátil"},
        {"VARIADOS","TRAVESSEIRO","Companheiro horizontal"},
        {"VARIADOS","CADEIRA","Descanso com pernas"},
        {"VARIADOS","JANELA","Parede com opinião"},
        {"VARIADOS","ABAJUR","Luz localizada"},
        {"VARIADOS","VENTILADOR","Gira para refrescar"},
        {"VARIADOS","ESCADA","Ajuda a gravidade perder"},
        {"VARIADOS","CADERNO","Ideias em folhas"},
        {"VARIADOS","CANETA","Tinta com propósito"},
        {"VARIADOS","BORRACHA","Apaga rastros do lápis"},
        {"VARIADOS","MALA","Viagem em formato caixa"},
        {"VARIADOS","GUARDACHUVA","Teto portátil"},
        {"VARIADOS","XICARA","Abraça bebidas quentes"},
        {"VARIADOS","COLHER","Ferramenta de sopa"},
        {"VARIADOS","FOGUETE","Pressa rumo ao céu"},
        {"VARIADOS","GARFO","Parceiro clássico da faca"},
        {"VARIADOS","FACA","Resolve alimentos resistentes"},
        {"VARIADOS","PRATO","Palco das refeições"},
        {"VARIADOS","PANELA","Onde receitas fervem"},
        {"VARIADOS","FRIGIDEIRA","Chão quente dos ovos"},
        {"VARIADOS","COPO","Transparência para beber"},
        {"VARIADOS","BALDE","Carrega água e tarefas"},
        {"VARIADOS","VASSOURA","Empurra poeira embora"},
        {"VARIADOS","RODO","Seca pisos molhados"},
        {"VARIADOS","SABONETE","Limpeza em formato sólido"},
        {"VARIADOS","TOALHA","Tecido que enxuga pressa"},
        {"VARIADOS","ESCOVA","Cerdas em missão"},
        {"VARIADOS","PENTE","Organiza fios rebeldes"},
        {"VARIADOS","SHAMPOO","Espuma especialista em cabelo"},
        {"VARIADOS","CHUVEIRO","Chuva particular do banheiro"},
        {"VARIADOS","TORNEIRA","Comando metálico da água"},
        {"VARIADOS","SOFA","Descanso coletivo estofado"},
        {"VARIADOS","TAPETE","Chão vestido"},
        {"VARIADOS","CORTINA","Janela com segredo"},
        {"VARIADOS","ARMARIO","Guarda coisas em silêncio"},
        {"VARIADOS","ESTANTE","Prateleiras empilhando histórias"},
        {"VARIADOS","LIVRO","Viagem de papel"},
        {"VARIADOS","TESOURA","Duas lâminas cooperando"},
        {"VARIADOS","GRAMPEADOR","Une folhas sem cola"},
        {"VARIADOS","MOEDA","Metal com valor"},
        {"VARIADOS","CARTEIRA","Bolso organizado"},
        {"VARIADOS","OCULOS","Ajuda olhos cansados"},
        {"VARIADOS","BONÉ","Sombra portátil"},
        {"VARIADOS","CAMISETA","Roupa básica democrática"},
        {"VARIADOS","SAPATO","Casa dos pés"},
        {"VARIADOS","MEIA","Abraço têxtil nos dedos"},
        {"VARIADOS","ANEL","Círculo que enfeita mãos"},
        {"VARIADOS","PULSEIRA","Enfeite de pulso"},
        {"VARIADOS","COLAR","Adorno ao redor do pescoço"},
        {"VARIADOS","CHAPEU","Cobertura com estilo"},
        {"VARIADOS","MASCARA","Esconde ou protege rostos"},
        {"VARIADOS","BICICLETA","Duas rodas em parceria"},
        {"VARIADOS","PATINS","Rodas nos pés"},
        {"VARIADOS","SKATE","Prancha inquieta"},
        {"VARIADOS","CAPACETE","Proteção para impactos"},
        {"VARIADOS","RADIO","Som vindo do ar"},
        {"VARIADOS","TELEVISAO","Janela elétrica doméstica"},
        {"VARIADOS","CONTROLE","Manda sentado"},
        {"VARIADOS","CELULAR","Mundo inteiro no bolso"},
        {"VARIADOS","CARREGADOR","Energia por fio"},
        {"VARIADOS","NOTEBOOK","Computador viajante"},
        {"VARIADOS","MOUSEPAD","Pista do cursor"},
        {"VARIADOS","FONE","Som particular"},
        {"VARIADOS","CAIXADESOM","Música em voz alta"},
        {"VARIADOS","PILHA","Energia engarrafada"},
        {"VARIADOS","BATERIA","Reserva elétrica portátil"},
        {"VARIADOS","LAMPADA","Noite derrotada"},
        {"VARIADOS","INTERRUPTOR","Liga e desliga destinos"},
        {"VARIADOS","EXTENSAO","Tomadas multiplicadas"},
        {"VARIADOS","CABIDE","Ombros emprestados"},
        {"VARIADOS","ALMOFADA","Conforto comprimível"},
        {"VARIADOS","TERMOMETRO","Mede febres e climas"},
        {"VARIADOS","BINOCULO","Olhos de longo alcance"},
        {"VARIADOS","BUSSOLA","Agulha que sabe norte"},
        {"VARIADOS","IMA","Metal atraído por personalidade"}

        };

        System.out.println("\nJOGO DE FORCA\n");
        System.out.println("As categorias são:\n");
        System.out.println("1- Cinema \n2- Literatura \n3- Esporte \n4- Cultura \n5- Ciência \n6- Tecnologia \n7- Geografia \n8- História \n9- Música \n10- Variados");
        System.out.println("\nEscolha digitando o número correspondente:\n");

        while (true) {

            if (scan.hasNextInt()) {
                categoria = scan.nextInt();

            if (categoria >= 1 && categoria <= 10) {
                if (categoria == 1) categoria_escolhida = "CINEMA";
                if (categoria == 2) categoria_escolhida = "LITERATURA";
                if (categoria == 3) categoria_escolhida = "ESPORTE";
                if (categoria == 4) categoria_escolhida = "CULTURA";
                if (categoria == 5) categoria_escolhida = "CIÊNCIA";
                if (categoria == 6) categoria_escolhida = "TECNOLOGIA";
                if (categoria == 7) categoria_escolhida = "GEOGRAFIA";
                if (categoria == 8) categoria_escolhida = "HISTÓRIA";
                if (categoria == 9) categoria_escolhida = "MÚSICA";
                if (categoria == 10) categoria_escolhida = "VARIADOS";
                break;

            } else {
                System.out.println("\nNúmero inválido! \nDigite um número correspondente a uma das categorias:");
            }

            } else {
                System.out.println("\nEntrada inválida! \nEscolha digitando o número correspondente a uma das categorias:");
                scan.next(); 
            }

            
        }

        while (true) {
            
            escolha = aleatorio.nextInt(palavras.length);

            if(palavras[escolha][0].equals(categoria_escolhida)){
                letras = palavras[escolha][1].length();
                progresso = new char[palavras[escolha][1].length()];
                break;
            }

        }

        System.out.println("\nCategoria: " + categoria_escolhida);

        System.out.println("\nA dica é: " + palavras[escolha][2] + " (" + letras + " letras).\n");

        System.out.println(" ____");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|\n");

        for (int i = 0; i < progresso.length; i++) {
                progresso[i] = '_';
            }
        
        System.out.println(String.valueOf(progresso));

        while (true) {
            
            boolean validador = false;

            System.out.println("\n");
            System.out.print("\nDigite uma letra: ");

            String entrada = scan.next().toUpperCase();

            letra = entrada.charAt(0);

            if (!Character.isLetter(letra)) {
                System.out.println("\nDigite apenas letras.");
                continue;
            }

            if (entrada.length() != 1) {
                System.out.println("\nDigite apenas uma letra por vez.");
                continue;
            }

            boolean repetida = false;

            for (int i = 0; i < contaletras; i++) {
                if (registro[i].equals(String.valueOf(letra))) {
                repetida = true;
                break;
                }
            }

            if (repetida) {
                System.out.println("Letra já digitada!\n");
                continue;
            }

            registro[contaletras] = String.valueOf(letra);
            contaletras++;

            palavra = palavras[escolha][1];

            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra) {
                    progresso[i] = letra;
                    validador = true;
                }
                
            }

            if(!validador){
                erros[contaerros] = String.valueOf(letra);
                contaerros++;
            }

            if(contaerros == 0){

                System.out.println("\nA dica é: " + palavras[escolha][2] + " (" + letras + " letras).\n");

                System.out.println("\n ____");
                System.out.println("|    |");
                System.out.println("|    |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|\n");

                System.out.println(String.valueOf(progresso));

            }

            if(contaerros == 1){

                System.out.println("\nA dica é: " + palavras[escolha][2] + " (" + letras + " letras).\n");

                System.out.println("\nErros: " + erros[0] + "\n");

                System.out.println(" ____");
                System.out.println("|    |");
                System.out.println("|    |");
                System.out.println("|    O");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|\n");

                System.out.println(String.valueOf(progresso));
                
            }

            if(contaerros == 2){

                System.out.println("\nA dica é: " + palavras[escolha][2] + " (" + letras + " letras).\n");

                System.out.print("\nErros: " + erros[0]);
                System.out.println(" " + erros[1] + "\n");

                System.out.println(" ____");
                System.out.println("|    |");
                System.out.println("|    |");
                System.out.println("|    O");
                System.out.println("|    |");
                System.out.println("|");
                System.out.println("|\n");

                System.out.println(String.valueOf(progresso));
                
            }

            if(contaerros == 3){

                System.out.println("\nA dica é: " + palavras[escolha][2] + " (" + letras + " letras).\n");

                System.out.print("\nErros: " + erros[0]);
                System.out.print(" " + erros[1]);
                System.out.println(" " + erros[2] + "\n");

                System.out.println(" ____");
                System.out.println("|    |");
                System.out.println("|    |");
                System.out.println("|    O");
                System.out.println("|   /|");
                System.out.println("|");
                System.out.println("|\n");

                System.out.println(String.valueOf(progresso));
                
            }

            if(contaerros == 4){

                System.out.println("\nA dica é: " + palavras[escolha][2] + " (" + letras + " letras).\n");

                System.out.print("\nErros: " + erros[0]);
                System.out.print(" " + erros[1]);
                System.out.print(" " + erros[2]);
                System.out.println(" " + erros[3] + "\n");

                System.out.println(" ____");
                System.out.println("|    |");
                System.out.println("|    |");
                System.out.println("|    O");
                System.out.println("|   /|\\");
                System.out.println("|");
                System.out.println("|\n");

                System.out.println(String.valueOf(progresso));
                
            }

            if(contaerros == 5){

                System.out.println("\nA dica é: " + palavras[escolha][2] + " (" + letras + " letras).\n");

                System.out.print("\nErros: " + erros[0]);
                System.out.print(" " + erros[1]);
                System.out.print(" " + erros[2]);
                System.out.print(" " + erros[3]);
                System.out.println(" " + erros[4] + "\n");

                System.out.println(" ____");
                System.out.println("|    |");
                System.out.println("|    |");
                System.out.println("|    O");
                System.out.println("|   /|\\");
                System.out.println("|   /");
                System.out.println("|\n");

                System.out.println(String.valueOf(progresso));
                
            }

            if(contaerros == 6){

                System.out.println("\nA dica é: " + palavras[escolha][2] + " (" + letras + " letras).\n");

                System.out.print("\nErros: " + erros[0]);
                System.out.print(" " + erros[1]);
                System.out.print(" " + erros[2]);
                System.out.print(" " + erros[3]);
                System.out.print(" " + erros[4]);
                System.out.println(" " + erros[5] + "\n");


                System.out.println(" ____");
                System.out.println("|    |");
                System.out.println("|    |");
                System.out.println("|    O");
                System.out.println("|   /|\\");
                System.out.println("|   / \\");
                System.out.println("|\n");

                System.out.println(String.valueOf(progresso));
                
            }

            if(contaerros == 7){

                System.out.println(" ____");
                System.out.println("|    |");
                System.out.println("|    O");
                System.out.println("|   /|\\");
                System.out.println("|   / \\");
                System.out.println("|");
                System.out.println("|\n");
                
                System.out.println("\nVocê perdeu!\n");

                break;
            }

            boolean ganhou = true;

            for (int i = 0; i < progresso.length; i++) {
                if (progresso[i] == '_') {
                ganhou = false;
                break;
                }
            }

            if (ganhou) {

                System.out.println(" ____");
                System.out.println("|    |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|    O");
                System.out.println("|   /|\\");
                System.out.println("|   / \\\n");               

                System.out.println("\nVocê ganhou!");
            break;
            }
          
        }

    }

}
