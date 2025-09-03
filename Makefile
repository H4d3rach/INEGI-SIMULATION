#Proyecto 3 Alejandre Dominguez Alan Jose 7CV2
JFLAGS = -g
JC = javac

.SUFFIXES: .java .class

.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
		  Archivo.java \
		  Registros.java \
		  graficaBarras.java \
		  interfazTexto.java \

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class

