package org.phone;

public class InternalStorage extends ExternalStorage {

	public void processorName() {
		System.out.println("My Phone Processor is Snapdragon");
	}

	public void ramSize() {
		System.out.println("My Phone RAM is 4GB");
	}

	public static void main(String[] args) {
		InternalStorage i=new InternalStorage();
		i.size();
		i.processorName();
		i.ramSize();
	}
}