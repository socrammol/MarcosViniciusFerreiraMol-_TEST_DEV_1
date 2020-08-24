package backend

import groovy.transform.CompileStatic


import java.time.LocalDateTime

@CompileStatic
class BootStrap {
    CompanyService companyService
    StockService stockService
    LocalDateTime data;
    double valor;
    def init = { servletContext ->
        Company nissan = companyService.save('Nissan', 'veiculos').save()
        Company Ford = companyService.save('Ford', 'veiculos').save()
        Company microsoft = companyService.save('Microsoft', 'sistemas').save()
       // data = LocalDateTime.of(2020, 01, 05, 01, 01, 01)
        int totalDias = 2;
        data = LocalDateTime.now().minusDays(totalDias);
        salvaStock(totalDias,data, nissan, Ford, microsoft)

    }


    def destroy = {
    }

    def void salvaStock(int totalDias,LocalDateTime localDateTime, Company company1, Company company2, Company company3) {
        LocalDateTime dataFinal = data;
        for (int i = 0; i < totalDias; i++) {
            for (int j = 0; j <= 8; j++) {
                while (dataFinal.getHour() < 10 || dataFinal.getHour() > 18 && dataFinal.getMinute() > 0) {
                    dataFinal = dataFinal.plusHours(1);
                }
                if (dataFinal.getHour() >= 10 && dataFinal.getHour() <= 18) {
                    for (int k = 0; k <=59; k++) {
                        Stock gerarStock1 = stockService.save(Math.random() * 100, dataFinal).save().addToCompany(company1)
                        //Stock gerarStock2 = stockService.save(Math.random() * 100, dataFinal).save().addToCompany(company2)
                       // Stock gerarStock3 = stockService.save(Math.random() * 100, dataFinal).save().addToCompany(company3)
                        dataFinal = dataFinal.plusMinutes(1);
                    }
                }

            }
        }
        dataFinal = dataFinal.plusDays(1);
    }
}

