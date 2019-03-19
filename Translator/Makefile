all: compile

compile:
	jflex scanner.flex
	java -jar ./libs/java-cup-11b.jar -interface -parser Parser parser.cup
	javac -cp ./libs/java-cup-11b-runtime.jar *.java

execute:
	java -cp ./libs/java-cup-11b-runtime.jar:. Main

clean:
	rm -f *.class *~
