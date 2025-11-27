// Classe de teste 
public class Cafeteria {
    public static void main(String[] args) {

        //Bebida simples
        Bebida cafe = new Cafe();
        System.out.println(cafe.getDescricao() + " - R$ " + cafe.getPreco());

        //Café com leite
        Bebida cafeComLeite = new LeiteDecorator(new Cafe());
        System.out.println(cafeComLeite.getDescricao() + " - R$ " + cafeComLeite.getPreco());

        //Chá com açúcar
        Bebida chaAdoçado = new AdoceDecorator(new Cha());
        System.out.println(chaAdoçado.getDescricao() + " - R$ " + chaAdoçado.getPreco());

        //Café completo (leite + açúcar + sabor caramelo)
        Bebida cafeGourmet = new SaborDecorator(new AdoceDecorator(new LeiteDecorator(new Cafe())), "Caramelo");
        System.out.println(cafeGourmet.getDescricao() + " - R$ " + cafeGourmet.getPreco());

        //Chocolate quente com leite e sabor baunilha
        Bebida chocoPersonalizado = new SaborDecorator(new LeiteDecorator(new ChocolateQuente()), "Baunilha");
        System.out.println(chocoPersonalizado.getDescricao() + " - R$ " + chocoPersonalizado.getPreco());
    }
}

