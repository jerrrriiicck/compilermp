/**
 * Define a grammar called Hello
 */
grammar Hello;
r  : main EOF ; // match keyword hello followed by an identifier

INT : '-'?[0-9]+ ; 

FLOAT : '-'?[0-9]+'.'[0-9]+('e''-'?[0-9]+)? ;

STRING : '"'(([0-9A-Za-z]+' '?'\n'?)+)?'"' ;

CHAR : '\''([0-9A-Za-z]|[\s])?'\'' ; 

ID : [a-zA-Z][0-9a-zA-Z]* ; // match lower-case identifiers

WS : [ \t\r\n\u000C]+ -> skip ; // skip spaces, tabs, newlines

data_type : 'bro' | 'bros' | 'idol' | 'pare' | 'wala'; 

literals : ID | FLOAT | CHAR | INT | STRING | func_call | 'true' | 'false' ;

asop : '+' | '-' ;

mdop : '*' | '/' | '%' ;

expr : literals cond_op expr | adexpr ;

adexpr : literals asop adexpr | mdexpr ;

mdexpr : literals mdop mdexpr | negexpr ;

negexpr : '!' literals | literals  | '(' expr ')' ;

incdec_stmt : ID '+' '+'
	| ID '-' '-'
	| ID asop '=' expr 
	| ID mdop '=' expr ;

cond_op : '>' | '<' | '>=' | '<=' | '!=' ;

var_dec : data_type var_dec_list ;

var_dec_list : asgn_stmt 
	| asgn_stmt ',' var_dec_list ;

asgn_stmt : ID '=' expr | array '=' expr ;

array : ID '[' expr ']' ;  

func_call : ID '(' param_list_pass ')' ;

param_list_pass : expr 
	| param_list_pass ',' expr 
	| empty ;

func_dec : data_type ID '(' param_list_rcv ')' '{' code_block '}' 
	| data_type ID '(' param_list_rcv ')' '{' code_block return_stmt '}' ;

param_list_rcv : data_type ID 
	| param_list_rcv ',' data_type ID 
	| empty ;
	
if_stmt : 'pwedebang' '(' cond_stmt ')' '{' code_block '}' 
	| 'pwedebang' '(' cond_stmt ')' '{' code_block '}' 'oreto' '{' code_block '}' 
	| 'pwedebang' '(' cond_stmt ')' '{' code_block '}' 'oreto' if_stmt;

cond_stmt : expr '&&' cond_stmt 
	| expr '||' cond_stmt
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

do_while : 'pls' '{' code_block '}' 'habang' '{' code_block '}' ; 

code_block : code | code code_block | empty ;

code : var_dec terminator
	| func_call terminator
	| print terminator
	| func_dec 
	| if_stmt
	| switch_block
	| for_loop
	| while_loop
	| do_while ;
	
empty : ;

print : 'broout' '(' expr ')' ;

main : 'NUMEROUNO' '{' code_block '}';

terminator : '\\m/' ;