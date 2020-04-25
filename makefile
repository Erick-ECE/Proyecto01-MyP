make compile:
	rm -f *.class && javac Controlador.java
make run: 
	java Controlador
make clean:
	rm *.class	