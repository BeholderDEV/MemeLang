grammar Memelang;

// Parser Rules

//Escopo do programa


prog : funcaoInicio;

//prog : lstDecl;
//lstDecl : lstDecl decl | decl;
//decl : declaracoes | funcao;

//*Escopo de funções
funcaoInicio: ((declaracoes PONTOEVIRGULA) | funcao)+;
funcao: tipoComVoid ID PARENTESEABRE parametros PARENTESEFECHA bloco;
parametros : (parametro(VIRGULA parametro)*)?;
parametro: tipo (REFERENCIA)? ID (multidimensional)?;

//**Escopo de bloco
bloco: CHAVESABRE comandos CHAVESFECHA ;

//*** Comandos
comandos: (condicionais|comando)*;
comando:((retorno|declaracoes|atribuicoes|chamadaFuncao|entradaesaida)PONTOEVIRGULA);

//**** Entrada e Saida
entradaesaida: (DEFREAD | DEFWRITE) PARENTESEABRE parametrosChamada PARENTESEFECHA;


//**** Retorno
retorno: DEFRETORNO expressao;

//**** Chamada de Funcao
chamadaFuncao: ID PARENTESEABRE parametrosChamada PARENTESEFECHA;
parametrosChamada: (expressao (VIRGULA expressao)*)? ;

//**** Condicionais
condicionais: ifdes | whiledes | fordes | dodes PONTOEVIRGULA | switchdes;

ifdes: IFDES PARENTESEABRE expressao PARENTESEFECHA bloco (ifdeselse|ifdeselseif)?;
ifdeselse: ELSE bloco;
ifdeselseif: ELSE ifdes ;
whiledes: WHILEDES PARENTESEABRE expressao PARENTESEFECHA bloco;
fordes: FORDES PARENTESEABRE (declaracoes|atribuicoes) PONTOEVIRGULA expressao PONTOEVIRGULA atribuicoes PARENTESEFECHA bloco;
dodes: DODES bloco WHILEDES PARENTESEABRE expressao PARENTESEFECHA;
switchdes: SWITCHDES PARENTESEABRE expressao PARENTESEFECHA CHAVESABRE switchCase defaultdes CHAVESFECHA;
switchCase: (CASE expressao DOISPONTOS comandos (BREAK)?)* ;
defaultdes: (DEFAULTDES DOISPONTOS comandos (BREAK)?)? ;
//**** Declaracoes
declaracoes: tipo declaracao (VIRGULA declaracao)*;
declaracao: ID ((IGUAL expressao)|(multidimensional(IGUAL declaracoesArray)?))?;
multidimensional: (COLCHETESABRE expressao COLCHETESFECHA)+;

declaracoesArray: CHAVESABRE (subArrayDeclaracoes|declaracoesArray) CHAVESFECHA (VIRGULA CHAVESABRE (subArrayDeclaracoes|declaracoesArray) CHAVESFECHA)*;
subArrayDeclaracoes: expressao (VIRGULA expressao)* ;

//**** Atribuições
atribuicoes: ID (multidimensional)? ((atribuicoesIncEDec)|((IGUAL | op_atr) expressao));
atribuicoesIncEDec: MAIS MAIS|MENOS MENOS;

//Definições gerais
tipoComVoid: VOID | tipo;
tipo: INT | STRING | DOUBLE | BOOL | BIN | HEXA | CHAR;

// NEW Expressões
expressao: (op_neg)?(val_final)((operations)(val_final))*;

operations : op_rel | op_neg | op_bitwise | op_arit_baixa | op_logica;
op_atr : MAIS IGUAL | MENOS IGUAL;
op_rel : MAIORQUE | MENORQUE | MAIOROUIGUAL | MENOROUIGUAL | IDENTICO | DIFERENTE;
op_neg : MENOS | BITNOT | NOT;
op_bitwise : BITSHIFTLEFT | BITSHIFTRIGHT | BITAND | BITOR | BITXOR | BITNOT;
op_arit_baixa : MAIS | DIVIDE | MULTIPLICA | MOD;
op_logica : AND | OR | NOT;
val_final : CONSTINTEIRO | CONSTSTRING | CONSTBINARIO | CONSTHEXA | CONSTCHAR | CONSTLOGICO | CONSTREAL | ID | chamadaFuncao | ID multidimensional | PARENTESEABRE expressao PARENTESEFECHA;


//// Lexer Rules

//*****************Palavras Reservadas*******************//
DEFREAD: 'leia';
DEFWRITE: 'escreva';


DEFRETORNO : 'goHomeYouAreDrunk';

IFDES : 'kek';
ELSE : 'notSureIf';
WHILEDES : 'everydayUntilYouLikeIt';
FORDES : 'waitForIt';
DODES : 'justDoIt';

INT : 'checkEm';
STRING : 'lolicon';
DOUBLE : 'dubs';
BOOL : 'yesButNo';
BIN : 'binLaden';
HEXA : 'l33t';
VOID : 'missingNo';
CHAR : 'batata';

BREAK : 'wat';

SWITCHDES : 'chooseAPill';
CASE : 'pill';
DEFAULTDES : 'hipster';

//Operadores Aritméticos

MAIS : '+';
MENOS : '-';
MULTIPLICA : '*';
DIVIDE : '/';
MOD: '%';

//Operadores Relacionais

MAIORQUE : '>';
MENORQUE : '<';
MAIOROUIGUAL : '>=';
MENOROUIGUAL : '<=';
IDENTICO : '==';
DIFERENTE : '!=';

//Operadores Logicos

AND : 'and';
OR : 'or';
NOT : 'nope';
REFERENCIA : 'sauce';

//Operadores Bit a Bit
BITSHIFTRIGHT : '>>';
BITSHIFTLEFT : '<<';
BITAND : '&';
BITOR : '|';
BITXOR : '^';
BITNOT : '~';

//Valores Constantes ???

CONSTREAL : [0-9]+'.'[0-9]+;
CONSTINTEIRO : [0-9]+;
CONSTBINARIO : 'hacker'[01]+;
CONSTHEXA : '7x1'[A-Fa-f0-9]+;
CONSTSTRING : ASPA(~["\\]|'\\'.)*ASPA;
CONSTLOGICO : ('yeah')|('trap');
CONSTCHAR : ASPASIMPLES(~["\\]|'\\'.)ASPASIMPLES;

//Comentarios
COMENTARIOLINHA : 'first'~[\n\r]* -> skip;
COMENTARIOMULTIPLO : 'ayy'(.|'\n')*'lmao' -> skip;

//DELIMITADORES
PONTO : '.';
IGUAL : '=';
PONTOEVIRGULA : 'desu';
VIRGULA : ',';
DOISPONTOS : ':';
COLCHETESABRE : '[';
COLCHETESFECHA : ']';
CHAVESABRE : 'illuminati';
CHAVESFECHA : 'confirmed'; //47
PARENTESEABRE : 'L(';
PARENTESEFECHA: ')L';

ASPA: '"';
ASPASIMPLES: '\'';
//EXTRA
ID : [A-Za-z_][A-Za-z_0-9]*;

//IGNORADOS
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
