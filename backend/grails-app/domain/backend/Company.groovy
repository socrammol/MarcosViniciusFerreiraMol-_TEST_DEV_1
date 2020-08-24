package backend
@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Company {
    String name;
    String segment;
    static hasMany = [stock: Stock]
    static constraints = {

    }
}
