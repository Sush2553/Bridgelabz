package com.oops;

public class InventoryFactory {
	private String inventoryName;
	private int inventoryNumber;
	private int inventoryValue;
   
	public InventoryFactory(String inventoryname,int inventorynumber,int inventoryvalue)
	 {
		 this.inventoryName=inventoryname;
		 this.inventoryNumber=inventorynumber;
		 this.inventoryValue=inventoryvalue;
	 }
	 
	 	public void setinventoryname(String inventoryname)
		{
			this.inventoryName=inventoryname;
		}
		
		public void setinventorynumber(int inventorynumber)
		{
			this.inventoryNumber=inventorynumber;
		}
		
		public void setinventoryvalue(int inventoryvalue)
		{
			this.inventoryValue=inventoryvalue;
		}
		
		
		public String getinventoryname()
		{
			return this.inventoryName;
		}
		
		public int getinventorynumber()
		{
			return this.inventoryNumber;
		}
		
		public int getinventoryvalue()
		{
			return this.inventoryValue;
		}

}
