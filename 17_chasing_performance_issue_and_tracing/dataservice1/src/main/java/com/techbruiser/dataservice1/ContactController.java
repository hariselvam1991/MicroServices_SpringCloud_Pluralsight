package com.techbruiser.dataservice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.Span;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    List<ContactDetails> details;

    @Autowired
	private Tracer tracer;

    public ContactController() {

        details = new ArrayList<ContactDetails>();
        details.add(new ContactDetails("500", "Alexis Rose", "30010"));
        details.add(new ContactDetails("501", "David Rose", "30056"));
        details.add(new ContactDetails("502", "Ted Mullens", "31055"));

    }

    @RequestMapping(value="/customer/{cid}/contactdetails", method=RequestMethod.GET)
	public ContactDetails getCustomerContactDetails(@PathVariable String cid) throws InterruptedException {

        Span dbSpan = this.tracer.nextSpan().name("DBLookup");
		try (Tracer.SpanInScope ws = this.tracer.withSpan(dbSpan.start())) {
			
			dbSpan.tag("call", "sql-database");

            //add arbitrary latency
            Random r = new Random();
            int multiplier = r.nextInt(5) * 1000;
            System.out.println("multiplier: " + multiplier);
            Thread.sleep(multiplier);

			//this shows up in the JSON, not the UI!
			dbSpan.event("db lookup complete");
		}
		finally {
			dbSpan.end();
		}

        return details.stream().filter(detail -> cid.equals(detail.getContactId())).findAny().orElse(null);   
             
    }
    
}
