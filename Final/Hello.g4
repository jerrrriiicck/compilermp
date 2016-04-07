/**
 * Define a grammar called Hello
 */
grammar Hello;
r  : main EOF ; // match keyword hello followed by an identifier

INT : '-'?[0-9]+ ; 

FLOAT : '-'?[0-9]+'.'[0-9]+('e''-'?[0-9]+)? ;

STRING : '"'((' '?[0-9A-Za-z]+' '?'\n'?)+)?'"' ;

CHAR : '\''([0-9A-Za-z]|[\s])?'\'' ; 

BOOLEAN : 'true' | 'false' ;

COMMENT : '8''='+'D'.*'~' ;

ID : [a-zA-Z][0-9a-zA-Z]* ; // match lower-case identifiers

WS : [ \t\r\n\u000C]+ -> skip ; // skip spaces, tabs, newlines

data_type : 'bro' | 'bros' | 'idol' | 'pare' | 'wala' | 'bools'; 

literals : ID | FLOAT | CHAR | INT | STRING | func_call | 'true' | 'false' ;

asop : '+' | '-' ;

mdop : '*' | '/' | '%' ;

expr : literals cond_op expr | adexpr | '(' expr ')';

adexpr : literals asop adexpr | mdexpr | '(' expr ')';

mdexpr : literals mdop mdexpr | negexpr | '(' expr ')';

negexpr : '!' literals | literals | '(' expr ')' ;

incdec_stmt : ID '+' '+'
	| ID '-' '-'
	| ID asop '=' expr 
	| ID mdop '=' expr ;

cond_op : '>' | '<' | '>=' | '<=' | '!=' | '==';

cs_op : '&&' | '||' ;

var_dec : data_type var_dec_list ;

var_dec_list : asgn_stmt 
	| asgn_stmt ',' var_dec_list ;

asgn_stmt : ID '=' expr | array '=' expr | ID ;

array : ID '[' expr ']' ;  

func_call : ID '(' param_list_pass ')' ;

param_list_pass : expr 
	| param_list_pass ',' expr 
	| empty ;

func_dec : empty
	| data_type ID '(' param_list_rcv ')' '{' code_block '}' func_dec ;

param_list_rcv : data_type ID 
	| param_list_rcv ',' data_type ID 
	| empty ;
	
if_stmt : 'pwedebang' '(' cond_stmt ')' '{' code_block '}' ;

cond_stmt : expr cs_op cond_stmt 
	| expr ; 
	
return_stmt : 'bounce' expr terminator ;

switch_stmt : 'swits' '(' expr ')' '{' switch_block '}' ;

switch_block : 'kays' expr ':' code_block 'walana' terminator 
	| 'kays' expr ':' switch_block 
	| 'kays' expr ':' code_block 
	| 'kays' expr ':' code_block 'walana' terminator switch_block
	| 'dipolt' ':' code_block 'walana' terminator ;
	
for_loop : 'fre' '(' 'idol' ID '=' expr ';' cond_stmt ';' incdec_stmt ')' '{' code_block '}'
	| 'fre' '(' ';' cond_stmt ';' incdec_stmt ')' '{' code_block '}'
	| 'fre' '(' ';' ';' incdec_stmt ')' '{' code_block '}' 
	| 'fre' '(' ';' ';' ')' '{' code_block '}' ;
	
while_loop : 'habang' '(' cond_stmt ')' '{' code_block '}' ;

do_while : 'pls' '{' code_block '}' 'habang' '(' cond_stmt ')' ; 

code_block : code | code code_block | empty ;

code : var_dec terminator
	| func_call terminator
	| print terminator
	| return_stmt terminator 
	| asgn_stmt terminator
	| do_while terminator
	| if_stmt
	| switch_block
	| for_loop
	| while_loop 
	| COMMENT ;
	
empty : ;

print : 'broout' '(' expr ')' ;

main : 'NUMEROUNO' '{' code_block '}' func_dec ;

terminator : '\\m/' ;