class BillRunner{
	
	public static void main(String [] generatebill){
		
		Bill bill = new Bill();
		bill.id=1;
		bill.billIssueDate="18/06/2024";
		bill.billDueDate="18/07/2024";
		bill.isBillPaid=false;
		bill.isLatestBill=true;
		
		System.out.println("the Bill id is:"+id);
		
		System.out.println("the billIssueDate is:"+bill.billIssueDate);
		
		System.out.println("the billDueDate is:"+bill.billDueDate);
		
		System.out.println("is bill paid:"+bill.isBillPaid);
		
		System.out.println("the latest bill is:"+bill.isLatestBill);
		
		System.out.println("*******************************************************");
		
		Bill bill1 = new Bill();
		bill1.id=2;
		bill1.billIssueDate="16/06/2024";
		bill1.billDueDate="16/07/2024";
		bill1.isBillPaid=true;
		bill1.isLatestBill=true;
		
		System.out.println("the Bill id is:"+bill1.id);
		
		System.out.println("the billIssueDate is:"+bill1.billIssueDate);
		
		System.out.println("the billDueDate is:"+bill1.billDueDate);
		
		System.out.println("is bill paid:"+bill1.isBillPaid);
		
		System.out.println("the latest bill is:"+bill1.isLatestBill);
	}
}
		