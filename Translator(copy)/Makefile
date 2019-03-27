all: compile

compile:
	jflex scanner.flex
	java -jar ./libs/java-cup-11b.jar -interface -parser Parser -dump -progress parser.cup 
	javac -cp ./libs/java-cup-11b-runtime.jar *.java

execute:
	java -cp ./libs/java-cup-11b-runtime.jar:. Main  -dump_states

clean:
	rm -f *.class *~
	rm sym.java Parser.java Scanner.java
