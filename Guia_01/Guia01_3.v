/*
Guia_0103
*/
module Guia_0103;
	// define data
	integer a = 77; // decimal
	integer b = 45; // decimal
	integer c = 67; // decimal
	integer d = 171; // decimal
	integer e = 135; // decimal
	// actions
	initial
		begin : main
		$display ( "Guia_0103 - Tests" );
		$display ( "a - %d = %d %d %d %d", a, a[7:6], a[5:4], a[3:2], a[1:0] );
		$display ( "b - %d = %o", b, b);
		$display ( "c - %d = %x", c, c);
		$display ( "d - %d = %x", d, d);
		$display ( "e - %d = %o", e, e);
		end // main
endmodule // Guia_0103