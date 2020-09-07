## Parser generator

The program generates a parser for LALR grammar in Java. Input grammar syntax is similar to ANTLR grammar.

### Usage:
```
String str = String.join("\n", Files.readAllLines(Path.of(filepath)));
new MainGenerator().generate(directory, str, programName, pack);   
```

+ `filepath` - path to the grammar file
+ `directory` - directory for saving the parser
+ `programName` - name of the parser
+ `pack` - package to save parser

### Examples:
+ Calculator - [grammar](/source/Calculator.dkr), [generated files](/src/main/java/generated/calculator), [tests](/src/test/java/generated/calculator/ParserCalculatorTest.java)
    + operations: `+`, `-`, `*`, `-`, `!`
+ Logic expressions - [grammar](/source/Logic.dkr), [generated files](/src/main/java/generated/logic), [tests](/src/test/java/generated/logic/ParserLogicTest.java)
    + operations: `not`, `and`, `or`, `xor`
+ Pascal variables - [grammar](/source/PascalVar.dkr), [generated files](/src/main/java/generated/pascal), [tests](/src/test/java/generated/pascal/ParserPascalVarTest.java)
    + parse variables with type

### References
[This article](https://web.cs.dal.ca/~sjackson/lalr1.html) was used to writing the code.

### Comments
Input grammar is parsed using a parser generated using ANTLR.