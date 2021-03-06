package analyser;

import instruction.InstructionEntry;
import tokenizer.TokenType;

import java.util.ArrayList;
import java.util.List;

public class SymbolEntry {

    // 种类：简单变量var，函数func，参数param等
    private String kind;
    // 类型：int，double，string,void,如果是函数则存其返回类型
    private TokenType type;
    // 值,如果是函数，则存其返回值
    private Object value;
    // 如果是函数，则是参数类型
    private ArrayList<TokenType> paramsType = new ArrayList<>();

    // 如果是函数
    private int level;
    // 指令集
    private ArrayList<InstructionEntry> instructions = new ArrayList<>();
    // 本地变量集
    private ArrayList<String> localVariables = new ArrayList<>();
    // 函数参数集
    private ArrayList<String> paramVars = new ArrayList<>();

    // 是否常量
    private boolean isConstant;
    // 是否有值
    private boolean isInitialized;

    private boolean isGlobal = false;

    private int stackOffset;

    public SymbolEntry(String kind, TokenType type, int level, boolean isConstant, boolean isInitialized,
            int stackOffset) {
        this.kind = kind;
        this.type = type;
        this.level = level;
        this.isConstant = isConstant;
        this.isInitialized = isInitialized;
        this.stackOffset = stackOffset;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public TokenType getType() {
        return type;
    }

    public void setType(TokenType type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ArrayList<InstructionEntry> getInstructions() {
        return instructions;
    }

    public void setInstructions(ArrayList<InstructionEntry> instructions) {
        this.instructions = instructions;
    }

    public ArrayList<String> getLocalVariables() {
        return localVariables;
    }

    public void setLocalVariables(ArrayList<String> localVariables) {
        this.localVariables = localVariables;
    }

    public ArrayList<String> getParamVars() {
        return paramVars;
    }

    public void setParamVars(ArrayList<String> paramVars) {
        this.paramVars = paramVars;
    }

    public boolean isConstant() {
        return isConstant;
    }

    public void setConstant(boolean constant) {
        isConstant = constant;
    }

    public boolean isInitialized() {
        return isInitialized;
    }

    public void setInitialized(boolean initialized) {
        isInitialized = initialized;
    }

    public boolean isGlobal() {
        return isGlobal;
    }

    public void setGlobal(boolean global) {
        isGlobal = global;
    }

    public int getStackOffset() {
        return stackOffset;
    }

    public void setStackOffset(int stackOffset) {
        this.stackOffset = stackOffset;
    }
}
