package hook.method;

public class MinhaClasseConcreta extends MinhaClasseAbstrata {

    @Override
    public Integer acaoPersonalizada(String param) {
        return param.length() + 55;
    }
}
