package com.example.demo.repository;
import java.util.ArrayList;
import java.util.Iterator;

import com.example.demo.bean.Libro;

public class BaseDatos {

  ArrayList<Libro> libros = new ArrayList<Libro>();
  public BaseDatos(){
    libros.add(new Libro(1,"HARRY POTTER Y EL PRISIONERO DE AZKABAN","J.K ROWINS", "SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
    libros.add(new Libro(2,"EL GRAN LABERINTO","J.K ROWINS", "SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
    libros.add(new Libro(3,"ROMEO Y JULIETA","J.K ROWINS", "SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
    libros.add(new Libro(4,"LA CARTA ESFERICA","J.K ROWINS", "SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
    libros.add(new Libro(5,"CODIGO DA VINCI","J.K ROWINS", "SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
    libros.add(new Libro(6,",UCHO RUIDO Y POCAS NUECES","J.K ROWINS", "SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
    libros.add(new Libro(7,"PROTOCOLO","J.K ROWINS", "SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
    libros.add(new Libro(8,"LINUX","J.K ROWINS", "SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
    libros.add(new Libro(9,"EL TUMULTO","J.K ROWINS", "SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
    libros.add(new Libro(10,"HARRY POTTER Y EL PRISIONERO DE AZKABAN","J.K ROWINS", "SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
    libros.add(new Libro(11,"HARRY POTTER Y EL PRISIONERO DE AZKABAN","J.K ROWINS", "SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
    libros.add(new Libro(12,"HARRY POTTER Y EL PRISIONERO DE AZKABAN","J.K ROWINS", "SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
    libros.add(new Libro(13,"HARRY POTTER Y EL PRISIONERO DE AZKABAN","J.K ROWINS", "SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
    libros.add(new Libro(14,"HARRY POTTER Y EL PRISIONERO DE AZKABAN","J.K ROWINS", "SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
    libros.add(new Libro(15,"HARRY POTTER Y EL PRISIONERO DE AZKABAN","J.K ROWINS", "SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
    libros.add(new Libro(16,"HARRY POTTER Y EL PRISIONERO DE AZKABAN","J.K ROWINS", "SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
    libros.add(new Libro(17,"HARRY POTTER Y EL PRISIONERO DE AZKABAN","J.K ROWINS", "SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
    libros.add(new Libro(18,"HARRY POTTER Y EL PRISIONERO DE AZKABAN","J.K ROWINS", "SALAMANDRA","26/9/2006 0:00:00","INFANTIL"));
  }
  public ArrayList<Libro> getLibros() {
    return libros;
  }
  public void setLibros(ArrayList<Libro> libros){
    this.libros = libros;
  }

  public void inserta(Libro libro){
    libros.add(libro);
  }
  public void borrar(int id) {
    Iterator<Libro> it = libros.iterator();
    while(it.hasNext()) {
      Libro li = it.next();
      if(li.getId()==id) {
        it.remove();
        break;
      }
    }
  }
  public void modifica(Libro libro) {
    Iterator<Libro> it = libros.iterator();
    while(it.hasNext()){
      Libro li = it.next();
      if(li.getId()==libro.getId()) {
        li.setTitulo(libro.getTitulo());
        li.setAutor(libro.getAutor());
        li.setEditorial(libro.getEditorial());
        li.setFecha(libro.getFecha());
        li.setTematica(libro.getTematica());
        break;
      }
    }
  }
}
