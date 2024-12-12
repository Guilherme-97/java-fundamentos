package data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Data {

	// Operações importantes:
	// Instanciar hora
	// Intanciar uma data apartir de um texto(ISO 8601)
	// dia, mês, ano (3 caixas no formulário)
	// conversão de hora global para local
	// cálculos com data hora(obter tempo)

	public static void main(String[] args) {

		// Data-hora local
		// classe utilitária com métodos estáticos
		LocalDate d01 = LocalDate.now();
		System.out.println("d01: " + d01);
		// passo a data manualmente
		LocalDate d02 = LocalDate.of(2024, Month.MARCH, 5);
		System.out.println("d02: " + d02);
		// data e hora manualmente
		LocalDateTime d08 = LocalDateTime.of(2024, Month.DECEMBER, 11, 12, 04);
		System.out.println("d08: " + d08);
		// Hora apartir de padrão ISO
		LocalDate d04 = LocalDate.parse("2024-07-20");
		System.out.println("d04: " + d04);

		// Formatando dia usando sobrecarga
		LocalDate d05 = LocalDate.parse("11/12/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println("d05: " + d05);

		// Formatando dia e hora usando sobrecarga
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDate d06 = LocalDate.parse("11/12/2024 01:30", fmt2);
		System.out.println("d06: " + d06);

		LocalDateTime d07 = LocalDateTime.now();
		System.out.println("d07: " + d07);

		// Data-hora global
		// horário de londres
		Instant d03 = Instant.now();
		System.out.println("d03: " + d03);

		// formata no padrão especificado
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d022 = LocalDate.now();
		System.out.println(d022.format(fmt1));

		// formatos prontos
		LocalDateTime d023 = LocalDateTime.now();
		DateTimeFormatter f = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter f1 = DateTimeFormatter.ISO_LOCAL_DATE;
		DateTimeFormatter f2 = DateTimeFormatter.ISO_WEEK_DATE;
		DateTimeFormatter f3 = DateTimeFormatter.ISO_TIME;
		System.out.println("formato ISO_DATE: " + d023.format(f));
		System.out.println("formato ISO_LOCAL_DATE: " + d023.format(f1));
		System.out.println("formato ISO_WEEK_DATE: " + d023.format(f2));
		System.out.println("formato ISO_TIME: " + d023.format(f3));

		// Lista de fusos customizados

		/*
		 * for (String s : ZoneId.getAvailableZoneIds()) { System.out.println(s); }
		 */

		// Pega um padrão de data/hora e transforma no padrão local da máquina
		Instant d024 = Instant.parse("2024-12-12T14:09:17.624651100Z");
		;
		// data/hora minha maquina
		LocalDateTime r1 = LocalDateTime.ofInstant(d024, ZoneId.systemDefault());
		System.out.println("r1 = " + r1);
		// data/hora da asia
		LocalDateTime r2 = LocalDateTime.ofInstant(d024, ZoneId.of("Asia/Singapore"));
		System.out.println("r2 = " + r2);
		// data/hora portugal
		LocalDateTime r3 = LocalDateTime.ofInstant(d024, ZoneId.of("Portugal"));
		System.out.println("r3 = " + r3);

		Instant i = Instant.now();
		LocalDateTime d = LocalDateTime.ofInstant(i, ZoneId.of("Brazil/East"));
		System.out.println(d);
		System.out.println("Dia do mês: " + d.getDayOfMonth());
		System.out.println("Hora: " + d.getHour());
		System.out.println("Minutos: " + d.getMinute());
		System.out.println("Ano: " + d.getYear());

	}

}
