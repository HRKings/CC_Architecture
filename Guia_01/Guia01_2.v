/*
Guia_0102.
*/
module Guia_0102;
// define data
	reg [7:0] a = 8'b0011001;
	reg [7:0] b = 8'b0010110;
	reg [7:0] c = 8'b0100101;
	reg [7:0] d = 8'b0111011;
	reg [7:0] e = 8'b0111001;
// actions
	initial
		begin : main
		$display ( "Guia_0102 - Tests" );
		$display ( "a - %8b = %d" , a, a );
		$display ( "b - %8b = %d" , b, b );
		$display ( "c - %8b = %d" , c, c );
		$display ( "d - %8b = %d" , d, d );
		$display ( "e - %8b = %d" , e, e );
		end // main
endmodule // Guia_0102