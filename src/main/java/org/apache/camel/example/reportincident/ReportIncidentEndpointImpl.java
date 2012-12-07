package org.apache.camel.example.reportincident;

import org.apache.log4j.Logger;


/**
 * The webservice we have implemented.
 */
public class ReportIncidentEndpointImpl implements ReportIncidentEndpoint {
	private static final Logger log = Logger.getLogger(ReportIncidentEndpointImpl.class);
	
    public OutputReportIncident reportIncident(InputReportIncident parameters) {
        log.info("Hello ReportIncidentEndpointImpl is called with givenname:" + parameters.getGivenName()
        		+ ", details: " + parameters.getDetails()
        		+ ", email: " + parameters.getEmail()
        		+ ", familyname: " + parameters.getFamilyName()
        		+ ", incidentdata: " + parameters.getIncidentDate()
        		+ ", incidentid: " + parameters.getIncidentId()
        		+ ", phone: " + parameters.getPhone()
        		+ ", summary: " + parameters.getSummary()
        		);

        OutputReportIncident out = new OutputReportIncident();
        out.setCode("OK");
        return out;
    }

}