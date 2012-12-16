package org.omg.CosTransactions;


/**
 * Generated from IDL interface "TransactionFactory".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at Dec 14, 2011 3:09:47 PM
 */

public interface TransactionFactoryOperations
{
	/* constants */
	/* operations  */
	org.omg.CosTransactions.Control create(int time_out);
	org.omg.CosTransactions.Control recreate(org.omg.CosTransactions.PropagationContext ctx);
}
