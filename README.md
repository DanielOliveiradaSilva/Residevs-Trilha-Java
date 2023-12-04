<img src="https://www.notion.so/image/https%3A%2F%2Fmoodle.residenciatic18.cepedi.org.br%2Fpluginfile.php%2F1%2Ftheme_moove%2Flogo%2F1691287992%2Flogo-marca.png?table=block&id=1da19094-db8e-415c-a24c-bc162eb96cc8&spaceId=0eb61098-d19e-4635-a58d-be59325af277&width=250&userId=f99a44f9-973b-4a01-8259-453bbad23877&cache=v2"  alt ="logo" width="100" height="100">


### Atividade Pratica Java-P003
DESENVOLVER CONCEITOS INICIAIS DE PROGRAMAÇÃO EM JAVA 
##### Questão 1
1. O que é uma exceção em Java e qual é o propósito de usá-las em programas?

<div style="text-align: justify">
<b><i>Resp.:</i></b>
Em Java, uma exceção é um evento ou condição não prevista  que surge durante a execução de um programa e que interrompe o fluxo normal de operações(quebra o codigo). As exceções são objetos que representam erros que ocorrem durante a execução de um programa, como tentativa de acesso a um arquivo inexistente, divisão por zero, entradas diferentes do esperado(não tratadas) entre outros.

As exessões em programas Java é lidar com situações excepcionais de forma controlada e adequada, permitindo que o programa trate essas condições anormais sem interromper abruptamente sua execução(Não interrompe o funcionamento do programa :)). Elas ajudam a separar o código de tratamento de erros do código principal, melhorando a legibilidade, a manutenibilidade e a confiabilidade do programa.
</div>

##### Questão 2
2. Pesquise sobre a diferença entre exceções verificadas e não verificadas em Java. Dê exemplos de cada uma. 
   
<div style="text-align: justify">
<b><i>Resp.:</i></b>
    Diferença entre exceções verificadas e não verificadas em Java:
    <img  src="https://gadget-info.com/img/difference-between/767/difference-between-checked.jpg" alt="figura"   width="360" height="300">
</div>

##### Questão 3
3. Como você pode lidar com exceções em Java? Quais são as palavras-chave e
as práticas comuns para tratamento de exceções? 

<div style="text-align: justify">
<b><i>Resp.:</i></b>
   Em Java, exceções são condições imprevistas que ocorrem durante a execução do programa e podem interromper o fluxo normal do código. As principais palavras-chave relacionadas ao tratamento de exceções são:
   
</div>

 ```java
    //Codigo Java
    try {
        // Bloco de código onde exceções podem ocorrer
        // Código que pode gerar uma exceção
    } catch (ExcecaoEspecifica e) {
        // Tratamento para uma exceção específica
        // Código para lidar com a exceção ExcecaoEspecifica
    } catch (OutraExcecao e) {
        // Tratamento para outra exceção específica
        // Código para lidar com a exceção OutraExcecao
    } catch (Exception e) {
        // Tratamento genérico para outras exceções
        // Código para lidar com qualquer outra exceção
    } finally {
        // Bloco de código que sempre é executado, independente de exceções
        // Código que libera recursos ou r ealiza ações finais
    }

 ```
 <div style="text-align: justify">
 Algumas práticas comuns no tratamento de exceções em Java incluem:

 Capturar exceções específicas: Capturar exceções específicas antes das exceções mais genéricas. Isso ajuda a lidar com as situações de erro de forma mais precisa.
 
 Manter o tratamento de exceções relevante: Tratar as exceções apenas onde é apropriado para tomar alguma ação para lidar com o problema.

 Exibir informações úteis: Ao lidar com exceções, fornecer informações claras e úteis em mensagens de erro ou logs para facilitar a depuração e o diagnóstico de problemas.
 
 Lançar exceções personalizadas: Quando a lógica do seu programa encontrar um erro específico que não pode ser tratado adequadamente no local, é possível lançar uma exceção personalizada que carregue informações relevantes sobre o erro.
 </div>

##### Questão 4
4. O que é o bloco "try-catch" em Java? Como ele funciona e por que é importante usá-lo ao lidar com exceções? 
   
<b><i>Resp.:</i></b>
O bloco try-catch em Java é uma estrutura usada para lidar com exceções durante a execução de um programa. Ele permite que o código detecte e trate exceções de maneira controlada, evitando interrupções não esperadas no fluxo normal do programa.

A estrutura básica do try-catch é composta por:

try: É o bloco onde o código propenso a gerar exceções é colocado. É nesse bloco que você envolve o código no qual você prevê que uma exceção possa ocorrer.

catch: É o bloco que captura e trata exceções específicas que podem ser lançadas dentro do bloco try. Cada bloco catch está associado a um tipo de exceção específico ou pode capturar exceções mais genéricas (como Exception).

Quando um código dentro do bloco try lança uma exceção, o Java procura por um bloco catch associado àquela exceção específica. Se uma correspondência for encontrada, o bloco catch é executado para lidar com a exceção, e então o controle do programa continua após o bloco try-catch.

É importante usar o bloco try-catch ao lidar com exceções por várias razões:

Prevenção de interrupções inesperadas: Evita que exceções não tratadas interrompam abruptamente a execução do programa.

Tratamento controlado de exceções: Permite o tratamento e a resposta apropriada a diferentes tipos de exceções, como exibição de mensagens de erro, registro de informações relevantes ou execução de ações alternativas.

Manutenção do fluxo do programa: Ajuda a manter o fluxo normal do programa, mesmo se ocorrerem erros, permitindo a continuidade da execução do código.

Lançamento e propagação de exceções:  Lançar e propagar exceções personalizadas, permitindo uma comunicação clara sobre erros específicos entre diferentes partes do código.

##### Questão 5
5. Quando é apropriado criar suas próprias exceções personalizadas em Java e como você pode fazer isso? Dê um exemplo de quando e por que você criaria uma exceção personalizada. 

Criar exceções personalizadas em Java é apropriado quando as exceções padrão não conseguem representar adequadamente as situações específicas do programa. Isso é útil para comunicar erros ou condições particulares de forma mais precisa e clara entre diferentes partes do código

Exceções personalizadas podem ser úteis para situações como validações específicas de entrada de dados, problemas de negócios não atendidos ou outras condições excepcionais relacionadas ao domínio da aplicação que precisam de tratamento diferenciado das exceções padrão. Elas contribuem para um código mais legível, manutenível e comunicam problemas específicos de forma mais clara.

Exemplo:

```java
//Codigo java
// Definição da exceção personalizada
class ProdutoIndisponivelException extends Exception {
    public ProdutoIndisponivelException() {
        super("O produto não está disponível no momento.");
    }

    public ProdutoIndisponivelException(String mensagem) {
        super(mensagem);
    }
}

class LojaOnline {
    private boolean produtoDisponivel = false;

    public void efetuarCompra() throws ProdutoIndisponivelException {
        if (!produtoDisponivel) {
            throw new ProdutoIndisponivelException("O produto que você deseja comprar está esgotado.");
        }

        // Lógica para efetuar a compra do produto
        // ...
    }
}

public class Exemplo {
    public static void main(String[] args) {
        LojaOnline loja = new LojaOnline();

        try {
            loja.efetuarCompra();
        } catch (ProdutoIndisponivelException e) {
            System.out.println("Erro ao efetuar a compra: " + e.getMessage());
        }
    }
}

```







