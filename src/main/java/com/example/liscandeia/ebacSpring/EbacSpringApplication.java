package com.example.liscandeia.ebacSpring;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.example.liscandeia.ebacSpring.domain.model.Cliente;
import com.example.liscandeia.ebacSpring.domain.repository.IClienteRepository;

@SpringBootApplication
@EnableJpaRepositories("com.example.liscandeia.ebacSpring.domain.repository")
@EntityScan("com.example.liscandeia.ebacSpring.domain.model")
public class EbacSpringApplication implements CommandLineRunner{
private static final Logger log = LoggerFactory.getLogger(EbacSpringApplication.class);
	
	@Autowired
	private IClienteRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(EbacSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("StartApplication...");
		Cliente cliente = createCliente();
		repository.save(cliente);
	}
	
	private Cliente createCliente() {
		return Cliente.builder()
				.cidade("DF")
				.cpf(12312312310L)
				.email("lis@teste.com")
				.end("End")
				.estado("DF")
				.nome("lis")
				.numero(10)
				.telefone(61999999999L)
				.build();
	}

}
	


