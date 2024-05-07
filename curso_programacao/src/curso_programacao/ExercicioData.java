package curso_programacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExercicioData {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//Para instanciar a data a partir do agora
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		//Para pegar um texto ISO e gerar uma data-hora
		LocalDate d04 = LocalDate.parse("2024-04-12");
		LocalDateTime d05 = LocalDateTime.parse("2024-04-12T14:22:30");
		Instant d06 = Instant.parse("2024-04-12T14:22:30Z");
		Instant d07 = Instant.parse("2024-04-12T13:44:23-03:00");
		
		//Texto personalizado
		LocalDate d08 = LocalDate.parse("12/04/2024", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("12/04/2024 14:41", fmt2);
		
		//Dados isolados para data-hora
		LocalDate d10 = LocalDate.of(2024, 04, 12);
		LocalDateTime d11 = LocalDateTime.of(2024, 04, 12, 14, 53);
		
		System.out.println("Data sem tempo: " + d01);
		System.out.println("Data com tempo: " + d02);
		System.out.println("Data com tempo GMT: " + d03);
		System.out.println("Gerando data-tempo com um texto no formato ISO: " + d04);
		System.out.println("O mesmo porém com horas: " + d05);
		System.out.println("O mesmo porém global: " + d06);
		System.out.println("Data com tempo global da nossa região: " + d07);
		System.out.println("De texto personalizado para Data-hora: " + d08);
		System.out.println("De texto personalizado para Data-hora com hora: " + d09);
		System.out.println("De dados isolados para formato data-hora: " + d10);
		System.out.println("De dados isolados para formato data-hora com hora: " + d11);
		
	}

}
