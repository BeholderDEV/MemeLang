grammar Memelang;

// Parser Rules

//Escopo do programa


prog : funcaoInicio;

//*Escopo de funções
funcaoInicio: (VOID ID PARENTESEABRE parametros PARENTESEFECHA bloco funcoes);
funcoes: (tipoComVoid ID PARENTESEABRE parametros PARENTESEFECHA bloco funcoes)?;
parametros : (tipo ID (multidimensional)?(VIRGULA tipo ID)*)?;

//**Escopo de bloco
bloco: CHAVESABRE comandos CHAVESFECHA ;

//*** Comandos
comandos: (condicionais|comando)*;
comando:((retorno|declaracoes|atribuicoes|chamadaFuncao)PONTOEVIRGULA);
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
declaracoes: tipo ID ((IGUAL expressao)|(multidimensional(IGUAL declaracoesArray)?))?;
multidimensional: (COLCHETESABRE CONSTINTEIRO COLCHETESFECHA)+;

declaracoesArray: CHAVESABRE (subArrayDeclaracoes|declaracoesArray) CHAVESFECHA (VIRGULA CHAVESABRE (subArrayDeclaracoes|declaracoesArray) CHAVESFECHA)*;
subArrayDeclaracoes: expressao (VIRGULA expressao)* ;

//**** Atribuições
atribuicoes: ID (multidimensional)? ((atribuicoesIncEDec)|(IGUAL expressao));
atribuicoesIncEDec: MAIS MAIS|MENOS MENOS;

//Definições gerais
tipoComVoid: VOID | tipo;
tipo: INT | STRING | DOUBLE | BOOL | BIN | HEXA | CHAR;

// NEW Expressões
expressao: (op_neg)?(val_final)((operations)(val_final))*;

operations : op_rel | op_neg | op_bitwise | op_arit_baixa | op_logica;
op_rel : MAIORQUE | MENORQUE | MAIOROUIGUAL | MENOROUIGUAL | IDENTICO | DIFERENTE;
op_neg : MENOS | BITNOT | NOT;
op_bitwise : BITSHIFTLEFT | BITSHIFTRIGHT;
op_arit_baixa : MAIS;
op_logica : AND | OR | NOT;
val_final : CONSTINTEIRO | CONSTSTRING | CONSTBINARIO | CONSTHEXA | CONSTLOGICO | CONSTREAL | ID | chamadaFuncao | ID multidimensional | PARENTESEABRE expressao PARENTESEFECHA;


//// Lexer Rules

//*****************Palavras Reservadas*******************//

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
CONSTLOGICO : '(yeah)|(trap)';
CONSTCHAR : ASPA(~["\\]|'\\'.)ASPA;

//Comentarios
COMENTARIOLINHA : 'first'~[\n\r]* -> skip;
COMENTARIOMULTIPLO : 'ayy'(.|'\n')*'lmao' -> skip;

//DELIMITADORES
PONTO : '.';
IGUAL : '=';
PONTOEVIRGULA : 'desu';
VIRGULA : '¬¬';
DOISPONTOS : ':';
COLCHETESABRE : '[';
COLCHETESFECHA : ']';
CHAVESABRE : 'illuminati';
CHAVESFECHA : 'confirmed'; //47
PARENTESEABRE : 'L(';
PARENTESEFECHA: ')L';

ASPA: '"';
//EXTRA
ID : [A-Za-z_][A-Za-z_0-9]*;

//IGNORADOS
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip ;
