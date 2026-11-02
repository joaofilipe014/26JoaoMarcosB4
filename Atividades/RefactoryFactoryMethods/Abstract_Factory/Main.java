package Abstract_Factory;

public class Main {
    public static void main(String[] args) {
        Fabrica fabricaAndroid = new FabricaAndroid();
        Aplicacao appAndroid = new Aplicacao(fabricaAndroid);
        appAndroid.renderizar();

        Fabrica fabricaIOS = new FabricaIOS();
        Aplicacao appIOS = new Aplicacao(fabricaIOS);
        appIOS.renderizar();

    }
}
