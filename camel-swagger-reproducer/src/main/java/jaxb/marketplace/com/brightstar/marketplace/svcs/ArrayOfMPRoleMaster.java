
package jaxb.marketplace.com.brightstar.marketplace.svcs;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMPRoleMaster complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMPRoleMaster"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MPRoleMaster" type="{http://svcs.marketplace.brightstar.com/}MPRoleMaster" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMPRoleMaster", propOrder = {
    "mpRoleMaster"
})
public class ArrayOfMPRoleMaster {

    @XmlElement(name = "MPRoleMaster", nillable = true)
    protected List<MPRoleMaster> mpRoleMaster;

    /**
     * Gets the value of the mpRoleMaster property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mpRoleMaster property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMPRoleMaster().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MPRoleMaster }
     * 
     * 
     */
    public List<MPRoleMaster> getMPRoleMaster() {
        if (mpRoleMaster == null) {
            mpRoleMaster = new ArrayList<MPRoleMaster>();
        }
        return this.mpRoleMaster;
    }

}
