import java.util.Scanner;

/**
 * interfaz para definir los menus de opciones de cada usuario (Lo que cada
 * usuario administrador, alumno o profesor pueden hacer)
 */
public interface MenuSesion<T> {
    Administrador admin = Administrador.getInstance();
    Scanner scr = new Scanner (System.in);
    
    public void opcionesMenu(T usuario);

}