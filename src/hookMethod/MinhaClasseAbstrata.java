package hookMethod;

public abstract class MinhaClasseAbstrata {

    public abstract Integer acaoPersonalizada(String param);

    public Integer acaoPrincipal(String param) {
        return param.length() + acaoPersonalizada(param);
    }

}
