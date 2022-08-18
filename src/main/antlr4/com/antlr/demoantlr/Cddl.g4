grammar Cddl;
entry : cddl+;
cddl : s (rule_1 s)+;
rule_1 : (typename (genericparm)? s assignt s type)
      | (groupname (genericparm)? s assigng s grpent);

typename : id;
groupname : id;

assignt : EQUALS | (SLASH EQUALS);
assigng : EQUALS | (SLASH SLASH EQUALS);

genericparm : LESS_THAN s id s (COMMA s id s )* GREATER_THAN;
genericarg : LESS_THAN s type1 s (COMMA s type1 s )* GREATER_THAN;

type : type1 (s SLASH s type1)*;

type1 : type2 (s (rangeop | ctlop) s type2)?;
// space may be needed before the operator if type2 ends in a name

type2 : value
      | (typename (genericarg)?)
      | (LEFT_BRACE s group s RIGHT_BRACE)
      | (LEFT_PAREN s type s RIGHT_PAREN)
      | (LEFT_CURLY_BRACE s group s RIGHT_CURLY_BRACE)
      | (TILDE s typename (genericarg)?)
      | (AMPERSAND s LEFT_PAREN s group s RIGHT_PAREN)
      | (AMPERSAND s groupname (genericarg)?)
      | (HASH SIX (PERIOD uint_1)? LEFT_PAREN s type s RIGHT_PAREN)
      | (HASH digit (PERIOD uint_1)?)                // major/ai
      | HASH;                                 // any

rangeop : (PERIOD PERIOD PERIOD) | (PERIOD PERIOD);

ctlop : PERIOD id;

group : grpchoice (s (SLASH SLASH) s grpchoice)*;

grpchoice : (grpent optcom)*;
grpent : ((occur s)? (memberkey s)? type)
            | ((occur s)? groupname (genericarg)?)  // preempted by above
            | ((occur s)? LEFT_PAREN s group s RIGHT_PAREN);

memberkey : (type1 s (CARAT s)? (EQUALS GREATER_THAN))
          | (bareword s COLON)
          | (value s COLON);

bareword : id;

optcom : s (COMMA s)?;

occur : ((uint_1)? ASTERISK (uint_1)?)
      | PLUS
      | QUESTION;

uint_1 : (digit1 digit*)
     | ((ZERO (CAP_X | X)) hexdig+)
     | ((ZERO (CAP_B | B)) bindig+)
     | ZERO;

value : number
      | text
      | bytes;

int_1 : (DASH)? uint_1;

// This is a float if it has fraction or exponent; int otherwise
number : hexfloat | (int_1 (PERIOD fraction)? ((CAP_E | E) exponent )?);
hexfloat : (DASH)? (ZERO (CAP_X | X)) hexdig+ (PERIOD hexdig+)? (CAP_P | P) exponent;
fraction : digit+;
exponent : (PLUS|DASH)? digit+;

text : QUOTE schar* QUOTE;
schar : (SPACE | EXCLAMATION) | (HASH | DOLLAR | PERCENT | AMPERSAND | APOSTROPHE | LEFT_PAREN | RIGHT_PAREN | ASTERISK | PLUS | COMMA | DASH | PERIOD | SLASH | ZERO | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | COLON | SEMICOLON | LESS_THAN | EQUALS | GREATER_THAN | QUESTION | AT | CAP_A | CAP_B | CAP_C | CAP_D | CAP_E | CAP_F | CAP_G | CAP_H | CAP_I | CAP_J | CAP_K | CAP_L | CAP_M | CAP_N | CAP_O | CAP_P | CAP_Q | CAP_R | CAP_S | CAP_T | CAP_U | CAP_V | CAP_W | CAP_X | CAP_Y | CAP_Z | LEFT_BRACE) | (RIGHT_BRACE | CARAT | UNDERSCORE | ACCENT | A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z | LEFT_CURLY_BRACE | PIPE | RIGHT_CURLY_BRACE | TILDE) | SCHAR_LETTER | sesc;

sesc : BACKSLASH ((SPACE | EXCLAMATION | QUOTE | HASH | DOLLAR | PERCENT | AMPERSAND | APOSTROPHE | LEFT_PAREN | RIGHT_PAREN | ASTERISK | PLUS | COMMA | DASH | PERIOD | SLASH | ZERO | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | COLON | SEMICOLON | LESS_THAN | EQUALS | GREATER_THAN | QUESTION | AT | CAP_A | CAP_B | CAP_C | CAP_D | CAP_E | CAP_F | CAP_G | CAP_H | CAP_I | CAP_J | CAP_K | CAP_L | CAP_M | CAP_N | CAP_O | CAP_P | CAP_Q | CAP_R | CAP_S | CAP_T | CAP_U | CAP_V | CAP_W | CAP_X | CAP_Y | CAP_Z | LEFT_BRACE | BACKSLASH | RIGHT_BRACE | CARAT | UNDERSCORE | ACCENT | A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z | LEFT_CURLY_BRACE | PIPE | RIGHT_CURLY_BRACE | TILDE) | SCHAR_LETTER);

bytes : (bsqual)? APOSTROPHE bchar* APOSTROPHE;

bchar : (SPACE | EXCLAMATION | QUOTE | HASH | DOLLAR | PERCENT | AMPERSAND) | (LEFT_PAREN | RIGHT_PAREN | ASTERISK | PLUS | COMMA | DASH | PERIOD | SLASH | ZERO | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | COLON | SEMICOLON | LESS_THAN | EQUALS | GREATER_THAN | QUESTION | AT | CAP_A | CAP_B | CAP_C | CAP_D | CAP_E | CAP_F | CAP_G | CAP_H | CAP_I | CAP_J | CAP_K | CAP_L | CAP_M | CAP_N | CAP_O | CAP_P | CAP_Q | CAP_R | CAP_S | CAP_T | CAP_U | CAP_V | CAP_W | CAP_X | CAP_Y | CAP_Z | LEFT_BRACE) | (RIGHT_BRACE | CARAT | UNDERSCORE | ACCENT | A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z | LEFT_CURLY_BRACE | PIPE | RIGHT_CURLY_BRACE | TILDE | U_007F | SCHAR_LETTER ) | sesc | crlf;

bsqual : (CAP_H | H) | ((CAP_B | B) SIX FOUR);

id : ealpha ((DASH | PERIOD)* (ealpha | digit))*;
alpha : (CAP_A | CAP_B | CAP_C | CAP_D | CAP_E | CAP_F | CAP_G | CAP_H | CAP_I | CAP_J | CAP_K | CAP_L | CAP_M | CAP_N | CAP_O | CAP_P | CAP_Q | CAP_R | CAP_S | CAP_T | CAP_U | CAP_V | CAP_W | CAP_X | CAP_Y | CAP_Z) | (A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z);
ealpha : alpha | AT | UNDERSCORE | DOLLAR;
digit : (ZERO | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE);
digit1 : (ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE);
hexdig : digit | (CAP_A | A) | (CAP_B | B) | (CAP_C | C) | (CAP_D | D) | (CAP_E | E) | (CAP_F | F);
bindig : (ZERO | ONE);

s : ws*;
ws : sp | nl;
sp : SPACE;
nl : comment | crlf;
comment : SEMICOLON pchar* crlf;

pchar : (SPACE | EXCLAMATION | QUOTE | HASH | DOLLAR | PERCENT | AMPERSAND | APOSTROPHE | LEFT_PAREN | RIGHT_PAREN | ASTERISK | PLUS | COMMA | DASH | PERIOD | SLASH | ZERO | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | COLON | SEMICOLON | LESS_THAN | EQUALS | GREATER_THAN | QUESTION | AT | CAP_A | CAP_B | CAP_C | CAP_D | CAP_E | CAP_F | CAP_G | CAP_H | CAP_I | CAP_J | CAP_K | CAP_L | CAP_M | CAP_N | CAP_O | CAP_P | CAP_Q | CAP_R | CAP_S | CAP_T | CAP_U | CAP_V | CAP_W | CAP_X | CAP_Y | CAP_Z | LEFT_BRACE | BACKSLASH | RIGHT_BRACE | CARAT | UNDERSCORE | ACCENT | A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z | LEFT_CURLY_BRACE | PIPE | RIGHT_CURLY_BRACE | TILDE) | SCHAR_LETTER;

crlf : LF | (CR LF);

////////////////////////////////////////////////////////////////////////////////////////////
// Lexer rules generated for each distinct character in original grammar
// Simplified character names based on Unicode (http://www.unicode.org/charts/PDF/U0000.pdf)
////////////////////////////////////////////////////////////////////////////////////////////

QUOTE : '"';
HASH : '#';
AMPERSAND : '&';
LEFT_PAREN : '(';
RIGHT_PAREN : ')';
ASTERISK : '*';
PLUS : '+';
COMMA : ',';
DASH : '-';
PERIOD : '.';
SLASH : '/';
ZERO : '0';
COLON : ':';
LESS_THAN : '<';
EQUALS : '=';
GREATER_THAN : '>';
QUESTION : '?';
LEFT_BRACE : '[';
RIGHT_BRACE : ']';
CARAT : '^';
SCHAR_LETTER : [\u0080-\uFFFD];

TAB : '\u0009';
LF : '\u000A';
CR : '\u000D';
SPACE : ' ';
EXCLAMATION : '!';
DOLLAR : '$';
PERCENT : '%';
APOSTROPHE : '\'';
ONE : '1';
TWO : '2';
THREE : '3';
FOUR : '4';
FIVE : '5';
SIX : '6';
SEVEN : '7';
EIGHT : '8';
NINE : '9';
SEMICOLON : ';';
AT : '@';
UNDERSCORE : '_';
CAP_A : 'A';
CAP_B : 'B';
CAP_C : 'C';
CAP_D : 'D';
CAP_E : 'E';
CAP_F : 'F';
CAP_G : 'G';
CAP_H : 'H';
CAP_I : 'I';
CAP_J : 'J';
CAP_K : 'K';
CAP_L : 'L';
CAP_M : 'M';
CAP_N : 'N';
CAP_O : 'O';
CAP_P : 'P';
CAP_Q : 'Q';
CAP_R : 'R';
CAP_S : 'S';
CAP_T : 'T';
CAP_U : 'U';
CAP_V : 'V';
CAP_W : 'W';
CAP_X : 'X';
CAP_Y : 'Y';
CAP_Z : 'Z';
A : 'a';
B : 'b';
C : 'c';
D : 'd';
E : 'e';
F : 'f';
G : 'g';
H : 'h';
I : 'i';
J : 'j';
K : 'k';
L : 'l';
M : 'm';
N : 'n';
O : 'o';
P : 'p';
Q : 'q';
R : 'r';
S : 's';
T : 't';
U : 'u';
V : 'v';
W : 'w';
X : 'x';
Y : 'y';
Z : 'z';
LEFT_CURLY_BRACE : '{';
PIPE : '|';
RIGHT_CURLY_BRACE : '}';
TILDE : '~';
U_007F : '\u007F';