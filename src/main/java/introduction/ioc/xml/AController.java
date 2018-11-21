package introduction.ioc.xml;

public class AController {

    private String name;

    private BService bService;


    public AController(){
        System.out.println("AController is constructor...");
    }

    public AController(String name){
        System.out.println("AController is constructor... set name = " + name);
        this.name = name;
    }

    public void invokeBService(){
        bService.hello();
    }

    public String getName() {
        System.out.println("AController get name = " + name);
        return name;
    }

    public void setName(String name) {
        System.out.println("AController  set name = " + name);
        this.name = name;
    }

    public BService getbService() {
        return bService;
    }

    public void setbService(BService bService) {
        this.bService = bService;
    }
}
