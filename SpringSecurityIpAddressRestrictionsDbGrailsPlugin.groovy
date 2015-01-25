class SpringSecurityIpAddressRestrictionsDbGrailsPlugin {
    // the plugin version
    def version = "0.1"

    // plugin dependancies
    // def dependsOn = ['spring-security-core': "*"]

    // control load order
    def loadAfter = ['services', 'spring-security-core']

    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.2.2 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp",
        "web-app/**"
    ]

    def title = "Spring Security IP Address Restrictions DB Plugin" // Headline display name of the plugin
    def author = "Joshua Moore"
    def authorEmail = "joshua.j.moore76@gmail.com"
    def description = '''\
This plugin allows you to configure and manage IP address restrictions for the Spring Security IP restrictions filter by using a GORM domain class.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/spring-security-ip-address-restrictions-db"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "APACHE"

    // Details of company behind the plugin (if there is one)
//    def organization = [ name: "My Company", url: "http://www.my-company.com/" ]

    // Any additional developers beyond the author specified above.
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

    // Location of the plugin's issue tracker.
//    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]

    // Online location of the plugin's browseable source code.
//    def scm = [ url: "http://svn.codehaus.org/grails-plugins/" ]

    def doWithWebDescriptor = { xml ->
    }

    def doWithSpring = {
    }

    def doWithDynamicMethods = { ctx ->
    }

    def doWithApplicationContext = { ctx ->
    }

    def onChange = { event ->
    }

    def onConfigChange = { event ->
    }

    def onShutdown = { event ->
    }
}
