class UrlMappings {
	static mappings = {
        "/api/$namespace/contacts"(controller:'restContact') {
            action = [GET: 'list']
        }
        "/console" (controller: 'console')
        "/console/$action" (controller: 'console')
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
