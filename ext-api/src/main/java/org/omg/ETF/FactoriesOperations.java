package org.omg.ETF;


/**
 * Generated from IDL interface "Factories".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 10/01/2013 11:46:14 AM
 */

public interface FactoriesOperations
{
	/* constants */
	/* operations  */
	org.omg.ETF.Connection create_connection(org.omg.RTCORBA.ProtocolProperties props);
	org.omg.ETF.Listener create_listener(org.omg.RTCORBA.ProtocolProperties props, int stacksize, short base_priority);
	org.omg.ETF.Profile demarshal_profile(org.omg.IOP.TaggedProfileHolder tagged_profile, org.omg.IOP.TaggedComponentSeqHolder components);
	org.omg.ETF.Profile decode_corbaloc(java.lang.String corbaloc);
	int profile_tag();
}
