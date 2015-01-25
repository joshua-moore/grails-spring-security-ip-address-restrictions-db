# Grails Spring Security IP address restrictions DB Plugin
Adds a simple managment service and domain class to your Grails application which allows you to manage Spring Security IP Address Restrictions. See the Spring Security Core Plugin documentation for more information about the [IP Address Restrictions](http://grails-plugins.github.io/grails-spring-security-core/guide/ip.html).

## Limitations
Due to the way the Spring Security Core Plugin loads filters based on the existance of configuration values your application using this plugin must contain a least one static IP address restriction mapping for the IP restriction filter to be included in the filter chain. Adding something like the following to your `grails-app/conf/Config.groovy` is suitable (and will be replaced once you define your own mappings using this plugin).

    grails.plugin.springsecurity.ipRestrictions = [
      '/aUrlPatternThatWillNeverBeUsed': '0.0.0.0'
    ]

## Domain class
The domain class added by this plugin `grails.plugin.springsecurity.IpAddressFilterEntry` is very simple and has only two properties (`urlPattern` and `ipPattern`). `urlPattern` must be unique and both are required and have the default maximum  length of 255 characters. The values for these properties should conform to the format specified by the Spring Security Core plugin. See the documentation for more information. Inserting, updating, and deleting instances of this domain class will trigger a refresh of the IP restrictions map by delegating to the `IpAddressFilterManagerService`.


## Service
The `grails.plugin.springsecurity.IpAddressFilterManagerService` service manages loading and refreshing the IP restriction map for the `IpAddressFilter` from existing `IpAddressFilterEntry` instances.
