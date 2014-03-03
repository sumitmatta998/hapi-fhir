















package ca.uhn.fhir.model.dstu.composite;

import java.util.*;
import ca.uhn.fhir.model.api.*;
import ca.uhn.fhir.model.api.annotation.*;
import ca.uhn.fhir.model.primitive.*;

/**
 * HAPI/FHIR <b>Contact</b> Datatype
 * (Technology mediated contact details (phone, fax, email, etc))
 *
 * <p>
 * <b>Definition:</b>
 * All kinds of technology mediated contact details for a person or organization, including telephone, email, etc.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * Need to track phone, fax, mobile, sms numbers, email addresses, twitter tags, etc.
 * </p> 
 */
@DatatypeDef(name="Contact") 
public class ContactDt extends BaseElement implements ICompositeDatatype {

	@Child(name="system", type=CodeDt.class, order=0, min=0, max=1)	
	private CodeDt mySystem;
	
	@Child(name="value", type=StringDt.class, order=1, min=0, max=1)	
	private StringDt myValue;
	
	@Child(name="use", type=CodeDt.class, order=2, min=0, max=1)	
	private CodeDt myUse;
	
	@Child(name="period", type=PeriodDt.class, order=3, min=0, max=1)	
	private PeriodDt myPeriod;
	
	/**
	 * Gets the value(s) for <b>system</b> (phone | fax | email | url).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Telecommunications form for contact - what communications system is required to make use of the contact
     * </p> 
	 */
	public CodeDt getSystem() {  
		if (mySystem == null) {
			mySystem = new CodeDt();
		}
		return mySystem;
	}

	/**
	 * Sets the value(s) for <b>system</b> (phone | fax | email | url)
	 *
     * <p>
     * <b>Definition:</b>
     * Telecommunications form for contact - what communications system is required to make use of the contact
     * </p> 
	 */
	public void setSystem(CodeDt theValue) {
		mySystem = theValue;
	}
	
 
	/**
	 * Gets the value(s) for <b>value</b> (The actual contact details).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The actual contact details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).
     * </p> 
	 */
	public StringDt getValue() {  
		if (myValue == null) {
			myValue = new StringDt();
		}
		return myValue;
	}

	/**
	 * Sets the value(s) for <b>value</b> (The actual contact details)
	 *
     * <p>
     * <b>Definition:</b>
     * The actual contact details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).
     * </p> 
	 */
	public void setValue(StringDt theValue) {
		myValue = theValue;
	}
	
	/**
	 * Sets the value(s) for <b>value</b> (The actual contact details)
	 *
     * <p>
     * <b>Definition:</b>
     * The actual contact details, in a form that is meaningful to the designated communication system (i.e. phone number or email address).
     * </p> 
	 */
	public void setValue( String theString) {
		myValue = new StringDt(theString); 
	}
 
	/**
	 * Gets the value(s) for <b>use</b> (home | work | temp | old | mobile - purpose of this address).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the purpose for the address
     * </p> 
	 */
	public CodeDt getUse() {  
		if (myUse == null) {
			myUse = new CodeDt();
		}
		return myUse;
	}

	/**
	 * Sets the value(s) for <b>use</b> (home | work | temp | old | mobile - purpose of this address)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the purpose for the address
     * </p> 
	 */
	public void setUse(CodeDt theValue) {
		myUse = theValue;
	}
	
 
	/**
	 * Gets the value(s) for <b>period</b> (Time period when the contact was/is in use).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Time period when the contact was/is in use
     * </p> 
	 */
	public PeriodDt getPeriod() {  
		if (myPeriod == null) {
			myPeriod = new PeriodDt();
		}
		return myPeriod;
	}

	/**
	 * Sets the value(s) for <b>period</b> (Time period when the contact was/is in use)
	 *
     * <p>
     * <b>Definition:</b>
     * Time period when the contact was/is in use
     * </p> 
	 */
	public void setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
	}
	
 


}