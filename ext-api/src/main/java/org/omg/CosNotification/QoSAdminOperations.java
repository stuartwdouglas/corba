package org.omg.CosNotification;


/**
 * Generated from IDL interface "QoSAdmin".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:52 PM
 */

public interface QoSAdminOperations
{
	/* constants */
	/* operations  */
	org.omg.CosNotification.Property[] get_qos();
	void set_qos(org.omg.CosNotification.Property[] qos) throws org.omg.CosNotification.UnsupportedQoS;
	void validate_qos(org.omg.CosNotification.Property[] required_qos, org.omg.CosNotification.NamedPropertyRangeSeqHolder available_qos) throws org.omg.CosNotification.UnsupportedQoS;
}
