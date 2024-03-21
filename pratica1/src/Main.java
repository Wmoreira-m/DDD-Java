import br.com.fiap.tdspo.model.Aviao;
import br.com.fiap.tdspo.model.Carro;
import br.com.fiap.tdspo.model.Cor;
import br.com.fiap.tdspo.model.Lancha;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Aviao aviao = new Aviao();
        Carro bmw = new Carro();
        Cor cor = new Cor();
        Lancha lancha = new Lancha();

        //Avião
        aviao.setModelo("737");
        aviao.setComprimento(35);
        aviao.setAnoFabricacao(1990);
        aviao.setQuantidadeLugares(80);
        aviao.setPrefixo("6ht486h54");
        aviao.setQuantidadeMotores(4);

        Cor prata = new Cor();
        prata.alterarCor(192,192,192,"prata");




        //Carro
        bmw.setAnoFabricacao(2012);
        bmw.setModelo("X1");
        bmw.setComprimento(4);
        bmw.setQuantidadePortas(4);
        bmw.setMotor(2);
        bmw.setQuantidadeLugares(4);
        bmw.setPlaca("GTA568");

        Cor verde = new Cor();

        verde.setNome("verde");
        verde.setR(0);
        verde.setG(255);
        verde.setB(0);

        //Lancha
        lancha.setModelo("barco");
        lancha.setAnoFabricacao(1);
        lancha.setComprimento(15);
        lancha.setQuantidadeMotores(4);
        lancha.setQuantidadeLugares(20);

        Cor marrom = new Cor();
        marrom.alterarCor(2,25, 20,"marrom");

        //Exibindo carro
        System.out.printf(bmw.getModelo() + bmw.getAnoFabricacao() + bmw.getPlaca());




        }
    }
