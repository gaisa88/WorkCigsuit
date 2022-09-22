package com.workcigsuit;

import com.workcigsuit.model.IdNumber;
import com.workcigsuit.service.IdnumberService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class WorkCigsuitApplication {

    public static void main(String[] args) {


//        ConfigurableApplicationContext context =
                SpringApplication.run(WorkCigsuitApplication.class, args);

//        IdnumberService repository = context.getBean(IdnumberService.class); // в методе getBean нашего приложения передаем наш сервис, которому присваиваем тип данных нашего сервиса


        // fetch all customers
//        Iterable<IdNumber> IdList = repository.readAllClient();  // создаем иттерируемый объект из сервиса прочитав записи с таблицы
//        System.out.println("Customers found with findAll():");
//        System.out.println("-------------------------------");
//        for (IdNumber documents : IdList) { // циклом вытаскиваем каждый объект из списка
//            System.out.println(documents.toString()); // переопределенным методом toString выводим данные объекта в том виде, в котором задали при создании сущности
//        }
//        System.out.println();
        //context.close();  // выключаем наше приложение
    }
}
