grammar Grammar;

@members{
	ActionRoutines AR = new ActionRoutines();
}

prog: 	(stmt)+
	;

stmt: assignment
	| print
	;

assignment:	
	ID '=' { AR.createList($ID.text); } assignment_tail[$ID.text]
	|  ID '[' INT ']' '=' value { AR.updateValue($ID.text, Integer.parseInt($INT.text), $value.val); }
	;

assignment_tail [String listID]: 
	'[' value_list[$listID] ']'
	| id1=ID { AR.concList($listID, $id1.text); } ('+' id2=ID { AR.concList($listID, $id2.text); } )*
	|ID '[' (i1=INT)? ':' (i2=INT)? ']'	{ AR.sliceList($listID, $ID.text, $i1.text, $i2.text); }
	| '[' 'for' x=ID 'in' l=ID 'if' { AR.setUpConditions($listID, $l.text, $x.text); } condition ']'  { AR.applyConditions($listID, $l.text); }
	;
	
condition:
	'(' c1=condition o=('or'|'and') c2=condition ')' { AR.combine($o.text); }
	| 'not' condition	{ AR.flip(); }
	| check
	;
	
check:  '(' o1=(ID|INT) OP o2=(ID|INT) ')' { AR.evaluate($o1.text, $OP.text, $o2.text); }
	;
		
value_list [String listID]:	
	v1 = value { AR.addValue($listID, $v1.val); } (',' v2 = value { AR.addValue($listID, $v2.val); } )*
	|
	;

value returns[Object val]:	
	STRING	{ $val = new String($STRING.text); }
	| INT	{ $val = Integer.parseInt($INT.text); }
	| ID	{ $val = new String($ID.text); }
	;

print: 'print' '(' ID ')'   { AR.printList($ID.text); }
	;


OP: ('==' | '!=' | '<' | '<=' | '>' | '>=')									;
STRING: '\'' ('a'..'z' | 'A'..'Z' | '0'..'9')* '\''							;
INT:	('-')? ('0'..'9')+													;		
ID:	('a'..'z' | 'A'..'Z' | '\_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '\_')*	;
WS:	(' ' | '\t' | '\n' | '\r')+ {skip();} 									;
COMMENTS:('//') (~('\n' | '\r'))* {skip();}									;