package dio.springboot.app.Springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {
    @Autowired
    private Rementente rementente;

   /* @Value("${nome:NoReply-Dio}") //criado a classe rementente deixa o código mais limpo e organizado
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones =
            new ArrayList<>(Arrays.asList(new Long[]{11995016354L}));*/

    @Override
    public void run(String... args) throws Exception{
        System.out.println("Mensagem enviada por: "+ rementente.getNome()
                + "\nE-mail:" + rementente.getEmail()
                + "\nCom Telefones para contato: " + rementente.getTelefones());
        System.out.println("Seu cadastro foi aprovado");
    }


}
