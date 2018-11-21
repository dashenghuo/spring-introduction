package introduction.ioc.xml;

public class BServiceImpl implements BService {

    public BServiceImpl(){
        System.out.println("BServiceImpl is constructor...");
    }

    @Override
    public void hello() {
        System.out.println("BServiceImpl...111 hello");
    }
}
