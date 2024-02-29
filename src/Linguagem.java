import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Linguagem {

    boolean VerificaPalavra(String palavra) {
        int contA = 0;
        int contB = 0;
        int contC = 0;
        boolean encontrouB = false;
        boolean encontrouC = false;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);

            switch (letra) {
                case 'a':
                    contA++;
                    break;
                case 'b':
                    contB++;
                    encontrouB = true;
                    break;
                case 'c':
                    contC++;
                    encontrouC = true;
                    break;
                default:
                    return false;
            }

            if ((encontrouB && letra == 'a') || (encontrouC && letra != 'c')) {
                return false;
            }
        }

        return contA >= 1 && contA == contB && contA == contC;
    }

    @Nested
    class LinguagemTest {

        @Test
        void teste1() {
            Linguagem objeto = new Linguagem();
            boolean retorno = objeto.VerificaPalavra("aabbcc");
            assertEquals(true, retorno);
        }

        @Test
        void teste2() {
            Linguagem objeto = new Linguagem();
            boolean retorno = objeto.VerificaPalavra("aaabbbccc");
            assertEquals(true, retorno);
        }

        @Test
        void teste3() {
            Linguagem objeto = new Linguagem();
            boolean retorno = objeto.VerificaPalavra("abcabc");
            assertEquals(false, retorno);
        }

        @Test
        void teste4() {
            Linguagem objeto = new Linguagem();
            boolean retorno = objeto.VerificaPalavra("aaccbb");
            assertEquals(false, retorno);
        }

        @Test
        void teste5() {
            Linguagem objeto = new Linguagem();
            boolean retorno = objeto.VerificaPalavra("abc");
            assertEquals(true, retorno);
        }

        @Test
        void teste6() {
            Linguagem objeto = new Linguagem();
            boolean retorno = objeto.VerificaPalavra("abcabcabc");
            assertEquals(false, retorno);
        }

        @Test
        void teste7() {
            Linguagem objeto = new Linguagem();
            boolean retorno = objeto.VerificaPalavra("ababab");
            assertEquals(false, retorno);
        }

    }
}