package backend

class StockController {
    StockService stockService
    static responseFormats = ['json','xml']
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE", get:"GET"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond stockService.list(params), model:[stockCount: stockService.count()]
    }
    def show(Long id) {
        respond stockService.get(id)
    }
}
