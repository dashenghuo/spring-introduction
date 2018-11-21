package introduction.ioc.annotationconf;

import introduction.ioc.xml.BService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class B1ServiceImpl implements BService {
    @Override
    public void hello() {
        System.out.println("BServiceImpl...111 hello");
    }


    @PostConstruct
    private void init(){
        System.out.println("execute init");
    }

    @PreDestroy
    private void destroy(){
        System.out.println("execute destroy");
    }
}
