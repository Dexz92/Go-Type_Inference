package lang.ast; // The generated scanner will belong to the package lang.ast

import lang.ast.LangParser.Terminals; // The terminals are implicitly defined in the parser
import lang.ast.LangParser.SyntaxError;

%%

// define the signature for the generated scanner
%public
%final
%class LangScanner
%extends beaver.Scanner

// the interface between the scanner and the parser is the nextToken() method
%type beaver.Symbol
%function nextToken

// store line and column information in the tokens
%line
%column

// this code will be inlined in the body of the generated scanner class
%{
  private beaver.Symbol sym(short id) {
    return new beaver.Symbol(id, yyline + 1, yycolumn + 1, yylength(), yytext());
  }
%}

// macros
WhiteSpace = [ ] | \t | \f | \n | \r
IntValue = [0-9]+
BoolValue = true | false
Float64Value = [0-9][0-9]*\.[0-9][0-9]*
Identifier = [a-zA-Z][a-zA-Z0-9]*
BlockComment = "/*" [^]* "*/"

%%

// discard whitespace information
{WhiteSpace}  { }
{BlockComment} { }

// token definitions
";"          { return sym(Terminals.SEMI); }
"bool"          { return sym(Terminals.BOOL); }
"float64"       { return sym(Terminals.FLOAT64); }
"int"           { return sym(Terminals.INT); }
"func"          { return sym(Terminals.FUNC); }
"var"           { return sym(Terminals.VAR); }
"const"         { return sym(Terminals.CONST); }
"return"        { return sym(Terminals.RETURN); }
"for"           { return sym(Terminals.FOR); }
"if"            { return sym(Terminals.IF); }
"else"          { return sym(Terminals.ELSE); }
":="            { return sym(Terminals.SHORTASSIGN); }
"="             { return sym(Terminals.ASSIGN); }
"*"             { return sym(Terminals.MUL); }
"/"             { return sym(Terminals.DIV); }
"%"             { return sym(Terminals.MOD); }
"+"             { return sym(Terminals.ADD); }
"-"             { return sym(Terminals.SUB); }
"=="            { return sym(Terminals.EQ); }
"!="            { return sym(Terminals.NE); }
"<="            { return sym(Terminals.LE); }
">="            { return sym(Terminals.GE); }
"<"             { return sym(Terminals.LT); }
">"             { return sym(Terminals.GT); }
"("             { return sym(Terminals.LP); }
")"             { return sym(Terminals.RP); }
","             { return sym(Terminals.COMMA); }
"{"             { return sym(Terminals.LB); }
"}"             { return sym(Terminals.RB); }
{IntValue}      { return sym(Terminals.INTVALUE); }
{BoolValue}     { return sym(Terminals.BOOLVALUE); }
{Float64Value}  { return sym(Terminals.FLOAT64VALUE); }
{Identifier}    { return sym(Terminals.ID); }
<<EOF>>         { return sym(Terminals.EOF); }

/* error fallback */
[^]           { throw new SyntaxError("Illegal character <"+yytext()+">"); }
