package com.ajas.functions;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplierTest {

	private final static Supplier<LocalDate> getTime = ()-> LocalDate.now();
	public static void main(String[] args) {
		System.out.println(getTime.get());
	}
}
