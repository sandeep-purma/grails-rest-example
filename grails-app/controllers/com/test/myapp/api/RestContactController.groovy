package com.test.myapp.api

import grails.rest.RestfulController
import com.test.myapp.RestResponse
import grails.rest.RestfulController
import com.test.myapp.Contact

class RestContactController extends RestfulController {
    static responseFormats = ['json', 'xml']
    static namespace = 'v0'

    def list(ContactListCommand cmd) {
        def max = cmd.max ?: 10; 
        def offset = cmd.offset ?: 0
        def contactList = Contact.createCriteria().list(max:max, offset:offset){
             order("id","asc")
        }
        def resultsMap = [:]
        resultsMap.put("contacts", contactList)
        resultsMap.put("totalCount",contactList.totalCount)
        respond new RestResponse(status: RestResponse.SUCCESS, type: RestResponse.SUCCESS, message: "Notes list.", results: [resultsMap])
    }
}

class ContactListCommand {
	    Long contactId
	    Long offset
	    Long max

	    def getContact() {
	        Contact.get(contactId)
	    }

	    static constraints = {
	        contactId nullable: true
	        offset nullable: true
	        max nullable:true
    	}
}
