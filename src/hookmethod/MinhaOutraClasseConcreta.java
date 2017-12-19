package hookmethod;

public class MinhaOutraClasseConcreta extends MinhaClasseAbstrata {
    @Override
    public Integer acaoPersonalizada(String param) {
        return param.length() + 23;
    }
}
