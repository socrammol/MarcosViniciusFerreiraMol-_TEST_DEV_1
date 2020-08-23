package backend

import java.time.LocalDate
import java.time.LocalDateTime

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Stock {
    double price;
    LocalDateTime priceDate;
    Company company;
    static constraints = {

    }
}
