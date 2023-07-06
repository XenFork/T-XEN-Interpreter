parser grammar txenParser;

options {
tokenVocab=txenLexer;
}

main:
    ;

field
    : integer
    | float
    | CHAR
    | STRING
    | BOOL
    | NULL
    | TEXT
    ;
integer
    : DECIMAL_LITERAL
    | HEX_LITERAL
    | OCT_LITERAL
    | BINARY_LITERAL;
float
        : FLOAT
        | HEX_FLOAT;