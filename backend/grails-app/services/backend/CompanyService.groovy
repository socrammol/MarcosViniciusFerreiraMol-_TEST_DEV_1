package backend

import grails.gorm.services.Service


@Service(Company)
interface CompanyService {
    Company save(String name, String segment)
    Company get(Serializable id)
    Long count()
    List<Company> list(Map args)

}
