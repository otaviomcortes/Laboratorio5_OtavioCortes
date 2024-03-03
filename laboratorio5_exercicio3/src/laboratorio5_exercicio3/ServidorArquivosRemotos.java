package laboratorio5_exercicio3;

class ServidorArquivosRemotos implements ArquivoRemoto {
    @Override
    public void baixarArquivo(String nomeArquivo) {

        System.out.println("Baixando arquivo " + nomeArquivo + " do servidor remoto...");
    }
}