package union.xenfork.interpreter.parses;

public enum Token {
    IMPORT_OR_PRIORITY("#"),/*import or priority*/
    LL("<-"),
    RL("->"),
    LSP("("),
    RSP(")"),
    LMP("["),
    RMP("]"),
    LBP("{"),
    RBP("}"),
    EOP(""),
    ;
    private final int ordinal;
    private final String tokenName;
    Token(String token) {
        ordinal = this.ordinal();
        tokenName = token;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public String getTokenName() {
        return tokenName;
    }
}
