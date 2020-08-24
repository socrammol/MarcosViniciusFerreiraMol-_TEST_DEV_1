package backend

class UrlMappings {

    static mappings = {

        get "/$controller(.$format)?"(action:"index")
        get "/$controller/$id(.$format)?"(action:"show")
        patch "/$controller/$id(.$format)?"(action:"patch")
        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
