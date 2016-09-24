grails.project.groupId = "com.nbos"

grails.mime.disable.accept.header.userAgents = ['Gecko', 'WebKit', 'Presto', 'Trident']
grails.mime.types = [
    all:           '*/*',
    atom:          'application/atom+xml',
    css:           'text/css',
    csv:           'text/csv',
    form:          'application/x-www-form-urlencoded',
    html:          ['text/html','application/xhtml+xml'],
    js:            'text/javascript',
    json:          ['application/json', 'text/json'],
    multipartForm: 'multipart/form-data',
    rss:           'application/rss+xml',
    text:          'text/plain',
    hal:           ['application/hal+json','application/hal+xml'],
    xml:           ['text/xml', 'application/xml']
]

grails.converters.json.default.deep = true
grails.views.default.codec = "html"

grails.controllers.defaultScope = 'singleton'

grails.converters.encoding = "UTF-8"
//grails.scaffolding.templates.domainSuffix = 'Instance'

grails.json.legacy.builder = false
grails.enable.native2ascii = true
grails.spring.bean.packages = []
grails.web.disable.multipart=false

grails.exceptionresolver.params.exclude = ['password']

grails.hibernate.cache.queries = false

grails.hibernate.pass.readonly = false
grails.hibernate.osiv.readonly = false
grails.plugin.console.enabled = Boolean.TRUE

environments {
    development {
        grails.logging.jul.usebridge = true
        grails.logging.jul.usebridge = true
        grails.serverURL = "http://localhost:8080/grails-rest-ex"
    }

    test {
        grails.assets.minifyJs = true
        grails.serverURL = "http://localhost:8080/grails-rest-ex"
    }

    production {
        grails.logging.jul.usebridge = false
        grails.logging.jul.usebridge = false
        grails.serverURL ="http://localhost:8080/grails-rest-ex"
    }
}

log4j.main = {

    error  'org.codehaus.groovy.grails.web.servlet',        // controllers
           'org.codehaus.groovy.grails.web.pages',          // GSP
           'org.codehaus.groovy.grails.web.sitemesh',       // layouts
           'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
           'org.codehaus.groovy.grails.web.mapping',        // URL mapping
           'org.codehaus.groovy.grails.commons',            // core / classloading
           'org.codehaus.groovy.grails.plugins',            // plugins
           'org.codehaus.groovy.grails.orm.hibernate',      // hibernate integration
           'org.springframework',
           'org.hibernate',
           'net.sf.ehcache.hibernate'
}

grails.databinding.dateFormats = ["yyyy-MM-dd'T'hh:mm:ss'Z'", "yyyy-MM-dd'T'hh:mm:ss.SSS'Z'"]

angular.pageSize = 25
angular.dateFormat="MM/dd/yyyy"

cors.url.pattern = '/*'
grails.plugin.localeConfiguration.supportedLocales = [ Locale.ENGLISH, Locale.GERMAN, Locale.FRANCE, Locale.FRENCH]
grails.plugin.localeConfiguration.defaultLocale = Locale.ENGLISH

cors.headers = [ 'Access-Control-Allow-Origin': '*' ]