import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class linguagem2 {

    boolean VerificaPalavra(String palavra) {
        int comprimento = palavra.length();

        for (int i = 0; i < comprimento / 2; i++) {
            char charEsquerda = palavra.charAt(i);
            char charDireita = palavra.charAt(comprimento - i - 1);

            if (charEsquerda != 'a' && charEsquerda != 'b') {
                i++;
                continue;
            }
            if (charDireita != 'a' && charDireita != 'b') {
                continue;
            }

            if (charEsquerda != charDireita) {
                return false;
            }
        }

        return true;
    }

        @Nested
        class LinguagemTest{

            @Test
            void teste1(){
                linguagem2 objeto = new linguagem2();
                boolean retorno = objeto.VerificaPalavra("abba");
                assertEquals(true, retorno);
            }
            @Test
            void teste2(){
                linguagem2 objeto = new linguagem2();
                boolean retorno = objeto.VerificaPalavra("abab");
                assertEquals(false, retorno);
            }
            @Test
            void teste3(){
                linguagem2 objeto = new linguagem2();
                boolean retorno = objeto.VerificaPalavra("bba");
                assertEquals(false, retorno);
            }
            @Test
            void teste4(){
                linguagem2 objeto = new linguagem2();
                boolean retorno = objeto.VerificaPalavra("ababa");
                assertEquals(true, retorno);
            }
            @Test
            void teste5(){
                linguagem2 objeto = new linguagem2();
                boolean retorno = objeto.VerificaPalavra("");
                assertEquals(true, retorno);
            }

        }
    }

