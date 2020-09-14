/*
Guia_0101.
*/
module Guia_0101;
// define data
	integer a = 25;
	integer b = 50;
	integer c = 713;
	integer d = 125;
	integer e = 365;

// actions
	initial
		begin : main
		$display ( "Guia_0101 - Tests" );
		$display ( "a - %d = %8b" , a, a );
		$display ( "b - %d = %8b" , b, b );
		$display ( "c - %d = %8b" , c, c );
		$display ( "d - %d = %8b" , d, d );
		$display ( "e - %d = %8b" , e, e );
		end // main
endmodule // Guia_0101