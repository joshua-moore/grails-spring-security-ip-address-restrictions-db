package grails.plugin.springsecurity

import org.springframework.beans.factory.InitializingBean

class IpAddressFilterManagerService implements InitializingBean {

	static transactional = false
	def ipAddressFilter

	void afterPropertiesSet() {
		refresh()
	}

	void refresh() {
		log.debug("Refreshing IP filter")
		
		Map<String, Object> ipRestrictions = [:]
		def ipAddressFilterEntries = IpAddressFilterEntry.list()
		log.debug("Total of ${ipAddressFilterEntries.size()} mappings found.")
		
		if (ipAddressFilterEntries.size() == 0) return // nothing to load

		ipAddressFilterEntries.each { i ->
			log.debug("Adding IP filter mapping '${i.urlPattern}' to [${i.ipPattern}]")
			ipRestrictions.put(i.urlPattern, i.ipPattern.split(','))
		}
		
		ipAddressFilter.setIpRestrictions(ipRestrictions)
	}
}
