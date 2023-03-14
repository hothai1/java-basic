package oop;

public class invoiceItem {
  private String id, desc;
  private int qty;
  private double unitPrice;
  public invoiceItem() {
	  String id, desc;
	   int qty;
	  double unitPrice;
  }
  public String getID() {
	  return id;
  }
  public String getDesc() {
	  return desc;
  }
  public int getQty() {
	  return qty;
  }
  public void setQty(int qty) {
	 this.qty = qty;  
  }
  public double getUnitPrice() {
	  return unitPrice;
  }
  public void setUnitPrice(double unitPrice) {
	  this.unitPrice = unitPrice;
  }
  public double getTotal() {
	  double total = this.unitPrice*this.qty;
	  return total;
  }
 public String toString() {
	 
 }
}
