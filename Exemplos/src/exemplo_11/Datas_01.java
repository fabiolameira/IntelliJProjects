/**
 * 
 */
package exemplo_11;
import java.time.*;
//import java.time.LocalDateTime;
//import java.time.LocalDate;
//import java.time.LocalTime;

/**
 * @author darkingw
 *
 */
public class Datas_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Uso de Imports para Conseguir datas:
		LocalDateTime momentoatual = LocalDateTime.now();
		System.out.println("Momento Atual: " +momentoatual);
		
		LocalDate hoje = LocalDate.now();
		System.out.println("Hoje: " +hoje);
		
		LocalTime agora = LocalTime.now();
		System.out.println("Agora: " +agora);
		
		int ano, mes, dia_do_mes, dia_do_ano;
		ano = momentoatual.getYear();
		mes = momentoatual.getMonthValue();
		dia_do_mes = momentoatual.getDayOfMonth();
		dia_do_ano = momentoatual.getDayOfYear();
		
		System.out.println("Ano: " +ano);
		System.out.println("Mês: " +mes);
		System.out.println("Dia do Mês: " +dia_do_mes);
		System.out.println("Dia do Ano: " +dia_do_ano);
		
		Month mes_v2 = momentoatual.getMonth();
		System.out.println("Mês Escrito: " +mes_v2);
		
		DayOfWeek dia_da_semana = momentoatual.getDayOfWeek();
		System.out.println("Dia da Semana: " +dia_da_semana);
		
		int hora = momentoatual.getHour();
		System.out.println("Hora: " +hora);
		
		LocalDateTime natal = LocalDateTime.of(ano, 12, 25, 00, 2);
		System.out.println("Natal: " +natal);
		
		System.out.println("O Natal é Postreor a Hoje? " +natal.isAfter(momentoatual));
		System.out.println("O Natal já Passou? " +natal.isBefore(momentoatual));
	}

}
