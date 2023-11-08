package com.xworkz.sorting.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Stream;

import com.xworkz.sorting.dto.IceCreamDTO;

public class IceCream {

	public static void main(String[] args) {
		IceCreamDTO creamDTO1 = new IceCreamDTO("choclate", "Brown", 250, LocalDate.of(2023, 10, 12), "cup");
		IceCreamDTO creamDTO2 = new IceCreamDTO("Strawberry", "pink", 300, LocalDate.of(2023, 10, 13), "cup");
		IceCreamDTO creamDTO3 = new IceCreamDTO("Vanila", "white", 250, LocalDate.of(2023, 8, 4), "cup");
		IceCreamDTO creamDTO4 = new IceCreamDTO("Pista", "green", 150, LocalDate.of(2023, 5, 8), "cone");
		IceCreamDTO creamDTO5 = new IceCreamDTO("Butterscach", "yellow", 50, LocalDate.of(2023, 10, 14), "Famil-pack");

		Stream.of(creamDTO5, creamDTO4, creamDTO3, creamDTO2, creamDTO1).sorted()
				.forEach(ice -> System.out.println(ice));
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Comparator<IceCreamDTO> ice = (i1, i2) -> i1.getFlavour().compareTo(i2.getFlavour());
		Stream.of(creamDTO5, creamDTO4, creamDTO3, creamDTO2, creamDTO1).sorted(ice)
				.forEach(i -> System.out.println(i));
		System.out.println("------------date desc--------------------");
		Comparator<IceCreamDTO> ice1 = (i1, i2) -> i2.getManufactureDate().compareTo(i1.getManufactureDate());

		Stream.of(creamDTO5, creamDTO4, creamDTO3, creamDTO2, creamDTO1).sorted(ice1)
				.forEach(ic -> System.out.println(ic));

		System.out.println("-------------colour asc---------------------");
		Comparator<IceCreamDTO> ice2 = (i1, i2) -> i1.getColor().compareTo(i2.getColor());

		Stream.of(creamDTO5, creamDTO4, creamDTO3, creamDTO2, creamDTO1).sorted(ice2)
				.forEach(ic -> System.out.println(ic));

		System.out.println("^^^^^^^^^^^^^^type desc--------------------");
		Comparator<IceCreamDTO> ice3 = (i1, i2) -> i2.getType().compareTo(i1.getType());
		Stream.of(creamDTO5, creamDTO4, creamDTO3, creamDTO2, creamDTO1).sorted(ice3)
				.forEach(ic -> System.out.println(ic));

		System.out.println("----------price and date------asen-----");
		Comparator<IceCreamDTO> ice4 = (i1, i2) -> {
			if (i1.getPrice() == (i2.getPrice())) {
				i1.getManufactureDate().compareTo(i2.getManufactureDate());
			}
			return 0;
		};
		Stream.of(creamDTO5, creamDTO4, creamDTO3, creamDTO2, creamDTO1).sorted(ice4)
				.forEach(ic -> System.out.println(ic));

		System.out.println("******************************************");
		Comparator<IceCreamDTO> price = (i1, i2) -> Double.compare(i1.getPrice(), i2.getPrice());
		Comparator<IceCreamDTO> date = (i1, i2) -> i1.getManufactureDate().compareTo(i2.getManufactureDate());
		Stream.of(creamDTO5, creamDTO4, creamDTO3, creamDTO2, creamDTO1).sorted(price.thenComparing(date))
				.forEach(a -> System.out.println(a));

	}

}
