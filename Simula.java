/** Agrega los alumnos y profesores iniciales 
 *  para probar el programa.
 *  Al menos 8 alumnos por cada grupo, un profesor por cada materia y opción técnica. 
 */
public class Simula {

    // agregar profesores primero
    public void agregaMaestros(){
        // crear un profesor por cada materia y opcion tecnica y contratarlos

        // Profesores de cada materia:
        Profesor p1 = new Profesor("Canek", 1, "Fisica", 'A');
        Profesor p2 = new Profesor("Galaviz", 1, "Matematicas", 'A');
        Profesor p3 = new Profesor("Gerardo", 2, "Biologia", 'A');
        Profesor p4 = new Profesor("Hector", 2, "Quimica", 'A');
        Profesor p5 = new Profesor("Karla", 3, "Historia", 'A');
        Profesor p6 = new Profesor("Paulo", 3, "Ciencias Sociales", 'A');
        Profesor p7 = new Profesor("Rosa", 4, "Filosofia", 'A');
        Profesor p8 = new Profesor("Rincon", 4, "Artes Plasticas", 'A');
        ContrataProfesor.contratarDefault(p1);
        ContrataProfesor.contratarDefault(p2);
        ContrataProfesor.contratarDefault(p3);
        ContrataProfesor.contratarDefault(p4);
        ContrataProfesor.contratarDefault(p5);
        ContrataProfesor.contratarDefault(p6);
        ContrataProfesor.contratarDefault(p7);
        ContrataProfesor.contratarDefault(p8);

        // Profesores Opciones tecnicas
        Profesor t1 = new Profesor("Lola", 0, "Agente de viajes y hotelería", 'A');
        Profesor t2 = new Profesor("Dexter", 0, "Fotógrafo, Laboratorista y Prensa", 'A');
        Profesor t3 = new Profesor("Gulliver", 0, "Nutriólogo", 'A');
        Profesor t4 = new Profesor("Homero", 0, "Laboratorista Químico", 'A');
        ContrataProfesor.contratarDefault(t1);
        ContrataProfesor.contratarDefault(t2);
        ContrataProfesor.contratarDefault(t3);
        ContrataProfesor.contratarDefault(t4);

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
        InscribeAlumno.inscribir(a1);
        InscribeAlumno.inscribir(a2);
        InscribeAlumno.inscribir(a3);
        InscribeAlumno.inscribir(a4);
        InscribeAlumno.inscribir(a5);
        InscribeAlumno.inscribir(a6);
        InscribeAlumno.inscribir(a7);
        InscribeAlumno.inscribir(a8);

        // Alumnos Fisico-Matematicas grupo B
        Alumno b1 = new Alumno("Jorge",1,'B');
        Alumno b2 = new Alumno("Ana",1,'B');
        Alumno b3 = new Alumno("Fernando",1,'B');
        Alumno b4 = new Alumno("Valeria",1,'B');
        Alumno b5 = new Alumno("Marco",1,'B');
        Alumno b6 = new Alumno("Mauricio",1,'B');
        Alumno b7 = new Alumno("Daniel",1,'B');
        Alumno b8 = new Alumno("Felipe",1,'B');
        InscribeAlumno.inscribir(b1);
        InscribeAlumno.inscribir(b2);
        InscribeAlumno.inscribir(b3);
        InscribeAlumno.inscribir(b4);
        InscribeAlumno.inscribir(b5);
        InscribeAlumno.inscribir(b6);
        InscribeAlumno.inscribir(b7);
        InscribeAlumno.inscribir(b8);

        // Alumnos Ciencias Biológicas y de la Salud grupo B
        Alumno c1 = new Alumno("Itzel",2,'B');
        Alumno c2 = new Alumno("Paulina",2,'B');
        Alumno c3 = new Alumno("Ximena",2,'B');
        Alumno c4 = new Alumno("Daniela",2,'B');
        Alumno c5 = new Alumno("Mariana",2,'B');
        Alumno c6 = new Alumno("Arturo",2,'B');
        Alumno c7 = new Alumno("Javier",2,'B');
        Alumno c8 = new Alumno("Roberto",2,'B');
        InscribeAlumno.inscribir(c1);
        InscribeAlumno.inscribir(c2);
        InscribeAlumno.inscribir(c3);
        InscribeAlumno.inscribir(c4);
        InscribeAlumno.inscribir(c5);
        InscribeAlumno.inscribir(c6);
        InscribeAlumno.inscribir(c7);
        InscribeAlumno.inscribir(c8);

         // Alumnos Ciencias Biológicas y de la Salud grupo A
         Alumno d1 = new Alumno("carlos",2,'A');
         Alumno d2 = new Alumno("Dante",2,'A');
         Alumno d3 = new Alumno("Erick",2,'A');
         Alumno d4 = new Alumno("Enrique",2,'A');
         Alumno d5 = new Alumno("Helio",2,'A');
         Alumno d6 = new Alumno("Manuel",2,'A');
         Alumno d7 = new Alumno("Cristian",2,'A');
         Alumno d8 = new Alumno("Ricardo",2,'A');
         InscribeAlumno.inscribir(d1);
         InscribeAlumno.inscribir(d2);
         InscribeAlumno.inscribir(d3);
         InscribeAlumno.inscribir(d4);
         InscribeAlumno.inscribir(d5);
         InscribeAlumno.inscribir(d6);
         InscribeAlumno.inscribir(d7);
         InscribeAlumno.inscribir(d8);

         // Alumnos Ciencias Sociales grupo A
         Alumno e1 = new Alumno("Gustavo",3,'A');
         Alumno e2 = new Alumno("Rafael",3,'A');
         Alumno e3 = new Alumno("Santiago",3,'A');
         Alumno e4 = new Alumno("Adolfo",3,'A');
         Alumno e5 = new Alumno("Manrique",3,'A');
         Alumno e6 = new Alumno("Lucifer",3,'A');
         Alumno e7 = new Alumno("Amenadiel",3,'A');
         Alumno e8 = new Alumno("Kibsaim",3,'A');
         InscribeAlumno.inscribir(e1);
         InscribeAlumno.inscribir(e2);
         InscribeAlumno.inscribir(e3);
         InscribeAlumno.inscribir(e4);
         InscribeAlumno.inscribir(e5);
         InscribeAlumno.inscribir(e6);
         InscribeAlumno.inscribir(e7);
         InscribeAlumno.inscribir(e8);

         // Alumnos Ciencias Sociales grupo B
        Alumno f1 = new Alumno("Bruce",3,'B');
        Alumno f2 = new Alumno("Clark",3,'B');
        Alumno f3 = new Alumno("Barry",3,'B');
        Alumno f4 = new Alumno("Arthur",3,'B');
        Alumno f5 = new Alumno("Luisa",3,'B');
        Alumno f6 = new Alumno("Cloe",3,'B');
        Alumno f7 = new Alumno("Diana",3,'B');
        Alumno f8 = new Alumno("Peter",3,'B');
        InscribeAlumno.inscribir(f1);
        InscribeAlumno.inscribir(f2);
        InscribeAlumno.inscribir(f3);
        InscribeAlumno.inscribir(f4);
        InscribeAlumno.inscribir(f5);
        InscribeAlumno.inscribir(f6);
        InscribeAlumno.inscribir(f7);
        InscribeAlumno.inscribir(f8);

        // Alumnos Humanidades y Artes grupo B
        Alumno g1 = new Alumno("John",4,'B');
        Alumno g2 = new Alumno("Sofia",4,'B');
        Alumno g3 = new Alumno("Fernanda",4,'B');
        Alumno g4 = new Alumno("Valerio",4,'B');
        Alumno g5 = new Alumno("Alejandra",4,'B');
        Alumno g6 = new Alumno("Boris",4,'B');
        Alumno g7 = new Alumno("Isidoro",4,'B');
        Alumno g8 = new Alumno("Samuel",4,'B');
        InscribeAlumno.inscribir(g1);
        InscribeAlumno.inscribir(g2);
        InscribeAlumno.inscribir(g3);
        InscribeAlumno.inscribir(g4);
        InscribeAlumno.inscribir(g5);
        InscribeAlumno.inscribir(g6);
        InscribeAlumno.inscribir(g7);
        InscribeAlumno.inscribir(g8);

         // Alumnos Humanidades y Artes grupo A
         Alumno h1 = new Alumno("Aron",4,'A');
         Alumno h2 = new Alumno("Martin",4,'A');
         Alumno h3 = new Alumno("Matias",4,'A');
         Alumno h4 = new Alumno("Alberto",4,'A');
         Alumno h5 = new Alumno("Gabriel",4,'A');
         Alumno h6 = new Alumno("Tomas",4,'A');
         Alumno h7 = new Alumno("David",4,'A');
         Alumno h8 = new Alumno("Joaquin",4,'A');
         InscribeAlumno.inscribir(h1);
         InscribeAlumno.inscribir(h2);
         InscribeAlumno.inscribir(h3);
         InscribeAlumno.inscribir(h4);
         InscribeAlumno.inscribir(h5);
         InscribeAlumno.inscribir(h6);
         InscribeAlumno.inscribir(h7);
         InscribeAlumno.inscribir(h8);


    }

    

}