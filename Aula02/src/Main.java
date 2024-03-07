public class Main {
    public static void main(String[] args) {

        // Criar um objeto que represente um cachorro
        Cachorro dogBelga = new Cachorro();

        // Atribuir valores aos atributos do objeto
        dogBelga.nome = "Spike";

        dogBelga.peso = 20;

        dogBelga.idade = 7;

        dogBelga.castrado = true;

        // Exibir os dados do objeto cachoro

        System.out.println(dogBelga.nome + " tem " + dogBelga.idade + " anos, pesa " +
                dogBelga.peso + " KG, e é castrado ? " +  dogBelga.castrado);

        // Criar um outro objeto cachorro
        Cachorro cao = new Cachorro();


        // extrair valores
        cao.nome = "lili";

        cao.idade = 6;

        cao.peso = 14;

        cao.castrado = false;


        // exibir o nome objeto

        System.out.println(cao.nome + " tem " + cao.idade + " anos, pesa " +
                cao.peso + " KG, e é castrado ? " +  cao.castrado);

        //chamar métodos

        cao.andar();
        dogBelga.andar();
        cao.latir();
        dogBelga.latir();
    }
}