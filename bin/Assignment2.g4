grammar Assignment2;

@members {
	/**
	 * Compares two integer numbers
	 *
	 * @param x the first number to compare
	 * @param y the second number to compare
	 * @return 1 if x is equal to y, and 0 otherwise
	 */
	public static int equals(int x, int y) {
	    return x == y ? 1 : 0;
	}
}


// Parser rules

s returns [int check]
	: r { $check = $r.check; }
;

r returns [int a, int b, int check]
	: { $a = 0; $b = 0; $check = 1; }
	| P { $a = 0; $b = 0; $check = 1; }
	| A { $a = 1; $b = 0; $check = 1; }
    | B { $a = 0; $b = 1; $check = 1; }
    | LP r1=r U r2=r RP { $a = $r1.a + $r2.a; $b = $r1.b + $r2.b; $check = $r1.check * $r2.check * equals($r1.a, $r2.b); }
    | LP r1=r C r2=r RP { $a = $r1.a + $r2.a; $b = $r1.b + $r2.b; $check = $r1.check * $r2.check; }
    | LP r S RP { $a = $r.a; $b = $r.b; $check = $r.check; }
;


// Lexer rules

A : 'a' ;
B : 'b' ;
P : 'p' ;
U : 'U' ;
C : '.' ;
S : '*' ;
LP : '(' ;
RP : ')' ;
