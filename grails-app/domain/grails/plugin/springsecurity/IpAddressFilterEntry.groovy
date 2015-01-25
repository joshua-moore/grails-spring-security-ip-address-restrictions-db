package grails.plugin.springsecurity

class IpAddressFilterEntry {

	transient ipAddressFilterManagerService

	String urlPattern
	String ipPattern

	static transients = ['ipAddressFilterManagerService']

	static constraints = {
		urlPattern(nullable: false, blank: false, unique: true)
		ipPattern(nullable: false, blank: false)
	}

	def afterInsert() {
		ipAddressFilterManagerService.refresh()
	}
	def afterUpdate() {
		ipAddressFilterManagerService.refresh()
	}
	def afterDelete() {
		ipAddressFilterManagerService.refresh()
	}
}
