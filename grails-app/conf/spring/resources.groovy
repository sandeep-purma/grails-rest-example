// Place your Spring DSL code here
import io.swagger.jaxrs.config.BeanConfig
beans = {
    swaggerConfig(BeanConfig) {
        def serverUrl = grailsApplication.config.grails.serverURL.toString()
        def hostName = serverUrl.substring(serverUrl.indexOf("://")+3)
        resourcePackage = 'com.nbos.twagon.api'
        host = hostName
        basePath = "/api"
        version = 'v0' // Default "1".
        title = 'Core Registration API, Version V0' // Default: App Name.
        description = 'API for Accessing secured resources'
        contact = 'appAdmin@testapp.com'
        license = ''
        licenseUrl = ''
    }
}
