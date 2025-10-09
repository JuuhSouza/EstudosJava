package br.com.alura.contador;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.table.TableRowSorter;
import java.io.File;
import java.util.Scanner;

@SpringBootApplication
public abstract class ContadorApplication implements CommandLineRunner{

	public static void main(String[] args) {
        SpringApplication.run(ContadorApplication.class, args);
	}

    //1- Contador
    @Override
    public void run(String... args) throws Exception{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um numero para começar a contagem:");
            int numero = scanner.nextInt();

            for (int i = 0; i <= numero; i++) {
                System.out.println(i + " ");
            }
        }

}
