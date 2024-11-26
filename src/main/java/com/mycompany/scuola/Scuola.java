/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.scuola;
import java.util.Scanner;
/**
 *
 * @author ospite
 */
public class Scuola {
     public void SetDocente1(){ //metodo per inserire docente di matematica
         System.out.println("----EMANUELE GHEORGHIU 4INFD 25/11/2007: --------");
         System.out.println("QUESTO PROGRAMMA CHIEDE AL UTENTE DI INSERIRE COGNOME DEL DOCENTE, NOME E COGNOME DEI STUDENTI E VOTI DI OGNI MATERIA, E CAALCOLA LA MEDIA DI OGNI STUDENTE: ");
        String docente = null;
        for(int i=0;i<1;i++){//for per generare il nome
         Scanner scanner= new Scanner(System.in);//funzione per far inserire al utente un numero
         System.out.println("inserisci il cognome del docente di matematica: " +docente);//stampa del docente
         docente=scanner.nextLine();
        }
    }
    public void SetDocente2(){ //metodo per inserire docente di italiano
        String docente2 = null;
        for(int i=0;i<1;i++){//for per generare il nome
         Scanner scanner= new Scanner(System.in);//funzione per far inserire al utente un numero
         System.out.println("inserisci il cognome del docente di italiano: " +docente2);//stampa del docente
         docente2=scanner.nextLine();
        }
    }
    public void SetDocente3(){ //metodo per inserire docente di storia
        String docente3 = null;
        for(int i=0;i<1;i++){//for per generare il nome
         Scanner scanner= new Scanner(System.in);
         System.out.println("inserisci il cognome del docente di storia: " +docente3);//stampa del docente
         docente3=scanner.nextLine();
        }
    }
    public void Setstudente(){
        String studente = null;
        Scanner scanner= new Scanner(System.in);
        for(int i=0;i<3;i++){
        System.out.println("inserisci il nome dei studenti: /n" +studente);//stampa dei nome dello studente
        studente=scanner.nextLine();
        System.out.println("inserisci il cognome dei studenti: /n" +studente);//stampa del cognome dello studente
        studente=scanner.nextLine();
        }
    }
    public void SetVoti(){
        int voti=0;
        int somma=0;
        int n=0;
        double media=0.0;
        Scanner scanner= new Scanner(System.in);
        for(int i=0;i<3;i++){
        System.out.println("inserisci i voti di matematica dei studenti: /n" +voti);//stampa dei voti di matematica dello studente
        voti=scanner.nextInt();
        System.out.println("inserisci i voti di italiano dei studenti: /n" +voti);//stampa dei voto di italiano dello studente
        voti=scanner.nextInt();
        System.out.println("inserisci i voti di storia dei studenti: /n" +voti);//stampa dei voti storia dello studente
        voti=scanner.nextInt();
       somma=n+n;//calcolo della somma per poi calcolarci la media 
        media=somma/100;//calcolo della media
        System.out.println("la media e' :/n" +media);//stampa della media
        media=scanner.nextDouble();
          
        
        }       
    }
   public static void main(String[] args){
        Scuola scuola=new Scuola();
        scuola.SetDocente1();//per stampare 
        scuola.SetDocente2();//per stampare
        scuola.SetDocente3();//per stampare
         scuola.Setstudente();//per stampare
        scuola.SetVoti();//per stampare
    }
}
