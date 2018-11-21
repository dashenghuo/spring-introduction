package introduction.ioc.xml;


public class JavaMain {

    public static void main(String[] args) {

        AController aController = new AController();
        aController.setName("尚德机构helloWorld");
        BService bService = new BServiceImpl();
        aController.setbService(bService);

        aController.getName();
        aController.invokeBService();


    }



}

