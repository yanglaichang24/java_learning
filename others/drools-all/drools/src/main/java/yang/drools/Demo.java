package yang.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * @author Mr.Yang
 * @desc Demo
 * @date 2023/3/28 11:02
 */
public class Demo {

    public static void main(String[] args) {
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer();

        KieSession kieSession = kieClasspathContainer.newKieSession("k");

        Student student = new Student();
        student.setScore(50);

        kieSession.insert(student);

        kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println(student.getScore());
        System.out.println(student.getType());




    }

}
