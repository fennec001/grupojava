public class Exe2 {
    public static void main(String[] args) {
       // atribuindo valores as pessoas das duas maneiras 
        Pessoa albert = new Pessoa("Albert",23,"257.081.500-41");
        Pessoa marcelino = new Pessoa();
        marcelino.setCpf("545.218.860-60");
        marcelino.setIdade(29);
        marcelino.setNome("marcelino");

        System.out.println(albert.toString());
        System.out.println(marcelino.toString());
    
    }
}
