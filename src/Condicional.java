public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2016;
        boolean incluidoNoPlano = true;
        Double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if(anoDeLancamento >= 2019){
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme retro legal");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")){
            System.out.println("teste");
        }else{
            System.out.println("errado");
        };
    }
}
