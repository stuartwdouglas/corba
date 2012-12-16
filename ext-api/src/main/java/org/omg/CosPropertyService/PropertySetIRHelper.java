package org.omg.CosPropertyService;


/**
 * This class contains generated Interface Repository information.
 * @author JacORB IDL compiler.
 */

public class PropertySetIRHelper
{
	public static java.util.Hashtable irInfo = new java.util.Hashtable();
	static
	{
		irInfo.put("define_properties", "(in:nproperties org.omg.CosPropertyService.Properties)");
		irInfo.put("get_all_properties", "(in:how_many ,out:nproperties org.omg.CosPropertyService.Properties,out:rest )");
		irInfo.put("get_all_property_names", "(in:how_many ,out:property_names org.omg.CosPropertyService.PropertyNames,out:rest )");
		irInfo.put("define_property", "(in:property_name org.omg.CosPropertyService.PropertyName,in:property_value )");
		irInfo.put("get_properties", "(in:property_names org.omg.CosPropertyService.PropertyNames,out:nproperties org.omg.CosPropertyService.Properties)");
		irInfo.put("get_number_of_properties", "()");
		irInfo.put("is_property_defined", "(in:property_name org.omg.CosPropertyService.PropertyName)");
		irInfo.put("delete_all_properties", "()");
		irInfo.put("delete_properties", "(in:property_names org.omg.CosPropertyService.PropertyNames)");
		irInfo.put("get_property_value", "(in:property_name org.omg.CosPropertyService.PropertyName)");
		irInfo.put("delete_property", "(in:property_name org.omg.CosPropertyService.PropertyName)");
	}
}
