package hook.method;

public class MinhaClassePrincipal {

    public static void main(String[] args) {

        MinhaClasseAbstrata mca = new MinhaOutraClasseConcreta();

        System.out.println(mca.acaoPrincipal("casa"));

    }

}
