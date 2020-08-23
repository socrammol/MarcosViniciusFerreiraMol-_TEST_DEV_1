package backend

import grails.gorm.services.Service


@Service(Company)
interface CompanyService {
    Company save(String name, String segment)

}
