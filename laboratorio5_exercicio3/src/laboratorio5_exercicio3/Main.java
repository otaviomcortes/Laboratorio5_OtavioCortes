package laboratorio5_exercicio3;

//O problema é o acesso a arquivos remotos em um servidor, que pode ser lento devido à latência da rede ou sobrecarga do servidor.
//Além disso, pode haver a necessidade de implementar controle de acesso ou autenticação antes de permitir o acesso aos arquivos.
//
//Usamos o padrão de projeto Proxy para solucionar esse problema, criando um intermediário entre o cliente e o servidor real de arquivos remotos.
//O Proxy controla e gerencia o acesso aos arquivos, verificando se eles estão em cache antes de baixá-los do servidor remoto.
//Isso reduz o número de downloads de arquivos do servidor remoto e melhora o desempenho da aplicação. 
//Além disso, o Proxy pode implementar verificações de segurança, autenticação de usuários ou autorização antes de permitir o acesso aos arquivos remotos.

public class Main {
    public static void main(String[] args) {
        
        ArquivoRemoto proxyArquivoRemoto = new ProxyArquivoRemoto();
        
        proxyArquivoRemoto.baixarArquivo("documento1.txt");
        proxyArquivoRemoto.baixarArquivo("documento2.txt");
        proxyArquivoRemoto.baixarArquivo("documento1.txt");
        proxyArquivoRemoto.baixarArquivo("documento3.txt");
        proxyArquivoRemoto.baixarArquivo("documento2.txt");
    }
}