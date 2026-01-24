package klu.skill4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import klu.skill4.StudentAnnotation;

public class AppAnnotation {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        StudentAnnotation student =
                context.getBean(StudentAnnotation.class);

        student.display();
    }
}
