package backend

import grails.gorm.transactions.Transactional

import java.time.LocalDateTime

@Transactional
class GetStocksService {

    def getStocks(Company company, int numbersOfHoursUntilNow) {
        Stock stock = stock.company.getId(company.getId());
        log.info(stock.getPriceDate(LocalDateTime.minusHours(numbersOfHoursUntilNow)))
    }
}
