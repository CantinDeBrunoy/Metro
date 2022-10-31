JFLAGS = -d build -cp build -sourcepath src
JC = javac
JVM = java

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	src/Models/Arete.java \
	src/Models/Sommet.java \
	src/Controllers/AlgoChemins.java \
	src/Controllers/KeyController.java \
	src/Controllers/MouseController.java \
	src/Views/Frame.java \
	src/Views/Panel.java \
	src/metro/metro.java 

MAIN = metro

default: classes

classes: $(CLASSES:.java=.class)

run : 
	$(JVM) -cp build metro/metro

clean:
	rm -r build