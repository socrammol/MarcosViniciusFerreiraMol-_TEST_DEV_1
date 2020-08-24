package backend

import backend.Company
import java.time.LocalDateTime

@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Stock {
    double price
    LocalDateTime priceDate
    static hasMany = [company : Company]
    static belongsTo = Company
    static constraints = {

    }
}
