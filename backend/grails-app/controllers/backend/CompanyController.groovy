package backend

class CompanyController {
    CompanyService companyService
    static responseFormats = ['json','xml']
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE", get:"GET"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond companyService.list(params), model:[companyCount: companyService.count()]
    }
    def show(Long id) {
        respond companyService.get(id)
    }
}
