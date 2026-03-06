package com.sistema.funcionarios.controller;

import com.sistema.funcionarios.model.Funcionario;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController

public class FuncionarioController {

    @GetMapping("/api/funcionarios")
    public List<Funcionario> listar() {
        Funcionario f1 = new Funcionario();
        f1.setId(1L); // Se o '1' ficar vermelho, mude para '1L' (com L maiúsculo)
        f1.setNome("Carlos Silva");
        f1.setCargo("Analista");
        f1.setSalario(4500.0);

        Funcionario f2 = new Funcionario();
        f2.setId(2L); // Se o '2' ficar vermelho, mude para '2L'
        f2.setNome("Mariana Souza");
        f2.setCargo("Gerente");
        f2.setSalario(7500.0);

        Funcionario f3 = new Funcionario();
        f3.setId(3L);
        f3.setNome("João Pedro");
        f3.setCargo("Desenvolvedor Júnior");
        f3.setSalario(3200.0);

        Funcionario f4 = new Funcionario();
        f4.setId(4L);
        f4.setNome("Ana Beatriz");
        f4.setCargo("Desenvolvedor Pleno");
        f4.setSalario(5500.0);

        Funcionario f5 = new Funcionario();
        f5.setId(5L);
        f5.setNome("Lucas Oliveira");
        f5.setCargo("Desenvolvedor Sênior");
        f5.setSalario(8500.0);

        Funcionario f6 = new Funcionario();
        f6.setId(6L);
        f6.setNome("Fernanda Costa");
        f6.setCargo("Designer UI/UX");
        f6.setSalario(4800.0);

        Funcionario f7 = new Funcionario();
        f7.setId(7L);
        f7.setNome("Rafael Santos");
        f7.setCargo("Scrum Master");
        f7.setSalario(7000.0);

        Funcionario f8 = new Funcionario();
        f8.setId(8L);
        f8.setNome("Camila Pereira");
        f8.setCargo("Product Owner");
        f8.setSalario(8000.0);

        Funcionario f9 = new Funcionario();
        f9.setId(9L);
        f9.setNome("Marcos Almeida");
        f9.setCargo("Engenheiro de Dados");
        f9.setSalario(9000.0);

        Funcionario f10 = new Funcionario();
        f10.setId(10L);
        f10.setNome("Juliana Lima");
        f10.setCargo("Analista de RH");
        f10.setSalario(3500.0);

        Funcionario f11 = new Funcionario();
        f11.setId(11L);
        f11.setNome("Thiago Mendes");
        f11.setCargo("Analista de Suporte");
        f11.setSalario(2800.0);

        Funcionario f12 = new Funcionario();
        f12.setId(12L);
        f12.setNome("Amanda Ribeiro");
        f12.setCargo("Arquiteta de Software");
        f12.setSalario(12000.0);

        Funcionario f13 = new Funcionario();
        f13.setId(13L);
        f13.setNome("Rodrigo Carvalho");
        f13.setCargo("Analista Financeiro");
        f13.setSalario(4200.0);

        Funcionario f14 = new Funcionario();
        f14.setId(14L);
        f14.setNome("Beatriz Rocha");
        f14.setCargo("Coordenadora de Marketing");
        f14.setSalario(6500.0);

        Funcionario f15 = new Funcionario();
        f15.setId(15L);
        f15.setNome("Bruno Gomes");
        f15.setCargo("DevOps Engineer");
        f15.setSalario(8200.0);

        Funcionario f16 = new Funcionario();
        f16.setId(16L);
        f16.setNome("Larissa Martins");
        f16.setCargo("Tech Lead");
        f16.setSalario(10500.0);

        Funcionario f17 = new Funcionario();
        f17.setId(17L);
        f17.setNome("Diego Fernandes");
        f17.setCargo("Desenvolvedor Mobile");
        f17.setSalario(6000.0);

        Funcionario f18 = new Funcionario();
        f18.setId(18L);
        f18.setNome("Patrícia Alves");
        f18.setCargo("QA Tester");
        f18.setSalario(4000.0);

        Funcionario f19 = new Funcionario();
        f19.setId(19L);
        return List.of(f1, f2);
    }
}