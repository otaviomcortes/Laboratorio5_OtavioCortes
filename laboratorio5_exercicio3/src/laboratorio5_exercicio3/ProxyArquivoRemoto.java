package laboratorio5_exercicio3;

import java.util.HashMap;
import java.util.Map;

class ProxyArquivoRemoto implements ArquivoRemoto {
    private final ServidorArquivosRemotos servidorArquivosRemotos;
    private final Map<String, String> cacheArquivos;

    public ProxyArquivoRemoto() {
        this.servidorArquivosRemotos = new ServidorArquivosRemotos();
        this.cacheArquivos = new HashMap<>();
    }

    @Override
    public void baixarArquivo(String nomeArquivo) {
     
        if (cacheArquivos.containsKey(nomeArquivo)) {
            System.out.println("Arquivo " + nomeArquivo + " encontrado no cache. Baixando do cache...");
 
            System.out.println("Arquivo " + nomeArquivo + ": " + cacheArquivos.get(nomeArquivo));
        } else {
         
            servidorArquivosRemotos.baixarArquivo(nomeArquivo);
           
            cacheArquivos.put(nomeArquivo, "Conteúdo do arquivo " + nomeArquivo);
        }
    }
}