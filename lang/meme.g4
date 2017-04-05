grammar meme;

r: DECLARACAO_INTEIRO VARIAVEL ATRIBUICAO NUMERO_INTEIRO;
//*****************Palavras Reservadas*******************//
ATRIBUICAO: '=';
DECLARACAO_INTEIRO: 'checkEm';
DECLARACAO_REAL: 'dubs';
DECLARACAO_LOGICO: 'yesButNo';
DECLARACAO_CARACTER: 'batata';
DECLARACAO_CADEIA: 'lolicon';
DECLARACAO_VAZIO: 'missingNo';
FUNCAO: 'genius';
SE: 'kek';
SENAO: 'notSureIf';
SENAOSE: 'topKek';
PARA: 'waitForIt';
ENQUANTO: 'everydayUntilYouLikeIt';
FACA: 'justDoIt';
ASPA: 'drEvil';
PARAR_LOOP: 'wat';
CONTINUAR_LOOP: 'lel';
RETORNO_FUNCAO: 'goHomeYouAreDrunk';

//DELIMITADORES
PONTO_E_VIRGULA: 'desu';
VIRGULA: '¬¬';
PONTO: '.';
ABRE_COLCHETE: '[';
FECHA_COLCHETE: ']';
ABRE_PARENTESES: 'L(';
FECHA_PARENTESES: ')L';
ABRE_CHAVES: 'illuminati';
FECHA_CHAVES: 'confirmed';
DOIS_PONTOS: ':';

//OPERADORES LOGICOS
NAO: 'nope';
E: 'and';
OU: 'or';

//OPERADORES BIT-A-BIT
AND: '&';
OU_INCLUSIVO: '|';
OU_EXCLUSIVO: '^';
DESLOCAMENTO_ESQUERDA: '<<';
DESLOCAMENTO_DIREITA: '>>';
COMPLEMENTO: '~';

//OPERADORES ARITMETICOS
SOMA: '+';
SUBTRACAO: '-';
MULTIPLICACAO: '*';
DIVISAO: '/';
MODULO: '%';

//OPERADORES RELACIONAIS
MAIOR: '>';
MENOR: '<';
IGUAL: '==';
MAIOR_IGUAL: '>=';
MENOR_IGUAL: '<=';
DIFERENTE: '!=';

//VALORES CONSTANTES
NUMERO_INTEIRO: [0-9]+;
NUMERO_REAL: [0-9]+'.'[0-9]+;
NUMERO_BINARIO: 'hacker'[01]+;
NUMERO_HEXADECIMANL: '7x1'[A-Fa-f0-9]+;
CADEIA_CONSTANTE: 'drEvil'(~["\\]|'\\'.)*'drEvil';
VARIAVEL: [A-Za-z_][A-Za-z_0-9]*;

//Comentarios
COMENTARIOLINHA : 'first'~[\n\r]* -> skip;
//COMENTARIOMULTIPLO : 'ayy'(.|'\n')*'lmao' -> skip;

//ignore
LIMBO: ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;