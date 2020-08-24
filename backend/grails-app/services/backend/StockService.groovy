package backend

import grails.gorm.services.Service


import java.time.LocalDateTime


@Service(Stock)
interface StockService {
    Stock save(double price, LocalDateTime priceDate, Company company)
    Stock get(Serializable id)
    Long count()
    List<Stock> list(Map args)
}
