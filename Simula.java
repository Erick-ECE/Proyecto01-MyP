/** Agrega los alumnos y profesores iniciales 
 *  para probar el programa.
 *  Al menos 8 alumnos por cada grupo, un profesor por cada materia y opción técnica. 
 */
public class Simula {
    Administrador admin = Administrador.getInstance();
    InscribeAlumno ins = new InscribeAlumno();

    // agregar profesores primero
    public void agregaMaestros(){
        // crear un profesor por cada materia y opcion tecnica y contratarlos

    }

    // despues agregar alumnos
    public void agregaAlumnos(){
    // crear 8 alumnos por cada grupo e inscribirlos;
        // Alumno(nombre,area,grupo);

        // Alumnos Fisico-Matematicas grupo A
        Alumno a1 = new Alumno("Pedro",1,'A');
        Alumno a2 = new Alumno("Juan",1,'A');
        Alumno a3 = new Alumno("Salvador",1,'A');
        Alumno a4 = new Alumno("Andres",1,'A');
        Alumno a5 = new Alumno("Miguel",1,'A');
        Alumno a6 = new Alumno("Angel",1,'A');
        Alumno a7 = new Alumno("Cesar",1,'A');
        Alumno a8 = new Alumno("Braulio",1,'A');
        ins.inscribir(a1);
        ins.inscribir(a2);
        ins.inscribir(a3);
        ins.inscribir(a4);
        ins.inscribir(a5);
        ins.inscribir(a6);
        ins.inscribir(a7);
        ins.inscribir(a8);

        // Alumnos Fisico-Matematicas grupo B
        Alumno b1 = new Alumno("Jorge",1,'B');
        Alumno b2 = new Alumno("Ana",1,'B');
        Alumno b3 = new Alumno("Fernando",1,'B');
        Alumno b4 = new Alumno("Valeria",1,'B');
        Alumno b5 = new Alumno("Marco",1,'B');
        Alumno b6 = new Alumno("Mauricio",1,'B');
        Alumno b7 = new Alumno("Daniel",1,'B');
        Alumno b8 = new Alumno("Felipe",1,'B');
        ins.inscribir(b1);
        ins.inscribir(b2);
        ins.inscribir(b3);
        ins.inscribir(b4);
        ins.inscribir(b5);
        ins.inscribir(b6);
        ins.inscribir(b7);
        ins.inscribir(b8);

        // Alumnos Ciencias Biológicas y de la Salud grupo B
        Alumno c1 = new Alumno("Itzel",2,'B');
        Alumno c2 = new Alumno("Paulina",2,'B');
        Alumno c3 = new Alumno("Ximena",2,'B');
        Alumno c4 = new Alumno("Daniela",2,'B');
        Alumno c5 = new Alumno("Mariana",2,'B');
        Alumno c6 = new Alumno("Arturo",2,'B');
        Alumno c7 = new Alumno("Javier",2,'B');
        Alumno c8 = new Alumno("Roberto",2,'B');
        ins.inscribir(c1);
        ins.inscribir(c2);
        ins.inscribir(c3);
        ins.inscribir(c4);
        ins.inscribir(c5);
        ins.inscribir(c6);
        ins.inscribir(c7);
        ins.inscribir(c8);

         // Alumnos Ciencias Biológicas y de la Salud grupo A
         Alumno d1 = new Alumno("carlos",2,'A');
         Alumno d2 = new Alumno("Dante",2,'A');
         Alumno d3 = new Alumno("Erick",2,'A');
         Alumno d4 = new Alumno("Enrique",2,'A');
         Alumno d5 = new Alumno("Helio",2,'A');
         Alumno d6 = new Alumno("Manuel",2,'A');
         Alumno d7 = new Alumno("Cristian",2,'A');
         Alumno d8 = new Alumno("Ricardo",2,'A');
         ins.inscribir(d1);
         ins.inscribir(d2);
         ins.inscribir(d3);
         ins.inscribir(d4);
         ins.inscribir(d5);
         ins.inscribir(d6);
         ins.inscribir(d7);
         ins.inscribir(d8);

         // Alumnos Ciencias Sociales grupo A
         Alumno e1 = new Alumno("Gustavo",3,'A');
         Alumno e2 = new Alumno("Rafael",3,'A');
         Alumno e3 = new Alumno("Santiago",3,'A');
         Alumno e4 = new Alumno("Adolfo",3,'A');
         Alumno e5 = new Alumno("Manrique",3,'A');
         Alumno e6 = new Alumno("Lucifer",3,'A');
         Alumno e7 = new Alumno("Amenadiel",3,'A');
         Alumno e8 = new Alumno("Kibsaim",3,'A');
         ins.inscribir(e1);
         ins.inscribir(e2);
         ins.inscribir(e3);
         ins.inscribir(e4);
         ins.inscribir(e5);
         ins.inscribir(e6);
         ins.inscribir(e7);
         ins.inscribir(e8);

         // Alumnos Ciencias Sociales grupo B
        Alumno f1 = new Alumno("Bruce",3,'B');
        Alumno f2 = new Alumno("Clark",3,'B');
        Alumno f3 = new Alumno("Barry",3,'B');
        Alumno f4 = new Alumno("Arthur",3,'B');
        Alumno f5 = new Alumno("Luisa",3,'B');
        Alumno f6 = new Alumno("Cloe",3,'B');
        Alumno f7 = new Alumno("Diana",3,'B');
        Alumno f8 = new Alumno("Peter",3,'B');
        ins.inscribir(f1);
        ins.inscribir(f2);
        ins.inscribir(f3);
        ins.inscribir(f4);
        ins.inscribir(f5);
        ins.inscribir(f6);
        ins.inscribir(f7);
        ins.inscribir(f8);

        // Alumnos Humanidades y Artes grupo B
        Alumno g1 = new Alumno("John",4,'B');
        Alumno g2 = new Alumno("Sofia",4,'B');
        Alumno g3 = new Alumno("Fernanda",4,'B');
        Alumno g4 = new Alumno("Valerio",4,'B');
        Alumno g5 = new Alumno("Alejandra",4,'B');
        Alumno g6 = new Alumno("Boris",4,'B');
        Alumno g7 = new Alumno("Isidoro",4,'B');
        Alumno g8 = new Alumno("Samuel",4,'B');
        ins.inscribir(g1);
        ins.inscribir(g2);
        ins.inscribir(g3);
        ins.inscribir(g4);
        ins.inscribir(g5);
        ins.inscribir(g6);
        ins.inscribir(g7);
        ins.inscribir(g8);

         // Alumnos Humanidades y Artes grupo A
         Alumno h1 = new Alumno("Aron",4,'A');
         Alumno h2 = new Alumno("Martin",4,'A');
         Alumno h3 = new Alumno("Matias",4,'A');
         Alumno h4 = new Alumno("Alberto",4,'A');
         Alumno h5 = new Alumno("Gabriel",4,'A');
         Alumno h6 = new Alumno("Tomas",4,'A');
         Alumno h7 = new Alumno("David",4,'A');
         Alumno h8 = new Alumno("Joaquin",4,'A');
         ins.inscribir(h1);
         ins.inscribir(h2);
         ins.inscribir(h3);
         ins.inscribir(h4);
         ins.inscribir(h5);
         ins.inscribir(h6);
         ins.inscribir(h7);
         ins.inscribir(h8);


    }

    

}