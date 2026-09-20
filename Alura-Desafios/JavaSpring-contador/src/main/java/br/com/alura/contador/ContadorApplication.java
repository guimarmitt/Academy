package br.com.alura.contador;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Scanner;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/******** Task 1 - Contador *
		System.out.println("Bem vindo ao contador!");
		System.out.println("----------------------");
		System.out.println("Digite um número para contagem: ");
		Scanner entrada = new Scanner(System.in);
		var numero = entrada.nextInt();

		for(int i = 1; i<=numero; i++){
			System.out.print(i + " ");
		} */

		/********* Task 2 - Serealização *
		Tarefa tarefa = new Tarefa("assistir aula 1", false, "João");
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File("tarefa.json"), tarefa);
		System.out.println("Dados salvos no arquivo tarefa.json!");*/

		/************** Task 3 - Deserealização */
		ObjectMapper objectMapper = new ObjectMapper();
		Tarefa tarefaLida = objectMapper.readValue(new File("tarefa.json"), Tarefa.class);
		System.out.println("Tarefa lida do JSON:");
		System.out.println(tarefaLida);

		/************* Task 4 Teste classe genérica */
		Avaliacao avaliacao = new Avaliacao(tarefaLida, 8, "Adorei a dinamica");
		System.out.println(avaliacao);

	}
}
