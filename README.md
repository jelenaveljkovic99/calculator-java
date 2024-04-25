Line of code (LOC) – Calculator 183 + Start 19 = 202
Start: Cyclomatic complexity: 3 (simple code) Cognitive complexity: 4
Calculator: Cyclomatic complexity: 27 (high complexity) Cognitive complexity: 37
Static analysis: 
Calculator: Line (18, 29)  Rename method "ToString" to prevent any misunderstanding/clash with method "toString" defined in superclass "java.lang.Object". 
Calculator: Line (4 , 13) Add a private constructor to hide the implicit public one. 
Calculator: Line (18, 29)  Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'. 
Calculator: Line (24, 25)  Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'. 
Calculator: Line (70, 28)  Immediately return this expression instead of assigning it to the temporary variable "textResult". 
Calculator: Line (74, 24)  Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$'. 
Calculator: Line (183, 12)  Remove this redundant jump. 

Start: Line (8, 2) Replace this use of System.out by a logger.
Start: Line (19, 4) Replace this use of System.out by a logger. 
Start: Line (6,9) Rename this local variable to match the regular expression '^[a-z][a-zA-Z0-9]*$'. 
