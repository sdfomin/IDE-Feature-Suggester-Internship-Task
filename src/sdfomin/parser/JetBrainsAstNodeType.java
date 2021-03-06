package sdfomin.parser;

public enum JetBrainsAstNodeType {
    UNKNOWN,
    PARSE_ERROR,

    INTEGER,
    IDENTIFIER,

    EXPRESSION,
    CONDITION_EXPRESSION,
    PLUS_MINUS_EXPRESSION,
    MULTIPLY_DIVISION_EXPRESSION,
    SIMPLE_EXPRESSION,

    STATEMENT,
    EXPRESSION_STATEMENT,
    IF_STATEMENT,
    ASSIGN_STATEMENT,
    BLOCK_STATEMENT,

    PROGRAM,
    STATEMENT_LIST

}
