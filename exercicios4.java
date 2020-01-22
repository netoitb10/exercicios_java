/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura_cond;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author manoel
 */
public class exercicios4 {
    
    @SuppressWarnings({"UseSpecificCatch", "ConvertToTryWithResources", "null"})
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DateFormat formatador = new SimpleDateFormat("HH:mm");
        Date hora_in = null, hora_fin = null;
        
        System.out.println("Este programa calcula a duração de um jogo.");
        
        System.out.println("Insira a hora inicial do jogo (HH:MM Ex.: 12:38):");
        String hora_inicial = sc.nextLine();
                
        System.out.println("Insira a hora final do jogo (HH:MM Ex.: 15:45):");
        String hora_final = sc.nextLine();
                
        try {
            //transforma o texto em data
            hora_in = formatador.parse(hora_inicial);
            hora_fin = formatador.parse(hora_final);
        } catch (Exception e) {
            System.err.print(e);
        }
        
        //diferença entre tempos (milisegundos)
        long ms = hora_fin.getTime() - hora_in.getTime();
        
        //converte milisegundos em horas e minutos
        @SuppressWarnings("MalformedFormatString")
        String diferenca = String.format( "%03d:%02d", ms / 3600000, ( ms / 60000 ) % 60 );
        
        System.out.printf("O jogo durou: %s %n", diferenca);
                
        sc.close();
    }
    
}
