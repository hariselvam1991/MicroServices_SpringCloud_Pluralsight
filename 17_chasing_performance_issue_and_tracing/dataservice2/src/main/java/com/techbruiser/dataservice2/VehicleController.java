package com.pluralsight.dataservice2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    List<VehicleDetails> details;

    public VehicleController() {

        details = new ArrayList<VehicleDetails>();
        details.add(new VehicleDetails("500", "Lincoln Contential", "SNUG30"));
        details.add(new VehicleDetails("501", "Chevrolet Camaro", "SNUG30"));
        details.add(new VehicleDetails("502", "Porsche Taycan", "GGLR20"));

    }

    @RequestMapping(value="/customer/{cid}/vehicledetails", method=RequestMethod.GET)
	public VehicleDetails getCustomerVehicleDetails(@PathVariable String cid) {
		
		return details.stream().filter(detail -> cid.equals(detail.getCustomerId())).findAny().orElse(null);   
	}
    
}
