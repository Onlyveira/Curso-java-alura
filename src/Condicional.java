public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2016;
        boolean incluidoNoPlano = false;
        Double notaDoFilme = 8.1;
        String tipoPlano = "plsus";

        if(anoDeLancamento >= 2019){
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme retro legal");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")){ // a utilização do .equals vem de que a string não é um tipo primitov
            System.out.println("teste");
        }else{
            System.out.println("errado");
        };
    }
}
