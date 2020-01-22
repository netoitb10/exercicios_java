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
    
    @SuppressWarnings({"ConvertToTryWithResources", "UseSpecificCatch", "null"})
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DateFormat formatador = new SimpleDateFormat("HH:mm");
        Date hora_in = null, hora_fin = null, meia_noite = null, hora_min = null ;
        long ms = 0;
        
        System.out.println("Este programa calcula a duração de um jogo, que tem no mínimo 1h e no máximo 24h");
        
        System.out.println("Insira a hora inicial do jogo (HH:MM Ex.: 12:38):");
        String hora_inicial = sc.nextLine();
                
        System.out.println("Insira a hora final do jogo (HH:MM Ex.: 15:45):");
        String hora_final = sc.nextLine();
                
        try {
            //transforma o texto em data
            hora_in = formatador.parse(hora_inicial);
            hora_fin = formatador.parse(hora_final);
            meia_noite = formatador.parse("23:59:59");
            hora_min = formatador.parse("01:00:00");
            
            //diferença entre tempos (milisegundos)
            ms = hora_fin.getTime() - hora_in.getTime();
        } catch (Exception e) {
            System.err.print(e);
        }
                        
        if ((hora_fin.getTime() <= meia_noite.getTime()) && (ms > hora_min.getTime())) {
            
            DuracaoJogo(ms);
                        
        } else {
            
            //diferença entre 24:00 e hora inicial (milisegundos)
            long aux_in = 86400000 - hora_in.getTime();
            ms = hora_fin.getTime() + aux_in;
            DuracaoJogo(ms);
        }    
       
        sc.close();
    }

    private static void DuracaoJogo(long ms) {
        
        //converte milisegundos em horas e minutos
        String diferenca = String.format( "%02d:%02d", ms / 3600000, ( ms / 60000 ) % 60 );
        
        System.out.printf("O jogo durou: %s %n", diferenca);
    }
    
}
