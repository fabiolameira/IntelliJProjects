/**
 * 
 */
package exemplo_11;
import java.time.*;
//import java.time.LocalDateTime;
//import java.time.LocalDate;
//import java.time.LocalTime;

/**
 * @author mvmartins
 *
 */
public class Datas_02 {

	/**
	 * 
	 */
	public static void main(String[] args) {
		
		LocalDateTime momento = LocalDateTime.now();
		System.out.println("Momento : "+momento);
		
		LocalDate hoje = momento.toLocalDate();		
		System.out.println("Hoje : "+ hoje);		
		LocalDate hoje_v2 = LocalDate.now();
		System.out.println("Hoje_v2 : "+ hoje_v2);
		
		LocalTime agora = momento.toLocalTime();
		System.out.println("Agora : "+ agora);
		
		int ano, dia_do_mes, dia_do_ano, numero_mes; 
		ano= momento.getYear();
		dia_do_mes = momento.getDayOfMonth();
		dia_do_ano = momento.getDayOfYear();
		numero_mes = momento.getMonthValue();
		
		System.out.println("Ano: "+ano);
		System.out.println("Dia do Mes: "+dia_do_mes);
		System.out.println("Dia do Ano: "+dia_do_ano);
		System.out.println("Mes (n�mero): "+numero_mes);
		
		Month mes = momento.getMonth();
		System.out.println("Mes " + mes);
		
		DayOfWeek dia_da_semana = momento.getDayOfWeek();
		System.out.println("Dia da semana: " + dia_da_semana);
		
		int hora;
		hora = momento.getHour();
		System.out.println("Hora " + hora);
		
		LocalDateTime Natal = LocalDateTime.of(ano, 12, 25, 0, 2);
		System.out.println("Natal: "+ Natal);
		
		//System.out.println("O Natal � posterior a hoje? "+ Natal.isAfter(momento));
		System.out.println("O Natal j� passou? "+ Natal.isBefore(momento));
		
		System.out.println("Compara: " + momento.compareTo(Natal));
		
		LocalDateTime ano0 = momento.minusYears(18);
		System.out.println("Maioridade: pessoas que nasceram antes de "+ano0);
	}

}
