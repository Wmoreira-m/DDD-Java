public class MesesInvalidos extends Exception{


    public MesesInvalidos(String mensagem) {
        super(mensagem);
    }

    public MesesInvalidos (){
        super("o mês deve estar entre 1 e 12");
    }
}
