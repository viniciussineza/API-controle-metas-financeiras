//package br.com.apisonhosobmedida.util;
//
//import br.com.apisonhosobmedida.model.MetaFinanceira;
//import br.com.apisonhosobmedida.repository.MetaFinanceiraRepository;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
//@Configuration
//public class LoadDataBase {
//
//    private static final Logger log = LoggerFactory.getLogger(LoadDataBase.class);
//
//    @Bean
//    CommandLineRunner initDataBase(MetaFinanceiraRepository repository) {
//        return args -> {
//            log.info("Preloading " + repository.save(
//                    new MetaFinanceira(
//                            "Viajar para Dathomir",
//                            10d,
//                            LocalDate.now(),
//                            LocalDate.parse("14/08/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy"))))
//            );
//        };
//    }
//
//
//}
