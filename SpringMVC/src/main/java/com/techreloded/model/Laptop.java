package com.techreloded.model;

import org.springframework.stereotype.Component;

// TODO: Auto-generated Javadoc
/**
 * The Class Laptop.
 */
@Component
public class Laptop {
	
	/** The ram. */
	int ram;
	
	/** The manufacturer. */
	String manufacturer;
	
	/** The processor. */
	String processor;

	/**
	 * Gets the ram.
	 *
	 * @return the ram
	 */
	public int getRam() {
		return ram;
	}

	/**
	 * Sets the ram.
	 *
	 * @param ram the new ram
	 */
	public void setRam(int ram) {
		this.ram = ram;
	}

	/**
	 * Gets the manufacturer.
	 *
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * Sets the manufacturer.
	 *
	 * @param manufacturer the new manufacturer
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * Gets the processor.
	 *
	 * @return the processor
	 */
	public String getProcessor() {
		return processor;
	}

	/**
	 * Sets the processor.
	 *
	 * @param processor the new processor
	 */
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public void compile() {
		System.out.println("Code is compiling by laptop classs...");
	}
}
