package bridge.example2;

public class MainClass {

    public static void main(String[] args) {
        // criando janelas de diálogo de aconrodo com o SO utilizando a implementação de janela abstrata que está na classe JanelaDialogo
        JanelaAbstrata janela1 = new JanelaDialogo(new JanelaLinux());
        JanelaAbstrata janela2 = new JanelaDialogo(new JanelaWindows());

        // invoco o método abstrato da classe JanelaAbstrata que em cada implementação vai desenhar a janela e o botão
        // de acordo com a variação de SO. Se for o linux os metodos da classe janelaLinux serão invocados.
        janela1.desenhar();
        janela2.desenhar();

        System.out.println();
        System.out.println("#################################################################################");
        System.out.println();

        // criando janelas de aviso utilizando a implementação que estão na classe JanelaAviso que utiliza a implementação
        // em  JanelaWindows ou JanelaLinux apra especificar
        janela1 = new JanelaAviso(new JanelaLinux());
        janela2 = new JanelaAviso(new JanelaWindows());


        janela1.desenhar();
        janela2.desenhar();




    }

}
