package iSoccer;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    static Scanner input = new Scanner(System.in);
    static Exception exc = new iSoccerE();
    static boolean login = false;
    static Clube saopaulo = new Clube();

    public static void Menu()
    {


        System.out.println("----------------Bem vindo ao Sistema---------------");
        System.out.println("Opções do menu");
        System.out.println("1 - Adicionar Funcionários");
        System.out.println("2 - Adicionar Sócio-Torcedor");
        System.out.println("3 - Gerenciar Recursos");
        System.out.println("4 - Gerar Relatórios");
        System.out.println("5 - Deslogar");

        int casee;

        casee = exc.loadintmargin(1 , 5);

        switch (casee)
        {
            case 1: adicionarFuncionarios(saopaulo.getFuncionarios());
            break;
            case 2: adicionarSocio(saopaulo);
            break;
            case 3: gerenciarRecursos(saopaulo);
            break;
            case 4: gerarRelatorios(saopaulo);
            break;
            case 5: login = false;
                System.out.println("\n");
                System.out.println("--------Você foi deslogado com sucesso :) ---------\n");
            break;
        }
    }

    public static void chamarSocios(ArrayList<Torcedor> torcedores)
    {
        System.out.println("Quatidade de sócios torcedores: " + torcedores.size());
        System.out.println("1 - Adimplentes");
        System.out.println("2 - Inadimplentes");
        System.out.println("3 - Lista individuais com todos os dados");

        int casee;

        casee = exc.loadintmargin(1, 3);

        switch (casee)
        {
            case 1:
                System.out.println("---------Torcedores Adimplentes----------");
                for(int i = 0; i < torcedores.size(); i++)
                {
                    if(torcedores.get(i).isAd())
                    {
                        System.out.println(torcedores.get(i).toString());
                    }
                }
                break;
            case 2:
                System.out.println("---------Torcedores Inadimplentes----------");
                for(int i = 0; i < torcedores.size(); i++)
                {
                    if(!torcedores.get(i).isAd())
                    {
                        System.out.println(torcedores.get(i).toString());
                    }
                }
                break;
            case 3:
                System.out.println("---------Todos os Sócios Torcedores----------");
                for(int i = 0; i < torcedores.size(); i++)
                {
                        System.out.println(torcedores.get(i).toString());
                }
                break;
        }
    }

    public static void chamarTJ(ArrayList<Funcionario> funcionarios)
    {
        int i, j;

        System.out.println("Escolha um relatório geral do time(0), ou um relatório de aptos(1) ou não aptos(2)");

        j = exc.loadintmargin(0, 2);

        if(j == 0)
        {
            for (i = 0; i < funcionarios.size(); i++)
            {
                if(funcionarios.get(i) instanceof Tecnico)
                {
                    System.out.println(funcionarios.get(i).toString());
                }
            }
            for (i = 0; i < funcionarios.size(); i++)
            {
                if(funcionarios.get(i) instanceof Jogadores)
                {
                    System.out.println(funcionarios.get(i).toString());
                }
            }
        }
        else if(j == 1)
        {
            for (i = 0; i < funcionarios.size(); i++)
            {
                if(funcionarios.get(i) instanceof Jogadores)
                {
                    Jogadores jogador = (Jogadores)funcionarios.get(i);
                    if(jogador.isAptidao())
                    System.out.println(funcionarios.get(i).toString());
                }
            }
        }
        else if(j == 2)
        {
            for (i = 0; i < funcionarios.size(); i++)
            {
                if(funcionarios.get(i) instanceof Jogadores)
                {
                    Jogadores jogador = (Jogadores)funcionarios.get(i);
                    if(!jogador.isAptidao())
                        System.out.println(funcionarios.get(i).toString());
                }
            }
        }
    }

    public static void servicosGerais(ArrayList<Funcionario> funcionarios)
    {
        int i;

        for (i = 0; i < funcionarios.size(); i++)
        {
            if(!(funcionarios.get(i) instanceof Tecnico || funcionarios.get(i) instanceof Jogadores))
            {
                System.out.println(funcionarios.get(i).toString());
            }
        }
    }

    public static void gerarRelatorios(Clube saopaulo)
    {
        System.out.println("Digite qual relatório deseja ser gerado");
        System.out.println("1 - Funcionários");
        System.out.println("2 - Recursos Físicos");
        System.out.println("3 - Sócio Torcedor");

        int casee;

        casee = exc.loadintmargin(1, 3);

        switch (casee)
        {
            case 1:
                System.out.println("Escolha a opção de funcionário que deseja o relatório");
                System.out.println("1 - Time");
                System.out.println("2 - Serviços gerais");

                int cassee = exc.loadintmargin(1, 2);

                switch (cassee)
                {
                    case 1: chamarTJ(saopaulo.getFuncionarios());
                    break;
                    case 2: servicosGerais(saopaulo.getFuncionarios());
                    break;
                }
                break;
            case 2:
                System.out.println("Escolha a opção de recursos físicos desejada");
                System.out.println("1 - Transporte");
                System.out.println("2 - Centro de treinamento");
                System.out.println("3 - Estádio");

                int casse = exc.loadintmargin(1, 3);

                switch (casse)
                {
                    case 1:
                        System.out.println("Dados Transporte");
                        System.out.println("Capacidade: " + saopaulo.getOnibus().getCapacidade());
                        break;
                    case 2:
                        System.out.println("Dados CT");
                        System.out.println("Dormitórios: " + saopaulo.getCt().getDormitorios());
                        break;
                    case 3:
                        System.out.println("Dados Estádio");
                        System.out.println(
                        "Estádio: " + saopaulo.getEstadio().getNomeEst() +
                        "\nCapacidade: " + saopaulo.getEstadio().getCapEst() +
                        "\nLanchonetes :" + saopaulo.getEstadio().getLanchonetes() +
                        "\nBanheiros: " + saopaulo.getEstadio().getBanheiros());
                        break;
                }
                break;
            case 3: chamarSocios(saopaulo.getTorcedores());
        }
    }

    public static void gerenciarRecursos(Clube saopaulo)
    {
        int opcao;

        System.out.println("Digite o recurso que você deseja gerenciar: ");
        System.out.println("1 - Ônibus");
        System.out.println("2 - Centro de Treinamento");
        System.out.println("3 - Estádio do Clube");

        opcao = exc.loadintmargin(1, 3);

        switch (opcao)
        {
            case 1:
                System.out.println("Adicionar ou verificar o ônibus");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Verificar");

            opcao = exc.loadintmargin(1, 2);
            switch (opcao)
            {
                case 1: if(saopaulo.getOnibus() == null)
                {
                    System.out.println(" -------- NOVO ÔNIBUS ADICIONADO --------\n");
                    saopaulo.setOnibus(new Onibus(45));
                }
                else
                {
                    System.out.println("Ônibus ja existente");
                }
                    break;
                case 2: if(saopaulo.getOnibus() == null)
                {
                    System.out.println("Não existe ônibus do clube ou está indisponível");
                }
                else
                {
                    System.out.println("Ônibus disponível");
                }
                    break;
            }
            break;
            case 2:
                System.out.println("Adicionar ou verificar o CT");
                System.out.println("1 - Adicionar");
                System.out.println("2 - Verificar");

                opcao = exc.loadintmargin(1, 2);
                switch (opcao)
                {
                    case 1: if(saopaulo.getCt() == null)
                    {
                        System.out.println("Digite a quantidade de dormitórios desejada: ");
                        int dormitorios = exc.loadint();
                        saopaulo.setCt(new CT(dormitorios));
                        System.out.println(" -------- NOVO CT ADICIONADO --------\n");
                    }
                    else
                    {
                        System.out.println("CT ja existente");
                    }
                        break;
                    case 2: if(saopaulo.getOnibus() == null)
                    {
                        System.out.println("Não existe CT do clube");
                    }
                    else
                    {
                        System.out.println("CT do clube existente!");
                        System.out.println("CT do clube possui: " + saopaulo.getCt().getDormitorios() + " dormitórios");
                    }
                        break;
                }
                break;
            case 3:
                System.out.println("Adicionar ou verificar o Estádio");
                System.out.println("1 - Adicionar");
                System.out.println("2 - Verificar");
                System.out.println("3 - Administrar");

                opcao = exc.loadintmargin(1, 3);
                switch (opcao)
                {
                    case 1: if(saopaulo.getEstadio() == null)
                    {
                        System.out.println("Digite o nome do estádio: ");
                        String nome = input.nextLine();
                        System.out.println("Digite a capacidade desejada: ");
                        int capacidade = exc.loadint();
                        System.out.println("Digite a quantidade de lanchonetes desejada: ");
                        int lanchonetes = exc.loadint();
                        System.out.println("Digite a quantidade de banheiros desejados: ");
                        int banheiros = exc.loadint();

                        saopaulo.setEstadio(new Estadio(nome, capacidade, lanchonetes, banheiros));
                        System.out.println(" -------- NOVO ESTÁDIO ADICIONADO --------\n");
                    }
                    else
                    {
                        System.out.println("Estádio ja existente");
                    }
                        break;
                    case 2: if(saopaulo.getEstadio() == null)
                    {
                        System.out.println("Não existe estádio do clube");
                    }
                    else
                    {
                        System.out.println("Estádio do clube existente!");
                        System.out.println("Eatádio do clube: " + saopaulo.getEstadio().getNomeEst() + " possui: "
                                + saopaulo.getEstadio().getCapEst() + " de capacidade, possui: "
                                + saopaulo.getEstadio().getBanheiros() + " banheiros e possui: "
                                + saopaulo.getEstadio().getLanchonetes() + " lanchonetes");
                    }
                        break;
                    case 3:
                        System.out.println("Alterar estádio");
                        System.out.println("Deseja alterar capacidade? (0 - não, 1 - sim)");
                        int x = exc.loadintmargin(0, 1);
                        if (x == 1)
                        {
                            System.out.println("Digite a nova capacidade: ");
                            saopaulo.getEstadio().setCapEst(exc.loadint());
                        }

                        System.out.println("Deseja alterar a quantidade de lanchonetes? (0 - não, 1 - sim)");
                        int y = exc.loadintmargin(0, 1);
                        if (y == 1)
                        {
                            System.out.println("Digite a nova quantidade de lanchonetes: ");
                            saopaulo.getEstadio().setCapEst(exc.loadint());
                        }

                        System.out.println("Deseja alterar a quantidade de banheiros? (0 - não, 1 - sim)");
                        int z = exc.loadintmargin(0, 1);
                        if (z == 1)
                        {
                            System.out.println("Digite a nova quantidade de banheiros: ");
                            saopaulo.getEstadio().setCapEst(exc.loadint());
                        }


                }
                break;
        }
    }

    public static void adicionarSocio(Clube saopaulo)
    {
        String nome, email, cpf, telefone, endereco;
        int taxaop;

        System.out.print("Digite o nome: ");
        nome = input.nextLine();
        System.out.println("Digite o endereço: ");
        endereco = input.nextLine();
        System.out.print("Digite o email: ");
        email = input.nextLine();
        System.out.print("Digite o cpf: ");
        cpf = input.nextLine();
        System.out.print("Digite o telefone: ");
        telefone = input.nextLine();

        System.out.println("Digite o tipo de filiação desejada: ");
        System.out.println("1 - Júnior " + saopaulo.getTaxaJunior() + "R$");
        System.out.println("2 - Sênior " + saopaulo.getTaxaSenior() + "R$");
        System.out.println("3 - Elite " + saopaulo.getTaxaElite() + "R$");

        taxaop = exc.loadintmargin(1,3);

        switch (taxaop)
        {
            case 1: saopaulo.getTorcedores().add(new Junior(nome, email, telefone, endereco, cpf, saopaulo.getTaxaJunior(), true));
            break;
            case 2: saopaulo.getTorcedores().add(new Senior(nome, email, telefone, endereco, cpf, saopaulo.getTaxaSenior(), true));
            break;
            case 3: saopaulo.getTorcedores().add(new Elite(nome, email, telefone, endereco, cpf, saopaulo.getTaxaElite(), true));
        }
    }

    public static void adicionarFuncionarios(ArrayList<Funcionario> funcionarios)
    {
        System.out.println("Digite o tipo de funcionário que vai ser adicionado");
        System.out.println("[1] - Presidente");
        System.out.println("[2] - Médico");
        System.out.println("[3] - Técnico");
        System.out.println("[4] - Preparadores físicos");
        System.out.println("[5] - Motoristas");
        System.out.println("[6] - Cozinheiros");
        System.out.println("[7] - Advogados");
        System.out.println("[8] - Jogadores");

        int verificar;

        verificar = exc.loadintmargin(1, 8);

        switch (verificar)
        {
            case 1: criarPresidente(funcionarios);
            break;
            case 2: criarMedico(funcionarios);
            break;
            case 3: criarTecnico(funcionarios);
            break;
            case 4: criarPreparador(funcionarios);
            break;
            case 5: criarMotorista(funcionarios);
            break;
            case 6: criarCozinheiro(funcionarios);
            break;
            case 7: criarAdvogado(funcionarios);
            break;
            case 8: criarJogador(funcionarios);
            break;
        }
    }

    public static void criarPresidente(ArrayList<Funcionario> funcionarios)
    {
        String nome, email, cpf, telefone;
        double salario;
        System.out.print("Digite o nome: ");
        nome = input.nextLine();
        System.out.print("Digite o email: ");
        email = input.nextLine();
        System.out.print("Digite o cpf: ");
        cpf = input.nextLine();
        System.out.print("Digite o Salário:\n");
        salario = exc.loaddouble();
        System.out.print("Digite o telefone: ");
        telefone = input.nextLine();

        Presidente presidente = new Presidente(nome, email, telefone, cpf, salario);
        funcionarios.add(presidente);
    }

    public static void criarMedico(ArrayList<Funcionario> funcionarios)
    {
        String nome, email, cpf, telefone, CRM;
        double salario;
        System.out.print("Digite o nome: ");
        nome = input.nextLine();
        System.out.print("Digite o email: ");
        email = input.nextLine();
        System.out.print("Digite o cpf: ");
        cpf = input.nextLine();
        System.out.print("Digite o Salário:\n");
        salario = exc.loaddouble();
        System.out.print("Digite o telefone: ");
        telefone = input.nextLine();
        System.out.println("Digite o CRM");
        CRM = input.nextLine();

        Medico medico = new Medico(nome, email, telefone, cpf, salario, CRM);
        funcionarios.add(medico);
    }

    public static void criarTecnico(ArrayList<Funcionario> funcionarios)
    {
        String nome, email, cpf, telefone;
        double salario;
        System.out.print("Digite o nome: ");
        nome = input.nextLine();
        System.out.print("Digite o email: ");
        email = input.nextLine();
        System.out.print("Digite o cpf: ");
        cpf = input.nextLine();
        System.out.print("Digite o Salário:\n");
        salario = exc.loaddouble();
        System.out.print("Digite o telefone: ");
        telefone = input.nextLine();

        Tecnico tecnico = new Tecnico(nome, email, telefone, cpf, salario);
        funcionarios.add(tecnico);
    }

    public static void criarPreparador(ArrayList<Funcionario> funcionarios)
    {
        String nome, email, cpf, telefone;
        double salario;
        System.out.print("Digite o nome: ");
        nome = input.nextLine();
        System.out.print("Digite o email: ");
        email = input.nextLine();
        System.out.print("Digite o cpf: ");
        cpf = input.nextLine();
        System.out.print("Digite o Salário:\n");
        salario = exc.loaddouble();
        System.out.print("Digite o telefone: ");
        telefone = input.nextLine();

        Preparadores preparador = new Preparadores(nome, email, telefone, cpf, salario);
        funcionarios.add(preparador);
    }

    public static void criarMotorista(ArrayList<Funcionario> funcionarios)
    {
        String nome, email, cpf, telefone, habilitacao;
        double salario;
        System.out.print("Digite o nome: ");
        nome = input.nextLine();
        System.out.print("Digite o email: ");
        email = input.nextLine();
        System.out.print("Digite o cpf: ");
        cpf = input.nextLine();
        System.out.print("Digite o Salário:\n");
        salario = exc.loaddouble();
        System.out.print("Digite o telefone: ");
        telefone = input.nextLine();
        System.out.println("Digite o número da habilitacao");
        habilitacao = input.nextLine();

        Motoristas motorista = new Motoristas(nome, email, telefone, cpf, salario, habilitacao);
        funcionarios.add(motorista);
    }

    public static void criarCozinheiro(ArrayList<Funcionario> funcionarios)
    {
        String nome, email, cpf, telefone;
        double salario;
        System.out.print("Digite o nome: ");
        nome = input.nextLine();
        System.out.print("Digite o email: ");
        email = input.nextLine();
        System.out.print("Digite o cpf: ");
        cpf = input.nextLine();
        System.out.print("Digite o Salário:\n");
        salario = exc.loaddouble();
        System.out.print("Digite o telefone: ");
        telefone = input.nextLine();

        Cozinheiros cozinheiro = new Cozinheiros(nome, email, telefone, cpf, salario);
        funcionarios.add(cozinheiro);
    }

    public static void criarAdvogado(ArrayList<Funcionario> funcionarios)
    {
        String nome, email, cpf, telefone;
        double salario;
        System.out.print("Digite o nome: ");
        nome = input.nextLine();
        System.out.print("Digite o email: ");
        email = input.nextLine();
        System.out.print("Digite o cpf: ");
        cpf = input.nextLine();
        System.out.print("Digite o Salário:\n");
        salario = exc.loaddouble();
        System.out.print("Digite o telefone: ");
        telefone = input.nextLine();

        Advogados advogado = new Advogados(nome, email, telefone, cpf, salario);
        funcionarios.add(advogado);
    }

    public static void criarJogador(ArrayList<Funcionario> funcionarios)
    {
        String nome, email, cpf, telefone, tipo;
        boolean aptidao = false;
        double salario;
        int a;

        System.out.print("Digite o nome: ");
        nome = input.nextLine();
        System.out.print("Digite o email: ");
        email = input.nextLine();
        System.out.print("Digite o cpf: ");
        cpf = input.nextLine();
        System.out.print("Digite o Salário:\n");
        salario = exc.loaddouble();
        System.out.print("Digite o telefone: ");
        telefone = input.nextLine();
        System.out.println("Digite a posição do jogador: ");
        tipo = input.nextLine();
        System.out.println("Digite se o jogador está apto a jogar(0 - não, 1 - sim): ");
        a = exc.loadintmargin(0, 1);
        if(a == 1) aptidao = true;

        Jogadores jogador = new Jogadores(nome, email, telefone, cpf, salario, tipo, aptidao);
        funcionarios.add(jogador);
    }

    public static boolean Login()
    {
        String LOGIN = "YURIFSS";
        String SENHA = "123456";
        String a;
        String b;

        System.out.println("Digite o seu Login: ");
        a = input.nextLine();
        if (a.equals(LOGIN))
        {
            System.out.println("Digite a senha: ");
            b = input.nextLine();
            if (b.equals(SENHA))
            {
                return true;
            }
            else
            {
                System.out.println("Senha incorreta");
                return false;
            }
        }
        else
        {
            System.out.println("Login errado ou não existente\n");
            return false;
        }
    }


        public static void main(String[] args)
        {
            boolean sair = false;
            int option;

            while(!sair)
            {
                System.out.println("Deseja Logar ou Sair do sistema?");
                System.out.println("1 - Logar no Sistema");
                System.out.println("2 - Sair do Sistema");

                int c;

                c = exc.loadintmargin(1 , 2);

                switch (c)
                {
                    case 1: login = Login();
                        break;

                    case 2: sair = true;
                        break;
                }
                while(login)
                {
                    Menu();
                }
            }
        }
}
